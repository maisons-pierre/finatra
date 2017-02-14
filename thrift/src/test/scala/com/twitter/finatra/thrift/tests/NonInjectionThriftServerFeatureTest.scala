package com.twitter.finatra.thrift.tests

import com.twitter.noninjection.thriftscala.NonInjectionService
import com.twitter.finatra.thrift.EmbeddedThriftServer
import com.twitter.finatra.thrift.tests.noninjection.NonInjectionThriftServer
import com.twitter.inject.server.WordSpecFeatureTest
import com.twitter.util.{Await, Future}

/** Tests that we can successfully bring up and query a service without injection. */
class NonInjectionThriftServerFeatureTest extends WordSpecFeatureTest {
  override val server = new EmbeddedThriftServer(
    twitterServer = new NonInjectionThriftServer())

  val client = server.thriftClient[NonInjectionService[Future]](clientId = "client")

  "success" in {
    Await.result(client.echo("Hi")) should equal("Hi")
  }
}