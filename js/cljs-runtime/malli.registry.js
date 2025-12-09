goog.provide('malli.registry');
/**
 * @define {string}
 */
malli.registry.mode = goog.define("malli.registry.mode","default");
/**
 * @define {string}
 */
malli.registry.type = goog.define("malli.registry.type","default");

/**
 * @interface
 */
malli.registry.Registry = function(){};

var malli$registry$Registry$_schema$dyn_20826 = (function (this$,type){
var x__5373__auto__ = (((this$ == null))?null:this$);
var m__5374__auto__ = (malli.registry._schema[goog.typeOf(x__5373__auto__)]);
if((!((m__5374__auto__ == null)))){
return (m__5374__auto__.cljs$core$IFn$_invoke$arity$2 ? m__5374__auto__.cljs$core$IFn$_invoke$arity$2(this$,type) : m__5374__auto__.call(null,this$,type));
} else {
var m__5372__auto__ = (malli.registry._schema["_"]);
if((!((m__5372__auto__ == null)))){
return (m__5372__auto__.cljs$core$IFn$_invoke$arity$2 ? m__5372__auto__.cljs$core$IFn$_invoke$arity$2(this$,type) : m__5372__auto__.call(null,this$,type));
} else {
throw cljs.core.missing_protocol("Registry.-schema",this$);
}
}
});
/**
 * returns the schema from a registry
 */
malli.registry._schema = (function malli$registry$_schema(this$,type){
if((((!((this$ == null)))) && ((!((this$.malli$registry$Registry$_schema$arity$2 == null)))))){
return this$.malli$registry$Registry$_schema$arity$2(this$,type);
} else {
return malli$registry$Registry$_schema$dyn_20826(this$,type);
}
});

var malli$registry$Registry$_schemas$dyn_20827 = (function (this$){
var x__5373__auto__ = (((this$ == null))?null:this$);
var m__5374__auto__ = (malli.registry._schemas[goog.typeOf(x__5373__auto__)]);
if((!((m__5374__auto__ == null)))){
return (m__5374__auto__.cljs$core$IFn$_invoke$arity$1 ? m__5374__auto__.cljs$core$IFn$_invoke$arity$1(this$) : m__5374__auto__.call(null,this$));
} else {
var m__5372__auto__ = (malli.registry._schemas["_"]);
if((!((m__5372__auto__ == null)))){
return (m__5372__auto__.cljs$core$IFn$_invoke$arity$1 ? m__5372__auto__.cljs$core$IFn$_invoke$arity$1(this$) : m__5372__auto__.call(null,this$));
} else {
throw cljs.core.missing_protocol("Registry.-schemas",this$);
}
}
});
/**
 * returns all schemas from a registry
 */
malli.registry._schemas = (function malli$registry$_schemas(this$){
if((((!((this$ == null)))) && ((!((this$.malli$registry$Registry$_schemas$arity$1 == null)))))){
return this$.malli$registry$Registry$_schemas$arity$1(this$);
} else {
return malli$registry$Registry$_schemas$dyn_20827(this$);
}
});

malli.registry.registry_QMARK_ = (function malli$registry$registry_QMARK_(x){
if((!((x == null)))){
if(((false) || ((cljs.core.PROTOCOL_SENTINEL === x.malli$registry$Registry$)))){
return true;
} else {
return false;
}
} else {
return false;
}
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20739 = (function (m,fm,meta20740){
this.m = m;
this.fm = fm;
this.meta20740 = meta20740;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20739.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20741,meta20740__$1){
var self__ = this;
var _20741__$1 = this;
return (new malli.registry.t_malli$registry20739(self__.m,self__.fm,meta20740__$1));
}));

(malli.registry.t_malli$registry20739.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20741){
var self__ = this;
var _20741__$1 = this;
return self__.meta20740;
}));

(malli.registry.t_malli$registry20739.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20739.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return self__.fm.get(type);
}));

(malli.registry.t_malli$registry20739.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return self__.m;
}));

(malli.registry.t_malli$registry20739.getBasis = (function (){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"m","m",-1021758608,null),new cljs.core.Symbol(null,"fm","fm",-1190690268,null),new cljs.core.Symbol(null,"meta20740","meta20740",-2137429866,null)], null);
}));

(malli.registry.t_malli$registry20739.cljs$lang$type = true);

(malli.registry.t_malli$registry20739.cljs$lang$ctorStr = "malli.registry/t_malli$registry20739");

(malli.registry.t_malli$registry20739.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20739");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20739.
 */
malli.registry.__GT_t_malli$registry20739 = (function malli$registry$__GT_t_malli$registry20739(m,fm,meta20740){
return (new malli.registry.t_malli$registry20739(m,fm,meta20740));
});


malli.registry.fast_registry = (function malli$registry$fast_registry(m){
var fm = m;
return (new malli.registry.t_malli$registry20739(m,fm,cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20748 = (function (m,meta20749){
this.m = m;
this.meta20749 = meta20749;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20748.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20750,meta20749__$1){
var self__ = this;
var _20750__$1 = this;
return (new malli.registry.t_malli$registry20748(self__.m,meta20749__$1));
}));

(malli.registry.t_malli$registry20748.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20750){
var self__ = this;
var _20750__$1 = this;
return self__.meta20749;
}));

(malli.registry.t_malli$registry20748.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20748.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return (self__.m.cljs$core$IFn$_invoke$arity$1 ? self__.m.cljs$core$IFn$_invoke$arity$1(type) : self__.m.call(null,type));
}));

(malli.registry.t_malli$registry20748.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return self__.m;
}));

(malli.registry.t_malli$registry20748.getBasis = (function (){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"m","m",-1021758608,null),new cljs.core.Symbol(null,"meta20749","meta20749",538865603,null)], null);
}));

(malli.registry.t_malli$registry20748.cljs$lang$type = true);

(malli.registry.t_malli$registry20748.cljs$lang$ctorStr = "malli.registry/t_malli$registry20748");

(malli.registry.t_malli$registry20748.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20748");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20748.
 */
malli.registry.__GT_t_malli$registry20748 = (function malli$registry$__GT_t_malli$registry20748(m,meta20749){
return (new malli.registry.t_malli$registry20748(m,meta20749));
});


malli.registry.simple_registry = (function malli$registry$simple_registry(m){
return (new malli.registry.t_malli$registry20748(m,cljs.core.PersistentArrayMap.EMPTY));
});
malli.registry.registry = (function malli$registry$registry(_QMARK_registry){
if((_QMARK_registry == null)){
return null;
} else {
if(malli.registry.registry_QMARK_(_QMARK_registry)){
return _QMARK_registry;
} else {
if(cljs.core.map_QMARK_(_QMARK_registry)){
return malli.registry.simple_registry(_QMARK_registry);
} else {
if((((!((_QMARK_registry == null))))?((((false) || ((cljs.core.PROTOCOL_SENTINEL === _QMARK_registry.malli$registry$Registry$))))?true:(((!_QMARK_registry.cljs$lang$protocol_mask$partition$))?cljs.core.native_satisfies_QMARK_(malli.registry.Registry,_QMARK_registry):false)):cljs.core.native_satisfies_QMARK_(malli.registry.Registry,_QMARK_registry))){
return _QMARK_registry;
} else {
return null;
}
}
}
}
});
malli.registry.registry_STAR_ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(malli.registry.simple_registry(cljs.core.PersistentArrayMap.EMPTY));
malli.registry.set_default_registry_BANG_ = (function malli$registry$set_default_registry_BANG_(_QMARK_registry){
if((!((malli.registry.mode === "strict")))){
return cljs.core.reset_BANG_(malli.registry.registry_STAR_,malli.registry.registry(_QMARK_registry));
} else {
throw cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2("can't set default registry, invalid mode",new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"mode","mode",654403691),malli.registry.mode,new cljs.core.Keyword(null,"type","type",1174270348),malli.registry.type], null));
}
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20775 = (function (meta20776){
this.meta20776 = meta20776;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20775.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20777,meta20776__$1){
var self__ = this;
var _20777__$1 = this;
return (new malli.registry.t_malli$registry20775(meta20776__$1));
}));

(malli.registry.t_malli$registry20775.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20777){
var self__ = this;
var _20777__$1 = this;
return self__.meta20776;
}));

(malli.registry.t_malli$registry20775.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20775.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return malli.registry._schema(cljs.core.deref(malli.registry.registry_STAR_),type);
}));

(malli.registry.t_malli$registry20775.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return malli.registry._schemas(cljs.core.deref(malli.registry.registry_STAR_));
}));

(malli.registry.t_malli$registry20775.getBasis = (function (){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"meta20776","meta20776",-1991133581,null)], null);
}));

(malli.registry.t_malli$registry20775.cljs$lang$type = true);

(malli.registry.t_malli$registry20775.cljs$lang$ctorStr = "malli.registry/t_malli$registry20775");

(malli.registry.t_malli$registry20775.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20775");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20775.
 */
malli.registry.__GT_t_malli$registry20775 = (function malli$registry$__GT_t_malli$registry20775(meta20776){
return (new malli.registry.t_malli$registry20775(meta20776));
});


malli.registry.custom_default_registry = (function malli$registry$custom_default_registry(){
return (new malli.registry.t_malli$registry20775(cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20805 = (function (_QMARK_registries,registries,meta20806){
this._QMARK_registries = _QMARK_registries;
this.registries = registries;
this.meta20806 = meta20806;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20805.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20807,meta20806__$1){
var self__ = this;
var _20807__$1 = this;
return (new malli.registry.t_malli$registry20805(self__._QMARK_registries,self__.registries,meta20806__$1));
}));

(malli.registry.t_malli$registry20805.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20807){
var self__ = this;
var _20807__$1 = this;
return self__.meta20806;
}));

(malli.registry.t_malli$registry20805.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20805.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return cljs.core.some((function (p1__20793_SHARP_){
return malli.registry._schema(p1__20793_SHARP_,type);
}),self__.registries);
}));

(malli.registry.t_malli$registry20805.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$2(cljs.core.merge,cljs.core.map.cljs$core$IFn$_invoke$arity$2(malli.registry._schemas,cljs.core.reverse(self__.registries)));
}));

(malli.registry.t_malli$registry20805.getBasis = (function (){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?registries","?registries",2135368100,null),new cljs.core.Symbol(null,"registries","registries",-1366064418,null),new cljs.core.Symbol(null,"meta20806","meta20806",1325879098,null)], null);
}));

(malli.registry.t_malli$registry20805.cljs$lang$type = true);

(malli.registry.t_malli$registry20805.cljs$lang$ctorStr = "malli.registry/t_malli$registry20805");

(malli.registry.t_malli$registry20805.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20805");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20805.
 */
malli.registry.__GT_t_malli$registry20805 = (function malli$registry$__GT_t_malli$registry20805(_QMARK_registries,registries,meta20806){
return (new malli.registry.t_malli$registry20805(_QMARK_registries,registries,meta20806));
});


malli.registry.composite_registry = (function malli$registry$composite_registry(var_args){
var args__5755__auto__ = [];
var len__5749__auto___20830 = arguments.length;
var i__5750__auto___20832 = (0);
while(true){
if((i__5750__auto___20832 < len__5749__auto___20830)){
args__5755__auto__.push((arguments[i__5750__auto___20832]));

var G__20833 = (i__5750__auto___20832 + (1));
i__5750__auto___20832 = G__20833;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((0) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((0)),(0),null)):null);
return malli.registry.composite_registry.cljs$core$IFn$_invoke$arity$variadic(argseq__5756__auto__);
});

(malli.registry.composite_registry.cljs$core$IFn$_invoke$arity$variadic = (function (_QMARK_registries){
var registries = cljs.core.mapv.cljs$core$IFn$_invoke$arity$2(malli.registry.registry,_QMARK_registries);
return (new malli.registry.t_malli$registry20805(_QMARK_registries,registries,cljs.core.PersistentArrayMap.EMPTY));
}));

(malli.registry.composite_registry.cljs$lang$maxFixedArity = (0));

/** @this {Function} */
(malli.registry.composite_registry.cljs$lang$applyTo = (function (seq20794){
var self__5735__auto__ = this;
return self__5735__auto__.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq20794));
}));


/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20809 = (function (db,meta20810){
this.db = db;
this.meta20810 = meta20810;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20809.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20811,meta20810__$1){
var self__ = this;
var _20811__$1 = this;
return (new malli.registry.t_malli$registry20809(self__.db,meta20810__$1));
}));

(malli.registry.t_malli$registry20809.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20811){
var self__ = this;
var _20811__$1 = this;
return self__.meta20810;
}));

(malli.registry.t_malli$registry20809.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20809.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return malli.registry._schema(malli.registry.registry(cljs.core.deref(self__.db)),type);
}));

(malli.registry.t_malli$registry20809.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return malli.registry._schemas(malli.registry.registry(cljs.core.deref(self__.db)));
}));

(malli.registry.t_malli$registry20809.getBasis = (function (){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"db","db",-1661185010,null),new cljs.core.Symbol(null,"meta20810","meta20810",-1878779810,null)], null);
}));

(malli.registry.t_malli$registry20809.cljs$lang$type = true);

(malli.registry.t_malli$registry20809.cljs$lang$ctorStr = "malli.registry/t_malli$registry20809");

(malli.registry.t_malli$registry20809.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20809");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20809.
 */
malli.registry.__GT_t_malli$registry20809 = (function malli$registry$__GT_t_malli$registry20809(db,meta20810){
return (new malli.registry.t_malli$registry20809(db,meta20810));
});


malli.registry.mutable_registry = (function malli$registry$mutable_registry(db){
return (new malli.registry.t_malli$registry20809(db,cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20812 = (function (meta20813){
this.meta20813 = meta20813;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20812.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20814,meta20813__$1){
var self__ = this;
var _20814__$1 = this;
return (new malli.registry.t_malli$registry20812(meta20813__$1));
}));

(malli.registry.t_malli$registry20812.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20814){
var self__ = this;
var _20814__$1 = this;
return self__.meta20813;
}));

(malli.registry.t_malli$registry20812.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20812.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
if(cljs.core.var_QMARK_(type)){
return cljs.core.deref(type);
} else {
return null;
}
}));

(malli.registry.t_malli$registry20812.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return null;
}));

(malli.registry.t_malli$registry20812.getBasis = (function (){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"meta20813","meta20813",1284753248,null)], null);
}));

(malli.registry.t_malli$registry20812.cljs$lang$type = true);

(malli.registry.t_malli$registry20812.cljs$lang$ctorStr = "malli.registry/t_malli$registry20812");

(malli.registry.t_malli$registry20812.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20812");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20812.
 */
malli.registry.__GT_t_malli$registry20812 = (function malli$registry$__GT_t_malli$registry20812(meta20813){
return (new malli.registry.t_malli$registry20812(meta20813));
});


malli.registry.var_registry = (function malli$registry$var_registry(){
return (new malli.registry.t_malli$registry20812(cljs.core.PersistentArrayMap.EMPTY));
});
malli.registry._STAR_registry_STAR_ = cljs.core.PersistentArrayMap.EMPTY;

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20815 = (function (meta20816){
this.meta20816 = meta20816;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20815.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20817,meta20816__$1){
var self__ = this;
var _20817__$1 = this;
return (new malli.registry.t_malli$registry20815(meta20816__$1));
}));

(malli.registry.t_malli$registry20815.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20817){
var self__ = this;
var _20817__$1 = this;
return self__.meta20816;
}));

(malli.registry.t_malli$registry20815.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20815.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return malli.registry._schema(malli.registry.registry(malli.registry._STAR_registry_STAR_),type);
}));

(malli.registry.t_malli$registry20815.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return malli.registry._schemas(malli.registry.registry(malli.registry._STAR_registry_STAR_));
}));

(malli.registry.t_malli$registry20815.getBasis = (function (){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"meta20816","meta20816",2035378143,null)], null);
}));

(malli.registry.t_malli$registry20815.cljs$lang$type = true);

(malli.registry.t_malli$registry20815.cljs$lang$ctorStr = "malli.registry/t_malli$registry20815");

(malli.registry.t_malli$registry20815.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20815");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20815.
 */
malli.registry.__GT_t_malli$registry20815 = (function malli$registry$__GT_t_malli$registry20815(meta20816){
return (new malli.registry.t_malli$registry20815(meta20816));
});


malli.registry.dynamic_registry = (function malli$registry$dynamic_registry(){
return (new malli.registry.t_malli$registry20815(cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20818 = (function (default_registry,provider,cache_STAR_,registry_STAR_,meta20819){
this.default_registry = default_registry;
this.provider = provider;
this.cache_STAR_ = cache_STAR_;
this.registry_STAR_ = registry_STAR_;
this.meta20819 = meta20819;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20818.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20820,meta20819__$1){
var self__ = this;
var _20820__$1 = this;
return (new malli.registry.t_malli$registry20818(self__.default_registry,self__.provider,self__.cache_STAR_,self__.registry_STAR_,meta20819__$1));
}));

(malli.registry.t_malli$registry20818.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20820){
var self__ = this;
var _20820__$1 = this;
return self__.meta20819;
}));

(malli.registry.t_malli$registry20818.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20818.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,name){
var self__ = this;
var ___$1 = this;
var or__5025__auto__ = (function (){var fexpr__20823 = cljs.core.deref(self__.cache_STAR_);
return (fexpr__20823.cljs$core$IFn$_invoke$arity$1 ? fexpr__20823.cljs$core$IFn$_invoke$arity$1(name) : fexpr__20823.call(null,name));
})();
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
var temp__5825__auto__ = (function (){var G__20824 = name;
var G__20825 = cljs.core.deref(self__.registry_STAR_);
return (self__.provider.cljs$core$IFn$_invoke$arity$2 ? self__.provider.cljs$core$IFn$_invoke$arity$2(G__20824,G__20825) : self__.provider.call(null,G__20824,G__20825));
})();
if(cljs.core.truth_(temp__5825__auto__)){
var schema = temp__5825__auto__;
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$4(self__.cache_STAR_,cljs.core.assoc,name,schema);

return schema;
} else {
return null;
}
}
}));

(malli.registry.t_malli$registry20818.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return cljs.core.deref(self__.cache_STAR_);
}));

(malli.registry.t_malli$registry20818.getBasis = (function (){
return new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"default-registry","default-registry",732204441,null),new cljs.core.Symbol(null,"provider","provider",1338474627,null),new cljs.core.Symbol(null,"cache*","cache*",-548597526,null),new cljs.core.Symbol(null,"registry*","registry*",-268031273,null),new cljs.core.Symbol(null,"meta20819","meta20819",-1365341539,null)], null);
}));

(malli.registry.t_malli$registry20818.cljs$lang$type = true);

(malli.registry.t_malli$registry20818.cljs$lang$ctorStr = "malli.registry/t_malli$registry20818");

(malli.registry.t_malli$registry20818.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20818");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20818.
 */
malli.registry.__GT_t_malli$registry20818 = (function malli$registry$__GT_t_malli$registry20818(default_registry,provider,cache_STAR_,registry_STAR_,meta20819){
return (new malli.registry.t_malli$registry20818(default_registry,provider,cache_STAR_,registry_STAR_,meta20819));
});


malli.registry.lazy_registry = (function malli$registry$lazy_registry(default_registry,provider){
var cache_STAR_ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var registry_STAR_ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(default_registry);
return cljs.core.reset_BANG_(registry_STAR_,malli.registry.composite_registry.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([default_registry,(new malli.registry.t_malli$registry20818(default_registry,provider,cache_STAR_,registry_STAR_,cljs.core.PersistentArrayMap.EMPTY))], 0)));
});
/**
 * finds a schema from a registry
 */
malli.registry.schema = (function malli$registry$schema(registry,type){
return malli.registry._schema(registry,type);
});
/**
 * finds all schemas from a registry
 */
malli.registry.schemas = (function malli$registry$schemas(registry){
return malli.registry._schemas(registry);
});

//# sourceMappingURL=malli.registry.js.map
