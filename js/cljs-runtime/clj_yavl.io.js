goog.provide('clj_yavl.io');
/**
 * Reads a JSON string and returns a Clojure data structure.
 * Options:
 * :key-fn - a function to apply to keys (e.g. keyword)
 * CLJ: uses babashka.json
 * CLJS: uses js/JSON.parse and js->clj
 */
clj_yavl.io.read_json_str = (function clj_yavl$io$read_json_str(var_args){
var G__33552 = arguments.length;
switch (G__33552) {
case 1:
return clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$1 = (function (s){
return clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(s,null);
}));

(clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2 = (function (s,p__33553){
var map__33554 = p__33553;
var map__33554__$1 = cljs.core.__destructure_map(map__33554);
var _opts = map__33554__$1;
var key_fn = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__33554__$1,new cljs.core.Keyword(null,"key-fn","key-fn",-636154479));
var js_obj = JSON.parse(s);
return cljs.core.js__GT_clj.cljs$core$IFn$_invoke$arity$variadic(js_obj,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"keywordize-keys","keywordize-keys",1310784252),cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(key_fn,cljs.core.keyword)], 0));
}));

(clj_yavl.io.read_json_str.cljs$lang$maxFixedArity = 2);

/**
 * Writes a Clojure data structure to a JSON string.
 * Options:
 * :indent - true or a number of spaces for indentation (not fully supported in CLJS default JSON)
 * CLJ: uses babashka.json
 * CLJS: uses js/JSON.stringify
 */
clj_yavl.io.write_json_str = (function clj_yavl$io$write_json_str(var_args){
var G__33556 = arguments.length;
switch (G__33556) {
case 1:
return clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$1 = (function (data){
return clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(data,null);
}));

(clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2 = (function (data,p__33557){
var map__33558 = p__33557;
var map__33558__$1 = cljs.core.__destructure_map(map__33558);
var _opts = map__33558__$1;
var indent = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__33558__$1,new cljs.core.Keyword(null,"indent","indent",-148200125));
if(cljs.core.truth_(indent)){
return JSON.stringify(cljs.core.clj__GT_js(data),null,((typeof indent === 'number')?indent:(2)));
} else {
return JSON.stringify(cljs.core.clj__GT_js(data));
}
}));

(clj_yavl.io.write_json_str.cljs$lang$maxFixedArity = 2);


//# sourceMappingURL=clj_yavl.io.js.map
