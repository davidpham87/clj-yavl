(ns clj-yavl.transforms)

;; List of Vega-Lite Transform and Aggregate operations

(def aggregations
  "Set of supported aggregation operations in Vega-Lite."
  #{:count :valid :missing :distinct :sum :mean :average :variance :variancep
    :stdev :stdevp :stderr :median :q1 :q3 :ci0 :ci1 :min :max :argmin :argmax})

(def transforms
  "Set of supported transform operations in Vega-Lite."
  #{:aggregate :bin :calculate :density :filter :flatten :fold :impute
    :joinaggregate :loess :lookup :pivot :quantile :regression :sample
    :stack :timeunit :window})
