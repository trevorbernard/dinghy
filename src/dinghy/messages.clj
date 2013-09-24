(ns dinghy.messages)

(defrecord RequestVote [^long term ^long candidate-id ^long last-log-index ^long last-log-term])
