(ns t-edn.specs
  (:require [clojure.alpha.spec :as s]))

(s/def ::id (s/and int? #(>= % 0)))
(s/def ::class keyword?)
(s/def ::loc keyword?)

(s/def ::id-thing-schema
  (s/schema [::id]))
(s/def ::loc-thing-schema
  (s/schema [::class ::loc]))
(s/def ::thing-schema
  (s/union id-thing-schema loc-thing-schema))

(s/def ::id-thing-spec)
(s/def ::loc-thing-spe)
(s/def ::thing-spec)

(s/def ::target keyword?)
(s/def ::task keyword?)

(s/def ::intent-schema
  (s/schema [::target ::task]))
