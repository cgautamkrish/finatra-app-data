package com.twitter.finatra_example

import com.twitter.finatra._
import com.twitter.finatra.ContentType._

object Server extends FinatraServer {
  register(new SearchController())
}
