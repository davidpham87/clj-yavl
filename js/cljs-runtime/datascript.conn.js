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
(datascript.conn.Conn.prototype.equiv = (function (other__25530__auto__){
var self__ = this;
var this__25529__auto__ = this;
return this__25529__auto__.cljs$core$IEquiv$_equiv$arity$2(null,other__25530__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_notify_watches$arity$3 = (function (this__25529__auto__,oldv__25537__auto__,newv__25532__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
var seq__27470 = cljs.core.seq(self__.watches);
var chunk__27471 = null;
var count__27472 = (0);
var i__27473 = (0);
while(true){
if((i__27473 < count__27472)){
var vec__27490 = chunk__27471.cljs$core$IIndexed$_nth$arity$2(null,i__27473);
var k__25538__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27490,(0),null);
var f__25533__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27490,(1),null);
(f__25533__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25533__auto__.cljs$core$IFn$_invoke$arity$4(k__25538__auto__,this__25529__auto____$1,oldv__25537__auto__,newv__25532__auto__) : f__25533__auto__.call(null,k__25538__auto__,this__25529__auto____$1,oldv__25537__auto__,newv__25532__auto__));


var G__27654 = seq__27470;
var G__27655 = chunk__27471;
var G__27656 = count__27472;
var G__27657 = (i__27473 + (1));
seq__27470 = G__27654;
chunk__27471 = G__27655;
count__27472 = G__27656;
i__27473 = G__27657;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27470);
if(temp__5825__auto__){
var seq__27470__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27470__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27470__$1);
var G__27658 = cljs.core.chunk_rest(seq__27470__$1);
var G__27659 = c__5548__auto__;
var G__27660 = cljs.core.count(c__5548__auto__);
var G__27661 = (0);
seq__27470 = G__27658;
chunk__27471 = G__27659;
count__27472 = G__27660;
i__27473 = G__27661;
continue;
} else {
var vec__27496 = cljs.core.first(seq__27470__$1);
var k__25538__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27496,(0),null);
var f__25533__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27496,(1),null);
(f__25533__auto__.cljs$core$IFn$_invoke$arity$4 ? f__25533__auto__.cljs$core$IFn$_invoke$arity$4(k__25538__auto__,this__25529__auto____$1,oldv__25537__auto__,newv__25532__auto__) : f__25533__auto__.call(null,k__25538__auto__,this__25529__auto____$1,oldv__25537__auto__,newv__25532__auto__));


var G__27662 = cljs.core.next(seq__27470__$1);
var G__27663 = null;
var G__27664 = (0);
var G__27665 = (0);
seq__27470 = G__27662;
chunk__27471 = G__27663;
count__27472 = G__27664;
i__27473 = G__27665;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_add_watch$arity$3 = (function (this__25529__auto__,key__25539__auto__,f__25533__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
(this__25529__auto____$1.watches = cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(self__.watches,key__25539__auto__,f__25533__auto__));

return this__25529__auto____$1;
}));

(datascript.conn.Conn.prototype.cljs$core$IWatchable$_remove_watch$arity$2 = (function (this__25529__auto__,key__25539__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return (this__25529__auto____$1.watches = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(self__.watches,key__25539__auto__));
}));

(datascript.conn.Conn.prototype.cljs$core$IEquiv$_equiv$arity$2 = (function (o__25531__auto__,other__25530__auto__){
var self__ = this;
var o__25531__auto____$1 = this;
return (o__25531__auto____$1 === other__25530__auto__);
}));

(datascript.conn.Conn.prototype.cljs$core$IHash$_hash$arity$1 = (function (this__25529__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return goog.getUid(this__25529__auto____$1);
}));

(datascript.conn.Conn.prototype.cljs$core$IReset$_reset_BANG_$arity$2 = (function (this__25529__auto__,newv__25532__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25529__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,cljs.core.constantly(newv__25532__auto__),cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$2 = (function (this__25529__auto__,f__25533__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25529__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25533__auto__,cljs.core.List.EMPTY),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$3 = (function (this__25529__auto__,f__25533__auto__,a__25534__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25529__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25533__auto__,(new cljs.core.List(null,a__25534__auto__,null,(1),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$4 = (function (this__25529__auto__,f__25533__auto__,a__25534__auto__,b__25535__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25529__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25533__auto__,(new cljs.core.List(null,a__25534__auto__,(new cljs.core.List(null,b__25535__auto__,null,(1),null)),(2),null))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$ISwap$_swap_BANG_$arity$5 = (function (this__25529__auto__,f__25533__auto__,a__25534__auto__,b__25535__auto__,xs__25536__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return cljs.core.nth.cljs$core$IFn$_invoke$arity$2(this__25529__auto____$1.extend_clj$core$IAtom3$swap_STAR_$arity$3(null,f__25533__auto__,cljs.core.cons(a__25534__auto__,cljs.core.cons(b__25535__auto__,xs__25536__auto__))),(1));
}));

(datascript.conn.Conn.prototype.cljs$core$IMeta$_meta$arity$1 = (function (this__25529__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return self__.meta;
}));

(datascript.conn.Conn.prototype.cljs$core$IDeref$_deref$arity$1 = (function (this__25529__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return this__25529__auto____$1.extend_clj$core$IAtom3$deref_impl$arity$1(null);
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$ = cljs.core.PROTOCOL_SENTINEL);

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$validate$arity$3 = (function (this__25529__auto__,validator__25541__auto__,value__25542__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
if((!((validator__25541__auto__ == null)))){
if(cljs.core.truth_((validator__25541__auto__.cljs$core$IFn$_invoke$arity$1 ? validator__25541__auto__.cljs$core$IFn$_invoke$arity$1(value__25542__auto__) : validator__25541__auto__.call(null,value__25542__auto__)))){
return null;
} else {
throw cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2("Invalid reference state",new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),value__25542__auto__], null));
}
} else {
return null;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$notify_watches$arity$3 = (function (this__25529__auto__,oldv__25537__auto__,newv__25532__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
var seq__27521 = cljs.core.seq(self__.watches);
var chunk__27522 = null;
var count__27523 = (0);
var i__27524 = (0);
while(true){
if((i__27524 < count__27523)){
var vec__27531 = chunk__27522.cljs$core$IIndexed$_nth$arity$2(null,i__27524);
var k__25538__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27531,(0),null);
var w__25543__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27531,(1),null);
(w__25543__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25543__auto__.cljs$core$IFn$_invoke$arity$4(k__25538__auto__,this__25529__auto____$1,oldv__25537__auto__,newv__25532__auto__) : w__25543__auto__.call(null,k__25538__auto__,this__25529__auto____$1,oldv__25537__auto__,newv__25532__auto__));


var G__27667 = seq__27521;
var G__27668 = chunk__27522;
var G__27669 = count__27523;
var G__27670 = (i__27524 + (1));
seq__27521 = G__27667;
chunk__27522 = G__27668;
count__27523 = G__27669;
i__27524 = G__27670;
continue;
} else {
var temp__5825__auto__ = cljs.core.seq(seq__27521);
if(temp__5825__auto__){
var seq__27521__$1 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(seq__27521__$1)){
var c__5548__auto__ = cljs.core.chunk_first(seq__27521__$1);
var G__27671 = cljs.core.chunk_rest(seq__27521__$1);
var G__27672 = c__5548__auto__;
var G__27673 = cljs.core.count(c__5548__auto__);
var G__27674 = (0);
seq__27521 = G__27671;
chunk__27522 = G__27672;
count__27523 = G__27673;
i__27524 = G__27674;
continue;
} else {
var vec__27541 = cljs.core.first(seq__27521__$1);
var k__25538__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27541,(0),null);
var w__25543__auto__ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27541,(1),null);
(w__25543__auto__.cljs$core$IFn$_invoke$arity$4 ? w__25543__auto__.cljs$core$IFn$_invoke$arity$4(k__25538__auto__,this__25529__auto____$1,oldv__25537__auto__,newv__25532__auto__) : w__25543__auto__.call(null,k__25538__auto__,this__25529__auto____$1,oldv__25537__auto__,newv__25532__auto__));


var G__27675 = cljs.core.next(seq__27521__$1);
var G__27676 = null;
var G__27677 = (0);
var G__27678 = (0);
seq__27521 = G__27675;
chunk__27522 = G__27676;
count__27523 = G__27677;
i__27524 = G__27678;
continue;
}
} else {
return null;
}
}
break;
}
}));

(datascript.conn.Conn.prototype.extend_clj$core$IAtom3$swap_STAR_$arity$3 = (function (this__25529__auto__,f__25533__auto__,args__25544__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
var oldv__25537__auto__ = cljs.core.deref(this__25529__auto____$1);
var newv__25532__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$3(f__25533__auto__,oldv__25537__auto__,args__25544__auto__);
this__25529__auto____$1.extend_clj$core$IAtom3$validate$arity$3(null,self__.validator,newv__25532__auto__);

this__25529__auto____$1.extend_clj$core$IAtom3$compare_and_set_impl$arity$3(null,oldv__25537__auto__,newv__25532__auto__);

this__25529__auto____$1.extend_clj$core$IAtom3$notify_watches$arity$3(null,oldv__25537__auto__,newv__25532__auto__);

return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [oldv__25537__auto__,newv__25532__auto__], null);
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

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$2 = (function (this__25529__auto__,k__25538__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
return this__25529__auto____$1.cljs$core$ILookup$_lookup$arity$3(null,k__25538__auto__,null);
}));

(datascript.conn.Conn.prototype.cljs$core$ILookup$_lookup$arity$3 = (function (this__25529__auto__,k__25538__auto__,not_found__25540__auto__){
var self__ = this;
var this__25529__auto____$1 = this;
var G__27550 = k__25538__auto__;
var G__27550__$1 = (((G__27550 instanceof cljs.core.Keyword))?G__27550.fqn:null);
switch (G__27550__$1) {
case "atom":
return self__.atom;

break;
default:
return not_found__25540__auto__;

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
var G__27557 = arguments.length;
switch (G__27557) {
case 1:
return datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___27681 = arguments.length;
var i__5750__auto___27682 = (0);
while(true){
if((i__5750__auto___27682 < len__5749__auto___27681)){
args_arr__5774__auto__.push((arguments[i__5750__auto___27682]));

var G__27683 = (i__5750__auto___27682 + (1));
i__5750__auto___27682 = G__27683;
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

(datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$variadic = (function (atom,rest__25545__auto__){
var opts__25546__auto__ = cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.array_map,rest__25545__auto__);
var ref__25547__auto__ = (new datascript.conn.Conn(atom,null,cljs.core.PersistentArrayMap.EMPTY,cljs.core.PersistentArrayMap.EMPTY));
var temp__5829__auto___27684 = new cljs.core.Keyword(null,"validator","validator",-1966190681).cljs$core$IFn$_invoke$arity$1(opts__25546__auto__);
if((temp__5829__auto___27684 == null)){
} else {
var validator__25541__auto___27685 = temp__5829__auto___27684;
ref__25547__auto__.extend_clj$core$IAtom3$validate$arity$3(null,validator__25541__auto___27685,cljs.core.deref(ref__25547__auto__));

(ref__25547__auto__.validator = validator__25541__auto___27685);
}

var temp__5829__auto___27686 = new cljs.core.Keyword(null,"meta","meta",1499536964).cljs$core$IFn$_invoke$arity$1(opts__25546__auto__);
if((temp__5829__auto___27686 == null)){
} else {
var meta__25548__auto___27687 = temp__5829__auto___27686;
cljs.core.reset_meta_BANG_(ref__25547__auto__,meta__25548__auto___27687);
}

return ref__25547__auto__;
}));

/** @this {Function} */
(datascript.conn.__GT_Conn.cljs$lang$applyTo = (function (seq27555){
var G__27556 = cljs.core.first(seq27555);
var seq27555__$1 = cljs.core.next(seq27555);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27556,seq27555__$1);
}));

(datascript.conn.__GT_Conn.cljs$lang$maxFixedArity = (1));


datascript.conn.make_conn = (function datascript$conn$make_conn(opts){
var G__27591 = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(opts);
return (datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1 ? datascript.conn.__GT_Conn.cljs$core$IFn$_invoke$arity$1(G__27591) : datascript.conn.__GT_Conn.call(null,G__27591));
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
var G__27603 = arguments.length;
switch (G__27603) {
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
var G__27605 = arguments.length;
switch (G__27605) {
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
var G__27608 = arguments.length;
switch (G__27608) {
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
var seq__27609_27695 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27610_27696 = null;
var count__27611_27697 = (0);
var i__27612_27698 = (0);
while(true){
if((i__27612_27698 < count__27611_27697)){
var vec__27619_27699 = chunk__27610_27696.cljs$core$IIndexed$_nth$arity$2(null,i__27612_27698);
var __27700 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27619_27699,(0),null);
var callback_27701 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27619_27699,(1),null);
(callback_27701.cljs$core$IFn$_invoke$arity$1 ? callback_27701.cljs$core$IFn$_invoke$arity$1(report) : callback_27701.call(null,report));


var G__27702 = seq__27609_27695;
var G__27703 = chunk__27610_27696;
var G__27704 = count__27611_27697;
var G__27705 = (i__27612_27698 + (1));
seq__27609_27695 = G__27702;
chunk__27610_27696 = G__27703;
count__27611_27697 = G__27704;
i__27612_27698 = G__27705;
continue;
} else {
var temp__5825__auto___27706 = cljs.core.seq(seq__27609_27695);
if(temp__5825__auto___27706){
var seq__27609_27707__$1 = temp__5825__auto___27706;
if(cljs.core.chunked_seq_QMARK_(seq__27609_27707__$1)){
var c__5548__auto___27708 = cljs.core.chunk_first(seq__27609_27707__$1);
var G__27709 = cljs.core.chunk_rest(seq__27609_27707__$1);
var G__27710 = c__5548__auto___27708;
var G__27711 = cljs.core.count(c__5548__auto___27708);
var G__27712 = (0);
seq__27609_27695 = G__27709;
chunk__27610_27696 = G__27710;
count__27611_27697 = G__27711;
i__27612_27698 = G__27712;
continue;
} else {
var vec__27622_27713 = cljs.core.first(seq__27609_27707__$1);
var __27714 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27622_27713,(0),null);
var callback_27715 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27622_27713,(1),null);
(callback_27715.cljs$core$IFn$_invoke$arity$1 ? callback_27715.cljs$core$IFn$_invoke$arity$1(report) : callback_27715.call(null,report));


var G__27716 = cljs.core.next(seq__27609_27707__$1);
var G__27717 = null;
var G__27718 = (0);
var G__27719 = (0);
seq__27609_27695 = G__27716;
chunk__27610_27696 = G__27717;
count__27611_27697 = G__27718;
i__27612_27698 = G__27719;
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
var G__27627 = arguments.length;
switch (G__27627) {
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
var report = datascript.db.map__GT_TxReport(new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"db-before","db-before",-553691536),db_before,new cljs.core.Keyword(null,"db-after","db-after",-571884666),db,new cljs.core.Keyword(null,"tx-data","tx-data",934159761),cljs.core.concat.cljs$core$IFn$_invoke$arity$2((cljs.core.truth_(db_before)?cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p1__27625_SHARP_){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(p1__27625_SHARP_,new cljs.core.Keyword(null,"added","added",2057651688),false);
}),datascript.db._datoms(db_before,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)):null),datascript.db._datoms(db,new cljs.core.Keyword(null,"eavt","eavt",-666437073),null,null,null,null)),new cljs.core.Keyword(null,"tx-meta","tx-meta",1159283194),tx_meta], null));
if(cljs.core.truth_(datascript.storage.storage(db_before))){
datascript.storage.store.cljs$core$IFn$_invoke$arity$1(db);

cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn),cljs.core.assoc,new cljs.core.Keyword(null,"db","db",993250759),db,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"tx-tail","tx-tail",1116487556),cljs.core.PersistentVector.EMPTY,new cljs.core.Keyword(null,"db-last-stored","db-last-stored",-2068760702),db], 0));
} else {
cljs.core.reset_BANG_(conn,db);
}

var seq__27629_27724 = cljs.core.seq(new cljs.core.Keyword(null,"listeners","listeners",394544445).cljs$core$IFn$_invoke$arity$1(cljs.core.deref(new cljs.core.Keyword(null,"atom","atom",-397043653).cljs$core$IFn$_invoke$arity$1(conn))));
var chunk__27630_27725 = null;
var count__27631_27726 = (0);
var i__27632_27727 = (0);
while(true){
if((i__27632_27727 < count__27631_27726)){
var vec__27640_27728 = chunk__27630_27725.cljs$core$IIndexed$_nth$arity$2(null,i__27632_27727);
var __27729 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27640_27728,(0),null);
var callback_27730 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27640_27728,(1),null);
(callback_27730.cljs$core$IFn$_invoke$arity$1 ? callback_27730.cljs$core$IFn$_invoke$arity$1(report) : callback_27730.call(null,report));


var G__27731 = seq__27629_27724;
var G__27732 = chunk__27630_27725;
var G__27733 = count__27631_27726;
var G__27734 = (i__27632_27727 + (1));
seq__27629_27724 = G__27731;
chunk__27630_27725 = G__27732;
count__27631_27726 = G__27733;
i__27632_27727 = G__27734;
continue;
} else {
var temp__5825__auto___27735 = cljs.core.seq(seq__27629_27724);
if(temp__5825__auto___27735){
var seq__27629_27736__$1 = temp__5825__auto___27735;
if(cljs.core.chunked_seq_QMARK_(seq__27629_27736__$1)){
var c__5548__auto___27738 = cljs.core.chunk_first(seq__27629_27736__$1);
var G__27739 = cljs.core.chunk_rest(seq__27629_27736__$1);
var G__27740 = c__5548__auto___27738;
var G__27741 = cljs.core.count(c__5548__auto___27738);
var G__27742 = (0);
seq__27629_27724 = G__27739;
chunk__27630_27725 = G__27740;
count__27631_27726 = G__27741;
i__27632_27727 = G__27742;
continue;
} else {
var vec__27644_27743 = cljs.core.first(seq__27629_27736__$1);
var __27744 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27644_27743,(0),null);
var callback_27745 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__27644_27743,(1),null);
(callback_27745.cljs$core$IFn$_invoke$arity$1 ? callback_27745.cljs$core$IFn$_invoke$arity$1(report) : callback_27745.call(null,report));


var G__27746 = cljs.core.next(seq__27629_27736__$1);
var G__27747 = null;
var G__27748 = (0);
var G__27749 = (0);
seq__27629_27724 = G__27746;
chunk__27630_27725 = G__27747;
count__27631_27726 = G__27748;
i__27632_27727 = G__27749;
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
var G__27650 = arguments.length;
switch (G__27650) {
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
