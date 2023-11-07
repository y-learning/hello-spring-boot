package io.github.yahyatinani.springbootstartermk

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloRestController {
  @RequestMapping("/")
  fun hello() = "Hello JSON over HTTP API!"
}
