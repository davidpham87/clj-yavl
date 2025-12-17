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
(datascript.conn.Conn.prototype.equiv = (function (other__35825__auto__){
var self__ = this;
var this__35824__auto__ = this;
return this__35824__auto__.cljs$core$IEquiv$_equiv$arity$2(null,other__35825__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_notify_watches$arity$3 = (function (this__35824__auto__,oldv__35832__auto__,newv__35827__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
var seq__36263 = cljs.core.seq(self__.watches);
var chunk__36264 = null;
var count__36265 = (0);
var i__36266 = (0);
while(true){
if((i__36266 < count__36265)){
var vec__36275 = chunk__36264.cljs$core$IIndexed$_nth$arity$2(null,i__36266);
var k__35833__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36275,(0),null);
var f__35828__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36275,(1),null);
(f__35828__auto__.cljs$core$IFn$_invoke$arity$4 ? f__35828__auto__.cljs$core$IFn$_invoke$arity$4(k__35833__auto__,this__35824__auto____$1,oldv__35832__auto__,newv__35827__auto__) : f__35828__auto__.call(null,k__35833__auto__,this__35824__auto____$1,oldv__35832__auto__,newv__35827__auto__));


var G__36468 = seq__36263;
var G__36469 = chunk__36264;
var G__36470 = count__36265;
var G__36471 = (i__36266 + (1));
seq__36263 = G__36468;
chunk__36264 = G__36469;
count__36265 = G__36470;
i__36266 = G__36471;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__36263);
if(temp__5825__auto__){
var seq__36263__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__36263__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__36263__$1);
var G__36472 = cljs.core.chunk_rest(seq__36263__$1);
var G__36473 = c__5548__auto__;
var G__36474 = cljs.core.count(c__5548__auto__);
var G__36475 = (0);
seq__36263 = G__36472;
chunk__36264 = G__36473;
count__36265 = G__36474;
i__36266 = G__36475;
continue;
} else {
var vec__36280 = cljs.core.first(seq__36263__$1);
var k__35833__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36280,(0),null);
var f__35828__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36280,(1),null);
(f__35828__auto__.cljs$core$IFn$_invoke$arity$4 ? f__35828__auto__.cljs$core$IFn$_invoke$arity$4(k__35833__auto__,this__35824__auto____$1,oldv__35832__auto__,newv__35827__auto__) : f__35828__auto__.call(null,k__35833__auto__,this__35824__auto____$1,oldv__35832__auto__,newv__35827__auto__));


var G__36476 = cljs.core.next(seq__36263__$1);
var G__36477 = null;
var G__36478 = (0);
var G__36479 = (0);
seq__36263 = G__36476;
chunk__36264 = G__36477;
count__36265 = G__36478;
i__36266 = G__36479;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_add_watch$arity$3 = (function (this__35824__auto__,key__35834__auto__,f__35828__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
(this__35824__auto____$1.watches = cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(self__.watches,key__35834__auto__,f__35828__auto__));

return this__35824__auto____$1;
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_remove_watch$arity$2 = (function (this__35824__auto__,key__35834__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return (this__35824__auto____$1.watches = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(self__.watches,key__35834__auto__));
}));

(datascript.conn.Conn.prototype.cljs$core$IEquiv$_equiv$arity$2 = (function (o__35826__auto__,other__35825__auto__){
var self__ = this;
var o__35826__auto____$1 = this;
return (o__35826__auto____$1 === other__35825__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IHash$_hash$arity$1 = (function (this__35824__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return goog.getUid(this__35824__auto____$1);
}));

(datascript.conn.Conn.prototype.cljs$core$IReset$_reset_BANG_$arity$2 = (function (this__35824__auto__,newv__35827__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__35824__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,cljs.core.constantly(newv__35827__auto__),cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$2 = (function (this__35824__auto__,f__35828__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__35824__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__35828__auto__,cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$3 = (function (this__35824__auto__,f__35828__auto__,a__35829__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__35824__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__35828__auto__,(new cljs.core.List(null,a__35829__auto__,null,(1),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$4 = (function (this__35824__auto__,f__35828__auto__,a__35829__auto__,b__35830__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__35824__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__35828__auto__,(new cljs.core.List(null,a__35829__auto__,(new cljs.core.List(null,b__35830__auto__,null,(1),null)),(2),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$5 = (function (this__35824__auto__,f__35828__auto__,a__35829__auto__,b__35830__auto__,xs__35831__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__35824__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__35828__auto__,cljs.core.cons(a__35829__auto__,cljs.core.cons(b__35830__auto__,xs__35831__auto__))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$IMeta$_meta$arity$1 = (function (this__35824__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return self__.meta;
}));

(datascript.conn.Conn.prototype.cljs$core$IDeref$_deref$arity$1 = (function (this__35824__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return this__35824__auto____$1.extend_clj$core$IAtom3$deref_impl$arity$1(null);
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$ = cljs.core.PROTOCOL_SENTINEL);

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$validate$arity$3 = (function (this__35824__auto__,validator__35836__auto__,value__35837__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
if((!((validator__35836__auto__ == null)))){
if(cljs.core.truth_((validator__35836__auto__.cljs$core$IFn$_invoke$arity$1 ? validator__35836__auto__.cljs$core$IFn$_invoke$arity$1(value__35837__auto__) : validator__35836__auto__.call(null,value__35837__auto__)))){
return null;
} else {
throw cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2("Invalid reference state",new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),value__35837__auto__], null));
}
} else {
return null;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$notify_watches$arity$3 = (function (this__35824__auto__,oldv__35832__auto__,newv__35827__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
var seq__36285 = cljs.core.seq(self__.watches);
var chunk__36286 = null;
var count__36287 = (0);
var i__36288 = (0);
while(true){
if((i__36288 < count__36287)){
var vec__36299 = chunk__36286.cljs$core$IIndexed$_nth$arity$2(null,i__36288);
var k__35833__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36299,(0),null);
var w__35838__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36299,(1),null);
(w__35838__auto__.cljs$core$IFn$_invoke$arity$4 ? w__35838__auto__.cljs$core$IFn$_invoke$arity$4(k__35833__auto__,this__35824__auto____$1,oldv__35832__auto__,newv__35827__auto__) : w__35838__auto__.call(null,k__35833__auto__,this__35824__auto____$1,oldv__35832__auto__,newv__35827__auto__));


var G__36482 = seq__36285;
var G__36483 = chunk__36286;
var G__36484 = count__36287;
var G__36485 = (i__36288 + (1));
seq__36285 = G__36482;
chunk__36286 = G__36483;
count__36287 = G__36484;
i__36288 = G__36485;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__36285);
if(temp__5825__auto__){
var seq__36285__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__36285__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__36285__$1);
var G__36486 = cljs.core.chunk_rest(seq__36285__$1);
var G__36487 = c__5548__auto__;
var G__36488 = cljs.core.count(c__5548__auto__);
var G__36489 = (0);
seq__36285 = G__36486;
chunk__36286 = G__36487;
count__36287 = G__36488;
i__36288 = G__36489;
continue;
} else {
var vec__36306 = cljs.core.first(seq__36285__$1);
var k__35833__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36306,(0),null);
var w__35838__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36306,(1),null);
(w__35838__auto__.cljs$core$IFn$_invoke$arity$4 ? w__35838__auto__.cljs$core$IFn$_invoke$arity$4(k__35833__auto__,this__35824__auto____$1,oldv__35832__auto__,newv__35827__auto__) : w__35838__auto__.call(null,k__35833__auto__,this__35824__auto____$1,oldv__35832__auto__,newv__35827__auto__));


var G__36490 = cljs.core.next(seq__36285__$1);
var G__36491 = null;
var G__36492 = (0);
var G__36493 = (0);
seq__36285 = G__36490;
chunk__36286 = G__36491;
count__36287 = G__36492;
i__36288 = G__36493;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$swap_STAR_$arity$3 = (function (this__35824__auto__,f__35828__auto__,args__35839__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
var oldv__35832__auto__ = cljs.core.deref(this__35824__auto____$1);
var newv__35827__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$3(f__35828__auto__,oldv__35832__auto__,args__35839__auto__);
this__35824__auto____$1.extend_clj$core$IAtom3$validate$arity$3(null,self__.validator,newv__35827__auto__);

this__35824__auto____$1.extend_clj$core$IAtom3$compare_and_set_impl$arity$3(null,oldv__35832__auto__,newv__35827__auto__);

this__35824__auto____$1.extend_clj$core$IAtom3$notify_watches$arity$3(null,oldv__35832__auto__,newv__35827__auto__);

return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [oldv__35832__auto__,newv__35827__auto__], null);
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

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$2 = (function (this__35824__auto__,k__35833__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
return this__35824__auto____$1.cljs$core$ILookup$_lookup$arity$3(null,k__35833__auto__,null);
}));

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$3 = (function (this__35824__auto__,k__35833__auto__,not_found__35835__auto__){
var self__ = this;
var this__35824__auto____$1 = this;
var G__36315 = k__35833__auto__;
var G__36315__$1 = (((G__36315 instanceof cljs.core.Keyword))?G__36315.fqn:null);
switch (G__36315__$1) {
case "atom":
return self__.atom;

break;
default:
return not_found__35835__auto__;

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
var G__36323 = arguments.length;
switch (G__36323) {
case 1:
return datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___36496 = arguments.length;
var i__5750__auto___36497 = (0);
while(true){
if((i__5750__auto___36497 < len__5749__auto___36496)){
args_arr__5774__auto__.push((arguments[i__5750__auto___36497]));

var G__36498 = (i__5750__auto___36497 + (1));
i__5750__auto___36497 = G__36498;
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

(datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$variadic = (function (atom,rest__35840__auto__){
var opts__35841__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.array_map,rest__35840__auto__);
var ref__35842__auto__ = (new datascript.conn.Conn(atom,null,cljs.core.PersistentArrayMap.EMPTY,cljs.core.PersistentArrayMap.EMPTY));
var temp__5829__auto___36501 = new cljs.core.Keyword(null,"validator","validator",-1966190681).cljs$core$IFn$_invoke$arity$1(opts__35841__auto__);
if((temp__5829__auto___36501 == null)){
} else {
var validator__35836__auto___36502 = temp__5829__auto___36501;
ref__35842__auto__.extend_clj$core$IAtom3$validate$arity$3(null,validator__35836__auto___36502,cljs.core.deref(ref__35842__auto__));

(ref__35842__auto__.validator = validator__35836__auto___36502);
}

var temp__5829__auto___36503 = new cljs.core.Keyword(null,"meta","meta",1499536964).cljs$core$IFn$_invoke$arity$1(opts__35841__auto__);
if((temp__5829__auto___36503 == null)){
} else {
var meta__35843__auto___36504 = temp__5829__auto___36503;
cljs.core.reset_meta_BANG_(ref__35842__auto__,meta__35843__auto___36504);
}

return ref__35842__auto__;
}));

/** @this {Function} */
(datascript.conn.__GT_Conn.cljs$lang$applyTo = (function (seq36321){
var G__36322 = cljs.core.first(seq36321);
var seq36321__$1 = cljs.core.next(seq36321);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__36322,seq36321__$1);
}));

(datascript.conn.__GT_Conn.cljs$lang$maxFixedArity = (1));


datascript.conn.make_conn = (function datascript$conn$make_conn(opts){
var G__36329 = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(opts);
return (datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1 ? datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1(G__36329) : datascript.conn.__GT_Conn.call(null,G__36329));
});
datascript.conn.with$ = (function datascript$conn$with(var_args){
var G__36337 = arguments.length;
switch (G__36337) {
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
var G__36362 = arguments.length;
switch (G__36362) {
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
var G__36385 = arguments.length;
switch (G__36385) {
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
var G__36388 = arguments.length;
switch (G__36388) {
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
var seq__36393_36512 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__36394_36513 = null;
var count__36395_36514 = (0);
var i__36396_36515 = (0);
while(true){
if((i__36396_36515 < count__36395_36514)){
var vec__36409_36516 = chunk__36394_36513.cljs$core$IIndexed$_nth$arity$2(null,i__36396_36515);
var __36517 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36409_36516,(0),null);
var callback_36518 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36409_36516,(1),null);
(callback_36518.cljs$core$IFn$_invoke$arity$1 ? callback_36518.cljs$core$IFn$_invoke$arity$1(report) : callback_36518.call(null,report));


var G__36519 = seq__36393_36512;
var G__36520 = chunk__36394_36513;
var G__36521 = count__36395_36514;
var G__36522 = (i__36396_36515 + (1));
seq__36393_36512 = G__36519;
chunk__36394_36513 = G__36520;
count__36395_36514 = G__36521;
i__36396_36515 = G__36522;
continue;
} else {
var temp__5825__auto___36523 = cljs.core.seq(seq__36393_36512);
if(temp__5825__auto___36523){
var seq__36393_36524__$1 = temp__5825__auto___36523;
if(cljs.core.chunked_seq_QMARK_(seq__36393_36524__$1)){
var c__5548__auto___36525 = cljs.core.chunk_first(seq__36393_36524__$1);
var G__36526 = cljs.core.chunk_rest(seq__36393_36524__$1);
var G__36527 = c__5548__auto___36525;
var G__36528 = cljs.core.count(c__5548__auto___36525);
var G__36529 = (0);
seq__36393_36512 = G__36526;
chunk__36394_36513 = G__36527;
count__36395_36514 = G__36528;
i__36396_36515 = G__36529;
continue;
} else {
var vec__36413_36530 = cljs.core.first(seq__36393_36524__$1);
var __36531 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36413_36530,(0),null);
var callback_36532 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36413_36530,(1),null);
(callback_36532.cljs$core$IFn$_invoke$arity$1 ? callback_36532.cljs$core$IFn$_invoke$arity$1(report) : callback_36532.call(null,report));


var G__36533 = cljs.core.next(seq__36393_36524__$1);
var G__36534 = null;
var G__36535 = (0);
var G__36536 = (0);
seq__36393_36512 = G__36533;
chunk__36394_36513 = G__36534;
count__36395_36514 = G__36535;
i__36396_36515 = G__36536;
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
var G__36418 = arguments.length;
switch (G__36418) {
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
var report = datascript.db.map__GT_TxReport(new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"db-before","db-before",-553691536),db_before,new cljs.core.Keyword(null,"db-after","db-after",-571884666),db,new cljs.core.Keyword(null,"tx-data","tx-data",934159761),cljs.core.concat.cljs$core$IFn$_invoke$arity$2((cljs.core.truth_(db_before)?cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p1__36416_SHARP_){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(p1__36416_SHARP_,new cljs.core.Keyword(null,"added","added",2057651688),false);
}),datascript.db._datoms(db_before,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)):null),datascript.db._datoms(db,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)),new cljs.core.Keyword(null,"tx-meta","tx-meta",1159283194),tx_meta], null));
if(cljs.core.truth_(datascript.storage.storage(db_before))){
datascript.storage.store.cljs$core$IFn$_invoke$arity$1(db);

cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn),cljs.core.assoc,new cljs.core.Keyword(null,"db","db",993250759),db,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"tx-tail","tx-tail",1116487556),cljs.core.PersistentVector.EMPTY,new cljs.core.Keyword(null,"db-last-stored","db-last-stored",-2068760702),db], 0));
} else {
cljs.core.reset_BANG_(conn,db);
}

var seq__36419_36539 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__36420_36540 = null;
var count__36421_36541 = (0);
var i__36422_36542 = (0);
while(true){
if((i__36422_36542 < count__36421_36541)){
var vec__36430_36543 = chunk__36420_36540.cljs$core$IIndexed$_nth$arity$2(null,i__36422_36542);
var __36544 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36430_36543,(0),null);
var callback_36545 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36430_36543,(1),null);
(callback_36545.cljs$core$IFn$_invoke$arity$1 ? callback_36545.cljs$core$IFn$_invoke$arity$1(report) : callback_36545.call(null,report));


var G__36546 = seq__36419_36539;
var G__36547 = chunk__36420_36540;
var G__36548 = count__36421_36541;
var G__36549 = (i__36422_36542 + (1));
seq__36419_36539 = G__36546;
chunk__36420_36540 = G__36547;
count__36421_36541 = G__36548;
i__36422_36542 = G__36549;
continue;
} else {
var temp__5825__auto___36550 = cljs.core.seq(seq__36419_36539);
if(temp__5825__auto___36550){
var seq__36419_36551__$1 = temp__5825__auto___36550;
if(cljs.core.chunked_seq_QMARK_(seq__36419_36551__$1)){
var c__5548__auto___36552 = cljs.core.chunk_first(seq__36419_36551__$1);
var G__36553 = cljs.core.chunk_rest(seq__36419_36551__$1);
var G__36554 = c__5548__auto___36552;
var G__36555 = cljs.core.count(c__5548__auto___36552);
var G__36556 = (0);
seq__36419_36539 = G__36553;
chunk__36420_36540 = G__36554;
count__36421_36541 = G__36555;
i__36422_36542 = G__36556;
continue;
} else {
var vec__36434_36557 = cljs.core.first(seq__36419_36551__$1);
var __36558 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36434_36557,(0),null);
var callback_36559 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__36434_36557,(1),null);
(callback_36559.cljs$core$IFn$_invoke$arity$1 ? callback_36559.cljs$core$IFn$_invoke$arity$1(report) : callback_36559.call(null,report));


var G__36560 = cljs.core.next(seq__36419_36551__$1);
var G__36561 = null;
var G__36562 = (0);
var G__36563 = (0);
seq__36419_36539 = G__36560;
chunk__36420_36540 = G__36561;
count__36421_36541 = G__36562;
i__36422_36542 = G__36563;
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
var G__36464 = arguments.length;
switch (G__36464) {
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
