(ns examples.test.preface
  (:use clojure.test))

(deftest test-load-preface
  (is (= "hello\r\n"
         (with-out-str (use :reload 'examples.preface)))))
