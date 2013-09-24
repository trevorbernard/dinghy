(ns dinghy.election)

;; Elections

;; - Allow at most one winner per term
;; - Each server gives out only ONE VOTE per term (persistent)
;; - This guarantees at most, one majority per term

;; Then should send RequestVote in parallel to other members in the cluster.. i.e. via zeromq pubsub?
(defn create-new-election
  "Increment current term and change to candidate state"
  [state]
  (-> state
      (assoc :state :candidate)
      (update-in [:term] (fnil + 0))))

