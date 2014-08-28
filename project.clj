(defproject com.trevorbernard/dinghy "0.1.0-SNAPSHOT"
  :description "A Clojure implementation of the Raft consensus algorithm"
  :url "https://github.com/trevorbernard/dinghy"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.2.4"]
                 [org.clojure/tools.logging "0.3.0"]
                 [net.openhft/chronicle "2.0.1"]
                 [org.zeromq/cljzmq "0.1.4" :exclusions [org.zeromq/jzmq]]
                 [org.zeromq/jeromq "0.3.4"]
                 [userevents/phaser "1.1.4"]]
  :main dinghy.core)
