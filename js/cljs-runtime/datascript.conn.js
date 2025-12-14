goog.provide('datascript.conn');

/**
* @constructor
 * @implements {cljs.core.IWatchable}
 * @implements {cljs.core.IEquiv}
 * @implements {cljs.core.IHash}
 * @implements {cljs.core.IReset}
 * @implements {cljs.core.ISwap}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IDeref}
 * @implements {extend_clj.core.IAtom3}
 * @implements {cljs.core.ILookup}
*/
datascript.conn.Conn = (function (atom,validator,watches,meta){
this.atom = atom;
this.validator = validator;
this.watches = watches;
this.meta = meta;
this.cljs$lang$protocol_mask$partition1$ = 98306;
this.cljs$lang$protocol_mask$partition0$ = 6455552;
});
(datascript.conn.Conn.prototype.equiv = (function (other__25522__auto__){
var self__ = this;
var this__25521__auto__ = this;
return this__25521__auto__.cljs$core$IEquiv$_equiv$arity$2(null,other__25522__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_notify_watches$arity$3 = (function (this__25521__auto__,oldv__25529__auto__,newv__25524__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
var seq__27477 = cljs.core.seq(self__.watches);
var chunk__27478 = null;
var count__27479 = (0);
var i__27480 = (0);
while(true){
if((i__27480 < count__27479)){
var vec__27499 = chunk__27478.cljs$core$IIndexed$_nth$arity$2(null,i__27480);
var k__25530__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27499,(0),null);
var f__25525__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27499,(1),null);
(f__25525__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25525__auto__.cljs$core$IFn$_invoke$arity$4(k__25530__auto__,this__25521__auto____$1,oldv__25529__auto__,newv__25524__auto__) : f__25525__auto__.call(null,k__25530__auto__,this__25521__auto____$1,oldv__25529__auto__,newv__25524__auto__));


var G__27704 = seq__27477;
var G__27705 = chunk__27478;
var G__27706 = count__27479;
var G__27707 = (i__27480 + (1));
seq__27477 = G__27704;
chunk__27478 = G__27705;
count__27479 = G__27706;
i__27480 = G__27707;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27477);
if(temp__5825__auto__){
var seq__27477__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27477__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27477__$1);
var G__27709 = cljs.core.chunk_rest(seq__27477__$1);
var G__27710 = c__5548__auto__;
var G__27711 = cljs.core.count(c__5548__auto__);
var G__27712 = (0);
seq__27477 = G__27709;
chunk__27478 = G__27710;
count__27479 = G__27711;
i__27480 = G__27712;
continue;
} else {
var vec__27502 = cljs.core.first(seq__27477__$1);
var k__25530__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27502,(0),null);
var f__25525__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27502,(1),null);
(f__25525__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25525__auto__.cljs$core$IFn$_invoke$arity$4(k__25530__auto__,this__25521__auto____$1,oldv__25529__auto__,newv__25524__auto__) : f__25525__auto__.call(null,k__25530__auto__,this__25521__auto____$1,oldv__25529__auto__,newv__25524__auto__));


var G__27713 = cljs.core.next(seq__27477__$1);
var G__27714 = null;
var G__27715 = (0);
var G__27716 = (0);
seq__27477 = G__27713;
chunk__27478 = G__27714;
count__27479 = G__27715;
i__27480 = G__27716;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_add_watch$arity$3 = (function (this__25521__auto__,key__25531__auto__,f__25525__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
(this__25521__auto____$1.watches = cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(self__.watches,key__25531__auto__,f__25525__auto__));

return this__25521__auto____$1;
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_remove_watch$arity$2 = (function (this__25521__auto__,key__25531__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return (this__25521__auto____$1.watches = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(self__.watches,key__25531__auto__));
}));

(datascript.conn.Conn.prototype.cljs$core$IEquiv$_equiv$arity$2 = (function (o__25523__auto__,other__25522__auto__){
var self__ = this;
var o__25523__auto____$1 = this;
return (o__25523__auto____$1 === other__25522__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IHash$_hash$arity$1 = (function (this__25521__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return goog.getUid(this__25521__auto____$1);
}));

(datascript.conn.Conn.prototype.cljs$core$IReset$_reset_BANG_$arity$2 = (function (this__25521__auto__,newv__25524__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25521__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,cljs.core.constantly(newv__25524__auto__),cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$2 = (function (this__25521__auto__,f__25525__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25521__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25525__auto__,cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$3 = (function (this__25521__auto__,f__25525__auto__,a__25526__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25521__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25525__auto__,(new cljs.core.List(null,a__25526__auto__,null,(1),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$4 = (function (this__25521__auto__,f__25525__auto__,a__25526__auto__,b__25527__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25521__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25525__auto__,(new cljs.core.List(null,a__25526__auto__,(new cljs.core.List(null,b__25527__auto__,null,(1),null)),(2),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$5 = (function (this__25521__auto__,f__25525__auto__,a__25526__auto__,b__25527__auto__,xs__25528__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25521__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25525__auto__,cljs.core.cons(a__25526__auto__,cljs.core.cons(b__25527__auto__,xs__25528__auto__))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$IMeta$_meta$arity$1 = (function (this__25521__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return self__.meta;
}));

(datascript.conn.Conn.prototype.cljs$core$IDeref$_deref$arity$1 = (function (this__25521__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return this__25521__auto____$1.extend_clj$core$IAtom3$deref_impl$arity$1(null);
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$ = cljs.core.PROTOCOL_SENTINEL);

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$validate$arity$3 = (function (this__25521__auto__,validator__25533__auto__,value__25534__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
if((!((validator__25533__auto__ == null)))){
if(cljs.core.truth_((validator__25533__auto__.cljs$core$IFn$_invoke$arity$1 ? validator__25533__auto__.cljs$core$IFn$_invoke$arity$1(value__25534__auto__) : validator__25533__auto__.call(null,value__25534__auto__)))){
return null;
} else {
throw cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2("Invalid reference state",new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),value__25534__auto__], null));
}
} else {
return null;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$notify_watches$arity$3 = (function (this__25521__auto__,oldv__25529__auto__,newv__25524__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
var seq__27529 = cljs.core.seq(self__.watches);
var chunk__27530 = null;
var count__27531 = (0);
var i__27532 = (0);
while(true){
if((i__27532 < count__27531)){
var vec__27553 = chunk__27530.cljs$core$IIndexed$_nth$arity$2(null,i__27532);
var k__25530__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27553,(0),null);
var w__25535__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27553,(1),null);
(w__25535__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25535__auto__.cljs$core$IFn$_invoke$arity$4(k__25530__auto__,this__25521__auto____$1,oldv__25529__auto__,newv__25524__auto__) : w__25535__auto__.call(null,k__25530__auto__,this__25521__auto____$1,oldv__25529__auto__,newv__25524__auto__));


var G__27722 = seq__27529;
var G__27723 = chunk__27530;
var G__27724 = count__27531;
var G__27725 = (i__27532 + (1));
seq__27529 = G__27722;
chunk__27530 = G__27723;
count__27531 = G__27724;
i__27532 = G__27725;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27529);
if(temp__5825__auto__){
var seq__27529__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27529__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27529__$1);
var G__27726 = cljs.core.chunk_rest(seq__27529__$1);
var G__27727 = c__5548__auto__;
var G__27728 = cljs.core.count(c__5548__auto__);
var G__27729 = (0);
seq__27529 = G__27726;
chunk__27530 = G__27727;
count__27531 = G__27728;
i__27532 = G__27729;
continue;
} else {
var vec__27559 = cljs.core.first(seq__27529__$1);
var k__25530__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27559,(0),null);
var w__25535__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27559,(1),null);
(w__25535__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25535__auto__.cljs$core$IFn$_invoke$arity$4(k__25530__auto__,this__25521__auto____$1,oldv__25529__auto__,newv__25524__auto__) : w__25535__auto__.call(null,k__25530__auto__,this__25521__auto____$1,oldv__25529__auto__,newv__25524__auto__));


var G__27730 = cljs.core.next(seq__27529__$1);
var G__27731 = null;
var G__27732 = (0);
var G__27733 = (0);
seq__27529 = G__27730;
chunk__27530 = G__27731;
count__27531 = G__27732;
i__27532 = G__27733;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$swap_STAR_$arity$3 = (function (this__25521__auto__,f__25525__auto__,args__25536__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
var oldv__25529__auto__ = cljs.core.deref(this__25521__auto____$1);
var newv__25524__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$3(f__25525__auto__,oldv__25529__auto__,args__25536__auto__);
this__25521__auto____$1.extend_clj$core$IAtom3$validate$arity$3(null,self__.validator,newv__25524__auto__);

this__25521__auto____$1.extend_clj$core$IAtom3$compare_and_set_impl$arity$3(null,oldv__25529__auto__,newv__25524__auto__);

this__25521__auto____$1.extend_clj$core$IAtom3$notify_watches$arity$3(null,oldv__25529__auto__,newv__25524__auto__);

return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [oldv__25529__auto__,newv__25524__auto__], null);
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$deref_impl$arity$1 = (function (this$){
var self__ = this;
var this$__$1 = this;
return new cljs.core.Keyword(null,"db","db",993250759).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(self__.atom));
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$compare_and_set_impl$arity$3 = (function (this$,oldv,newv){
var self__ = this;
var this$__$1 = this;
return cljs.core.compare_and_set_BANG_(self__.atom,cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(cljs.core.deref(self__.atom),new cljs.core.Keyword(null,"db","db",993250759),oldv),cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(cljs.core.deref(self__.atom),new cljs.core.Keyword(null,"db","db",993250759),newv));
}));

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$2 = (function (this__25521__auto__,k__25530__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
return this__25521__auto____$1.cljs$core$ILookup$_lookup$arity$3(null,k__25530__auto__,null);
}));

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$3 = (function (this__25521__auto__,k__25530__auto__,not_found__25532__auto__){
var self__ = this;
var this__25521__auto____$1 = this;
var G__27570 = k__25530__auto__;
var G__27570__$1 = (((G__27570 instanceof cljs.core.Keyword))?G__27570.fqn:null);
switch (G__27570__$1) {
case "atom":
return self__.atom;

break;
default:
return not_found__25532__auto__;

}
}));

(datascript.conn.Conn.getBasis = (function (){
return new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"atom","atom",1243487874,null),new cljs.core.Symbol(null,"validator","validator",-325659154,null),new cljs.core.Symbol(null,"watches","watches",1367433992,null),new cljs.core.Symbol(null,"meta","meta",-1154898805,null)], null);
}));

(datascript.conn.Conn.cljs$lang$type = true);

(datascript.conn.Conn.cljs$lang$ctorStr = "datascript.conn/Conn");

(datascript.conn.Conn.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"datascript.conn/Conn");
}));

/**
 * Positional factory function for datascript.conn/Conn.
 */
datascript.conn.__GT_Conn = (function datascript$conn$__GT_Conn(atom,validator,watches,meta){
return (new datascript.conn.Conn(atom,validator,watches,meta));
});


datascript.conn.__GT_Conn = (function datascript$conn$__GT_Conn(var_args){
var G__27574 = arguments.length;
switch (G__27574) {
case 1:
return datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___27736 = arguments.length;
var i__5750__auto___27737 = (0);
while(true){
if((i__5750__auto___27737 < len__5749__auto___27736)){
args_arr__5774__auto__.push((arguments[i__5750__auto___27737]));

var G__27738 = (i__5750__auto___27737 + (1));
i__5750__auto___27737 = G__27738;
continue;
} else {
}
break;
}

var argseq__5775__auto__ = ((((1) < args_arr__5774__auto__.length))?(new cljs.core.IndexedSeq(args_arr__5774__auto__.slice((1)),(0),null)):null);
return datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__5775__auto__);

}
});

(datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1 = (function (atom){
return (new datascript.conn.Conn(atom,null,cljs.core.PersistentArrayMap.EMPTY,cljs.core.PersistentArrayMap.EMPTY));
}));

(datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$variadic = (function (atom,rest__25537__auto__){
var opts__25538__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.array_map,rest__25537__auto__);
var ref__25539__auto__ = (new datascript.conn.Conn(atom,null,cljs.core.PersistentArrayMap.EMPTY,cljs.core.PersistentArrayMap.EMPTY));
var temp__5829__auto___27739 = new cljs.core.Keyword(null,"validator","validator",-1966190681).cljs$core$IFn$_invoke$arity$1(opts__25538__auto__);
if((temp__5829__auto___27739 == null)){
} else {
var validator__25533__auto___27740 = temp__5829__auto___27739;
ref__25539__auto__.extend_clj$core$IAtom3$validate$arity$3(null,validator__25533__auto___27740,cljs.core.deref(ref__25539__auto__));

(ref__25539__auto__.validator = validator__25533__auto___27740);
}

var temp__5829__auto___27741 = new cljs.core.Keyword(null,"meta","meta",1499536964).cljs$core$IFn$_invoke$arity$1(opts__25538__auto__);
if((temp__5829__auto___27741 == null)){
} else {
var meta__25540__auto___27742 = temp__5829__auto___27741;
cljs.core.reset_meta_BANG_(ref__25539__auto__,meta__25540__auto___27742);
}

return ref__25539__auto__;
}));

/** @this {Function} */
(datascript.conn.__GT_Conn.cljs$lang$applyTo = (function (seq27572){
var G__27573 = cljs.core.first(seq27572);
var seq27572__$1 = cljs.core.next(seq27572);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27573,seq27572__$1);
}));

(datascript.conn.__GT_Conn.cljs$lang$maxFixedArity = (1));


datascript.conn.make_conn = (function datascript$conn$make_conn(opts){
var G__27580 = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(opts);
return (datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1 ? datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1(G__27580) : datascript.conn.__GT_Conn.call(null,G__27580));
});
datascript.conn.with$ = (function datascript$conn$with(var_args){
var G__27597 = arguments.length;
switch (G__27597) {
case 2:
return datascript.conn.with$.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
case 3:
return datascript.conn.with$.cljs$core$IFn$_invoke$arity$3((arguments[(0)]),(arguments[(1)]),(arguments[(2)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(datascript.conn.with$.cljs$core$IFn$_invoke$arity$2 = (function (db,tx_data){
return datascript.conn.with$.cljs$core$IFn$_invoke$arity$3(db,tx_data,null);
}));

(datascript.conn.with$.cljs$core$IFn$_invoke$arity$3 = (function (db,tx_data,tx_meta){
if(datascript.db.db_QMARK_(db)){
} else {
throw (new Error("Assert failed: (db/db? db)"));
}

if((db instanceof datascript.db.FilteredDB)){
throw cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2("Filtered DB cannot be modified",new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"error","error",-978969032),new cljs.core.Keyword("transaction","filtered","transaction/filtered",1699706605)], null));
} else {
return datascript.db.transact_tx_data(datascript.db.__GT_TxReport(db,db,cljs.core.PersistentVector.EMPTY,cljs.core.PersistentArrayMap.EMPTY,tx_meta),tx_data);
}
}));

(datascript.conn.with$.cljs$lang$maxFixedArity = 3);

/**
 * Applies transaction to an immutable db value, returning new immutable db value. Same as `(:db-after (with db tx-data))`.
 */
datascript.conn.db_with = (function datascript$conn$db_with(db,tx_data){
if(datascript.db.db_QMARK_(db)){
} else {
throw (new Error("Assert failed: (db/db? db)"));
}

return new cljs.core.Keyword(null,"db-after","db-after",-571884666).cljs$core$IFn$_invoke$arity$1(datascript.conn.with$.cljs$core$IFn$_invoke$arity$2(db,tx_data));
});
datascript.conn.conn_QMARK_ = (function datascript$conn$conn_QMARK_(conn){
var and__5023__auto__ = (((!((conn == null))))?(((((conn.cljs$lang$protocol_mask$partition0$ & (32768))) || ((cljs.core.PROTOCOL_SENTINEL === conn.cljs$core$IDeref$))))?true:(((!conn.cljs$lang$protocol_mask$partition0$))?cljs.core.native_satisfies_QMARK_(cljs.core.IDeref,conn):false)):cljs.core.native_satisfies_QMARK_(cljs.core.IDeref,conn));
if(and__5023__auto__){
var temp__5827__auto__ = cljs.core.deref(conn);
if((temp__5827__auto__ == null)){
return true;
} else {
var db = temp__5827__auto__;
return datascript.db.db_QMARK_(db);
}
} else {
return and__5023__auto__;
}
});
datascript.conn.conn_from_db = (function datascript$conn$conn_from_db(db){
if(datascript.db.db_QMARK_(db)){
} else {
throw (new Error("Assert failed: (db/db? db)"));
}

var temp__5827__auto__ = datascript.storage.storage(db);
if((temp__5827__auto__ == null)){
return datascript.conn.make_conn(new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"db","db",993250759),db], null));
} else {
var storage = temp__5827__auto__;
datascript.storage.store.cljs$core$IFn$_invoke$arity$1(db);

return datascript.conn.make_conn(new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"db","db",993250759),db,new cljs.core.Keyword(null,"tx-tail","tx-tail",1116487556),cljs.core.PersistentVector.EMPTY,new cljs.core.Keyword(null,"db-last-stored","db-last-stored",-2068760702),db], null));
}
});
datascript.conn.conn_from_datoms = (function datascript$conn$conn_from_datoms(var_args){
var G__27606 = arguments.length;
switch (G__27606) {
case 1:
return datascript.conn.conn_from_datoms.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return datascript.conn.conn_from_datoms.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
case 3:
return datascript.conn.conn_from_datoms.cljs$core$IFn$_invoke$arity$3((arguments[(0)]),(arguments[(1)]),(arguments[(2)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(datascript.conn.conn_from_datoms.cljs$core$IFn$_invoke$arity$1 = (function (datoms){
return datascript.conn.conn_from_db(datascript.db.init_db(datoms,null,cljs.core.PersistentArrayMap.EMPTY));
}));

(datascript.conn.conn_from_datoms.cljs$core$IFn$_invoke$arity$2 = (function (datoms,schema){
return datascript.conn.conn_from_db(datascript.db.init_db(datoms,schema,cljs.core.PersistentArrayMap.EMPTY));
}));

(datascript.conn.conn_from_datoms.cljs$core$IFn$_invoke$arity$3 = (function (datoms,schema,opts){
return datascript.conn.conn_from_db(datascript.db.init_db(datoms,schema,datascript.storage.maybe_adapt_storage(opts)));
}));

(datascript.conn.conn_from_datoms.cljs$lang$maxFixedArity = 3);

datascript.conn.create_conn = (function datascript$conn$create_conn(var_args){
var G__27613 = arguments.length;
switch (G__27613) {
case 0:
return datascript.conn.create_conn.cljs$core$IFn$_invoke$arity$0();

break;
case 1:
return datascript.conn.create_conn.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return datascript.conn.create_conn.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(datascript.conn.create_conn.cljs$core$IFn$_invoke$arity$0 = (function (){
return datascript.conn.conn_from_db(datascript.db.empty_db(null,cljs.core.PersistentArrayMap.EMPTY));
}));

(datascript.conn.create_conn.cljs$core$IFn$_invoke$arity$1 = (function (schema){
return datascript.conn.conn_from_db(datascript.db.empty_db(schema,cljs.core.PersistentArrayMap.EMPTY));
}));

(datascript.conn.create_conn.cljs$core$IFn$_invoke$arity$2 = (function (schema,opts){
return datascript.conn.conn_from_db(datascript.db.empty_db(schema,datascript.storage.maybe_adapt_storage(opts)));
}));

(datascript.conn.create_conn.cljs$lang$maxFixedArity = 2);

datascript.conn._transact_BANG_ = (function datascript$conn$_transact_BANG_(conn,tx_data,tx_meta){
if(datascript.conn.conn_QMARK_(conn)){
} else {
throw (new Error("Assert failed: (conn? conn)"));
}

var _STAR_report = cljs.core.volatile_BANG_(null);
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$2(conn,(function (db){
var r = datascript.conn.with$.cljs$core$IFn$_invoke$arity$3(db,tx_data,tx_meta);
cljs.core.vreset_BANG_(_STAR_report,r);

return new cljs.core.Keyword(null,"db-after","db-after",-571884666).cljs$core$IFn$_invoke$arity$1(r);
}));

return cljs.core.deref(_STAR_report);
});
datascript.conn.transact_BANG_ = (function datascript$conn$transact_BANG_(var_args){
var G__27635 = arguments.length;
switch (G__27635) {
case 2:
return datascript.conn.transact_BANG_.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
case 3:
return datascript.conn.transact_BANG_.cljs$core$IFn$_invoke$arity$3((arguments[(0)]),(arguments[(1)]),(arguments[(2)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(datascript.conn.transact_BANG_.cljs$core$IFn$_invoke$arity$2 = (function (conn,tx_data){
return datascript.conn.transact_BANG_.cljs$core$IFn$_invoke$arity$3(conn,tx_data,null);
}));

(datascript.conn.transact_BANG_.cljs$core$IFn$_invoke$arity$3 = (function (conn,tx_data,tx_meta){
if(datascript.conn.conn_QMARK_(conn)){
} else {
throw (new Error("Assert failed: (conn? conn)"));
}

var report = datascript.conn._transact_BANG_(conn,tx_data,tx_meta);
var seq__27644_27796 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27645_27797 = null;
var count__27646_27798 = (0);
var i__27647_27799 = (0);
while(true){
if((i__27647_27799 < count__27646_27798)){
var vec__27657_27826 = chunk__27645_27797.cljs$core$IIndexed$_nth$arity$2(null,i__27647_27799);
var __27827 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27657_27826,(0),null);
var callback_27828 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27657_27826,(1),null);
(callback_27828.cljs$core$IFn$_invoke$arity$1 ? callback_27828.cljs$core$IFn$_invoke$arity$1(report) : callback_27828.call(null,report));


var G__27829 = seq__27644_27796;
var G__27830 = chunk__27645_27797;
var G__27831 = count__27646_27798;
var G__27832 = (i__27647_27799 + (1));
seq__27644_27796 = G__27829;
chunk__27645_27797 = G__27830;
count__27646_27798 = G__27831;
i__27647_27799 = G__27832;
continue;
} else {
var temp__5825__auto___27833 = cljs.core.seq(seq__27644_27796);
if(temp__5825__auto___27833){
var seq__27644_27834__$1 = temp__5825__auto___27833;
if(cljs.core.chunked_seq_QMARK_(seq__27644_27834__$1)){
var c__5548__auto___27836 = cljs.core.chunk_first(seq__27644_27834__$1);
var G__27837 = cljs.core.chunk_rest(seq__27644_27834__$1);
var G__27838 = c__5548__auto___27836;
var G__27839 = cljs.core.count(c__5548__auto___27836);
var G__27840 = (0);
seq__27644_27796 = G__27837;
chunk__27645_27797 = G__27838;
count__27646_27798 = G__27839;
i__27647_27799 = G__27840;
continue;
} else {
var vec__27665_27842 = cljs.core.first(seq__27644_27834__$1);
var __27843 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27665_27842,(0),null);
var callback_27844 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27665_27842,(1),null);
(callback_27844.cljs$core$IFn$_invoke$arity$1 ? callback_27844.cljs$core$IFn$_invoke$arity$1(report) : callback_27844.call(null,report));


var G__27845 = cljs.core.next(seq__27644_27834__$1);
var G__27846 = null;
var G__27847 = (0);
var G__27848 = (0);
seq__27644_27796 = G__27845;
chunk__27645_27797 = G__27846;
count__27646_27798 = G__27847;
i__27647_27799 = G__27848;
continue;
}
} else {
}
}
break;
}

return report;
}));

(datascript.conn.transact_BANG_.cljs$lang$maxFixedArity = 3);

datascript.conn.reset_conn_BANG_ = (function datascript$conn$reset_conn_BANG_(var_args){
var G__27670 = arguments.length;
switch (G__27670) {
case 2:
return datascript.conn.reset_conn_BANG_.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
case 3:
return datascript.conn.reset_conn_BANG_.cljs$core$IFn$_invoke$arity$3((arguments[(0)]),(arguments[(1)]),(arguments[(2)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(datascript.conn.reset_conn_BANG_.cljs$core$IFn$_invoke$arity$2 = (function (conn,db){
return datascript.conn.reset_conn_BANG_.cljs$core$IFn$_invoke$arity$3(conn,db,null);
}));

(datascript.conn.reset_conn_BANG_.cljs$core$IFn$_invoke$arity$3 = (function (conn,db,tx_meta){
if(datascript.conn.conn_QMARK_(conn)){
} else {
throw (new Error("Assert failed: (conn? conn)"));
}

if(datascript.db.db_QMARK_(db)){
} else {
throw (new Error("Assert failed: (db/db? db)"));
}

var db_before = cljs.core.deref(conn);
var report = datascript.db.map__GT_TxReport(new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"db-before","db-before",-553691536),db_before,new cljs.core.Keyword(null,"db-after","db-after",-571884666),db,new cljs.core.Keyword(null,"tx-data","tx-data",934159761),cljs.core.concat.cljs$core$IFn$_invoke$arity$2((cljs.core.truth_(db_before)?cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p1__27668_SHARP_){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(p1__27668_SHARP_,new cljs.core.Keyword(null,"added","added",2057651688),false);
}),datascript.db._datoms(db_before,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)):null),datascript.db._datoms(db,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)),new cljs.core.Keyword(null,"tx-meta","tx-meta",1159283194),tx_meta], null));
if(cljs.core.truth_(datascript.storage.storage(db_before))){
datascript.storage.store.cljs$core$IFn$_invoke$arity$1(db);

cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn),cljs.core.assoc,new cljs.core.Keyword(null,"db","db",993250759),db,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"tx-tail","tx-tail",1116487556),cljs.core.PersistentVector.EMPTY,new cljs.core.Keyword(null,"db-last-stored","db-last-stored",-2068760702),db], 0));
} else {
cljs.core.reset_BANG_(conn,db);
}

var seq__27673_27850 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27674_27851 = null;
var count__27675_27852 = (0);
var i__27676_27853 = (0);
while(true){
if((i__27676_27853 < count__27675_27852)){
var vec__27683_27858 = chunk__27674_27851.cljs$core$IIndexed$_nth$arity$2(null,i__27676_27853);
var __27859 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27683_27858,(0),null);
var callback_27860 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27683_27858,(1),null);
(callback_27860.cljs$core$IFn$_invoke$arity$1 ? callback_27860.cljs$core$IFn$_invoke$arity$1(report) : callback_27860.call(null,report));


var G__27861 = seq__27673_27850;
var G__27862 = chunk__27674_27851;
var G__27863 = count__27675_27852;
var G__27864 = (i__27676_27853 + (1));
seq__27673_27850 = G__27861;
chunk__27674_27851 = G__27862;
count__27675_27852 = G__27863;
i__27676_27853 = G__27864;
continue;
} else {
var temp__5825__auto___27865 = cljs.core.seq(seq__27673_27850);
if(temp__5825__auto___27865){
var seq__27673_27866__$1 = temp__5825__auto___27865;
if(cljs.core.chunked_seq_QMARK_(seq__27673_27866__$1)){
var c__5548__auto___27867 = cljs.core.chunk_first(seq__27673_27866__$1);
var G__27868 = cljs.core.chunk_rest(seq__27673_27866__$1);
var G__27869 = c__5548__auto___27867;
var G__27870 = cljs.core.count(c__5548__auto___27867);
var G__27871 = (0);
seq__27673_27850 = G__27868;
chunk__27674_27851 = G__27869;
count__27675_27852 = G__27870;
i__27676_27853 = G__27871;
continue;
} else {
var vec__27686_27872 = cljs.core.first(seq__27673_27866__$1);
var __27873 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27686_27872,(0),null);
var callback_27874 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27686_27872,(1),null);
(callback_27874.cljs$core$IFn$_invoke$arity$1 ? callback_27874.cljs$core$IFn$_invoke$arity$1(report) : callback_27874.call(null,report));


var G__27875 = cljs.core.next(seq__27673_27866__$1);
var G__27876 = null;
var G__27877 = (0);
var G__27878 = (0);
seq__27673_27850 = G__27875;
chunk__27674_27851 = G__27876;
count__27675_27852 = G__27877;
i__27676_27853 = G__27878;
continue;
}
} else {
}
}
break;
}

return db;
}));

(datascript.conn.reset_conn_BANG_.cljs$lang$maxFixedArity = 3);

datascript.conn.reset_schema_BANG_ = (function datascript$conn$reset_schema_BANG_(conn,schema){
if(datascript.conn.conn_QMARK_(conn)){
} else {
throw (new Error("Assert failed: (conn? conn)"));
}

var db = cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(conn,datascript.db.with_schema,schema);
return db;
});
datascript.conn.listen_BANG_ = (function datascript$conn$listen_BANG_(var_args){
var G__27691 = arguments.length;
switch (G__27691) {
case 2:
return datascript.conn.listen_BANG_.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
case 3:
return datascript.conn.listen_BANG_.cljs$core$IFn$_invoke$arity$3((arguments[(0)]),(arguments[(1)]),(arguments[(2)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(datascript.conn.listen_BANG_.cljs$core$IFn$_invoke$arity$2 = (function (conn,callback){
return datascript.conn.listen_BANG_.cljs$core$IFn$_invoke$arity$3(conn,cljs.core.rand.cljs$core$IFn$_invoke$arity$0(),callback);
}));

(datascript.conn.listen_BANG_.cljs$core$IFn$_invoke$arity$3 = (function (conn,key,callback){
if(datascript.conn.conn_QMARK_(conn)){
} else {
throw (new Error("Assert failed: (conn? conn)"));
}

cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn),cljs.core.update,new cljs.core.Keyword(null,"listeners","listeners",394544445),cljs.core.assoc,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([key,callback], 0));

return key;
}));

(datascript.conn.listen_BANG_.cljs$lang$maxFixedArity = 3);

datascript.conn.unlisten_BANG_ = (function datascript$conn$unlisten_BANG_(conn,key){
if(datascript.conn.conn_QMARK_(conn)){
} else {
throw (new Error("Assert failed: (conn? conn)"));
}

return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn),cljs.core.update,new cljs.core.Keyword(null,"listeners","listeners",394544445),cljs.core.dissoc,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([key], 0));
});

//# sourceMappingURL=datascript.conn.js.map
