(ns dinghy.network)

(defprotocol Network
  (request-vote [_])
  (grant-vote [_ candidate-id]))
