java_library(
  dependencies=[
    '3rdparty/jvm/ch/qos/logback:logback-classic',
    '3rdparty/jvm/com/fasterxml/jackson:jackson-annotations',
    '3rdparty/jvm/com/google/inject:guice',
    '3rdparty/jvm/javax/inject:javax.inject',
    '3rdparty/jvm/org/apache/thrift:libthrift-0.5.0',
    '3rdparty/jvm/org/slf4j:slf4j-api',
    'finagle/finagle-core/src/main/scala:scala',
    'finagle/finagle-thrift/src/main/scala:scala',
    'finagle/finagle-thriftmux/src/main/scala:scala',
    'finatra/examples/java-thrift-server/thrift-example-idl',
    'finatra/inject/inject-app/src/main/scala:scala',
    'finatra/inject/inject-core/src/main/scala:scala',
    'finatra/inject/inject-server/src/main/scala:scala',
    'finatra/inject/inject-utils/src/main/scala:scala',
    'finatra/thrift/src/main/scala:scala',
    'twitter-server/src/main/scala:scala',
    'util/util-app/src/main/scala:scala',
    'util/util-core/src/main/scala:scala',
    'util/util-lint/src/main/scala:scala',
    'util/util-logging/src/main/scala:scala',
    'util/util-slf4j-api/src/main/scala',
    'util/util-stats/src/main/scala:scala',
  ],
  fatal_warnings=True,
  sources=rglobs('*.java'),
  resources=[
    'finatra/examples/java-thrift-server/thrift-example-server/src/main/resources'
  ]
)
