var path = require("path");
try {
    require("source-map-support").install();
} catch(err) {
}
require(path.join(path.resolve("."),"resources/public/js","goog","bootstrap","nodejs.js"));
require(path.join(path.resolve("."),"resources/public/js","cljs_deps.js"));
goog.global.CLOSURE_UNCOMPILED_DEFINES = {"cljs.core._STAR_target_STAR_":"nodejs"};
goog.require("demo.main");

exports.helloHttp = function helloHttp (req, res) {
  var plus = demo.main.plus(1,3);
  res.send(`Hello ${req.body.name || 'World'} [${plus}] ! `);
};