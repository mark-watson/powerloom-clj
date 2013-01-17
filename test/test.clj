(ns test
  (:use [powerloom] :reload-all))

(load-plm "test.plm")
(change-module "BUSINESS")
(assert-proposition "(and (company c3) (company-name c3 'Moms Grocery'))")
(assert-proposition "(and (company c4) (company-name c4 'KnowledgeBooks Systems'))")
(println (do-query "all ?x (company ?x)"))
(println (do-query "all (?x ?name) (and (company ?x) (company-name ?x ?name))"))
