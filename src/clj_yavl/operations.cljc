(ns clj-yavl.operations)

(def aggregations
  "List of supported Vega-Lite aggregation operations."
  [:argmax
   :argmin
   :average
   :ci0
   :ci1
   :count
   :distinct
   :max
   :mean
   :median
   :min
   :missing
   :product
   :q1
   :q3
   :stderr
   :stdev
   :stdevp
   :sum
   :valid
   :variance
   :variancep])

(def transforms
  "List of supported Vega-Lite transform operations."
  [:aggregate
   :bin
   :calculate
   :density
   :filter
   :flatten
   :fold
   :impute
   :joinaggregate
   :loess
   :lookup
   :pivot
   :quantile
   :regression
   :sample
   :stack
   :timeunit
   :window])
