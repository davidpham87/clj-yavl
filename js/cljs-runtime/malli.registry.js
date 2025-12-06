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

var malli$registry$Registry$_schema$dyn_20981 = (function (this$,type){
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
return malli$registry$Registry$_schema$dyn_20981(this$,type);
}
});

var malli$registry$Registry$_schemas$dyn_20984 = (function (this$){
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
return malli$registry$Registry$_schemas$dyn_20984(this$);
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
malli.registry.t_malli$registry20915 = (function (m,fm,meta20916){
this.m = m;
this.fm = fm;
this.meta20916 = meta20916;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20915.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20917,meta20916__$1){
var self__ = this;
var _20917__$1 = this;
return (new malli.registry.t_malli$registry20915(self__.m,self__.fm,meta20916__$1));
}));

(malli.registry.t_malli$registry20915.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20917){
var self__ = this;
var _20917__$1 = this;
return self__.meta20916;
}));

(malli.registry.t_malli$registry20915.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20915.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return self__.fm.get(type);
}));

(malli.registry.t_malli$registry20915.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return self__.m;
}));

(malli.registry.t_malli$registry20915.getBasis = (function (){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"m","m",-1021758608,null),new cljs.core.Symbol(null,"fm","fm",-1190690268,null),new cljs.core.Symbol(null,"meta20916","meta20916",-1989608474,null)], null);
}));

(malli.registry.t_malli$registry20915.cljs$lang$type = true);

(malli.registry.t_malli$registry20915.cljs$lang$ctorStr = "malli.registry/t_malli$registry20915");

(malli.registry.t_malli$registry20915.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20915");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20915.
 */
malli.registry.__GT_t_malli$registry20915 = (function malli$registry$__GT_t_malli$registry20915(m,fm,meta20916){
return (new malli.registry.t_malli$registry20915(m,fm,meta20916));
});


malli.registry.fast_registry = (function malli$registry$fast_registry(m){
var fm = m;
return (new malli.registry.t_malli$registry20915(m,fm,cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20927 = (function (m,meta20928){
this.m = m;
this.meta20928 = meta20928;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20927.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20929,meta20928__$1){
var self__ = this;
var _20929__$1 = this;
return (new malli.registry.t_malli$registry20927(self__.m,meta20928__$1));
}));

(malli.registry.t_malli$registry20927.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20929){
var self__ = this;
var _20929__$1 = this;
return self__.meta20928;
}));

(malli.registry.t_malli$registry20927.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20927.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return (self__.m.cljs$core$IFn$_invoke$arity$1 ? self__.m.cljs$core$IFn$_invoke$arity$1(type) : self__.m.call(null,type));
}));

(malli.registry.t_malli$registry20927.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return self__.m;
}));

(malli.registry.t_malli$registry20927.getBasis = (function (){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"m","m",-1021758608,null),new cljs.core.Symbol(null,"meta20928","meta20928",-1018950134,null)], null);
}));

(malli.registry.t_malli$registry20927.cljs$lang$type = true);

(malli.registry.t_malli$registry20927.cljs$lang$ctorStr = "malli.registry/t_malli$registry20927");

(malli.registry.t_malli$registry20927.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20927");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20927.
 */
malli.registry.__GT_t_malli$registry20927 = (function malli$registry$__GT_t_malli$registry20927(m,meta20928){
return (new malli.registry.t_malli$registry20927(m,meta20928));
});


malli.registry.simple_registry = (function malli$registry$simple_registry(m){
return (new malli.registry.t_malli$registry20927(m,cljs.core.PersistentArrayMap.EMPTY));
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
malli.registry.t_malli$registry20934 = (function (meta20935){
this.meta20935 = meta20935;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20934.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20936,meta20935__$1){
var self__ = this;
var _20936__$1 = this;
return (new malli.registry.t_malli$registry20934(meta20935__$1));
}));

(malli.registry.t_malli$registry20934.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20936){
var self__ = this;
var _20936__$1 = this;
return self__.meta20935;
}));

(malli.registry.t_malli$registry20934.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20934.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return malli.registry._schema(cljs.core.deref(malli.registry.registry_STAR_),type);
}));

(malli.registry.t_malli$registry20934.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return malli.registry._schemas(cljs.core.deref(malli.registry.registry_STAR_));
}));

(malli.registry.t_malli$registry20934.getBasis = (function (){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"meta20935","meta20935",672331365,null)], null);
}));

(malli.registry.t_malli$registry20934.cljs$lang$type = true);

(malli.registry.t_malli$registry20934.cljs$lang$ctorStr = "malli.registry/t_malli$registry20934");

(malli.registry.t_malli$registry20934.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20934");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20934.
 */
malli.registry.__GT_t_malli$registry20934 = (function malli$registry$__GT_t_malli$registry20934(meta20935){
return (new malli.registry.t_malli$registry20934(meta20935));
});


malli.registry.custom_default_registry = (function malli$registry$custom_default_registry(){
return (new malli.registry.t_malli$registry20934(cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20939 = (function (_QMARK_registries,registries,meta20940){
this._QMARK_registries = _QMARK_registries;
this.registries = registries;
this.meta20940 = meta20940;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20939.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20941,meta20940__$1){
var self__ = this;
var _20941__$1 = this;
return (new malli.registry.t_malli$registry20939(self__._QMARK_registries,self__.registries,meta20940__$1));
}));

(malli.registry.t_malli$registry20939.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20941){
var self__ = this;
var _20941__$1 = this;
return self__.meta20940;
}));

(malli.registry.t_malli$registry20939.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20939.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return cljs.core.some((function (p1__20937_SHARP_){
return malli.registry._schema(p1__20937_SHARP_,type);
}),self__.registries);
}));

(malli.registry.t_malli$registry20939.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$2(cljs.core.merge,cljs.core.map.cljs$core$IFn$_invoke$arity$2(malli.registry._schemas,cljs.core.reverse(self__.registries)));
}));

(malli.registry.t_malli$registry20939.getBasis = (function (){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?registries","?registries",2135368100,null),new cljs.core.Symbol(null,"registries","registries",-1366064418,null),new cljs.core.Symbol(null,"meta20940","meta20940",-16535605,null)], null);
}));

(malli.registry.t_malli$registry20939.cljs$lang$type = true);

(malli.registry.t_malli$registry20939.cljs$lang$ctorStr = "malli.registry/t_malli$registry20939");

(malli.registry.t_malli$registry20939.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20939");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20939.
 */
malli.registry.__GT_t_malli$registry20939 = (function malli$registry$__GT_t_malli$registry20939(_QMARK_registries,registries,meta20940){
return (new malli.registry.t_malli$registry20939(_QMARK_registries,registries,meta20940));
});


malli.registry.composite_registry = (function malli$registry$composite_registry(var_args){
var args__5755__auto__ = [];
var len__5749__auto___21007 = arguments.length;
var i__5750__auto___21008 = (0);
while(true){
if((i__5750__auto___21008 < len__5749__auto___21007)){
args__5755__auto__.push((arguments[i__5750__auto___21008]));

var G__21009 = (i__5750__auto___21008 + (1));
i__5750__auto___21008 = G__21009;
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
return (new malli.registry.t_malli$registry20939(_QMARK_registries,registries,cljs.core.PersistentArrayMap.EMPTY));
}));

(malli.registry.composite_registry.cljs$lang$maxFixedArity = (0));

/** @this {Function} */
(malli.registry.composite_registry.cljs$lang$applyTo = (function (seq20938){
var self__5735__auto__ = this;
return self__5735__auto__.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq20938));
}));


/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20942 = (function (db,meta20943){
this.db = db;
this.meta20943 = meta20943;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20942.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20944,meta20943__$1){
var self__ = this;
var _20944__$1 = this;
return (new malli.registry.t_malli$registry20942(self__.db,meta20943__$1));
}));

(malli.registry.t_malli$registry20942.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20944){
var self__ = this;
var _20944__$1 = this;
return self__.meta20943;
}));

(malli.registry.t_malli$registry20942.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20942.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return malli.registry._schema(malli.registry.registry(cljs.core.deref(self__.db)),type);
}));

(malli.registry.t_malli$registry20942.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return malli.registry._schemas(malli.registry.registry(cljs.core.deref(self__.db)));
}));

(malli.registry.t_malli$registry20942.getBasis = (function (){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"db","db",-1661185010,null),new cljs.core.Symbol(null,"meta20943","meta20943",-769473708,null)], null);
}));

(malli.registry.t_malli$registry20942.cljs$lang$type = true);

(malli.registry.t_malli$registry20942.cljs$lang$ctorStr = "malli.registry/t_malli$registry20942");

(malli.registry.t_malli$registry20942.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20942");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20942.
 */
malli.registry.__GT_t_malli$registry20942 = (function malli$registry$__GT_t_malli$registry20942(db,meta20943){
return (new malli.registry.t_malli$registry20942(db,meta20943));
});


malli.registry.mutable_registry = (function malli$registry$mutable_registry(db){
return (new malli.registry.t_malli$registry20942(db,cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20948 = (function (meta20949){
this.meta20949 = meta20949;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20948.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20950,meta20949__$1){
var self__ = this;
var _20950__$1 = this;
return (new malli.registry.t_malli$registry20948(meta20949__$1));
}));

(malli.registry.t_malli$registry20948.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20950){
var self__ = this;
var _20950__$1 = this;
return self__.meta20949;
}));

(malli.registry.t_malli$registry20948.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20948.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
if(cljs.core.var_QMARK_(type)){
return cljs.core.deref(type);
} else {
return null;
}
}));

(malli.registry.t_malli$registry20948.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return null;
}));

(malli.registry.t_malli$registry20948.getBasis = (function (){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"meta20949","meta20949",-1249288428,null)], null);
}));

(malli.registry.t_malli$registry20948.cljs$lang$type = true);

(malli.registry.t_malli$registry20948.cljs$lang$ctorStr = "malli.registry/t_malli$registry20948");

(malli.registry.t_malli$registry20948.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20948");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20948.
 */
malli.registry.__GT_t_malli$registry20948 = (function malli$registry$__GT_t_malli$registry20948(meta20949){
return (new malli.registry.t_malli$registry20948(meta20949));
});


malli.registry.var_registry = (function malli$registry$var_registry(){
return (new malli.registry.t_malli$registry20948(cljs.core.PersistentArrayMap.EMPTY));
});
malli.registry._STAR_registry_STAR_ = cljs.core.PersistentArrayMap.EMPTY;

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20959 = (function (meta20960){
this.meta20960 = meta20960;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20959.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20961,meta20960__$1){
var self__ = this;
var _20961__$1 = this;
return (new malli.registry.t_malli$registry20959(meta20960__$1));
}));

(malli.registry.t_malli$registry20959.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20961){
var self__ = this;
var _20961__$1 = this;
return self__.meta20960;
}));

(malli.registry.t_malli$registry20959.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20959.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,type){
var self__ = this;
var ___$1 = this;
return malli.registry._schema(malli.registry.registry(malli.registry._STAR_registry_STAR_),type);
}));

(malli.registry.t_malli$registry20959.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return malli.registry._schemas(malli.registry.registry(malli.registry._STAR_registry_STAR_));
}));

(malli.registry.t_malli$registry20959.getBasis = (function (){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"meta20960","meta20960",-2084932563,null)], null);
}));

(malli.registry.t_malli$registry20959.cljs$lang$type = true);

(malli.registry.t_malli$registry20959.cljs$lang$ctorStr = "malli.registry/t_malli$registry20959");

(malli.registry.t_malli$registry20959.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20959");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20959.
 */
malli.registry.__GT_t_malli$registry20959 = (function malli$registry$__GT_t_malli$registry20959(meta20960){
return (new malli.registry.t_malli$registry20959(meta20960));
});


malli.registry.dynamic_registry = (function malli$registry$dynamic_registry(){
return (new malli.registry.t_malli$registry20959(cljs.core.PersistentArrayMap.EMPTY));
});

/**
* @constructor
 * @implements {malli.registry.Registry}
 * @implements {cljs.core.IMeta}
 * @implements {cljs.core.IWithMeta}
*/
malli.registry.t_malli$registry20966 = (function (default_registry,provider,cache_STAR_,registry_STAR_,meta20967){
this.default_registry = default_registry;
this.provider = provider;
this.cache_STAR_ = cache_STAR_;
this.registry_STAR_ = registry_STAR_;
this.meta20967 = meta20967;
this.cljs$lang$protocol_mask$partition0$ = 393216;
this.cljs$lang$protocol_mask$partition1$ = 0;
});
(malli.registry.t_malli$registry20966.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_20968,meta20967__$1){
var self__ = this;
var _20968__$1 = this;
return (new malli.registry.t_malli$registry20966(self__.default_registry,self__.provider,self__.cache_STAR_,self__.registry_STAR_,meta20967__$1));
}));

(malli.registry.t_malli$registry20966.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_20968){
var self__ = this;
var _20968__$1 = this;
return self__.meta20967;
}));

(malli.registry.t_malli$registry20966.prototype.malli$registry$Registry$ = cljs.core.PROTOCOL_SENTINEL);

(malli.registry.t_malli$registry20966.prototype.malli$registry$Registry$_schema$arity$2 = (function (_,name){
var self__ = this;
var ___$1 = this;
var or__5025__auto__ = (function (){var fexpr__20971 = cljs.core.deref(self__.cache_STAR_);
return (fexpr__20971.cljs$core$IFn$_invoke$arity$1 ? fexpr__20971.cljs$core$IFn$_invoke$arity$1(name) : fexpr__20971.call(null,name));
})();
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
var temp__5825__auto__ = (function (){var G__20972 = name;
var G__20973 = cljs.core.deref(self__.registry_STAR_);
return (self__.provider.cljs$core$IFn$_invoke$arity$2 ? self__.provider.cljs$core$IFn$_invoke$arity$2(G__20972,G__20973) : self__.provider.call(null,G__20972,G__20973));
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

(malli.registry.t_malli$registry20966.prototype.malli$registry$Registry$_schemas$arity$1 = (function (_){
var self__ = this;
var ___$1 = this;
return cljs.core.deref(self__.cache_STAR_);
}));

(malli.registry.t_malli$registry20966.getBasis = (function (){
return new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"default-registry","default-registry",732204441,null),new cljs.core.Symbol(null,"provider","provider",1338474627,null),new cljs.core.Symbol(null,"cache*","cache*",-548597526,null),new cljs.core.Symbol(null,"registry*","registry*",-268031273,null),new cljs.core.Symbol(null,"meta20967","meta20967",1432941813,null)], null);
}));

(malli.registry.t_malli$registry20966.cljs$lang$type = true);

(malli.registry.t_malli$registry20966.cljs$lang$ctorStr = "malli.registry/t_malli$registry20966");

(malli.registry.t_malli$registry20966.cljs$lang$ctorPrWriter = (function (this__5310__auto__,writer__5311__auto__,opt__5312__auto__){
return cljs.core._write(writer__5311__auto__,"malli.registry/t_malli$registry20966");
}));

/**
 * Positional factory function for malli.registry/t_malli$registry20966.
 */
malli.registry.__GT_t_malli$registry20966 = (function malli$registry$__GT_t_malli$registry20966(default_registry,provider,cache_STAR_,registry_STAR_,meta20967){
return (new malli.registry.t_malli$registry20966(default_registry,provider,cache_STAR_,registry_STAR_,meta20967));
});


malli.registry.lazy_registry = (function malli$registry$lazy_registry(default_registry,provider){
var cache_STAR_ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var registry_STAR_ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(default_registry);
return cljs.core.reset_BANG_(registry_STAR_,malli.registry.composite_registry.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([default_registry,(new malli.registry.t_malli$registry20966(default_registry,provider,cache_STAR_,registry_STAR_,cljs.core.PersistentArrayMap.EMPTY))], 0)));
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
