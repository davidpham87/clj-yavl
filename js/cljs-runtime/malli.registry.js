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

var malli$registry$Registry$_schema$dyn_27551 = (function (this$,type){
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
return malli$registry$Registry$_schema$dyn_27551(this$,type);
}
});

var malli$registry$Registry$_schemas$dyn_27552 = (function (this$){
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
return malli$registry$Registry$_schemas$dyn_27552(this$);
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
malli.registry.t_malli$registry27483 = (function (m,fm,meta27484){
this.m = m;
this.fm = fm;
this.meta27484 = meta27484;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry27483.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_27485,meta27484__$1){
var self__ = this;
var _27485__$1 = this;
return (new malli.registry.t_malli$registry27483(self__.m,self__.fm,meta27484__$1));
}));

(malli.registry.t_malli$registry27483.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_27485){
var self__ = this;
var _27485__$1 = this;
return self__.meta27484;
}));

(malli.registry.t_malli$registry27483.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry27483.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return self__.fm.get(type);
}));

(malli.registry.t_malli$registry27483.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return self__.m;
}));

(malli.registry.t_malli$registry27483.getBasis = (function (){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"m","m",-1021758608,null),new cljs.core.Symbol(null,"fm","fm",-1190690268,null),new cljs.core.Symbol(null,"meta27484","meta27484",910768100,null)], null);
}));

(malli.registry.t_malli$registry27483.cljs$lang$type = true);

(malli.registry.t_malli$registry27483.cljs$lang$ctorStr = "malli.registry/t_malli$registry27483");

(malli.registry.t_malli$registry27483.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry27483");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry27483.
 */
malli.registry.__GT_t_malli$registry27483 = (function malli$registry$__GT_t_malli$registry27483(m,fm,meta27484){
return (new malli.registry.t_malli$registry27483(m,fm,meta27484));
});


malli.registry.fast_registry = (function malli$registry$fast_registry(m){
var fm = m;
return (new malli.registry.t_malli$registry27483(m,fm,cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry27486 = (function (m,meta27487){
this.m = m;
this.meta27487 = meta27487;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry27486.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_27488,meta27487__$1){
var self__ = this;
var _27488__$1 = this;
return (new malli.registry.t_malli$registry27486(self__.m,meta27487__$1));
}));

(malli.registry.t_malli$registry27486.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_27488){
var self__ = this;
var _27488__$1 = this;
return self__.meta27487;
}));

(malli.registry.t_malli$registry27486.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry27486.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return (self__.m.cljs$core$IFn$_invoke$arity$1 ? self__.m.cljs$core$IFn$_invoke$arity$1(type) : self__.m.call(null,type));
}));

(malli.registry.t_malli$registry27486.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return self__.m;
}));

(malli.registry.t_malli$registry27486.getBasis = (function (){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"m","m",-1021758608,null),new cljs.core.Symbol(null,"meta27487","meta27487",2058251734,null)], null);
}));

(malli.registry.t_malli$registry27486.cljs$lang$type = true);

(malli.registry.t_malli$registry27486.cljs$lang$ctorStr = "malli.registry/t_malli$registry27486");

(malli.registry.t_malli$registry27486.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry27486");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry27486.
 */
malli.registry.__GT_t_malli$registry27486 = (function malli$registry$__GT_t_malli$registry27486(m,meta27487){
return (new malli.registry.t_malli$registry27486(m,meta27487));
});


malli.registry.simple_registry = (function malli$registry$simple_registry(m){
return (new malli.registry.t_malli$registry27486(m,cljs.core.PersistentArrayMap.EMPTY));
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
malli.registry.t_malli$registry27493 = (function (meta27494){
this.meta27494 = meta27494;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry27493.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_27495,meta27494__$1){
var self__ = this;
var _27495__$1 = this;
return (new malli.registry.t_malli$registry27493(meta27494__$1));
}));

(malli.registry.t_malli$registry27493.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_27495){
var self__ = this;
var _27495__$1 = this;
return self__.meta27494;
}));

(malli.registry.t_malli$registry27493.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry27493.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return malli.registry._schema(cljs.core.deref(malli.registry.registry_STAR_),type);
}));

(malli.registry.t_malli$registry27493.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return malli.registry._schemas(cljs.core.deref(malli.registry.registry_STAR_));
}));

(malli.registry.t_malli$registry27493.getBasis = (function (){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"meta27494","meta27494",-483603648,null)], null);
}));

(malli.registry.t_malli$registry27493.cljs$lang$type = true);

(malli.registry.t_malli$registry27493.cljs$lang$ctorStr = "malli.registry/t_malli$registry27493");

(malli.registry.t_malli$registry27493.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry27493");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry27493.
 */
malli.registry.__GT_t_malli$registry27493 = (function malli$registry$__GT_t_malli$registry27493(meta27494){
return (new malli.registry.t_malli$registry27493(meta27494));
});


malli.registry.custom_default_registry = (function malli$registry$custom_default_registry(){
return (new malli.registry.t_malli$registry27493(cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry27498 = (function (_QMARK_registries,registries,meta27499){
this._QMARK_registries = _QMARK_registries;
this.registries = registries;
this.meta27499 = meta27499;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry27498.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_27500,meta27499__$1){
var self__ = this;
var _27500__$1 = this;
return (new malli.registry.t_malli$registry27498(self__._QMARK_registries,self__.registries,meta27499__$1));
}));

(malli.registry.t_malli$registry27498.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_27500){
var self__ = this;
var _27500__$1 = this;
return self__.meta27499;
}));

(malli.registry.t_malli$registry27498.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry27498.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return cljs.core.some((function (p1__27496_SHARP_){
return malli.registry._schema(p1__27496_SHARP_,type);
}),self__.registries);
}));

(malli.registry.t_malli$registry27498.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$2(cljs.core.merge,cljs.core.map.cljs$core$IFn$_invoke$arity$2(malli.registry._schemas,cljs.core.reverse(self__.registries)));
}));

(malli.registry.t_malli$registry27498.getBasis = (function (){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?registries","?registries",2135368100,null),new cljs.core.Symbol(null,"registries","registries",-1366064418,null),new cljs.core.Symbol(null,"meta27499","meta27499",-377084629,null)], null);
}));

(malli.registry.t_malli$registry27498.cljs$lang$type = true);

(malli.registry.t_malli$registry27498.cljs$lang$ctorStr = "malli.registry/t_malli$registry27498");

(malli.registry.t_malli$registry27498.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry27498");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry27498.
 */
malli.registry.__GT_t_malli$registry27498 = (function malli$registry$__GT_t_malli$registry27498(_QMARK_registries,registries,meta27499){
return (new malli.registry.t_malli$registry27498(_QMARK_registries,registries,meta27499));
});


malli.registry.composite_registry = (function malli$registry$composite_registry(var_args){
var args__5755__auto__ = [];
var len__5749__auto___27574 = arguments.length;
var i__5750__auto___27575 = (0);
while(true){
if((i__5750__auto___27575 < len__5749__auto___27574)){
args__5755__auto__.push((arguments[i__5750__auto___27575]));

var G__27576 = (i__5750__auto___27575 + (1));
i__5750__auto___27575 = G__27576;
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
return (new malli.registry.t_malli$registry27498(_QMARK_registries,registries,cljs.core.PersistentArrayMap.EMPTY));
}));

(malli.registry.composite_registry.cljs$lang$maxFixedArity = (0));

/** @this {Function} */
(malli.registry.composite_registry.cljs$lang$applyTo = (function (seq27497){
var self__5735__auto__ = this;
return self__5735__auto__.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq27497));
}));


/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry27504 = (function (db,meta27505){
this.db = db;
this.meta27505 = meta27505;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry27504.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_27506,meta27505__$1){
var self__ = this;
var _27506__$1 = this;
return (new malli.registry.t_malli$registry27504(self__.db,meta27505__$1));
}));

(malli.registry.t_malli$registry27504.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_27506){
var self__ = this;
var _27506__$1 = this;
return self__.meta27505;
}));

(malli.registry.t_malli$registry27504.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry27504.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return malli.registry._schema(malli.registry.registry(cljs.core.deref(self__.db)),type);
}));

(malli.registry.t_malli$registry27504.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return malli.registry._schemas(malli.registry.registry(cljs.core.deref(self__.db)));
}));

(malli.registry.t_malli$registry27504.getBasis = (function (){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"db","db",-1661185010,null),new cljs.core.Symbol(null,"meta27505","meta27505",-755153094,null)], null);
}));

(malli.registry.t_malli$registry27504.cljs$lang$type = true);

(malli.registry.t_malli$registry27504.cljs$lang$ctorStr = "malli.registry/t_malli$registry27504");

(malli.registry.t_malli$registry27504.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry27504");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry27504.
 */
malli.registry.__GT_t_malli$registry27504 = (function malli$registry$__GT_t_malli$registry27504(db,meta27505){
return (new malli.registry.t_malli$registry27504(db,meta27505));
});


malli.registry.mutable_registry = (function malli$registry$mutable_registry(db){
return (new malli.registry.t_malli$registry27504(db,cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry27517 = (function (meta27518){
this.meta27518 = meta27518;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry27517.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_27519,meta27518__$1){
var self__ = this;
var _27519__$1 = this;
return (new malli.registry.t_malli$registry27517(meta27518__$1));
}));

(malli.registry.t_malli$registry27517.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_27519){
var self__ = this;
var _27519__$1 = this;
return self__.meta27518;
}));

(malli.registry.t_malli$registry27517.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry27517.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
if(cljs.core.var_QMARK_(type)){
return cljs.core.deref(type);
} else {
return null;
}
}));

(malli.registry.t_malli$registry27517.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return null;
}));

(malli.registry.t_malli$registry27517.getBasis = (function (){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"meta27518","meta27518",1276223482,null)], null);
}));

(malli.registry.t_malli$registry27517.cljs$lang$type = true);

(malli.registry.t_malli$registry27517.cljs$lang$ctorStr = "malli.registry/t_malli$registry27517");

(malli.registry.t_malli$registry27517.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry27517");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry27517.
 */
malli.registry.__GT_t_malli$registry27517 = (function malli$registry$__GT_t_malli$registry27517(meta27518){
return (new malli.registry.t_malli$registry27517(meta27518));
});


malli.registry.var_registry = (function malli$registry$var_registry(){
return (new malli.registry.t_malli$registry27517(cljs.core.PersistentArrayMap.EMPTY));
});
malli.registry._STAR_registry_STAR_ = cljs.core.PersistentArrayMap.EMPTY;

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry27523 = (function (meta27524){
this.meta27524 = meta27524;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry27523.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_27525,meta27524__$1){
var self__ = this;
var _27525__$1 = this;
return (new malli.registry.t_malli$registry27523(meta27524__$1));
}));

(malli.registry.t_malli$registry27523.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_27525){
var self__ = this;
var _27525__$1 = this;
return self__.meta27524;
}));

(malli.registry.t_malli$registry27523.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry27523.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return malli.registry._schema(malli.registry.registry(malli.registry._STAR_registry_STAR_),type);
}));

(malli.registry.t_malli$registry27523.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return malli.registry._schemas(malli.registry.registry(malli.registry._STAR_registry_STAR_));
}));

(malli.registry.t_malli$registry27523.getBasis = (function (){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"meta27524","meta27524",-265161734,null)], null);
}));

(malli.registry.t_malli$registry27523.cljs$lang$type = true);

(malli.registry.t_malli$registry27523.cljs$lang$ctorStr = "malli.registry/t_malli$registry27523");

(malli.registry.t_malli$registry27523.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry27523");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry27523.
 */
malli.registry.__GT_t_malli$registry27523 = (function malli$registry$__GT_t_malli$registry27523(meta27524){
return (new malli.registry.t_malli$registry27523(meta27524));
});


malli.registry.dynamic_registry = (function malli$registry$dynamic_registry(){
return (new malli.registry.t_malli$registry27523(cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry27534 = (function (default_registry,provider,cache_STAR_,registry_STAR_,meta27535){
this.default_registry = default_registry;
this.provider = provider;
this.cache_STAR_ = cache_STAR_;
this.registry_STAR_ = registry_STAR_;
this.meta27535 = meta27535;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry27534.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_27536,meta27535__$1){
var self__ = this;
var _27536__$1 = this;
return (new malli.registry.t_malli$registry27534(self__.default_registry,self__.provider,self__.cache_STAR_,self__.registry_STAR_,meta27535__$1));
}));

(malli.registry.t_malli$registry27534.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_27536){
var self__ = this;
var _27536__$1 = this;
return self__.meta27535;
}));

(malli.registry.t_malli$registry27534.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry27534.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,name){
var self__ = this;
var ___$1 = this;
var or__5025__auto__ = (function (){var fexpr__27544 = cljs.core.deref(self__.cache_STAR_);
return (fexpr__27544.cljs$core$IFn$_invoke$arity$1 ? fexpr__27544.cljs$core$IFn$_invoke$arity$1(name) : fexpr__27544.call(null,name));
})();
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
var temp__5825__auto__ = (function (){var G__27545 = name;
var G__27546 = cljs.core.deref(self__.registry_STAR_);
return (self__.provider.cljs$core$IFn$_invoke$arity$2 ? self__.provider.cljs$core$IFn$_invoke$arity$2(G__27545,G__27546) : self__.provider.call(null,G__27545,G__27546));
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

(malli.registry.t_malli$registry27534.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return cljs.core.deref(self__.cache_STAR_);
}));

(malli.registry.t_malli$registry27534.getBasis = (function (){
return new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"default-registry","default-registry",732204441,null),new cljs.core.Symbol(null,"provider","provider",1338474627,null),new cljs.core.Symbol(null,"cache*","cache*",-548597526,null),new cljs.core.Symbol(null,"registry*","registry*",-268031273,null),new cljs.core.Symbol(null,"meta27535","meta27535",544307308,null)], null);
}));

(malli.registry.t_malli$registry27534.cljs$lang$type = true);

(malli.registry.t_malli$registry27534.cljs$lang$ctorStr = "malli.registry/t_malli$registry27534");

(malli.registry.t_malli$registry27534.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry27534");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry27534.
 */
malli.registry.__GT_t_malli$registry27534 = (function malli$registry$__GT_t_malli$registry27534(default_registry,provider,cache_STAR_,registry_STAR_,meta27535){
return (new malli.registry.t_malli$registry27534(default_registry,provider,cache_STAR_,registry_STAR_,meta27535));
});


malli.registry.lazy_registry = (function malli$registry$lazy_registry(default_registry,provider){
var cache_STAR_ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var registry_STAR_ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(default_registry);
return cljs.core.reset_BANG_(registry_STAR_,malli.registry.composite_registry.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([default_registry,(new malli.registry.t_malli$registry27534(default_registry,provider,cache_STAR_,registry_STAR_,cljs.core.PersistentArrayMap.EMPTY))], 0)));
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
