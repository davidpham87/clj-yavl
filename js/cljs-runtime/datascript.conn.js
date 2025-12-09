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
(datascript.conn.Conn.prototype.equiv = (function (other__25489__auto__){
var self__ = this;
var this__25488__auto__ = this;
return this__25488__auto__.cljs$core$IEquiv$_equiv$arity$2(null,other__25489__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_notify_watches$arity$3 = (function (this__25488__auto__,oldv__25496__auto__,newv__25491__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
var seq__27451 = cljs.core.seq(self__.watches);
var chunk__27452 = null;
var count__27453 = (0);
var i__27454 = (0);
while(true){
if((i__27454 < count__27453)){
var vec__27462 = chunk__27452.cljs$core$IIndexed$_nth$arity$2(null,i__27454);
var k__25497__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27462,(0),null);
var f__25492__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27462,(1),null);
(f__25492__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25492__auto__.cljs$core$IFn$_invoke$arity$4(k__25497__auto__,this__25488__auto____$1,oldv__25496__auto__,newv__25491__auto__) : f__25492__auto__.call(null,k__25497__auto__,this__25488__auto____$1,oldv__25496__auto__,newv__25491__auto__));


var G__27622 = seq__27451;
var G__27623 = chunk__27452;
var G__27624 = count__27453;
var G__27625 = (i__27454 + (1));
seq__27451 = G__27622;
chunk__27452 = G__27623;
count__27453 = G__27624;
i__27454 = G__27625;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27451);
if(temp__5825__auto__){
var seq__27451__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27451__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27451__$1);
var G__27626 = cljs.core.chunk_rest(seq__27451__$1);
var G__27627 = c__5548__auto__;
var G__27628 = cljs.core.count(c__5548__auto__);
var G__27629 = (0);
seq__27451 = G__27626;
chunk__27452 = G__27627;
count__27453 = G__27628;
i__27454 = G__27629;
continue;
} else {
var vec__27467 = cljs.core.first(seq__27451__$1);
var k__25497__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27467,(0),null);
var f__25492__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27467,(1),null);
(f__25492__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25492__auto__.cljs$core$IFn$_invoke$arity$4(k__25497__auto__,this__25488__auto____$1,oldv__25496__auto__,newv__25491__auto__) : f__25492__auto__.call(null,k__25497__auto__,this__25488__auto____$1,oldv__25496__auto__,newv__25491__auto__));


var G__27632 = cljs.core.next(seq__27451__$1);
var G__27633 = null;
var G__27634 = (0);
var G__27635 = (0);
seq__27451 = G__27632;
chunk__27452 = G__27633;
count__27453 = G__27634;
i__27454 = G__27635;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_add_watch$arity$3 = (function (this__25488__auto__,key__25498__auto__,f__25492__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
(this__25488__auto____$1.watches = cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(self__.watches,key__25498__auto__,f__25492__auto__));

return this__25488__auto____$1;
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_remove_watch$arity$2 = (function (this__25488__auto__,key__25498__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return (this__25488__auto____$1.watches = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(self__.watches,key__25498__auto__));
}));

(datascript.conn.Conn.prototype.cljs$core$IEquiv$_equiv$arity$2 = (function (o__25490__auto__,other__25489__auto__){
var self__ = this;
var o__25490__auto____$1 = this;
return (o__25490__auto____$1 === other__25489__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IHash$_hash$arity$1 = (function (this__25488__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return goog.getUid(this__25488__auto____$1);
}));

(datascript.conn.Conn.prototype.cljs$core$IReset$_reset_BANG_$arity$2 = (function (this__25488__auto__,newv__25491__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25488__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,cljs.core.constantly(newv__25491__auto__),cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$2 = (function (this__25488__auto__,f__25492__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25488__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25492__auto__,cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$3 = (function (this__25488__auto__,f__25492__auto__,a__25493__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25488__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25492__auto__,(new cljs.core.List(null,a__25493__auto__,null,(1),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$4 = (function (this__25488__auto__,f__25492__auto__,a__25493__auto__,b__25494__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25488__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25492__auto__,(new cljs.core.List(null,a__25493__auto__,(new cljs.core.List(null,b__25494__auto__,null,(1),null)),(2),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$5 = (function (this__25488__auto__,f__25492__auto__,a__25493__auto__,b__25494__auto__,xs__25495__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25488__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25492__auto__,cljs.core.cons(a__25493__auto__,cljs.core.cons(b__25494__auto__,xs__25495__auto__))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$IMeta$_meta$arity$1 = (function (this__25488__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return self__.meta;
}));

(datascript.conn.Conn.prototype.cljs$core$IDeref$_deref$arity$1 = (function (this__25488__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return this__25488__auto____$1.extend_clj$core$IAtom3$deref_impl$arity$1(null);
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$ = cljs.core.PROTOCOL_SENTINEL);

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$validate$arity$3 = (function (this__25488__auto__,validator__25500__auto__,value__25501__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
if((!((validator__25500__auto__ == null)))){
if(cljs.core.truth_((validator__25500__auto__.cljs$core$IFn$_invoke$arity$1 ? validator__25500__auto__.cljs$core$IFn$_invoke$arity$1(value__25501__auto__) : validator__25500__auto__.call(null,value__25501__auto__)))){
return null;
} else {
throw cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2("Invalid reference state",new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),value__25501__auto__], null));
}
} else {
return null;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$notify_watches$arity$3 = (function (this__25488__auto__,oldv__25496__auto__,newv__25491__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
var seq__27474 = cljs.core.seq(self__.watches);
var chunk__27475 = null;
var count__27476 = (0);
var i__27477 = (0);
while(true){
if((i__27477 < count__27476)){
var vec__27488 = chunk__27475.cljs$core$IIndexed$_nth$arity$2(null,i__27477);
var k__25497__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27488,(0),null);
var w__25502__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27488,(1),null);
(w__25502__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25502__auto__.cljs$core$IFn$_invoke$arity$4(k__25497__auto__,this__25488__auto____$1,oldv__25496__auto__,newv__25491__auto__) : w__25502__auto__.call(null,k__25497__auto__,this__25488__auto____$1,oldv__25496__auto__,newv__25491__auto__));


var G__27640 = seq__27474;
var G__27641 = chunk__27475;
var G__27642 = count__27476;
var G__27643 = (i__27477 + (1));
seq__27474 = G__27640;
chunk__27475 = G__27641;
count__27476 = G__27642;
i__27477 = G__27643;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27474);
if(temp__5825__auto__){
var seq__27474__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27474__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27474__$1);
var G__27644 = cljs.core.chunk_rest(seq__27474__$1);
var G__27645 = c__5548__auto__;
var G__27646 = cljs.core.count(c__5548__auto__);
var G__27647 = (0);
seq__27474 = G__27644;
chunk__27475 = G__27645;
count__27476 = G__27646;
i__27477 = G__27647;
continue;
} else {
var vec__27494 = cljs.core.first(seq__27474__$1);
var k__25497__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27494,(0),null);
var w__25502__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27494,(1),null);
(w__25502__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25502__auto__.cljs$core$IFn$_invoke$arity$4(k__25497__auto__,this__25488__auto____$1,oldv__25496__auto__,newv__25491__auto__) : w__25502__auto__.call(null,k__25497__auto__,this__25488__auto____$1,oldv__25496__auto__,newv__25491__auto__));


var G__27648 = cljs.core.next(seq__27474__$1);
var G__27649 = null;
var G__27650 = (0);
var G__27651 = (0);
seq__27474 = G__27648;
chunk__27475 = G__27649;
count__27476 = G__27650;
i__27477 = G__27651;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$swap_STAR_$arity$3 = (function (this__25488__auto__,f__25492__auto__,args__25503__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
var oldv__25496__auto__ = cljs.core.deref(this__25488__auto____$1);
var newv__25491__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$3(f__25492__auto__,oldv__25496__auto__,args__25503__auto__);
this__25488__auto____$1.extend_clj$core$IAtom3$validate$arity$3(null,self__.validator,newv__25491__auto__);

this__25488__auto____$1.extend_clj$core$IAtom3$compare_and_set_impl$arity$3(null,oldv__25496__auto__,newv__25491__auto__);

this__25488__auto____$1.extend_clj$core$IAtom3$notify_watches$arity$3(null,oldv__25496__auto__,newv__25491__auto__);

return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [oldv__25496__auto__,newv__25491__auto__], null);
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

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$2 = (function (this__25488__auto__,k__25497__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
return this__25488__auto____$1.cljs$core$ILookup$_lookup$arity$3(null,k__25497__auto__,null);
}));

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$3 = (function (this__25488__auto__,k__25497__auto__,not_found__25499__auto__){
var self__ = this;
var this__25488__auto____$1 = this;
var G__27497 = k__25497__auto__;
var G__27497__$1 = (((G__27497 instanceof cljs.core.Keyword))?G__27497.fqn:null);
switch (G__27497__$1) {
case "atom":
return self__.atom;

break;
default:
return not_found__25499__auto__;

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
var G__27501 = arguments.length;
switch (G__27501) {
case 1:
return datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___27682 = arguments.length;
var i__5750__auto___27683 = (0);
while(true){
if((i__5750__auto___27683 < len__5749__auto___27682)){
args_arr__5774__auto__.push((arguments[i__5750__auto___27683]));

var G__27684 = (i__5750__auto___27683 + (1));
i__5750__auto___27683 = G__27684;
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

(datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$variadic = (function (atom,rest__25504__auto__){
var opts__25505__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.array_map,rest__25504__auto__);
var ref__25506__auto__ = (new datascript.conn.Conn(atom,null,cljs.core.PersistentArrayMap.EMPTY,cljs.core.PersistentArrayMap.EMPTY));
var temp__5829__auto___27685 = new cljs.core.Keyword(null,"validator","validator",-1966190681).cljs$core$IFn$_invoke$arity$1(opts__25505__auto__);
if((temp__5829__auto___27685 == null)){
} else {
var validator__25500__auto___27687 = temp__5829__auto___27685;
ref__25506__auto__.extend_clj$core$IAtom3$validate$arity$3(null,validator__25500__auto___27687,cljs.core.deref(ref__25506__auto__));

(ref__25506__auto__.validator = validator__25500__auto___27687);
}

var temp__5829__auto___27688 = new cljs.core.Keyword(null,"meta","meta",1499536964).cljs$core$IFn$_invoke$arity$1(opts__25505__auto__);
if((temp__5829__auto___27688 == null)){
} else {
var meta__25507__auto___27689 = temp__5829__auto___27688;
cljs.core.reset_meta_BANG_(ref__25506__auto__,meta__25507__auto___27689);
}

return ref__25506__auto__;
}));

/** @this {Function} */
(datascript.conn.__GT_Conn.cljs$lang$applyTo = (function (seq27499){
var G__27500 = cljs.core.first(seq27499);
var seq27499__$1 = cljs.core.next(seq27499);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27500,seq27499__$1);
}));

(datascript.conn.__GT_Conn.cljs$lang$maxFixedArity = (1));


datascript.conn.make_conn = (function datascript$conn$make_conn(opts){
var G__27515 = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(opts);
return (datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1 ? datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1(G__27515) : datascript.conn.__GT_Conn.call(null,G__27515));
});
datascript.conn.with$ = (function datascript$conn$with(var_args){
var G__27519 = arguments.length;
switch (G__27519) {
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
var G__27548 = arguments.length;
switch (G__27548) {
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
var G__27554 = arguments.length;
switch (G__27554) {
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
var G__27556 = arguments.length;
switch (G__27556) {
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
var seq__27557_27699 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27558_27700 = null;
var count__27559_27701 = (0);
var i__27560_27702 = (0);
while(true){
if((i__27560_27702 < count__27559_27701)){
var vec__27567_27703 = chunk__27558_27700.cljs$core$IIndexed$_nth$arity$2(null,i__27560_27702);
var __27704 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27567_27703,(0),null);
var callback_27705 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27567_27703,(1),null);
(callback_27705.cljs$core$IFn$_invoke$arity$1 ? callback_27705.cljs$core$IFn$_invoke$arity$1(report) : callback_27705.call(null,report));


var G__27706 = seq__27557_27699;
var G__27707 = chunk__27558_27700;
var G__27708 = count__27559_27701;
var G__27709 = (i__27560_27702 + (1));
seq__27557_27699 = G__27706;
chunk__27558_27700 = G__27707;
count__27559_27701 = G__27708;
i__27560_27702 = G__27709;
continue;
} else {
var temp__5825__auto___27710 = cljs.core.seq(seq__27557_27699);
if(temp__5825__auto___27710){
var seq__27557_27711__$1 = temp__5825__auto___27710;
if(cljs.core.chunked_seq_QMARK_(seq__27557_27711__$1)){
var c__5548__auto___27712 = cljs.core.chunk_first(seq__27557_27711__$1);
var G__27713 = cljs.core.chunk_rest(seq__27557_27711__$1);
var G__27714 = c__5548__auto___27712;
var G__27715 = cljs.core.count(c__5548__auto___27712);
var G__27716 = (0);
seq__27557_27699 = G__27713;
chunk__27558_27700 = G__27714;
count__27559_27701 = G__27715;
i__27560_27702 = G__27716;
continue;
} else {
var vec__27570_27717 = cljs.core.first(seq__27557_27711__$1);
var __27718 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27570_27717,(0),null);
var callback_27719 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27570_27717,(1),null);
(callback_27719.cljs$core$IFn$_invoke$arity$1 ? callback_27719.cljs$core$IFn$_invoke$arity$1(report) : callback_27719.call(null,report));


var G__27720 = cljs.core.next(seq__27557_27711__$1);
var G__27721 = null;
var G__27722 = (0);
var G__27723 = (0);
seq__27557_27699 = G__27720;
chunk__27558_27700 = G__27721;
count__27559_27701 = G__27722;
i__27560_27702 = G__27723;
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
var G__27585 = arguments.length;
switch (G__27585) {
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
var report = datascript.db.map__GT_TxReport(new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"db-before","db-before",-553691536),db_before,new cljs.core.Keyword(null,"db-after","db-after",-571884666),db,new cljs.core.Keyword(null,"tx-data","tx-data",934159761),cljs.core.concat.cljs$core$IFn$_invoke$arity$2((cljs.core.truth_(db_before)?cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p1__27573_SHARP_){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(p1__27573_SHARP_,new cljs.core.Keyword(null,"added","added",2057651688),false);
}),datascript.db._datoms(db_before,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)):null),datascript.db._datoms(db,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)),new cljs.core.Keyword(null,"tx-meta","tx-meta",1159283194),tx_meta], null));
if(cljs.core.truth_(datascript.storage.storage(db_before))){
datascript.storage.store.cljs$core$IFn$_invoke$arity$1(db);

cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn),cljs.core.assoc,new cljs.core.Keyword(null,"db","db",993250759),db,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"tx-tail","tx-tail",1116487556),cljs.core.PersistentVector.EMPTY,new cljs.core.Keyword(null,"db-last-stored","db-last-stored",-2068760702),db], 0));
} else {
cljs.core.reset_BANG_(conn,db);
}

var seq__27597_27733 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27598_27734 = null;
var count__27599_27735 = (0);
var i__27600_27736 = (0);
while(true){
if((i__27600_27736 < count__27599_27735)){
var vec__27608_27737 = chunk__27598_27734.cljs$core$IIndexed$_nth$arity$2(null,i__27600_27736);
var __27738 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27608_27737,(0),null);
var callback_27739 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27608_27737,(1),null);
(callback_27739.cljs$core$IFn$_invoke$arity$1 ? callback_27739.cljs$core$IFn$_invoke$arity$1(report) : callback_27739.call(null,report));


var G__27740 = seq__27597_27733;
var G__27741 = chunk__27598_27734;
var G__27742 = count__27599_27735;
var G__27743 = (i__27600_27736 + (1));
seq__27597_27733 = G__27740;
chunk__27598_27734 = G__27741;
count__27599_27735 = G__27742;
i__27600_27736 = G__27743;
continue;
} else {
var temp__5825__auto___27744 = cljs.core.seq(seq__27597_27733);
if(temp__5825__auto___27744){
var seq__27597_27745__$1 = temp__5825__auto___27744;
if(cljs.core.chunked_seq_QMARK_(seq__27597_27745__$1)){
var c__5548__auto___27746 = cljs.core.chunk_first(seq__27597_27745__$1);
var G__27747 = cljs.core.chunk_rest(seq__27597_27745__$1);
var G__27748 = c__5548__auto___27746;
var G__27749 = cljs.core.count(c__5548__auto___27746);
var G__27750 = (0);
seq__27597_27733 = G__27747;
chunk__27598_27734 = G__27748;
count__27599_27735 = G__27749;
i__27600_27736 = G__27750;
continue;
} else {
var vec__27611_27751 = cljs.core.first(seq__27597_27745__$1);
var __27752 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27611_27751,(0),null);
var callback_27753 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27611_27751,(1),null);
(callback_27753.cljs$core$IFn$_invoke$arity$1 ? callback_27753.cljs$core$IFn$_invoke$arity$1(report) : callback_27753.call(null,report));


var G__27754 = cljs.core.next(seq__27597_27745__$1);
var G__27755 = null;
var G__27756 = (0);
var G__27757 = (0);
seq__27597_27733 = G__27754;
chunk__27598_27734 = G__27755;
count__27599_27735 = G__27756;
i__27600_27736 = G__27757;
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
var G__27617 = arguments.length;
switch (G__27617) {
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
