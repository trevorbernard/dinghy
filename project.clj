(defproject com.trevorbernard/dinghy "0.1.0-SNAPSHOT"
  :description "A Clojure implementation of the Raft consensus algorithm"
  :url "https://github.com/trevorbernard/dinghy"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [net.openhft/chronicle "2.0.1"]
                 [org.zeromq/cljzmq "0.1.2"]
                 [userevents/phaser "1.1.4"]]
  :jvm-opts ["-Djava.library.path=/usr/lib:/usr/local/lib"]
  :main dinghy.core)
