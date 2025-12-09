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
(datascript.conn.Conn.prototype.equiv = (function (other__25454__auto__){
var self__ = this;
var this__25453__auto__ = this;
return this__25453__auto__.cljs$core$IEquiv$_equiv$arity$2(null,other__25454__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_notify_watches$arity$3 = (function (this__25453__auto__,oldv__25461__auto__,newv__25456__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
var seq__27421 = cljs.core.seq(self__.watches);
var chunk__27422 = null;
var count__27423 = (0);
var i__27424 = (0);
while(true){
if((i__27424 < count__27423)){
var vec__27434 = chunk__27422.cljs$core$IIndexed$_nth$arity$2(null,i__27424);
var k__25462__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27434,(0),null);
var f__25457__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27434,(1),null);
(f__25457__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25457__auto__.cljs$core$IFn$_invoke$arity$4(k__25462__auto__,this__25453__auto____$1,oldv__25461__auto__,newv__25456__auto__) : f__25457__auto__.call(null,k__25462__auto__,this__25453__auto____$1,oldv__25461__auto__,newv__25456__auto__));


var G__27718 = seq__27421;
var G__27719 = chunk__27422;
var G__27720 = count__27423;
var G__27721 = (i__27424 + (1));
seq__27421 = G__27718;
chunk__27422 = G__27719;
count__27423 = G__27720;
i__27424 = G__27721;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27421);
if(temp__5825__auto__){
var seq__27421__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27421__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27421__$1);
var G__27722 = cljs.core.chunk_rest(seq__27421__$1);
var G__27723 = c__5548__auto__;
var G__27724 = cljs.core.count(c__5548__auto__);
var G__27725 = (0);
seq__27421 = G__27722;
chunk__27422 = G__27723;
count__27423 = G__27724;
i__27424 = G__27725;
continue;
} else {
var vec__27437 = cljs.core.first(seq__27421__$1);
var k__25462__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27437,(0),null);
var f__25457__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27437,(1),null);
(f__25457__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25457__auto__.cljs$core$IFn$_invoke$arity$4(k__25462__auto__,this__25453__auto____$1,oldv__25461__auto__,newv__25456__auto__) : f__25457__auto__.call(null,k__25462__auto__,this__25453__auto____$1,oldv__25461__auto__,newv__25456__auto__));


var G__27726 = cljs.core.next(seq__27421__$1);
var G__27727 = null;
var G__27728 = (0);
var G__27729 = (0);
seq__27421 = G__27726;
chunk__27422 = G__27727;
count__27423 = G__27728;
i__27424 = G__27729;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_add_watch$arity$3 = (function (this__25453__auto__,key__25463__auto__,f__25457__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
(this__25453__auto____$1.watches = cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(self__.watches,key__25463__auto__,f__25457__auto__));

return this__25453__auto____$1;
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_remove_watch$arity$2 = (function (this__25453__auto__,key__25463__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return (this__25453__auto____$1.watches = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(self__.watches,key__25463__auto__));
}));

(datascript.conn.Conn.prototype.cljs$core$IEquiv$_equiv$arity$2 = (function (o__25455__auto__,other__25454__auto__){
var self__ = this;
var o__25455__auto____$1 = this;
return (o__25455__auto____$1 === other__25454__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IHash$_hash$arity$1 = (function (this__25453__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return goog.getUid(this__25453__auto____$1);
}));

(datascript.conn.Conn.prototype.cljs$core$IReset$_reset_BANG_$arity$2 = (function (this__25453__auto__,newv__25456__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25453__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,cljs.core.constantly(newv__25456__auto__),cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$2 = (function (this__25453__auto__,f__25457__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25453__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25457__auto__,cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$3 = (function (this__25453__auto__,f__25457__auto__,a__25458__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25453__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25457__auto__,(new cljs.core.List(null,a__25458__auto__,null,(1),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$4 = (function (this__25453__auto__,f__25457__auto__,a__25458__auto__,b__25459__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25453__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25457__auto__,(new cljs.core.List(null,a__25458__auto__,(new cljs.core.List(null,b__25459__auto__,null,(1),null)),(2),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$5 = (function (this__25453__auto__,f__25457__auto__,a__25458__auto__,b__25459__auto__,xs__25460__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25453__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25457__auto__,cljs.core.cons(a__25458__auto__,cljs.core.cons(b__25459__auto__,xs__25460__auto__))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$IMeta$_meta$arity$1 = (function (this__25453__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return self__.meta;
}));

(datascript.conn.Conn.prototype.cljs$core$IDeref$_deref$arity$1 = (function (this__25453__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return this__25453__auto____$1.extend_clj$core$IAtom3$deref_impl$arity$1(null);
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$ = cljs.core.PROTOCOL_SENTINEL);

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$validate$arity$3 = (function (this__25453__auto__,validator__25465__auto__,value__25466__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
if((!((validator__25465__auto__ == null)))){
if(cljs.core.truth_((validator__25465__auto__.cljs$core$IFn$_invoke$arity$1 ? validator__25465__auto__.cljs$core$IFn$_invoke$arity$1(value__25466__auto__) : validator__25465__auto__.call(null,value__25466__auto__)))){
return null;
} else {
throw cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2("Invalid reference state",new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),value__25466__auto__], null));
}
} else {
return null;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$notify_watches$arity$3 = (function (this__25453__auto__,oldv__25461__auto__,newv__25456__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
var seq__27484 = cljs.core.seq(self__.watches);
var chunk__27485 = null;
var count__27486 = (0);
var i__27487 = (0);
while(true){
if((i__27487 < count__27486)){
var vec__27496 = chunk__27485.cljs$core$IIndexed$_nth$arity$2(null,i__27487);
var k__25462__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27496,(0),null);
var w__25467__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27496,(1),null);
(w__25467__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25467__auto__.cljs$core$IFn$_invoke$arity$4(k__25462__auto__,this__25453__auto____$1,oldv__25461__auto__,newv__25456__auto__) : w__25467__auto__.call(null,k__25462__auto__,this__25453__auto____$1,oldv__25461__auto__,newv__25456__auto__));


var G__27735 = seq__27484;
var G__27736 = chunk__27485;
var G__27737 = count__27486;
var G__27738 = (i__27487 + (1));
seq__27484 = G__27735;
chunk__27485 = G__27736;
count__27486 = G__27737;
i__27487 = G__27738;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27484);
if(temp__5825__auto__){
var seq__27484__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27484__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27484__$1);
var G__27739 = cljs.core.chunk_rest(seq__27484__$1);
var G__27740 = c__5548__auto__;
var G__27741 = cljs.core.count(c__5548__auto__);
var G__27742 = (0);
seq__27484 = G__27739;
chunk__27485 = G__27740;
count__27486 = G__27741;
i__27487 = G__27742;
continue;
} else {
var vec__27513 = cljs.core.first(seq__27484__$1);
var k__25462__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27513,(0),null);
var w__25467__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27513,(1),null);
(w__25467__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25467__auto__.cljs$core$IFn$_invoke$arity$4(k__25462__auto__,this__25453__auto____$1,oldv__25461__auto__,newv__25456__auto__) : w__25467__auto__.call(null,k__25462__auto__,this__25453__auto____$1,oldv__25461__auto__,newv__25456__auto__));


var G__27743 = cljs.core.next(seq__27484__$1);
var G__27744 = null;
var G__27745 = (0);
var G__27746 = (0);
seq__27484 = G__27743;
chunk__27485 = G__27744;
count__27486 = G__27745;
i__27487 = G__27746;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$swap_STAR_$arity$3 = (function (this__25453__auto__,f__25457__auto__,args__25468__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
var oldv__25461__auto__ = cljs.core.deref(this__25453__auto____$1);
var newv__25456__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$3(f__25457__auto__,oldv__25461__auto__,args__25468__auto__);
this__25453__auto____$1.extend_clj$core$IAtom3$validate$arity$3(null,self__.validator,newv__25456__auto__);

this__25453__auto____$1.extend_clj$core$IAtom3$compare_and_set_impl$arity$3(null,oldv__25461__auto__,newv__25456__auto__);

this__25453__auto____$1.extend_clj$core$IAtom3$notify_watches$arity$3(null,oldv__25461__auto__,newv__25456__auto__);

return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [oldv__25461__auto__,newv__25456__auto__], null);
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

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$2 = (function (this__25453__auto__,k__25462__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
return this__25453__auto____$1.cljs$core$ILookup$_lookup$arity$3(null,k__25462__auto__,null);
}));

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$3 = (function (this__25453__auto__,k__25462__auto__,not_found__25464__auto__){
var self__ = this;
var this__25453__auto____$1 = this;
var G__27519 = k__25462__auto__;
var G__27519__$1 = (((G__27519 instanceof cljs.core.Keyword))?G__27519.fqn:null);
switch (G__27519__$1) {
case "atom":
return self__.atom;

break;
default:
return not_found__25464__auto__;

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
var G__27537 = arguments.length;
switch (G__27537) {
case 1:
return datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___27749 = arguments.length;
var i__5750__auto___27750 = (0);
while(true){
if((i__5750__auto___27750 < len__5749__auto___27749)){
args_arr__5774__auto__.push((arguments[i__5750__auto___27750]));

var G__27751 = (i__5750__auto___27750 + (1));
i__5750__auto___27750 = G__27751;
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

(datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$variadic = (function (atom,rest__25469__auto__){
var opts__25470__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.array_map,rest__25469__auto__);
var ref__25471__auto__ = (new datascript.conn.Conn(atom,null,cljs.core.PersistentArrayMap.EMPTY,cljs.core.PersistentArrayMap.EMPTY));
var temp__5829__auto___27752 = new cljs.core.Keyword(null,"validator","validator",-1966190681).cljs$core$IFn$_invoke$arity$1(opts__25470__auto__);
if((temp__5829__auto___27752 == null)){
} else {
var validator__25465__auto___27754 = temp__5829__auto___27752;
ref__25471__auto__.extend_clj$core$IAtom3$validate$arity$3(null,validator__25465__auto___27754,cljs.core.deref(ref__25471__auto__));

(ref__25471__auto__.validator = validator__25465__auto___27754);
}

var temp__5829__auto___27758 = new cljs.core.Keyword(null,"meta","meta",1499536964).cljs$core$IFn$_invoke$arity$1(opts__25470__auto__);
if((temp__5829__auto___27758 == null)){
} else {
var meta__25472__auto___27759 = temp__5829__auto___27758;
cljs.core.reset_meta_BANG_(ref__25471__auto__,meta__25472__auto___27759);
}

return ref__25471__auto__;
}));

/** @this {Function} */
(datascript.conn.__GT_Conn.cljs$lang$applyTo = (function (seq27535){
var G__27536 = cljs.core.first(seq27535);
var seq27535__$1 = cljs.core.next(seq27535);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27536,seq27535__$1);
}));

(datascript.conn.__GT_Conn.cljs$lang$maxFixedArity = (1));


datascript.conn.make_conn = (function datascript$conn$make_conn(opts){
var G__27548 = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(opts);
return (datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1 ? datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1(G__27548) : datascript.conn.__GT_Conn.call(null,G__27548));
});
datascript.conn.with$ = (function datascript$conn$with(var_args){
var G__27550 = arguments.length;
switch (G__27550) {
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
var G__27556 = arguments.length;
switch (G__27556) {
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
var G__27558 = arguments.length;
switch (G__27558) {
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
var G__27565 = arguments.length;
switch (G__27565) {
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
var seq__27566_27770 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27567_27771 = null;
var count__27568_27772 = (0);
var i__27569_27773 = (0);
while(true){
if((i__27569_27773 < count__27568_27772)){
var vec__27576_27774 = chunk__27567_27771.cljs$core$IIndexed$_nth$arity$2(null,i__27569_27773);
var __27775 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27576_27774,(0),null);
var callback_27776 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27576_27774,(1),null);
(callback_27776.cljs$core$IFn$_invoke$arity$1 ? callback_27776.cljs$core$IFn$_invoke$arity$1(report) : callback_27776.call(null,report));


var G__27777 = seq__27566_27770;
var G__27778 = chunk__27567_27771;
var G__27779 = count__27568_27772;
var G__27780 = (i__27569_27773 + (1));
seq__27566_27770 = G__27777;
chunk__27567_27771 = G__27778;
count__27568_27772 = G__27779;
i__27569_27773 = G__27780;
continue;
} else {
var temp__5825__auto___27781 = cljs.core.seq(seq__27566_27770);
if(temp__5825__auto___27781){
var seq__27566_27782__$1 = temp__5825__auto___27781;
if(cljs.core.chunked_seq_QMARK_(seq__27566_27782__$1)){
var c__5548__auto___27783 = cljs.core.chunk_first(seq__27566_27782__$1);
var G__27784 = cljs.core.chunk_rest(seq__27566_27782__$1);
var G__27785 = c__5548__auto___27783;
var G__27786 = cljs.core.count(c__5548__auto___27783);
var G__27787 = (0);
seq__27566_27770 = G__27784;
chunk__27567_27771 = G__27785;
count__27568_27772 = G__27786;
i__27569_27773 = G__27787;
continue;
} else {
var vec__27580_27788 = cljs.core.first(seq__27566_27782__$1);
var __27789 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27580_27788,(0),null);
var callback_27790 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27580_27788,(1),null);
(callback_27790.cljs$core$IFn$_invoke$arity$1 ? callback_27790.cljs$core$IFn$_invoke$arity$1(report) : callback_27790.call(null,report));


var G__27791 = cljs.core.next(seq__27566_27782__$1);
var G__27792 = null;
var G__27793 = (0);
var G__27794 = (0);
seq__27566_27770 = G__27791;
chunk__27567_27771 = G__27792;
count__27568_27772 = G__27793;
i__27569_27773 = G__27794;
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
var report = datascript.db.map__GT_TxReport(new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"db-before","db-before",-553691536),db_before,new cljs.core.Keyword(null,"db-after","db-after",-571884666),db,new cljs.core.Keyword(null,"tx-data","tx-data",934159761),cljs.core.concat.cljs$core$IFn$_invoke$arity$2((cljs.core.truth_(db_before)?cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p1__27583_SHARP_){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(p1__27583_SHARP_,new cljs.core.Keyword(null,"added","added",2057651688),false);
}),datascript.db._datoms(db_before,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)):null),datascript.db._datoms(db,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)),new cljs.core.Keyword(null,"tx-meta","tx-meta",1159283194),tx_meta], null));
if(cljs.core.truth_(datascript.storage.storage(db_before))){
datascript.storage.store.cljs$core$IFn$_invoke$arity$1(db);

cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn),cljs.core.assoc,new cljs.core.Keyword(null,"db","db",993250759),db,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"tx-tail","tx-tail",1116487556),cljs.core.PersistentVector.EMPTY,new cljs.core.Keyword(null,"db-last-stored","db-last-stored",-2068760702),db], 0));
} else {
cljs.core.reset_BANG_(conn,db);
}

var seq__27630_27798 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27631_27799 = null;
var count__27632_27800 = (0);
var i__27633_27801 = (0);
while(true){
if((i__27633_27801 < count__27632_27800)){
var vec__27692_27802 = chunk__27631_27799.cljs$core$IIndexed$_nth$arity$2(null,i__27633_27801);
var __27803 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27692_27802,(0),null);
var callback_27804 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27692_27802,(1),null);
(callback_27804.cljs$core$IFn$_invoke$arity$1 ? callback_27804.cljs$core$IFn$_invoke$arity$1(report) : callback_27804.call(null,report));


var G__27805 = seq__27630_27798;
var G__27806 = chunk__27631_27799;
var G__27807 = count__27632_27800;
var G__27808 = (i__27633_27801 + (1));
seq__27630_27798 = G__27805;
chunk__27631_27799 = G__27806;
count__27632_27800 = G__27807;
i__27633_27801 = G__27808;
continue;
} else {
var temp__5825__auto___27809 = cljs.core.seq(seq__27630_27798);
if(temp__5825__auto___27809){
var seq__27630_27810__$1 = temp__5825__auto___27809;
if(cljs.core.chunked_seq_QMARK_(seq__27630_27810__$1)){
var c__5548__auto___27811 = cljs.core.chunk_first(seq__27630_27810__$1);
var G__27812 = cljs.core.chunk_rest(seq__27630_27810__$1);
var G__27813 = c__5548__auto___27811;
var G__27814 = cljs.core.count(c__5548__auto___27811);
var G__27815 = (0);
seq__27630_27798 = G__27812;
chunk__27631_27799 = G__27813;
count__27632_27800 = G__27814;
i__27633_27801 = G__27815;
continue;
} else {
var vec__27695_27816 = cljs.core.first(seq__27630_27810__$1);
var __27817 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27695_27816,(0),null);
var callback_27818 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27695_27816,(1),null);
(callback_27818.cljs$core$IFn$_invoke$arity$1 ? callback_27818.cljs$core$IFn$_invoke$arity$1(report) : callback_27818.call(null,report));


var G__27819 = cljs.core.next(seq__27630_27810__$1);
var G__27820 = null;
var G__27821 = (0);
var G__27822 = (0);
seq__27630_27798 = G__27819;
chunk__27631_27799 = G__27820;
count__27632_27800 = G__27821;
i__27633_27801 = G__27822;
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
var G__27704 = arguments.length;
switch (G__27704) {
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
