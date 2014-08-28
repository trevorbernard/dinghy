(ns dinghy.core
  (:require [clojure.tools.logging :as log]
            [clojure.tools.cli :refer [cli]])
  (:gen-class))

(defn- parse-args
  [args]
  (cli args
       ["-h" "--help" "Show available parameters" :flag true]
       ["-c" "--cluster" "Comma separated list of nodes"]
       ["-p" "--port" "Listen on this port" :parse-fn #(Integer/parseInt %) :default 8121]
       ["-t" "--transaction-log" "Path to transaction log" :default "raftlog"]))

(defn -main [& args]
  (let [[options args banner] (parse-args args)
        {:keys [help cluster transaction-log]} options]
    (when help
      (println banner)
      (System/exit 0))))
