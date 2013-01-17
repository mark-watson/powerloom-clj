; Clojure opennlp tools
(ns powerloom
  (:import PowerLoomWrapper))

(def pl (PowerLoomWrapper.))

(defn load-plm [fpath]
  (.load pl fpath))

(defn change-module [mname] (.changeModule pl mname))

(defn assert-proposition [mname]
  (.assertProposition pl (.replaceAll mname "'" "\"")))

(defn convert-to-map [vb]
  (into {} vb))

(defn do-query [query]
  (for [result (map seq (.doQuery pl query))]
    (map (fn [str] (.replaceAll str "\"" "")) result)))

;;(load-plm "test.plm")
;;(change-module "BUSINESS")
;;(assert-proposition "(and (company c3) (company-name c3 'Moms Grocery'))")
;;(println (do-query "all ?x (company ?x)"))
;;(println (do-query "all (?x ?name) (and (company ?x) (company-name ?x ?name))"))
