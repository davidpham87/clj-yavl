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
var _STAR_current_trace_STAR__orig_val__21544 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__21545 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"op-type","op-type",-1636141668),new cljs.core.Keyword("event","do-fx","event/do-fx",1357330452)], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__21545);

try{try{var effects = new cljs.core.Keyword(null,"effects","effects",-282369292).cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,new cljs.core.Keyword(null,"db","db",993250759));
var temp__5825__auto___21661 = new cljs.core.Keyword(null,"db","db",993250759).cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5825__auto___21661)){
var new_db_21662 = temp__5825__auto___21661;
var fexpr__21556_21663 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,new cljs.core.Keyword(null,"db","db",993250759),false);
(fexpr__21556_21663.cljs$core$IFn$_invoke$arity$1 ? fexpr__21556_21663.cljs$core$IFn$_invoke$arity$1(new_db_21662) : fexpr__21556_21663.call(null,new_db_21662));
} else {
}

var seq__21558 = cljs.core.seq(effects_without_db);
var chunk__21559 = null;
var count__21560 = (0);
var i__21561 = (0);
while(true){
if((i__21561 < count__21560)){
var vec__21588 = chunk__21559.cljs$core$IIndexed$_nth$arity$2(null,i__21561);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21588,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21588,(1),null);
var temp__5823__auto___21664 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___21664)){
var effect_fn_21665 = temp__5823__auto___21664;
(effect_fn_21665.cljs$core$IFn$_invoke$arity$1 ? effect_fn_21665.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_21665.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring.",((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"event","event",301435442),effect_key))?["You may be trying to return a coeffect map from an event-fx handler. ","See https://day8.github.io/re-frame/use-cofx-as-fx/"].join(''):null)], 0));
}


var G__21668 = seq__21558;
var G__21669 = chunk__21559;
var G__21670 = count__21560;
var G__21671 = (i__21561 + (1));
seq__21558 = G__21668;
chunk__21559 = G__21669;
count__21560 = G__21670;
i__21561 = G__21671;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__21558);
if(temp__5825__auto__){
var seq__21558__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__21558__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__21558__$1);
var G__21672 = cljs.core.chunk_rest(seq__21558__$1);
var G__21673 = c__5548__auto__;
var G__21674 = cljs.core.count(c__5548__auto__);
var G__21675 = (0);
seq__21558 = G__21672;
chunk__21559 = G__21673;
count__21560 = G__21674;
i__21561 = G__21675;
continue;
} else {
var vec__21592 = cljs.core.first(seq__21558__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21592,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21592,(1),null);
var temp__5823__auto___21676 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___21676)){
var effect_fn_21677 = temp__5823__auto___21676;
(effect_fn_21677.cljs$core$IFn$_invoke$arity$1 ? effect_fn_21677.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_21677.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring.",((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"event","event",301435442),effect_key))?["You may be trying to return a coeffect map from an event-fx handler. ","See https://day8.github.io/re-frame/use-cofx-as-fx/"].join(''):null)], 0));
}


var G__21678 = cljs.core.next(seq__21558__$1);
var G__21679 = null;
var G__21680 = (0);
var G__21681 = (0);
seq__21558 = G__21678;
chunk__21559 = G__21679;
count__21560 = G__21680;
i__21561 = G__21681;
continue;
}
} else {
return null;
}
}
break;
}
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__21218__auto___21682 = re_frame.interop.now();
var duration__21219__auto___21683 = (end__21218__auto___21682 - new cljs.core.Keyword(null,"start","start",-355208981).cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,new cljs.core.Keyword(null,"duration","duration",1444101068),duration__21219__auto___21683,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"end","end",-268185958),re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__21218__auto___21682);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__21544);
}} else {
var effects = new cljs.core.Keyword(null,"effects","effects",-282369292).cljs$core$IFn$_invoke$arity$1(context);
var effects_without_db = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(effects,new cljs.core.Keyword(null,"db","db",993250759));
var temp__5825__auto___21684 = new cljs.core.Keyword(null,"db","db",993250759).cljs$core$IFn$_invoke$arity$1(effects);
if(cljs.core.truth_(temp__5825__auto___21684)){
var new_db_21685 = temp__5825__auto___21684;
var fexpr__21595_21686 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,new cljs.core.Keyword(null,"db","db",993250759),false);
(fexpr__21595_21686.cljs$core$IFn$_invoke$arity$1 ? fexpr__21595_21686.cljs$core$IFn$_invoke$arity$1(new_db_21685) : fexpr__21595_21686.call(null,new_db_21685));
} else {
}

var seq__21598 = cljs.core.seq(effects_without_db);
var chunk__21599 = null;
var count__21600 = (0);
var i__21601 = (0);
while(true){
if((i__21601 < count__21600)){
var vec__21608 = chunk__21599.cljs$core$IIndexed$_nth$arity$2(null,i__21601);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21608,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21608,(1),null);
var temp__5823__auto___21687 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___21687)){
var effect_fn_21688 = temp__5823__auto___21687;
(effect_fn_21688.cljs$core$IFn$_invoke$arity$1 ? effect_fn_21688.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_21688.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring.",((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"event","event",301435442),effect_key))?["You may be trying to return a coeffect map from an event-fx handler. ","See https://day8.github.io/re-frame/use-cofx-as-fx/"].join(''):null)], 0));
}


var G__21689 = seq__21598;
var G__21690 = chunk__21599;
var G__21691 = count__21600;
var G__21692 = (i__21601 + (1));
seq__21598 = G__21689;
chunk__21599 = G__21690;
count__21600 = G__21691;
i__21601 = G__21692;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__21598);
if(temp__5825__auto__){
var seq__21598__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__21598__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__21598__$1);
var G__21693 = cljs.core.chunk_rest(seq__21598__$1);
var G__21694 = c__5548__auto__;
var G__21695 = cljs.core.count(c__5548__auto__);
var G__21696 = (0);
seq__21598 = G__21693;
chunk__21599 = G__21694;
count__21600 = G__21695;
i__21601 = G__21696;
continue;
} else {
var vec__21611 = cljs.core.first(seq__21598__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21611,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21611,(1),null);
var temp__5823__auto___21698 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___21698)){
var effect_fn_21699 = temp__5823__auto___21698;
(effect_fn_21699.cljs$core$IFn$_invoke$arity$1 ? effect_fn_21699.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_21699.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: no handler registered for effect:",effect_key,". Ignoring.",((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"event","event",301435442),effect_key))?["You may be trying to return a coeffect map from an event-fx handler. ","See https://day8.github.io/re-frame/use-cofx-as-fx/"].join(''):null)], 0));
}


var G__21700 = cljs.core.next(seq__21598__$1);
var G__21701 = null;
var G__21702 = (0);
var G__21703 = (0);
seq__21598 = G__21700;
chunk__21599 = G__21701;
count__21600 = G__21702;
i__21601 = G__21703;
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
re_frame.fx.dispatch_later = (function re_frame$fx$dispatch_later(p__21614){
var map__21615 = p__21614;
var map__21615__$1 = cljs.core.__destructure_map(map__21615);
var effect = map__21615__$1;
var ms = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__21615__$1,new cljs.core.Keyword(null,"ms","ms",-1152709733));
var dispatch = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__21615__$1,new cljs.core.Keyword(null,"dispatch","dispatch",1319337009));
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
var seq__21617 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__21618 = null;
var count__21619 = (0);
var i__21620 = (0);
while(true){
if((i__21620 < count__21619)){
var effect = chunk__21618.cljs$core$IIndexed$_nth$arity$2(null,i__21620);
re_frame.fx.dispatch_later(effect);


var G__21704 = seq__21617;
var G__21705 = chunk__21618;
var G__21706 = count__21619;
var G__21707 = (i__21620 + (1));
seq__21617 = G__21704;
chunk__21618 = G__21705;
count__21619 = G__21706;
i__21620 = G__21707;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__21617);
if(temp__5825__auto__){
var seq__21617__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__21617__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__21617__$1);
var G__21708 = cljs.core.chunk_rest(seq__21617__$1);
var G__21709 = c__5548__auto__;
var G__21710 = cljs.core.count(c__5548__auto__);
var G__21711 = (0);
seq__21617 = G__21708;
chunk__21618 = G__21709;
count__21619 = G__21710;
i__21620 = G__21711;
continue;
} else {
var effect = cljs.core.first(seq__21617__$1);
re_frame.fx.dispatch_later(effect);


var G__21712 = cljs.core.next(seq__21617__$1);
var G__21713 = null;
var G__21714 = (0);
var G__21715 = (0);
seq__21617 = G__21712;
chunk__21618 = G__21713;
count__21619 = G__21714;
i__21620 = G__21715;
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
var seq__21621 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,seq_of_effects));
var chunk__21622 = null;
var count__21623 = (0);
var i__21624 = (0);
while(true){
if((i__21624 < count__21623)){
var vec__21634 = chunk__21622.cljs$core$IIndexed$_nth$arity$2(null,i__21624);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21634,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21634,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"db","db",993250759),effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5823__auto___21721 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___21721)){
var effect_fn_21722 = temp__5823__auto___21721;
(effect_fn_21722.cljs$core$IFn$_invoke$arity$1 ? effect_fn_21722.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_21722.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__21723 = seq__21621;
var G__21724 = chunk__21622;
var G__21725 = count__21623;
var G__21726 = (i__21624 + (1));
seq__21621 = G__21723;
chunk__21622 = G__21724;
count__21623 = G__21725;
i__21624 = G__21726;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__21621);
if(temp__5825__auto__){
var seq__21621__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__21621__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__21621__$1);
var G__21727 = cljs.core.chunk_rest(seq__21621__$1);
var G__21728 = c__5548__auto__;
var G__21729 = cljs.core.count(c__5548__auto__);
var G__21730 = (0);
seq__21621 = G__21727;
chunk__21622 = G__21728;
count__21623 = G__21729;
i__21624 = G__21730;
continue;
} else {
var vec__21640 = cljs.core.first(seq__21621__$1);
var effect_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21640,(0),null);
var effect_value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__21640,(1),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"db","db",993250759),effect_key)){
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: \":fx\" effect should not contain a :db effect"], 0));
} else {
}

var temp__5823__auto___21731 = re_frame.registrar.get_handler.cljs$core$IFn$_invoke$arity$3(re_frame.fx.kind,effect_key,false);
if(cljs.core.truth_(temp__5823__auto___21731)){
var effect_fn_21732 = temp__5823__auto___21731;
(effect_fn_21732.cljs$core$IFn$_invoke$arity$1 ? effect_fn_21732.cljs$core$IFn$_invoke$arity$1(effect_value) : effect_fn_21732.call(null,effect_value));
} else {
re_frame.loggers.console.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"warn","warn",-436710552),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2(["re-frame: in \":fx\" effect found ",effect_key," which has no associated handler. Ignoring."], 0));
}


var G__21733 = cljs.core.next(seq__21621__$1);
var G__21734 = null;
var G__21735 = (0);
var G__21736 = (0);
seq__21621 = G__21733;
chunk__21622 = G__21734;
count__21623 = G__21735;
i__21624 = G__21736;
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
var seq__21643 = cljs.core.seq(cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,value));
var chunk__21644 = null;
var count__21645 = (0);
var i__21646 = (0);
while(true){
if((i__21646 < count__21645)){
var event = chunk__21644.cljs$core$IIndexed$_nth$arity$2(null,i__21646);
re_frame.router.dispatch(event);


var G__21742 = seq__21643;
var G__21743 = chunk__21644;
var G__21744 = count__21645;
var G__21745 = (i__21646 + (1));
seq__21643 = G__21742;
chunk__21644 = G__21743;
count__21645 = G__21744;
i__21646 = G__21745;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__21643);
if(temp__5825__auto__){
var seq__21643__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__21643__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__21643__$1);
var G__21746 = cljs.core.chunk_rest(seq__21643__$1);
var G__21747 = c__5548__auto__;
var G__21748 = cljs.core.count(c__5548__auto__);
var G__21749 = (0);
seq__21643 = G__21746;
chunk__21644 = G__21747;
count__21645 = G__21748;
i__21646 = G__21749;
continue;
} else {
var event = cljs.core.first(seq__21643__$1);
re_frame.router.dispatch(event);


var G__21750 = cljs.core.next(seq__21643__$1);
var G__21751 = null;
var G__21752 = (0);
var G__21753 = (0);
seq__21643 = G__21750;
chunk__21644 = G__21751;
count__21645 = G__21752;
i__21646 = G__21753;
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
var seq__21651 = cljs.core.seq(value);
var chunk__21652 = null;
var count__21653 = (0);
var i__21654 = (0);
while(true){
if((i__21654 < count__21653)){
var event = chunk__21652.cljs$core$IIndexed$_nth$arity$2(null,i__21654);
clear_event(event);


var G__21754 = seq__21651;
var G__21755 = chunk__21652;
var G__21756 = count__21653;
var G__21757 = (i__21654 + (1));
seq__21651 = G__21754;
chunk__21652 = G__21755;
count__21653 = G__21756;
i__21654 = G__21757;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__21651);
if(temp__5825__auto__){
var seq__21651__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__21651__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__21651__$1);
var G__21758 = cljs.core.chunk_rest(seq__21651__$1);
var G__21759 = c__5548__auto__;
var G__21760 = cljs.core.count(c__5548__auto__);
var G__21761 = (0);
seq__21651 = G__21758;
chunk__21652 = G__21759;
count__21653 = G__21760;
i__21654 = G__21761;
continue;
} else {
var event = cljs.core.first(seq__21651__$1);
clear_event(event);


var G__21762 = cljs.core.next(seq__21651__$1);
var G__21763 = null;
var G__21764 = (0);
var G__21765 = (0);
seq__21651 = G__21762;
chunk__21652 = G__21763;
count__21653 = G__21764;
i__21654 = G__21765;
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
var _STAR_current_trace_STAR__orig_val__21659 = re_frame.trace._STAR_current_trace_STAR_;
var _STAR_current_trace_STAR__temp_val__21660 = re_frame.trace.start_trace(new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"op-type","op-type",-1636141668),new cljs.core.Keyword("reagent","quiescent","reagent/quiescent",-16138681)], null));
(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__temp_val__21660);

try{try{return null;
}finally {if(re_frame.trace.is_trace_enabled_QMARK_()){
var end__21218__auto___21769 = re_frame.interop.now();
var duration__21219__auto___21770 = (end__21218__auto___21769 - new cljs.core.Keyword(null,"start","start",-355208981).cljs$core$IFn$_invoke$arity$1(re_frame.trace._STAR_current_trace_STAR_));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(re_frame.trace.traces,cljs.core.conj,cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(re_frame.trace._STAR_current_trace_STAR_,new cljs.core.Keyword(null,"duration","duration",1444101068),duration__21219__auto___21770,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"end","end",-268185958),re_frame.interop.now()], 0)));

re_frame.trace.run_tracing_callbacks_BANG_(end__21218__auto___21769);
} else {
}
}}finally {(re_frame.trace._STAR_current_trace_STAR_ = _STAR_current_trace_STAR__orig_val__21659);
}} else {
return null;
}
}
}));

//# sourceMappingURL=re_frame.fx.js.map
