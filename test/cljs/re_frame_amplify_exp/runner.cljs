(ns re-frame-amplify-exp.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [re-frame-amplify-exp.core-test]))

(doo-tests 're-frame-amplify-exp.core-test)
