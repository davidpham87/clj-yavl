goog.provide('reagent.debug');
reagent.debug.has_console = (typeof console !== 'undefined');
reagent.debug.tracking = false;
if((typeof reagent !== 'undefined') && (typeof reagent.debug !== 'undefined') && (typeof reagent.debug.warnings !== 'undefined')){
} else {
reagent.debug.warnings = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(null);
}
if((typeof reagent !== 'undefined') && (typeof reagent.debug !== 'undefined') && (typeof reagent.debug.track_console !== 'undefined')){
} else {
reagent.debug.track_console = (function (){var o = ({});
(o.warn = (function() { 
var G__20137__delegate = function (args){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(reagent.debug.warnings,cljs.core.update_in,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"warn","warn",-436710552)], null),cljs.core.conj,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.str,args)], 0));
};
var G__20137 = function (var_args){
var args = null;
if (arguments.length > 0) {
var G__20138__i = 0, G__20138__a = new Array(arguments.length -  0);
while (G__20138__i < G__20138__a.length) {G__20138__a[G__20138__i] = arguments[G__20138__i + 0]; ++G__20138__i;}
  args = new cljs.core.IndexedSeq(G__20138__a,0,null);
} 
return G__20137__delegate.call(this,args);};
G__20137.cljs$lang$maxFixedArity = 0;
G__20137.cljs$lang$applyTo = (function (arglist__20139){
var args = cljs.core.seq(arglist__20139);
return G__20137__delegate(args);
});
G__20137.cljs$core$IFn$_invoke$arity$variadic = G__20137__delegate;
return G__20137;
})()
);

(o.error = (function() { 
var G__20140__delegate = function (args){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(reagent.debug.warnings,cljs.core.update_in,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"error","error",-978969032)], null),cljs.core.conj,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.str,args)], 0));
};
var G__20140 = function (var_args){
var args = null;
if (arguments.length > 0) {
var G__20141__i = 0, G__20141__a = new Array(arguments.length -  0);
while (G__20141__i < G__20141__a.length) {G__20141__a[G__20141__i] = arguments[G__20141__i + 0]; ++G__20141__i;}
  args = new cljs.core.IndexedSeq(G__20141__a,0,null);
} 
return G__20140__delegate.call(this,args);};
G__20140.cljs$lang$maxFixedArity = 0;
G__20140.cljs$lang$applyTo = (function (arglist__20142){
var args = cljs.core.seq(arglist__20142);
return G__20140__delegate(args);
});
G__20140.cljs$core$IFn$_invoke$arity$variadic = G__20140__delegate;
return G__20140;
})()
);

return o;
})();
}
reagent.debug.track_warnings = (function reagent$debug$track_warnings(f){
(reagent.debug.tracking = true);

cljs.core.reset_BANG_(reagent.debug.warnings,null);

(f.cljs$core$IFn$_invoke$arity$0 ? f.cljs$core$IFn$_invoke$arity$0() : f.call(null));

var warns = cljs.core.deref(reagent.debug.warnings);
cljs.core.reset_BANG_(reagent.debug.warnings,null);

(reagent.debug.tracking = false);

return warns;
});

//# sourceMappingURL=reagent.debug.js.map
