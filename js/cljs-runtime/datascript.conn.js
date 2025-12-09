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
(datascript.conn.Conn.prototype.equiv = (function (other__25455__auto__){
var self__ = this;
var this__25454__auto__ = this;
return this__25454__auto__.cljs$core$IEquiv$_equiv$arity$2(null,other__25455__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_notify_watches$arity$3 = (function (this__25454__auto__,oldv__25462__auto__,newv__25457__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
var seq__27419 = cljs.core.seq(self__.watches);
var chunk__27420 = null;
var count__27421 = (0);
var i__27422 = (0);
while(true){
if((i__27422 < count__27421)){
var vec__27435 = chunk__27420.cljs$core$IIndexed$_nth$arity$2(null,i__27422);
var k__25463__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27435,(0),null);
var f__25458__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27435,(1),null);
(f__25458__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25458__auto__.cljs$core$IFn$_invoke$arity$4(k__25463__auto__,this__25454__auto____$1,oldv__25462__auto__,newv__25457__auto__) : f__25458__auto__.call(null,k__25463__auto__,this__25454__auto____$1,oldv__25462__auto__,newv__25457__auto__));


var G__27652 = seq__27419;
var G__27653 = chunk__27420;
var G__27654 = count__27421;
var G__27655 = (i__27422 + (1));
seq__27419 = G__27652;
chunk__27420 = G__27653;
count__27421 = G__27654;
i__27422 = G__27655;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27419);
if(temp__5825__auto__){
var seq__27419__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27419__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27419__$1);
var G__27656 = cljs.core.chunk_rest(seq__27419__$1);
var G__27657 = c__5548__auto__;
var G__27658 = cljs.core.count(c__5548__auto__);
var G__27659 = (0);
seq__27419 = G__27656;
chunk__27420 = G__27657;
count__27421 = G__27658;
i__27422 = G__27659;
continue;
} else {
var vec__27443 = cljs.core.first(seq__27419__$1);
var k__25463__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27443,(0),null);
var f__25458__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27443,(1),null);
(f__25458__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25458__auto__.cljs$core$IFn$_invoke$arity$4(k__25463__auto__,this__25454__auto____$1,oldv__25462__auto__,newv__25457__auto__) : f__25458__auto__.call(null,k__25463__auto__,this__25454__auto____$1,oldv__25462__auto__,newv__25457__auto__));


var G__27660 = cljs.core.next(seq__27419__$1);
var G__27661 = null;
var G__27662 = (0);
var G__27663 = (0);
seq__27419 = G__27660;
chunk__27420 = G__27661;
count__27421 = G__27662;
i__27422 = G__27663;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_add_watch$arity$3 = (function (this__25454__auto__,key__25464__auto__,f__25458__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
(this__25454__auto____$1.watches = cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(self__.watches,key__25464__auto__,f__25458__auto__));

return this__25454__auto____$1;
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_remove_watch$arity$2 = (function (this__25454__auto__,key__25464__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return (this__25454__auto____$1.watches = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(self__.watches,key__25464__auto__));
}));

(datascript.conn.Conn.prototype.cljs$core$IEquiv$_equiv$arity$2 = (function (o__25456__auto__,other__25455__auto__){
var self__ = this;
var o__25456__auto____$1 = this;
return (o__25456__auto____$1 === other__25455__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IHash$_hash$arity$1 = (function (this__25454__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return goog.getUid(this__25454__auto____$1);
}));

(datascript.conn.Conn.prototype.cljs$core$IReset$_reset_BANG_$arity$2 = (function (this__25454__auto__,newv__25457__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25454__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,cljs.core.constantly(newv__25457__auto__),cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$2 = (function (this__25454__auto__,f__25458__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25454__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25458__auto__,cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$3 = (function (this__25454__auto__,f__25458__auto__,a__25459__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25454__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25458__auto__,(new cljs.core.List(null,a__25459__auto__,null,(1),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$4 = (function (this__25454__auto__,f__25458__auto__,a__25459__auto__,b__25460__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25454__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25458__auto__,(new cljs.core.List(null,a__25459__auto__,(new cljs.core.List(null,b__25460__auto__,null,(1),null)),(2),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$5 = (function (this__25454__auto__,f__25458__auto__,a__25459__auto__,b__25460__auto__,xs__25461__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25454__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25458__auto__,cljs.core.cons(a__25459__auto__,cljs.core.cons(b__25460__auto__,xs__25461__auto__))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$IMeta$_meta$arity$1 = (function (this__25454__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return self__.meta;
}));

(datascript.conn.Conn.prototype.cljs$core$IDeref$_deref$arity$1 = (function (this__25454__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return this__25454__auto____$1.extend_clj$core$IAtom3$deref_impl$arity$1(null);
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$ = cljs.core.PROTOCOL_SENTINEL);

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$validate$arity$3 = (function (this__25454__auto__,validator__25466__auto__,value__25467__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
if((!((validator__25466__auto__ == null)))){
if(cljs.core.truth_((validator__25466__auto__.cljs$core$IFn$_invoke$arity$1 ? validator__25466__auto__.cljs$core$IFn$_invoke$arity$1(value__25467__auto__) : validator__25466__auto__.call(null,value__25467__auto__)))){
return null;
} else {
throw cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2("Invalid reference state",new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),value__25467__auto__], null));
}
} else {
return null;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$notify_watches$arity$3 = (function (this__25454__auto__,oldv__25462__auto__,newv__25457__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
var seq__27464 = cljs.core.seq(self__.watches);
var chunk__27465 = null;
var count__27466 = (0);
var i__27467 = (0);
while(true){
if((i__27467 < count__27466)){
var vec__27490 = chunk__27465.cljs$core$IIndexed$_nth$arity$2(null,i__27467);
var k__25463__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27490,(0),null);
var w__25468__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27490,(1),null);
(w__25468__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25468__auto__.cljs$core$IFn$_invoke$arity$4(k__25463__auto__,this__25454__auto____$1,oldv__25462__auto__,newv__25457__auto__) : w__25468__auto__.call(null,k__25463__auto__,this__25454__auto____$1,oldv__25462__auto__,newv__25457__auto__));


var G__27664 = seq__27464;
var G__27665 = chunk__27465;
var G__27666 = count__27466;
var G__27667 = (i__27467 + (1));
seq__27464 = G__27664;
chunk__27465 = G__27665;
count__27466 = G__27666;
i__27467 = G__27667;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27464);
if(temp__5825__auto__){
var seq__27464__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27464__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27464__$1);
var G__27668 = cljs.core.chunk_rest(seq__27464__$1);
var G__27669 = c__5548__auto__;
var G__27670 = cljs.core.count(c__5548__auto__);
var G__27671 = (0);
seq__27464 = G__27668;
chunk__27465 = G__27669;
count__27466 = G__27670;
i__27467 = G__27671;
continue;
} else {
var vec__27493 = cljs.core.first(seq__27464__$1);
var k__25463__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27493,(0),null);
var w__25468__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27493,(1),null);
(w__25468__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25468__auto__.cljs$core$IFn$_invoke$arity$4(k__25463__auto__,this__25454__auto____$1,oldv__25462__auto__,newv__25457__auto__) : w__25468__auto__.call(null,k__25463__auto__,this__25454__auto____$1,oldv__25462__auto__,newv__25457__auto__));


var G__27672 = cljs.core.next(seq__27464__$1);
var G__27673 = null;
var G__27674 = (0);
var G__27675 = (0);
seq__27464 = G__27672;
chunk__27465 = G__27673;
count__27466 = G__27674;
i__27467 = G__27675;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$swap_STAR_$arity$3 = (function (this__25454__auto__,f__25458__auto__,args__25469__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
var oldv__25462__auto__ = cljs.core.deref(this__25454__auto____$1);
var newv__25457__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$3(f__25458__auto__,oldv__25462__auto__,args__25469__auto__);
this__25454__auto____$1.extend_clj$core$IAtom3$validate$arity$3(null,self__.validator,newv__25457__auto__);

this__25454__auto____$1.extend_clj$core$IAtom3$compare_and_set_impl$arity$3(null,oldv__25462__auto__,newv__25457__auto__);

this__25454__auto____$1.extend_clj$core$IAtom3$notify_watches$arity$3(null,oldv__25462__auto__,newv__25457__auto__);

return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [oldv__25462__auto__,newv__25457__auto__], null);
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

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$2 = (function (this__25454__auto__,k__25463__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
return this__25454__auto____$1.cljs$core$ILookup$_lookup$arity$3(null,k__25463__auto__,null);
}));

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$3 = (function (this__25454__auto__,k__25463__auto__,not_found__25465__auto__){
var self__ = this;
var this__25454__auto____$1 = this;
var G__27510 = k__25463__auto__;
var G__27510__$1 = (((G__27510 instanceof cljs.core.Keyword))?G__27510.fqn:null);
switch (G__27510__$1) {
case "atom":
return self__.atom;

break;
default:
return not_found__25465__auto__;

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
var G__27518 = arguments.length;
switch (G__27518) {
case 1:
return datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___27683 = arguments.length;
var i__5750__auto___27684 = (0);
while(true){
if((i__5750__auto___27684 < len__5749__auto___27683)){
args_arr__5774__auto__.push((arguments[i__5750__auto___27684]));

var G__27685 = (i__5750__auto___27684 + (1));
i__5750__auto___27684 = G__27685;
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

(datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$variadic = (function (atom,rest__25470__auto__){
var opts__25471__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.array_map,rest__25470__auto__);
var ref__25472__auto__ = (new datascript.conn.Conn(atom,null,cljs.core.PersistentArrayMap.EMPTY,cljs.core.PersistentArrayMap.EMPTY));
var temp__5829__auto___27686 = new cljs.core.Keyword(null,"validator","validator",-1966190681).cljs$core$IFn$_invoke$arity$1(opts__25471__auto__);
if((temp__5829__auto___27686 == null)){
} else {
var validator__25466__auto___27687 = temp__5829__auto___27686;
ref__25472__auto__.extend_clj$core$IAtom3$validate$arity$3(null,validator__25466__auto___27687,cljs.core.deref(ref__25472__auto__));

(ref__25472__auto__.validator = validator__25466__auto___27687);
}

var temp__5829__auto___27688 = new cljs.core.Keyword(null,"meta","meta",1499536964).cljs$core$IFn$_invoke$arity$1(opts__25471__auto__);
if((temp__5829__auto___27688 == null)){
} else {
var meta__25473__auto___27689 = temp__5829__auto___27688;
cljs.core.reset_meta_BANG_(ref__25472__auto__,meta__25473__auto___27689);
}

return ref__25472__auto__;
}));

/** @this {Function} */
(datascript.conn.__GT_Conn.cljs$lang$applyTo = (function (seq27516){
var G__27517 = cljs.core.first(seq27516);
var seq27516__$1 = cljs.core.next(seq27516);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27517,seq27516__$1);
}));

(datascript.conn.__GT_Conn.cljs$lang$maxFixedArity = (1));


datascript.conn.make_conn = (function datascript$conn$make_conn(opts){
var G__27522 = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(opts);
return (datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1 ? datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1(G__27522) : datascript.conn.__GT_Conn.call(null,G__27522));
});
datascript.conn.with$ = (function datascript$conn$with(var_args){
var G__27546 = arguments.length;
switch (G__27546) {
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
var G__27584 = arguments.length;
switch (G__27584) {
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
var G__27591 = arguments.length;
switch (G__27591) {
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
var G__27596 = arguments.length;
switch (G__27596) {
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
var seq__27598_27695 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27599_27696 = null;
var count__27600_27697 = (0);
var i__27601_27698 = (0);
while(true){
if((i__27601_27698 < count__27600_27697)){
var vec__27613_27699 = chunk__27599_27696.cljs$core$IIndexed$_nth$arity$2(null,i__27601_27698);
var __27700 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27613_27699,(0),null);
var callback_27701 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27613_27699,(1),null);
(callback_27701.cljs$core$IFn$_invoke$arity$1 ? callback_27701.cljs$core$IFn$_invoke$arity$1(report) : callback_27701.call(null,report));


var G__27702 = seq__27598_27695;
var G__27703 = chunk__27599_27696;
var G__27704 = count__27600_27697;
var G__27705 = (i__27601_27698 + (1));
seq__27598_27695 = G__27702;
chunk__27599_27696 = G__27703;
count__27600_27697 = G__27704;
i__27601_27698 = G__27705;
continue;
} else {
var temp__5825__auto___27706 = cljs.core.seq(seq__27598_27695);
if(temp__5825__auto___27706){
var seq__27598_27707__$1 = temp__5825__auto___27706;
if(cljs.core.chunked_seq_QMARK_(seq__27598_27707__$1)){
var c__5548__auto___27708 = cljs.core.chunk_first(seq__27598_27707__$1);
var G__27709 = cljs.core.chunk_rest(seq__27598_27707__$1);
var G__27710 = c__5548__auto___27708;
var G__27711 = cljs.core.count(c__5548__auto___27708);
var G__27712 = (0);
seq__27598_27695 = G__27709;
chunk__27599_27696 = G__27710;
count__27600_27697 = G__27711;
i__27601_27698 = G__27712;
continue;
} else {
var vec__27616_27713 = cljs.core.first(seq__27598_27707__$1);
var __27714 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27616_27713,(0),null);
var callback_27715 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27616_27713,(1),null);
(callback_27715.cljs$core$IFn$_invoke$arity$1 ? callback_27715.cljs$core$IFn$_invoke$arity$1(report) : callback_27715.call(null,report));


var G__27716 = cljs.core.next(seq__27598_27707__$1);
var G__27717 = null;
var G__27718 = (0);
var G__27719 = (0);
seq__27598_27695 = G__27716;
chunk__27599_27696 = G__27717;
count__27600_27697 = G__27718;
i__27601_27698 = G__27719;
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
var G__27626 = arguments.length;
switch (G__27626) {
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
var report = datascript.db.map__GT_TxReport(new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"db-before","db-before",-553691536),db_before,new cljs.core.Keyword(null,"db-after","db-after",-571884666),db,new cljs.core.Keyword(null,"tx-data","tx-data",934159761),cljs.core.concat.cljs$core$IFn$_invoke$arity$2((cljs.core.truth_(db_before)?cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p1__27619_SHARP_){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(p1__27619_SHARP_,new cljs.core.Keyword(null,"added","added",2057651688),false);
}),datascript.db._datoms(db_before,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)):null),datascript.db._datoms(db,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)),new cljs.core.Keyword(null,"tx-meta","tx-meta",1159283194),tx_meta], null));
if(cljs.core.truth_(datascript.storage.storage(db_before))){
datascript.storage.store.cljs$core$IFn$_invoke$arity$1(db);

cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn),cljs.core.assoc,new cljs.core.Keyword(null,"db","db",993250759),db,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"tx-tail","tx-tail",1116487556),cljs.core.PersistentVector.EMPTY,new cljs.core.Keyword(null,"db-last-stored","db-last-stored",-2068760702),db], 0));
} else {
cljs.core.reset_BANG_(conn,db);
}

var seq__27627_27722 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27628_27723 = null;
var count__27629_27724 = (0);
var i__27630_27725 = (0);
while(true){
if((i__27630_27725 < count__27629_27724)){
var vec__27637_27726 = chunk__27628_27723.cljs$core$IIndexed$_nth$arity$2(null,i__27630_27725);
var __27727 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27637_27726,(0),null);
var callback_27728 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27637_27726,(1),null);
(callback_27728.cljs$core$IFn$_invoke$arity$1 ? callback_27728.cljs$core$IFn$_invoke$arity$1(report) : callback_27728.call(null,report));


var G__27729 = seq__27627_27722;
var G__27730 = chunk__27628_27723;
var G__27731 = count__27629_27724;
var G__27732 = (i__27630_27725 + (1));
seq__27627_27722 = G__27729;
chunk__27628_27723 = G__27730;
count__27629_27724 = G__27731;
i__27630_27725 = G__27732;
continue;
} else {
var temp__5825__auto___27733 = cljs.core.seq(seq__27627_27722);
if(temp__5825__auto___27733){
var seq__27627_27734__$1 = temp__5825__auto___27733;
if(cljs.core.chunked_seq_QMARK_(seq__27627_27734__$1)){
var c__5548__auto___27735 = cljs.core.chunk_first(seq__27627_27734__$1);
var G__27736 = cljs.core.chunk_rest(seq__27627_27734__$1);
var G__27737 = c__5548__auto___27735;
var G__27738 = cljs.core.count(c__5548__auto___27735);
var G__27739 = (0);
seq__27627_27722 = G__27736;
chunk__27628_27723 = G__27737;
count__27629_27724 = G__27738;
i__27630_27725 = G__27739;
continue;
} else {
var vec__27640_27740 = cljs.core.first(seq__27627_27734__$1);
var __27741 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27640_27740,(0),null);
var callback_27742 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27640_27740,(1),null);
(callback_27742.cljs$core$IFn$_invoke$arity$1 ? callback_27742.cljs$core$IFn$_invoke$arity$1(report) : callback_27742.call(null,report));


var G__27743 = cljs.core.next(seq__27627_27734__$1);
var G__27744 = null;
var G__27745 = (0);
var G__27746 = (0);
seq__27627_27722 = G__27743;
chunk__27628_27723 = G__27744;
count__27629_27724 = G__27745;
i__27630_27725 = G__27746;
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
var G__27644 = arguments.length;
switch (G__27644) {
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
