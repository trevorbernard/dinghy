(ns dinghy.messages)

(defrecord Vote [^long term ^long candidate-id ^long last-log-index ^long last-log-term])
