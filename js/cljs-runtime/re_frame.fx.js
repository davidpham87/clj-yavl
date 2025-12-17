goog.provide('re_frame.fx');
re_frame.fx.kind = new cljs.core.Keyword(null,"fx","fx",-1237829572);
if(cljs.core.truth_((re_frame.registrar.kinds.cljs$core$IFn$_invoke$arity$1 ? re_frame.registrar.kinds.cljs$core$IFn$_invoke$arity$1(re_frame.fx.kind) : re_frame.registrar.kinds.call(null,re_frame.fx.kind)))){
} else {
throw (new Error("Assert failed: (re-frame.registrar/kinds kind)"));
}
re_frame.fx.reg_fx = (function re_frame$fx$reg_fx(id,handler){
return re_frame.registrar.register_handler(re_frame.fx.kind,id,handler);
});
/**
 * An interceptor whose `:after` actions the contents of `:effects`. As a result,
 *   this interceptor is Domino 3.
 * 
 *   This interceptor is silently added (by reg-event-db etc) to the front of
 *   interceptor chains for all events.
 * 
 *   For each key in `:effects` (a map), it calls the registered `effects handler`
 *   (see `reg-fx` for registration of effect handlers).
 * 
 *   So, if `:effects` was:
 *    {:dispatch  [:hello 42]
 *     :db        {...}
 *     :undo      "set flag"}
 * 
 *   it will call the registered effect handlers for each of the map's keys:
 *   `:dispatch`, `:undo` and `:db`. When calling each handler, provides the map
 *   value for that key - so in the example above the effect handler for :dispatch
 *   will be given one arg `[:hello 42]`.
 * 
 *   You cannot rely on the ordering in which effects are executed, other than that
 *   `:db` is guaranteed to be executed first.
 */
re_frame.fx.do_fx = re_frame.interceptor.__GT_interceptor.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"id","id",-1388402092),new cljs.core.Keyword(null,"do-fx","do-fx",1194163050),new cljs.core.Keyword(null,"after","after",594996914),(function re_frame$fx$do_fx_after(context){
if(re_frame.trace.is_trace_enabled_QMARK_()){
var _STAR_current_trace_STAR__orig_val__27232 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__27233 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"op-type","op-type",-1636141668),new cljs.core.Keyword("event","do-fx","event/do-fx",1357330452)], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__27233);

try{try{var effects = new cljs.core.Keyword(null,"effects","effects",-282369292).cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,new cljs.core.Keyword(null,"db","db",993250759));
var temp__5825__auto___27354 = new cljs.core.Keyword(null,"db","db",993250759).cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5825__auto___27354)){
var new_db_27355 = temp__5825__auto___27354;
var fexpr__27235_27356 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,new cljs.core.Keyword(null,"db","db",993250759),false);
(fexpr__27235_27356.cljs$core$IFn$_invoke$arity$1 ? fexpr__27235_27356.cljs$core$IFn$_invoke$arity$1(new_db_27355) : fexpr__27235_27356.call(null,new_db_27355));
} else {
}

var seq__27236 = cljs.core.seq(effects_without_db);
var chunk__27237 = null;
var count__27238 = (0);
var i__27239 = (0);
while(true){
if((i__27239 < count__27238)){
var vec__27253 = chunk__27237.cljs$core$IIndexed$_nth$arity$2(null,i__27239);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27253,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27253,(1),null);
var temp__5823__auto___27357 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___27357)){
var effect_fn_27358 = temp__5823__auto___27357;
(effect_fn_27358.cljs$core$IFn$_invoke$arity$1 ? effect_fn_27358.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_27358.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring.",((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"event","event",301435442),effect_key))?["You may be trying to return a coeffect map from an event-fx handler. ","See https://day8.github.io/re-frame/use-cofx-as-fx/"].join(''):null)], 0));
}


var G__27359 = seq__27236;
var G__27360 = chunk__27237;
var G__27361 = count__27238;
var G__27362 = (i__27239 + (1));
seq__27236 = G__27359;
chunk__27237 = G__27360;
count__27238 = G__27361;
i__27239 = G__27362;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27236);
if(temp__5825__auto__){
var seq__27236__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27236__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27236__$1);
var G__27363 = cljs.core.chunk_rest(seq__27236__$1);
var G__27364 = c__5548__auto__;
var G__27365 = cljs.core.count(c__5548__auto__);
var G__27366 = (0);
seq__27236 = G__27363;
chunk__27237 = G__27364;
count__27238 = G__27365;
i__27239 = G__27366;
continue;
} else {
var vec__27260 = cljs.core.first(seq__27236__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27260,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27260,(1),null);
var temp__5823__auto___27367 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___27367)){
var effect_fn_27368 = temp__5823__auto___27367;
(effect_fn_27368.cljs$core$IFn$_invoke$arity$1 ? effect_fn_27368.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_27368.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring.",((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"event","event",301435442),effect_key))?["You may be trying to return a coeffect map from an event-fx handler. ","See https://day8.github.io/re-frame/use-cofx-as-fx/"].join(''):null)], 0));
}


var G__27369 = cljs.core.next(seq__27236__$1);
var G__27370 = null;
var G__27371 = (0);
var G__27372 = (0);
seq__27236 = G__27369;
chunk__27237 = G__27370;
count__27238 = G__27371;
i__27239 = G__27372;
continue;
}
} else {
return null;
}
}
break;
}
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__26908__auto___27373 = re_frame.interop.now();
var duration__26909__auto___27374 = (end__26908__auto___27373 - new cljs.core.Keyword(null,"start","start",-355208981).cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,new cljs.core.Keyword(null,"duration","duration",1444101068),duration__26909__auto___27374,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"end","end",-268185958),re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__26908__auto___27373);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__27232);
}} else {
var effects = new cljs.core.Keyword(null,"effects","effects",-282369292).cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,new cljs.core.Keyword(null,"db","db",993250759));
var temp__5825__auto___27375 = new cljs.core.Keyword(null,"db","db",993250759).cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5825__auto___27375)){
var new_db_27376 = temp__5825__auto___27375;
var fexpr__27273_27377 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,new cljs.core.Keyword(null,"db","db",993250759),false);
(fexpr__27273_27377.cljs$core$IFn$_invoke$arity$1 ? fexpr__27273_27377.cljs$core$IFn$_invoke$arity$1(new_db_27376) : fexpr__27273_27377.call(null,new_db_27376));
} else {
}

var seq__27274 = cljs.core.seq(effects_without_db);
var chunk__27275 = null;
var count__27276 = (0);
var i__27277 = (0);
while(true){
if((i__27277 < count__27276)){
var vec__27301 = chunk__27275.cljs$core$IIndexed$_nth$arity$2(null,i__27277);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27301,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27301,(1),null);
var temp__5823__auto___27378 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___27378)){
var effect_fn_27379 = temp__5823__auto___27378;
(effect_fn_27379.cljs$core$IFn$_invoke$arity$1 ? effect_fn_27379.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_27379.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring.",((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"event","event",301435442),effect_key))?["You may be trying to return a coeffect map from an event-fx handler. ","See https://day8.github.io/re-frame/use-cofx-as-fx/"].join(''):null)], 0));
}


var G__27380 = seq__27274;
var G__27381 = chunk__27275;
var G__27382 = count__27276;
var G__27383 = (i__27277 + (1));
seq__27274 = G__27380;
chunk__27275 = G__27381;
count__27276 = G__27382;
i__27277 = G__27383;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27274);
if(temp__5825__auto__){
var seq__27274__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27274__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27274__$1);
var G__27384 = cljs.core.chunk_rest(seq__27274__$1);
var G__27385 = c__5548__auto__;
var G__27386 = cljs.core.count(c__5548__auto__);
var G__27387 = (0);
seq__27274 = G__27384;
chunk__27275 = G__27385;
count__27276 = G__27386;
i__27277 = G__27387;
continue;
} else {
var vec__27306 = cljs.core.first(seq__27274__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27306,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27306,(1),null);
var temp__5823__auto___27388 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___27388)){
var effect_fn_27389 = temp__5823__auto___27388;
(effect_fn_27389.cljs$core$IFn$_invoke$arity$1 ? effect_fn_27389.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_27389.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring.",((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"event","event",301435442),effect_key))?["You may be trying to return a coeffect map from an event-fx handler. ","See https://day8.github.io/re-frame/use-cofx-as-fx/"].join(''):null)], 0));
}


var G__27390 = cljs.core.next(seq__27274__$1);
var G__27391 = null;
var G__27392 = (0);
var G__27393 = (0);
seq__27274 = G__27390;
chunk__27275 = G__27391;
count__27276 = G__27392;
i__27277 = G__27393;
continue;
}
} else {
return null;
}
}
break;
}
}
})], 0));
re_frame.fx.dispatch_later = (function re_frame$fx$dispatch_later(p__27313){
var map__27314 = p__27313;
var map__27314__$1 = cljs.core.__destructure_map(map__27314);
var effect = map__27314__$1;
var ms = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__27314__$1,new cljs.core.Keyword(null,"ms","ms",-1152709733));
var dispatch = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__27314__$1,new cljs.core.Keyword(null,"dispatch","dispatch",1319337009));
if(((cljs.core.empty_QMARK_(dispatch)) || ((!(typeof ms === 'number'))))){
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"error","error",-978969032),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: ignoring bad :dispatch-later value:",effect], 0));
} else {
return re_frame.interop.set_timeout_BANG_((function (){
return re_frame.router.dispatch(dispatch);
}),ms);
}
});
re_frame.fx.reg_fx(new cljs.core.Keyword(null,"dispatch-later","dispatch-later",291951390),(function (value){
if(cljs.core.map_QMARK_(value)){
return re_frame.fx.dispatch_later(value);
} else {
var seq__27318 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__27319 = null;
var count__27320 = (0);
var i__27321 = (0);
while(true){
if((i__27321 < count__27320)){
var effect = chunk__27319.cljs$core$IIndexed$_nth$arity$2(null,i__27321);
re_frame.fx.dispatch_later(effect);


var G__27394 = seq__27318;
var G__27395 = chunk__27319;
var G__27396 = count__27320;
var G__27397 = (i__27321 + (1));
seq__27318 = G__27394;
chunk__27319 = G__27395;
count__27320 = G__27396;
i__27321 = G__27397;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27318);
if(temp__5825__auto__){
var seq__27318__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27318__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27318__$1);
var G__27398 = cljs.core.chunk_rest(seq__27318__$1);
var G__27399 = c__5548__auto__;
var G__27400 = cljs.core.count(c__5548__auto__);
var G__27401 = (0);
seq__27318 = G__27398;
chunk__27319 = G__27399;
count__27320 = G__27400;
i__27321 = G__27401;
continue;
} else {
var effect = cljs.core.first(seq__27318__$1);
re_frame.fx.dispatch_later(effect);


var G__27402 = cljs.core.next(seq__27318__$1);
var G__27403 = null;
var G__27404 = (0);
var G__27405 = (0);
seq__27318 = G__27402;
chunk__27319 = G__27403;
count__27320 = G__27404;
i__27321 = G__27405;
continue;
}
} else {
return null;
}
}
break;
}
}
}));
re_frame.fx.reg_fx(new cljs.core.Keyword(null,"fx","fx",-1237829572),(function (seq_of_effects){
if((!(cljs.core.sequential_QMARK_(seq_of_effects)))){
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect expects a seq, but was given ",cljs.core.type(seq_of_effects)], 0));
} else {
var seq__27328 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,seq_of_effects));
var chunk__27329 = null;
var count__27330 = (0);
var i__27331 = (0);
while(true){
if((i__27331 < count__27330)){
var vec__27338 = chunk__27329.cljs$core$IIndexed$_nth$arity$2(null,i__27331);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27338,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27338,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"db","db",993250759),effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5823__auto___27406 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___27406)){
var effect_fn_27407 = temp__5823__auto___27406;
(effect_fn_27407.cljs$core$IFn$_invoke$arity$1 ? effect_fn_27407.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_27407.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__27408 = seq__27328;
var G__27409 = chunk__27329;
var G__27410 = count__27330;
var G__27411 = (i__27331 + (1));
seq__27328 = G__27408;
chunk__27329 = G__27409;
count__27330 = G__27410;
i__27331 = G__27411;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27328);
if(temp__5825__auto__){
var seq__27328__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27328__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27328__$1);
var G__27412 = cljs.core.chunk_rest(seq__27328__$1);
var G__27413 = c__5548__auto__;
var G__27414 = cljs.core.count(c__5548__auto__);
var G__27415 = (0);
seq__27328 = G__27412;
chunk__27329 = G__27413;
count__27330 = G__27414;
i__27331 = G__27415;
continue;
} else {
var vec__27341 = cljs.core.first(seq__27328__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27341,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27341,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"db","db",993250759),effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5823__auto___27416 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___27416)){
var effect_fn_27417 = temp__5823__auto___27416;
(effect_fn_27417.cljs$core$IFn$_invoke$arity$1 ? effect_fn_27417.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_27417.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__27418 = cljs.core.next(seq__27328__$1);
var G__27419 = null;
var G__27420 = (0);
var G__27421 = (0);
seq__27328 = G__27418;
chunk__27329 = G__27419;
count__27330 = G__27420;
i__27331 = G__27421;
continue;
}
} else {
return null;
}
}
break;
}
}
}));
re_frame.fx.reg_fx(new cljs.core.Keyword(null,"dispatch","dispatch",1319337009),(function (value){
if((!(cljs.core.vector_QMARK_(value)))){
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"error","error",-978969032),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: ignoring bad :dispatch value. Expected a vector, but got:",value], 0));
} else {
return re_frame.router.dispatch(value);
}
}));
re_frame.fx.reg_fx(new cljs.core.Keyword(null,"dispatch-n","dispatch-n",-504469236),(function (value){
if((!(cljs.core.sequential_QMARK_(value)))){
return re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"error","error",-978969032),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: ignoring bad :dispatch-n value. Expected a collection, but got:",value], 0));
} else {
var seq__27344 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__27345 = null;
var count__27346 = (0);
var i__27347 = (0);
while(true){
if((i__27347 < count__27346)){
var event = chunk__27345.cljs$core$IIndexed$_nth$arity$2(null,i__27347);
re_frame.router.dispatch(event);


var G__27422 = seq__27344;
var G__27423 = chunk__27345;
var G__27424 = count__27346;
var G__27425 = (i__27347 + (1));
seq__27344 = G__27422;
chunk__27345 = G__27423;
count__27346 = G__27424;
i__27347 = G__27425;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27344);
if(temp__5825__auto__){
var seq__27344__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27344__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27344__$1);
var G__27426 = cljs.core.chunk_rest(seq__27344__$1);
var G__27427 = c__5548__auto__;
var G__27428 = cljs.core.count(c__5548__auto__);
var G__27429 = (0);
seq__27344 = G__27426;
chunk__27345 = G__27427;
count__27346 = G__27428;
i__27347 = G__27429;
continue;
} else {
var event = cljs.core.first(seq__27344__$1);
re_frame.router.dispatch(event);


var G__27430 = cljs.core.next(seq__27344__$1);
var G__27431 = null;
var G__27432 = (0);
var G__27433 = (0);
seq__27344 = G__27430;
chunk__27345 = G__27431;
count__27346 = G__27432;
i__27347 = G__27433;
continue;
}
} else {
return null;
}
}
break;
}
}
}));
re_frame.fx.reg_fx(new cljs.core.Keyword(null,"deregister-event-handler","deregister-event-handler",-1096518994),(function (value){
var clear_event = cljs.core.partial.cljs$core$IFn$_invoke$arity$2(re_frame.registrar.clear_handlers,re_frame.events.kind);
if(cljs.core.sequential_QMARK_(value)){
var seq__27348 = cljs.core.seq(value);
var chunk__27349 = null;
var count__27350 = (0);
var i__27351 = (0);
while(true){
if((i__27351 < count__27350)){
var event = chunk__27349.cljs$core$IIndexed$_nth$arity$2(null,i__27351);
clear_event(event);


var G__27434 = seq__27348;
var G__27435 = chunk__27349;
var G__27436 = count__27350;
var G__27437 = (i__27351 + (1));
seq__27348 = G__27434;
chunk__27349 = G__27435;
count__27350 = G__27436;
i__27351 = G__27437;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27348);
if(temp__5825__auto__){
var seq__27348__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27348__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27348__$1);
var G__27438 = cljs.core.chunk_rest(seq__27348__$1);
var G__27439 = c__5548__auto__;
var G__27440 = cljs.core.count(c__5548__auto__);
var G__27441 = (0);
seq__27348 = G__27438;
chunk__27349 = G__27439;
count__27350 = G__27440;
i__27351 = G__27441;
continue;
} else {
var event = cljs.core.first(seq__27348__$1);
clear_event(event);


var G__27442 = cljs.core.next(seq__27348__$1);
var G__27443 = null;
var G__27444 = (0);
var G__27445 = (0);
seq__27348 = G__27442;
chunk__27349 = G__27443;
count__27350 = G__27444;
i__27351 = G__27445;
continue;
}
} else {
return null;
}
}
break;
}
} else {
return clear_event(value);
}
}));
re_frame.fx.reg_fx(new cljs.core.Keyword(null,"db","db",993250759),(function (value){
if((!((cljs.core.deref(re_frame.db.app_db) === value)))){
return cljs.core.reset_BANG_(re_frame.db.app_db,value);
} else {
if(re_frame.trace.is_trace_enabled_QMARK_()){
var _STAR_current_trace_STAR__orig_val__27352 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__27353 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"op-type","op-type",-1636141668),new cljs.core.Keyword("reagent","quiescent","reagent/quiescent",-16138681)], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__27353);

try{try{return null;
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__26908__auto___27446 = re_frame.interop.now();
var duration__26909__auto___27447 = (end__26908__auto___27446 - new cljs.core.Keyword(null,"start","start",-355208981).cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,new cljs.core.Keyword(null,"duration","duration",1444101068),duration__26909__auto___27447,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"end","end",-268185958),re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__26908__auto___27446);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__27352);
}} else {
return null;
}
}
}));

//# sourceMappingURL=re_frame.fx.js.map
