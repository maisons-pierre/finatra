scala_library(
  provides = scala_artifact(
    org = 'com.twitter',
    name = 'inject-modules',
    repo = artifactory,
  ),
  dependencies=[
    '3rdparty/jvm/com/google/inject/extensions:guice-assistedinject',
    '3rdparty/jvm/com/google/inject/extensions:guice-multibindings',
    '3rdparty/jvm/com/google/inject:guice',
    '3rdparty/jvm/net/codingwell:scala-guice',
    '3rdparty/jvm/org/slf4j:slf4j-api',
    'finagle/finagle-core/src/main/scala:scala',
    'finatra/inject/inject-core/src/main/scala:scala',
    'util/util-slf4j-api/src/main/scala',
    'util/util-stats/src/main/scala:scala',
  ],
  fatal_warnings=True,
  sources=rglobs('*.scala'),
)
