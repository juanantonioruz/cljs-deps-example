(ns demo.app
  (:require 
   [juan.core :as core]
   )
  )

(.log js/console core/hello)


(comment
  (require '[cljs.repl.node :as node])(node/run-node-nrepl)
  )
