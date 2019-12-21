(ns web-audio-cljs.app)

(def audio-context
  (or (.-AudioContext js/window)
      (.-webkitAudioContext js/window)))
(def audio-ctx (js/AudioContext.))
(def audio-element (.querySelector js/document "audio"))
(def track (.createMediaElementSource audio-ctx audio-element))
(def play-button (.querySelector js/document ".tape-controls-play"))

(defn init []
  (println "Hello World"))