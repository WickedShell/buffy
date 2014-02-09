;; Copyright (c) 2013-2014 Alex Petrov, Michael S. Klishin, and the ClojureWerkz Team
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;; By using this software in any fashion, you are agreeing to be bound by
;; the terms of this license.
;; You must not remove this notice, or any other, from this software.

(ns clojurewerkz.buffy.types.protocols
  (:refer-clojure :exclude [read]))

;;
;; Protocol
;;

(defprotocol BuffyType
  (size [bt])
  (write [bt buffer idx value])
  (read [bt buffer idx]))
