package org.cloudfoundry.client;

import io.grpc.ManagedChannel;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslProvider;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static io.grpc.internal.GrpcUtil.DEFAULT_KEEPALIVE_TIME_NANOS;

public class Util {
  private static final String CHARSET = "UTF-8";

  public static ManagedChannel getChannel(String host, int port) throws IOException {
    return NettyChannelBuilder.forAddress(host, port)
        .negotiationType(NegotiationType.TLS)
        .sslContext(Util.buildSslContext(SERVER_CA, CLIENT_CERT, CLIENT_KEY))
        .keepAliveTime(DEFAULT_KEEPALIVE_TIME_NANOS, TimeUnit.NANOSECONDS)
        .build();
  }

  public static SslContext buildSslContext(String serverCA,
                                            String clientCertificate,
                                            String clientPrivateKey) throws IOException {
    SslContextBuilder builder = GrpcSslContexts.forClient();
    builder.sslProvider(SslProvider.OPENSSL);
    if (serverCA != null) {
      builder.trustManager(IOUtils.toInputStream(serverCA, CHARSET));
    }
    if (clientCertificate != null && clientPrivateKey != null) {
      builder.keyManager(IOUtils.toInputStream(clientCertificate, CHARSET), IOUtils.toInputStream(clientPrivateKey, CHARSET));
    } else {
      throw new RuntimeException("Unable to fetch client certificate or client private key for external provider.");
    }
    return builder.build();
  }

  //  /tmp/perm-certs/ca.crt
  private static final String SERVER_CA = "-----BEGIN CERTIFICATE-----\n" +
      "MIIDIDCCAgigAwIBAgIJAITJlZ9kN8hYMA0GCSqGSIb3DQEBBQUAMBQxEjAQBgNV\n" +
      "BAMTCUVuY3J5cHRvcjAeFw0xODA2MjAxODExNDZaFw0xODA3MjAxODExNDZaMBQx\n" +
      "EjAQBgNVBAMTCUVuY3J5cHRvcjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoC\n" +
      "ggEBANCohKwM7uS0CmeNNO1eCGg8YFyBbvJNt3IvGEdxjFO94jAT0cpeG9jQgP/m\n" +
      "9dxquwsLYGnccNktAbFt7+6N5+DVA1nM35jegEAHhnxssUK6e2nAWcpftZkikf65\n" +
      "4O8Fvsykc+VIAQL2wjiPjVC67XvjgiFlOQ4hJi+kLHmqBmvnNyD3rwmLRLBaIbso\n" +
      "v+8Dz28NZAQSlqDKqKwqWB6jysDoCk9hs4XVxfGsjInl4KQYBnXw89hxTtMHuU4h\n" +
      "fLNz6+Z1EBrAbnlq+1mzmp3EdY80n3KpFDs4xvts0Y3+hWXmPEmnfSLtkyCegoji\n" +
      "qm1Ze+zT3ZNvJrE7B1HMiLBsDm8CAwEAAaN1MHMwHQYDVR0OBBYEFC2hP9pl8sj9\n" +
      "1TZuBOC1DmCSOb9xMEQGA1UdIwQ9MDuAFC2hP9pl8sj91TZuBOC1DmCSOb9xoRik\n" +
      "FjAUMRIwEAYDVQQDEwlFbmNyeXB0b3KCCQCEyZWfZDfIWDAMBgNVHRMEBTADAQH/\n" +
      "MA0GCSqGSIb3DQEBBQUAA4IBAQC1sG9kSAA+dc/IqQ+BHA6LpbF3YTNjqZX53TxO\n" +
      "eYE/Po0Wf9fL7RvB7EVFfdU2qPJRhAiV3dFL+H20jUQkaZVzzJB13vvFyqsxjhHf\n" +
      "6PjuVy8Yzlb9xDseQOGbIfWg4wLvKVVvmLT+JWu1CeZBJOlgICK4zO6Yg8CSe+6r\n" +
      "y71+2EAKL5HjkdM8tgk39dkgr24iBH2GIByKZVsFw2aPGn3rMYewalwjFXeCquYj\n" +
      "OMx9fUesLCG5qCLoB3UZWPxsLPZieHxG1MMKYJGs7VrH7/pOPY0R9XCF0oae50jg\n" +
      "rK5DpA/M4ChVpGB+rarwY91DfYsQC9x2JOaU+rZpX4ixFv7P\n" +
      "-----END CERTIFICATE-----";

  //  /tmp/perm-certs/client.crt
  private static final String CLIENT_CERT = "-----BEGIN CERTIFICATE-----\n" +
      "MIICojCCAYoCCQD4qZsmO0UpvzANBgkqhkiG9w0BAQwFADAUMRIwEAYDVQQDEwlF\n" +
      "bmNyeXB0b3IwHhcNMTgwNjIwMTgxMTQ2WhcNMTgwNzIwMTgxMTQ2WjASMRAwDgYD\n" +
      "VQQDEwdDcmVkaHViMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA5P+5\n" +
      "lVnpgvY+eYH7cGfIvEYyoNQwgB6w6U6aNJD1qEjYw6QJsYNFgCjOv7QHJmXqgXfs\n" +
      "7QfrocNQ36/vVUYvxDLwdh+WX371WB1i78PUMWLTChrOF1gOm3ifMD7DXMoNm132\n" +
      "b0nRGXqo1fWskTBS+CpE2+GwRA47pVK15dGTPP73EZ1G2JJ/qUwwn7aETDxBcOoK\n" +
      "WozoRLDW8rPKqnSmB4+iTGGUXNZLGjjSaRCaBsNqERZhY0t5V61NWoKhuB5rMZcu\n" +
      "U4yyaNnGHf/BXiNEj5Q2ZFyd+UmZj20T6O4gB8Y1J2J8VEPPYIQ6dMrFOHx6KKsT\n" +
      "YFBH7yrp46WmPWfl4QIDAQABMA0GCSqGSIb3DQEBDAUAA4IBAQB85PCSxoEu3FVL\n" +
      "n9xR2VqKpknQaFXFc1jgkSPLpvc3O+aHEG1PvAnGVBX6NVvIJeNnd9G62cYNHxWV\n" +
      "gJ8yN8kJuyP6WnvEvKEeeoDCNNN/jGnzqZyP0DY0UEcy2elKYSN+qdq3RemOS2Ga\n" +
      "ScKZ2HKoJvMHU7FslHeQHye6pn9VCO2v1ehWYcquIlVdGgTbPqWBRZ3WE1Cqzb6N\n" +
      "UDpSWyht/bwOEfbK/oKn8U8J73+7sRs+HOaLnpYEXtqAhvz1Ov/YRsP0iKkkd+/F\n" +
      "7VCTt1nfuMLhz/VvvpiinLVb71aYNHWesumNlC1NMXoik6XYGtfraA82w1zi554d\n" +
      "AOMf/kGs\n" +
      "-----END CERTIFICATE-----";

  //  /tmp/perm-certs/client.p8
  private static final String CLIENT_KEY = "-----BEGIN PRIVATE KEY-----\n" +
      "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDk/7mVWemC9j55\n" +
      "gftwZ8i8RjKg1DCAHrDpTpo0kPWoSNjDpAmxg0WAKM6/tAcmZeqBd+ztB+uhw1Df\n" +
      "r+9VRi/EMvB2H5ZffvVYHWLvw9QxYtMKGs4XWA6beJ8wPsNcyg2bXfZvSdEZeqjV\n" +
      "9ayRMFL4KkTb4bBEDjulUrXl0ZM8/vcRnUbYkn+pTDCftoRMPEFw6gpajOhEsNby\n" +
      "s8qqdKYHj6JMYZRc1ksaONJpEJoGw2oRFmFjS3lXrU1agqG4Hmsxly5TjLJo2cYd\n" +
      "/8FeI0SPlDZkXJ35SZmPbRPo7iAHxjUnYnxUQ89ghDp0ysU4fHooqxNgUEfvKunj\n" +
      "paY9Z+XhAgMBAAECggEAVyttBogiVmLL507uWpx3Egwaq5P6HlsQds8f7hCcIoIQ\n" +
      "WXCw6+yPYTinctvhuOEkwkHXY2cXcA08VNnQ3gIInsPROvXNNO7MD82n4qMFvALl\n" +
      "WLxZZRN1BAOHfUL29PRI97Jt43ES8oL5j/CjzuS5QJQ+gADKKy3L0KPKcAA17wpa\n" +
      "jocv0zoG1LQ6icMGopajACv9sXx4BdOYYReF+PZ/bRXKOrtKSrE6NQOHbtJiGUmD\n" +
      "WsLzqMc7muYyFuHBtLswxvNrBGxG7oX0bmmeLXdHX4SElDqhfVq1FN5/Tzh4LwGd\n" +
      "/END3k32bgRFA1SDTreEgND37mWACyF2m4+4zU6KzQKBgQD+Pp06JEzwhR4Gv660\n" +
      "LW+TqJxpjlO1pJesfn4fWh7/QFpGRrOLOzHXMGI0vb+lybsmuImJAiQJtCd3uGeh\n" +
      "kqZBRh6FaUoRiDUKBRF63YswLVJN+ZP9BCwwFu1bnXhOf1962uyHg6FhFmmSp657\n" +
      "URM8cDWu3P7+iGNeTBMFAU99pwKBgQDmlHz7nTcPBq1bBM2ISr9yBRquDRDX405z\n" +
      "+O0JLE+dEydJkPJwtrhHj0VTTHVdE2zClr5X93gmr8RhSN7ut4aojGToAYfpgyO5\n" +
      "dNMDnYcL+KUD0ZAzxcaALy7YXZrznhN+pfizMgpyWnRFZSStH1wntKWIega1xPeI\n" +
      "LLa3eL/BNwKBgDkb1XNW7hVkwV7gtZxxTEvNpvyq5LC7fPpZG3ltY+MQEHcSsIfI\n" +
      "zyQ4EQcpzB+wVaKX9wTYf0HSvr7MpDKN31xwJLDw+ps/jjJm+wsvMnGq7H7pXc2K\n" +
      "n2ZZ8A0RLRHs2ISfIlw6PAiz4Rj5I1890eVUiypxJ7IC7tcinW8VYUanAoGBANZg\n" +
      "0CMP9JTf3GV3fbBt7rkPzdJtC2/tQo/IrHmO3SZpHGnlfcMV3xeJOSdNOwEigkgY\n" +
      "5zfaObeeS7M3kS3ZLDWg8mBSrA6Lgrd2yond+CVFNAbs3GmGRBwBwkggH2TJX86s\n" +
      "eSICMHxJZTjv5L2hHok8B3twGLT/QDU3fVnvxjjZAoGBANAVD34YylKZe0n8w4c8\n" +
      "6uQoWGgVvLrJd0+055YSgpb4StXLs9v6/IWrbu2WPUMvT7nnr5q9YQw2UbEvk2MT\n" +
      "ivQD5fxAmw/NaqIxv0YGg3dG0WfUZjomSeltfp5l7pnSPyDQg4jPu1Id0Pm0EexV\n" +
      "/5jkqN/wtBN7Uq6OO8URMyun\n" +
      "-----END PRIVATE KEY-----";
}
