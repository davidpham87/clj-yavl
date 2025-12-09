goog.provide('datascript.built_ins');
datascript.built_ins._differ_QMARK_ = (function datascript$built_ins$_differ_QMARK_(var_args){
var args__5755__auto__ = [];
var len__5749__auto___27844 = arguments.length;
var i__5750__auto___27845 = (0);
while(true){
if((i__5750__auto___27845 < len__5749__auto___27844)){
args__5755__auto__.push((arguments[i__5750__auto___27845]));

var G__27846 = (i__5750__auto___27845 + (1));
i__5750__auto___27845 = G__27846;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((0) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((0)),(0),null)):null);
return datascript.built_ins._differ_QMARK_.cljs$core$IFn$_invoke$arity$variadic(argseq__5756__auto__);
});

(datascript.built_ins._differ_QMARK_.cljs$core$IFn$_invoke$arity$variadic = (function (xs){
var l = cljs.core.count(xs);
return cljs.core.not_EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.take.cljs$core$IFn$_invoke$arity$2((l / (2)),xs),cljs.core.drop.cljs$core$IFn$_invoke$arity$2((l / (2)),xs));
}));

(datascript.built_ins._differ_QMARK_.cljs$lang$maxFixedArity = (0));

/** @this {Function} */
(datascript.built_ins._differ_QMARK_.cljs$lang$applyTo = (function (seq27595){
var self__5735__auto__ = this;
return self__5735__auto__.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq27595));
}));

datascript.built_ins._get_else = (function datascript$built_ins$_get_else(db,e,a,else_val){
if((else_val == null)){
throw cljs.core.ex_info.cljs$core$IFn$_invoke$arity$2("get-else: nil default value is not supported",new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"error","error",-978969032),new cljs.core.Keyword("query","where","query/where",-1935159429)], null));
} else {
}

var temp__5827__auto__ = cljs.core.first(datascript.db._search(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [datascript.db.entid(db,e),a], null)));
if((temp__5827__auto__ == null)){
return else_val;
} else {
var datom = temp__5827__auto__;
return new cljs.core.Keyword(null,"v","v",21465059).cljs$core$IFn$_invoke$arity$1(datom);
}
});
datascript.built_ins._get_some = (function datascript$built_ins$_get_some(var_args){
var args__5755__auto__ = [];
var len__5749__auto___27848 = arguments.length;
var i__5750__auto___27849 = (0);
while(true){
if((i__5750__auto___27849 < len__5749__auto___27848)){
args__5755__auto__.push((arguments[i__5750__auto___27849]));

var G__27850 = (i__5750__auto___27849 + (1));
i__5750__auto___27849 = G__27850;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((2) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((2)),(0),null)):null);
return datascript.built_ins._get_some.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),(arguments[(1)]),argseq__5756__auto__);
});

(datascript.built_ins._get_some.cljs$core$IFn$_invoke$arity$variadic = (function (db,e,as){
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (_,a){
var temp__5829__auto__ = cljs.core.first(datascript.db._search(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [datascript.db.entid(db,e),a], null)));
if((temp__5829__auto__ == null)){
return null;
} else {
var datom = temp__5829__auto__;
return cljs.core.reduced(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"a","a",-2123407586).cljs$core$IFn$_invoke$arity$1(datom),new cljs.core.Keyword(null,"v","v",21465059).cljs$core$IFn$_invoke$arity$1(datom)], null));
}
}),null,as);
}));

(datascript.built_ins._get_some.cljs$lang$maxFixedArity = (2));

/** @this {Function} */
(datascript.built_ins._get_some.cljs$lang$applyTo = (function (seq27663){
var G__27664 = cljs.core.first(seq27663);
var seq27663__$1 = cljs.core.next(seq27663);
var G__27665 = cljs.core.first(seq27663__$1);
var seq27663__$2 = cljs.core.next(seq27663__$1);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27664,G__27665,seq27663__$2);
}));

datascript.built_ins._missing_QMARK_ = (function datascript$built_ins$_missing_QMARK_(db,e,a){
return (cljs.core.get.cljs$core$IFn$_invoke$arity$2(datascript.impl.entity.entity(db,e),a) == null);
});
datascript.built_ins.and_fn = (function datascript$built_ins$and_fn(var_args){
var args__5755__auto__ = [];
var len__5749__auto___27852 = arguments.length;
var i__5750__auto___27853 = (0);
while(true){
if((i__5750__auto___27853 < len__5749__auto___27852)){
args__5755__auto__.push((arguments[i__5750__auto___27853]));

var G__27854 = (i__5750__auto___27853 + (1));
i__5750__auto___27853 = G__27854;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((0) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((0)),(0),null)):null);
return datascript.built_ins.and_fn.cljs$core$IFn$_invoke$arity$variadic(argseq__5756__auto__);
});

(datascript.built_ins.and_fn.cljs$core$IFn$_invoke$arity$variadic = (function (args){
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (a,b){
if(cljs.core.truth_(b)){
return b;
} else {
return cljs.core.reduced(b);
}
}),true,args);
}));

(datascript.built_ins.and_fn.cljs$lang$maxFixedArity = (0));

/** @this {Function} */
(datascript.built_ins.and_fn.cljs$lang$applyTo = (function (seq27701){
var self__5735__auto__ = this;
return self__5735__auto__.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq27701));
}));

datascript.built_ins.or_fn = (function datascript$built_ins$or_fn(var_args){
var args__5755__auto__ = [];
var len__5749__auto___27855 = arguments.length;
var i__5750__auto___27856 = (0);
while(true){
if((i__5750__auto___27856 < len__5749__auto___27855)){
args__5755__auto__.push((arguments[i__5750__auto___27856]));

var G__27857 = (i__5750__auto___27856 + (1));
i__5750__auto___27856 = G__27857;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((0) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((0)),(0),null)):null);
return datascript.built_ins.or_fn.cljs$core$IFn$_invoke$arity$variadic(argseq__5756__auto__);
});

(datascript.built_ins.or_fn.cljs$core$IFn$_invoke$arity$variadic = (function (args){
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (a,b){
if(cljs.core.truth_(b)){
return cljs.core.reduced(b);
} else {
return b;
}
}),null,args);
}));

(datascript.built_ins.or_fn.cljs$lang$maxFixedArity = (0));

/** @this {Function} */
(datascript.built_ins.or_fn.cljs$lang$applyTo = (function (seq27710){
var self__5735__auto__ = this;
return self__5735__auto__.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq27710));
}));

datascript.built_ins.less = (function datascript$built_ins$less(var_args){
var G__27717 = arguments.length;
switch (G__27717) {
case 1:
return datascript.built_ins.less.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return datascript.built_ins.less.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___27859 = arguments.length;
var i__5750__auto___27860 = (0);
while(true){
if((i__5750__auto___27860 < len__5749__auto___27859)){
args_arr__5774__auto__.push((arguments[i__5750__auto___27860]));

var G__27861 = (i__5750__auto___27860 + (1));
i__5750__auto___27860 = G__27861;
continue;
} else {
}
break;
}

var argseq__5775__auto__ = ((((2) < args_arr__5774__auto__.length))?(new cljs.core.IndexedSeq(args_arr__5774__auto__.slice((2)),(0),null)):null);
return datascript.built_ins.less.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),(arguments[(1)]),argseq__5775__auto__);

}
});

(datascript.built_ins.less.cljs$core$IFn$_invoke$arity$1 = (function (x){
return true;
}));

(datascript.built_ins.less.cljs$core$IFn$_invoke$arity$2 = (function (x,y){
return (datascript.db.value_compare(x,y) < (0));
}));

(datascript.built_ins.less.cljs$core$IFn$_invoke$arity$variadic = (function (x,y,more){
while(true){
if(datascript.built_ins.less.cljs$core$IFn$_invoke$arity$2(x,y)){
if(cljs.core.next(more)){
var G__27872 = y;
var G__27873 = cljs.core.first(more);
var G__27874 = cljs.core.next(more);
x = G__27872;
y = G__27873;
more = G__27874;
continue;
} else {
return datascript.built_ins.less.cljs$core$IFn$_invoke$arity$2(y,cljs.core.first(more));
}
} else {
return false;
}
break;
}
}));

/** @this {Function} */
(datascript.built_ins.less.cljs$lang$applyTo = (function (seq27714){
var G__27715 = cljs.core.first(seq27714);
var seq27714__$1 = cljs.core.next(seq27714);
var G__27716 = cljs.core.first(seq27714__$1);
var seq27714__$2 = cljs.core.next(seq27714__$1);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27715,G__27716,seq27714__$2);
}));

(datascript.built_ins.less.cljs$lang$maxFixedArity = (2));

datascript.built_ins.greater = (function datascript$built_ins$greater(var_args){
var G__27734 = arguments.length;
switch (G__27734) {
case 1:
return datascript.built_ins.greater.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return datascript.built_ins.greater.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___27876 = arguments.length;
var i__5750__auto___27877 = (0);
while(true){
if((i__5750__auto___27877 < len__5749__auto___27876)){
args_arr__5774__auto__.push((arguments[i__5750__auto___27877]));

var G__27878 = (i__5750__auto___27877 + (1));
i__5750__auto___27877 = G__27878;
continue;
} else {
}
break;
}

var argseq__5775__auto__ = ((((2) < args_arr__5774__auto__.length))?(new cljs.core.IndexedSeq(args_arr__5774__auto__.slice((2)),(0),null)):null);
return datascript.built_ins.greater.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),(arguments[(1)]),argseq__5775__auto__);

}
});

(datascript.built_ins.greater.cljs$core$IFn$_invoke$arity$1 = (function (x){
return true;
}));

(datascript.built_ins.greater.cljs$core$IFn$_invoke$arity$2 = (function (x,y){
return (datascript.db.value_compare(x,y) > (0));
}));

(datascript.built_ins.greater.cljs$core$IFn$_invoke$arity$variadic = (function (x,y,more){
while(true){
if(datascript.built_ins.greater.cljs$core$IFn$_invoke$arity$2(x,y)){
if(cljs.core.next(more)){
var G__27879 = y;
var G__27880 = cljs.core.first(more);
var G__27881 = cljs.core.next(more);
x = G__27879;
y = G__27880;
more = G__27881;
continue;
} else {
return datascript.built_ins.greater.cljs$core$IFn$_invoke$arity$2(y,cljs.core.first(more));
}
} else {
return false;
}
break;
}
}));

/** @this {Function} */
(datascript.built_ins.greater.cljs$lang$applyTo = (function (seq27731){
var G__27732 = cljs.core.first(seq27731);
var seq27731__$1 = cljs.core.next(seq27731);
var G__27733 = cljs.core.first(seq27731__$1);
var seq27731__$2 = cljs.core.next(seq27731__$1);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27732,G__27733,seq27731__$2);
}));

(datascript.built_ins.greater.cljs$lang$maxFixedArity = (2));

datascript.built_ins.less_equal = (function datascript$built_ins$less_equal(var_args){
var G__27760 = arguments.length;
switch (G__27760) {
case 1:
return datascript.built_ins.less_equal.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return datascript.built_ins.less_equal.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___27883 = arguments.length;
var i__5750__auto___27884 = (0);
while(true){
if((i__5750__auto___27884 < len__5749__auto___27883)){
args_arr__5774__auto__.push((arguments[i__5750__auto___27884]));

var G__27885 = (i__5750__auto___27884 + (1));
i__5750__auto___27884 = G__27885;
continue;
} else {
}
break;
}

var argseq__5775__auto__ = ((((2) < args_arr__5774__auto__.length))?(new cljs.core.IndexedSeq(args_arr__5774__auto__.slice((2)),(0),null)):null);
return datascript.built_ins.less_equal.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),(arguments[(1)]),argseq__5775__auto__);

}
});

(datascript.built_ins.less_equal.cljs$core$IFn$_invoke$arity$1 = (function (x){
return true;
}));

(datascript.built_ins.less_equal.cljs$core$IFn$_invoke$arity$2 = (function (x,y){
return (!((datascript.db.value_compare(x,y) > (0))));
}));

(datascript.built_ins.less_equal.cljs$core$IFn$_invoke$arity$variadic = (function (x,y,more){
while(true){
if(datascript.built_ins.less_equal.cljs$core$IFn$_invoke$arity$2(x,y)){
if(cljs.core.next(more)){
var G__27886 = y;
var G__27887 = cljs.core.first(more);
var G__27888 = cljs.core.next(more);
x = G__27886;
y = G__27887;
more = G__27888;
continue;
} else {
return datascript.built_ins.less_equal.cljs$core$IFn$_invoke$arity$2(y,cljs.core.first(more));
}
} else {
return false;
}
break;
}
}));

/** @this {Function} */
(datascript.built_ins.less_equal.cljs$lang$applyTo = (function (seq27755){
var G__27756 = cljs.core.first(seq27755);
var seq27755__$1 = cljs.core.next(seq27755);
var G__27757 = cljs.core.first(seq27755__$1);
var seq27755__$2 = cljs.core.next(seq27755__$1);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27756,G__27757,seq27755__$2);
}));

(datascript.built_ins.less_equal.cljs$lang$maxFixedArity = (2));

datascript.built_ins.greater_equal = (function datascript$built_ins$greater_equal(var_args){
var G__27768 = arguments.length;
switch (G__27768) {
case 1:
return datascript.built_ins.greater_equal.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return datascript.built_ins.greater_equal.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
var args_arr__5774__auto__ = [];
var len__5749__auto___27896 = arguments.length;
var i__5750__auto___27897 = (0);
while(true){
if((i__5750__auto___27897 < len__5749__auto___27896)){
args_arr__5774__auto__.push((arguments[i__5750__auto___27897]));

var G__27898 = (i__5750__auto___27897 + (1));
i__5750__auto___27897 = G__27898;
continue;
} else {
}
break;
}

var argseq__5775__auto__ = ((((2) < args_arr__5774__auto__.length))?(new cljs.core.IndexedSeq(args_arr__5774__auto__.slice((2)),(0),null)):null);
return datascript.built_ins.greater_equal.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),(arguments[(1)]),argseq__5775__auto__);

}
});

(datascript.built_ins.greater_equal.cljs$core$IFn$_invoke$arity$1 = (function (x){
return true;
}));

(datascript.built_ins.greater_equal.cljs$core$IFn$_invoke$arity$2 = (function (x,y){
return (!((datascript.db.value_compare(x,y) < (0))));
}));

(datascript.built_ins.greater_equal.cljs$core$IFn$_invoke$arity$variadic = (function (x,y,more){
while(true){
if(datascript.built_ins.greater_equal.cljs$core$IFn$_invoke$arity$2(x,y)){
if(cljs.core.next(more)){
var G__27903 = y;
var G__27904 = cljs.core.first(more);
var G__27905 = cljs.core.next(more);
x = G__27903;
y = G__27904;
more = G__27905;
continue;
} else {
return datascript.built_ins.greater_equal.cljs$core$IFn$_invoke$arity$2(y,cljs.core.first(more));
}
} else {
return false;
}
break;
}
}));

/** @this {Function} */
(datascript.built_ins.greater_equal.cljs$lang$applyTo = (function (seq27765){
var G__27766 = cljs.core.first(seq27765);
var seq27765__$1 = cljs.core.next(seq27765);
var G__27767 = cljs.core.first(seq27765__$1);
var seq27765__$2 = cljs.core.next(seq27765__$1);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__27766,G__27767,seq27765__$2);
}));

(datascript.built_ins.greater_equal.cljs$lang$maxFixedArity = (2));

datascript.built_ins.query_fns = cljs.core.PersistentHashMap.fromArrays([new cljs.core.Symbol(null,"true?","true?",-1600332395,null),new cljs.core.Symbol(null,"and","and",668631710,null),new cljs.core.Symbol(null,"odd?","odd?",-1458588199,null),new cljs.core.Symbol(null,"get-else","get-else",1312024065,null),new cljs.core.Symbol(null,">=",">=",1016916022,null),new cljs.core.Symbol(null,"print-str","print-str",-699700354,null),new cljs.core.Symbol(null,">",">",1085014381,null),new cljs.core.Symbol(null,"count","count",-514511684,null),new cljs.core.Symbol(null,"get-some","get-some",409442058,null),new cljs.core.Symbol(null,"nil?","nil?",1612038930,null),new cljs.core.Symbol(null,"untuple","untuple",-606149900,null),new cljs.core.Symbol(null,"inc","inc",324505433,null),new cljs.core.Symbol(null,"/","/",-1371932971,null),new cljs.core.Symbol(null,"quot","quot",-1125214196,null),new cljs.core.Symbol(null,"false?","false?",-1522377573,null),new cljs.core.Symbol(null,"not","not",1044554643,null),new cljs.core.Symbol(null,"identity","identity",-1007039734,null),new cljs.core.Symbol(null,"-differ?","-differ?",1465687357,null),new cljs.core.Symbol(null,"tuple","tuple",1167864243,null),new cljs.core.Symbol(null,"re-seq","re-seq",-2105554076,null),new cljs.core.Symbol(null,"<=","<=",1244895369,null),new cljs.core.Symbol("clojure.string","starts-with?","clojure.string/starts-with?",656256322,null),new cljs.core.Symbol(null,"=","=",-1501502141,null),new cljs.core.Symbol(null,"min","min",2085523049,null),new cljs.core.Symbol(null,"+","+",-740910886,null),new cljs.core.Symbol(null,"name","name",-810760592,null),new cljs.core.Symbol(null,"missing?","missing?",-1710383910,null),new cljs.core.Symbol(null,"ground","ground",-1460862835,null),new cljs.core.Symbol(null,"rand-int","rand-int",-495012157,null),new cljs.core.Symbol(null,"complement","complement",-913606051,null),new cljs.core.Symbol(null,"==","==",-234118149,null),new cljs.core.Symbol(null,"hash-map","hash-map",-439030950,null),new cljs.core.Symbol(null,"compare","compare",1109853757,null),new cljs.core.Symbol(null,"range","range",-1014743483,null),new cljs.core.Symbol(null,"max","max",1701898075,null),new cljs.core.Symbol(null,"empty?","empty?",76408555,null),new cljs.core.Symbol(null,"*","*",345799209,null),new cljs.core.Symbol(null,"pr-str","pr-str",-2066912145,null),new cljs.core.Symbol(null,"println-str","println-str",-2049216703,null),new cljs.core.Symbol(null,"meta","meta",-1154898805,null),new cljs.core.Symbol(null,"zero?","zero?",325758897,null),new cljs.core.Symbol(null,"!=","!=",-201205829,null),new cljs.core.Symbol(null,"prn-str","prn-str",-145225943,null),new cljs.core.Symbol(null,"dec","dec",-766002333,null),new cljs.core.Symbol(null,"re-pattern","re-pattern",1047705161,null),new cljs.core.Symbol(null,"vector","vector",-751469611,null),new cljs.core.Symbol(null,"not=","not=",1466536204,null),new cljs.core.Symbol(null,"get","get",-971253014,null),new cljs.core.Symbol(null,"str","str",-1564826950,null),new cljs.core.Symbol(null,"<","<",993667236,null),new cljs.core.Symbol(null,"namespace","namespace",1263021155,null),new cljs.core.Symbol(null,"keyword","keyword",-1843046022,null),new cljs.core.Symbol(null,"-","-",-471816912,null),new cljs.core.Symbol(null,"some?","some?",234752293,null),new cljs.core.Symbol(null,"pos?","pos?",-244377722,null),new cljs.core.Symbol(null,"rand","rand",-1745930995,null),new cljs.core.Symbol(null,"re-matches","re-matches",-1865705768,null),new cljs.core.Symbol(null,"list","list",-1889078086,null),new cljs.core.Symbol(null,"contains?","contains?",-1676812576,null),new cljs.core.Symbol("clojure.string","ends-with?","clojure.string/ends-with?",-745964149,null),new cljs.core.Symbol(null,"subs","subs",1453849536,null),new cljs.core.Symbol(null,"mod","mod",1510044207,null),new cljs.core.Symbol("clojure.string","includes?","clojure.string/includes?",-1842146260,null),new cljs.core.Symbol(null,"array-map","array-map",1555038968,null),new cljs.core.Symbol(null,"rem","rem",664046770,null),new cljs.core.Symbol(null,"even?","even?",-1827825394,null),new cljs.core.Symbol(null,"type","type",-1480165421,null),new cljs.core.Symbol(null,"neg?","neg?",-1902175577,null),new cljs.core.Symbol("clojure.string","blank?","clojure.string/blank?",1772874244,null),new cljs.core.Symbol(null,"not-empty","not-empty",2029453590,null),new cljs.core.Symbol(null,"or","or",1876275696,null),new cljs.core.Symbol(null,"identical?","identical?",-745864205,null),new cljs.core.Symbol(null,"set","set",1945134081,null),new cljs.core.Symbol(null,"re-find","re-find",1143444147,null)],[cljs.core.true_QMARK_,datascript.built_ins.and_fn,cljs.core.odd_QMARK_,datascript.built_ins._get_else,datascript.built_ins.greater_equal,cljs.core.print_str,datascript.built_ins.greater,cljs.core.count,datascript.built_ins._get_some,cljs.core.nil_QMARK_,cljs.core.identity,cljs.core.inc,cljs.core._SLASH_,cljs.core.quot,cljs.core.false_QMARK_,cljs.core.not,cljs.core.identity,datascript.built_ins._differ_QMARK_,cljs.core.vector,cljs.core.re_seq,datascript.built_ins.less_equal,clojure.string.starts_with_QMARK_,cljs.core._EQ_,cljs.core.min,cljs.core._PLUS_,cljs.core.name,datascript.built_ins._missing_QMARK_,cljs.core.identity,cljs.core.rand_int,cljs.core.complement,cljs.core._EQ__EQ_,cljs.core.hash_map,cljs.core.compare,cljs.core.range,cljs.core.max,cljs.core.empty_QMARK_,cljs.core._STAR_,cljs.core.pr_str,cljs.core.println_str,cljs.core.meta,cljs.core.zero_QMARK_,cljs.core.not_EQ_,cljs.core.prn_str,cljs.core.dec,cljs.core.re_pattern,cljs.core.vector,cljs.core.not_EQ_,cljs.core.get,cljs.core.str,datascript.built_ins.less,cljs.core.namespace,cljs.core.keyword,cljs.core._,cljs.core.some_QMARK_,cljs.core.pos_QMARK_,cljs.core.rand,cljs.core.re_matches,cljs.core.list,cljs.core.contains_QMARK_,clojure.string.ends_with_QMARK_,cljs.core.subs,cljs.core.mod,clojure.string.includes_QMARK_,cljs.core.array_map,cljs.core.rem,cljs.core.even_QMARK_,cljs.core.type,cljs.core.neg_QMARK_,clojure.string.blank_QMARK_,cljs.core.not_empty,datascript.built_ins.or_fn,cljs.core.identical_QMARK_,cljs.core.set,cljs.core.re_find]);
datascript.built_ins.aggregate_sum = (function datascript$built_ins$aggregate_sum(coll){
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$3(cljs.core._PLUS_,(0),coll);
});
datascript.built_ins.aggregate_avg = (function datascript$built_ins$aggregate_avg(coll){
return (datascript.built_ins.aggregate_sum(coll) / cljs.core.count(coll));
});
datascript.built_ins.aggregate_median = (function datascript$built_ins$aggregate_median(coll){
var terms = cljs.core.sort.cljs$core$IFn$_invoke$arity$1(coll);
var size = cljs.core.count(coll);
var med = (size >> (1));
var G__27824 = cljs.core.nth.cljs$core$IFn$_invoke$arity$2(terms,med);
if(cljs.core.even_QMARK_(size)){
return ((G__27824 + cljs.core.nth.cljs$core$IFn$_invoke$arity$2(terms,(med - (1)))) / (2));
} else {
return G__27824;
}
});
datascript.built_ins.aggregate_variance = (function datascript$built_ins$aggregate_variance(coll){
var mean = datascript.built_ins.aggregate_avg(coll);
var sum = datascript.built_ins.aggregate_sum((function (){var iter__5503__auto__ = (function datascript$built_ins$aggregate_variance_$_iter__27825(s__27826){
return (new cljs.core.LazySeq(null,(function (){
var s__27826__$1 = s__27826;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__27826__$1);
if(temp__5825__auto__){
var s__27826__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__27826__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__27826__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__27828 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__27827 = (0);
while(true){
if((i__27827 < size__5502__auto__)){
var x = cljs.core._nth(c__5501__auto__,i__27827);
var delta = (x - mean);
cljs.core.chunk_append(b__27828,(delta * delta));

var G__27928 = (i__27827 + (1));
i__27827 = G__27928;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__27828),datascript$built_ins$aggregate_variance_$_iter__27825(cljs.core.chunk_rest(s__27826__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__27828),null);
}
} else {
var x = cljs.core.first(s__27826__$2);
var delta = (x - mean);
return cljs.core.cons((delta * delta),datascript$built_ins$aggregate_variance_$_iter__27825(cljs.core.rest(s__27826__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__5503__auto__(coll);
})());
return (sum / cljs.core.count(coll));
});
datascript.built_ins.aggregate_stddev = (function datascript$built_ins$aggregate_stddev(coll){
return Math.sqrt(datascript.built_ins.aggregate_variance(coll));
});
datascript.built_ins.aggregate_min = (function datascript$built_ins$aggregate_min(var_args){
var G__27830 = arguments.length;
switch (G__27830) {
case 1:
return datascript.built_ins.aggregate_min.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return datascript.built_ins.aggregate_min.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(datascript.built_ins.aggregate_min.cljs$core$IFn$_invoke$arity$1 = (function (coll){
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (acc,x){
if((cljs.core.compare(x,acc) < (0))){
return x;
} else {
return acc;
}
}),cljs.core.first(coll),cljs.core.next(coll));
}));

(datascript.built_ins.aggregate_min.cljs$core$IFn$_invoke$arity$2 = (function (n,coll){
return cljs.core.vec(cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (acc,x){
if((cljs.core.count(acc) < n)){
return cljs.core.sort.cljs$core$IFn$_invoke$arity$2(cljs.core.compare,cljs.core.conj.cljs$core$IFn$_invoke$arity$2(acc,x));
} else {
if((cljs.core.compare(x,cljs.core.last(acc)) < (0))){
return cljs.core.sort.cljs$core$IFn$_invoke$arity$2(cljs.core.compare,cljs.core.conj.cljs$core$IFn$_invoke$arity$2(cljs.core.butlast(acc),x));
} else {
return acc;

}
}
}),cljs.core.PersistentVector.EMPTY,coll));
}));

(datascript.built_ins.aggregate_min.cljs$lang$maxFixedArity = 2);

datascript.built_ins.aggregate_max = (function datascript$built_ins$aggregate_max(var_args){
var G__27833 = arguments.length;
switch (G__27833) {
case 1:
return datascript.built_ins.aggregate_max.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return datascript.built_ins.aggregate_max.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(datascript.built_ins.aggregate_max.cljs$core$IFn$_invoke$arity$1 = (function (coll){
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (acc,x){
if((cljs.core.compare(x,acc) > (0))){
return x;
} else {
return acc;
}
}),cljs.core.first(coll),cljs.core.next(coll));
}));

(datascript.built_ins.aggregate_max.cljs$core$IFn$_invoke$arity$2 = (function (n,coll){
return cljs.core.vec(cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (acc,x){
if((cljs.core.count(acc) < n)){
return cljs.core.sort.cljs$core$IFn$_invoke$arity$2(cljs.core.compare,cljs.core.conj.cljs$core$IFn$_invoke$arity$2(acc,x));
} else {
if((cljs.core.compare(x,cljs.core.first(acc)) > (0))){
return cljs.core.sort.cljs$core$IFn$_invoke$arity$2(cljs.core.compare,cljs.core.conj.cljs$core$IFn$_invoke$arity$2(cljs.core.next(acc),x));
} else {
return acc;

}
}
}),cljs.core.PersistentVector.EMPTY,coll));
}));

(datascript.built_ins.aggregate_max.cljs$lang$maxFixedArity = 2);

datascript.built_ins.aggregate_rand = (function datascript$built_ins$aggregate_rand(var_args){
var G__27835 = arguments.length;
switch (G__27835) {
case 1:
return datascript.built_ins.aggregate_rand.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return datascript.built_ins.aggregate_rand.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(datascript.built_ins.aggregate_rand.cljs$core$IFn$_invoke$arity$1 = (function (coll){
return cljs.core.rand_nth(coll);
}));

(datascript.built_ins.aggregate_rand.cljs$core$IFn$_invoke$arity$2 = (function (n,coll){
return cljs.core.vec(cljs.core.repeatedly.cljs$core$IFn$_invoke$arity$2(n,(function (){
return cljs.core.rand_nth(coll);
})));
}));

(datascript.built_ins.aggregate_rand.cljs$lang$maxFixedArity = 2);

datascript.built_ins.aggregate_sample = (function datascript$built_ins$aggregate_sample(n,coll){
return cljs.core.vec(cljs.core.take.cljs$core$IFn$_invoke$arity$2(n,cljs.core.shuffle(coll)));
});
datascript.built_ins.aggregate_count_distinct = (function datascript$built_ins$aggregate_count_distinct(coll){
return cljs.core.count(cljs.core.distinct.cljs$core$IFn$_invoke$arity$1(coll));
});
datascript.built_ins.aggregates = cljs.core.PersistentHashMap.fromArrays([new cljs.core.Symbol(null,"variance","variance",-1522424942,null),new cljs.core.Symbol(null,"count","count",-514511684,null),new cljs.core.Symbol(null,"median","median",-2084869638,null),new cljs.core.Symbol(null,"sum","sum",1777518341,null),new cljs.core.Symbol(null,"min","min",2085523049,null),new cljs.core.Symbol(null,"max","max",1701898075,null),new cljs.core.Symbol(null,"count-distinct","count-distinct",-1566572514,null),new cljs.core.Symbol(null,"distinct","distinct",-148347594,null),new cljs.core.Symbol(null,"avg","avg",1837937727,null),new cljs.core.Symbol(null,"stddev","stddev",775056588,null),new cljs.core.Symbol(null,"rand","rand",-1745930995,null),new cljs.core.Symbol(null,"sample","sample",1719555128,null)],[datascript.built_ins.aggregate_variance,cljs.core.count,datascript.built_ins.aggregate_median,datascript.built_ins.aggregate_sum,datascript.built_ins.aggregate_min,datascript.built_ins.aggregate_max,datascript.built_ins.aggregate_count_distinct,cljs.core.set,datascript.built_ins.aggregate_avg,datascript.built_ins.aggregate_stddev,datascript.built_ins.aggregate_rand,datascript.built_ins.aggregate_sample]);

//# sourceMappingURL=datascript.built_ins.js.map
