goog.provide('clj_yavl.viz');
var module$node_modules$vega_embed$build$vega_embed=shadow.js.require("module$node_modules$vega_embed$build$vega_embed", {});
clj_yavl.viz.vega_lite_viz = (function clj_yavl$viz$vega_lite_viz(spec){
var container_ref = reagent.core.atom.cljs$core$IFn$_invoke$arity$1(null);
var view_ref = reagent.core.atom.cljs$core$IFn$_invoke$arity$1(null);
return reagent.core.create_class.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword(null,"display-name","display-name",694513143),"vega-lite-viz",new cljs.core.Keyword(null,"component-did-mount","component-did-mount",-1126910518),(function (_){
if(cljs.core.truth_((function (){var and__5023__auto__ = cljs.core.deref(container_ref);
if(cljs.core.truth_(and__5023__auto__)){
return spec;
} else {
return and__5023__auto__;
}
})())){
return module$node_modules$vega_embed$build$vega_embed.default(cljs.core.deref(container_ref),cljs.core.clj__GT_js(spec),cljs.core.clj__GT_js(new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"actions","actions",-812656882),true], null))).then((function (res){
return cljs.core.reset_BANG_(view_ref,res.view);
})).catch(console.error);
} else {
return null;
}
}),new cljs.core.Keyword(null,"component-did-update","component-did-update",-1468549173),(function (this$){
var new_spec = cljs.core.second(reagent.core.argv(this$));
if(cljs.core.truth_(cljs.core.deref(container_ref))){
return module$node_modules$vega_embed$build$vega_embed.default(cljs.core.deref(container_ref),cljs.core.clj__GT_js(new_spec),cljs.core.clj__GT_js(new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"actions","actions",-812656882),true], null))).then((function (res){
return cljs.core.reset_BANG_(view_ref,res.view);
})).catch(console.error);
} else {
return null;
}
}),new cljs.core.Keyword(null,"component-will-unmount","component-will-unmount",-2058314698),(function (_){
if(cljs.core.truth_(cljs.core.deref(view_ref))){
return cljs.core.deref(view_ref).finalize();
} else {
return null;
}
}),new cljs.core.Keyword(null,"reagent-render","reagent-render",-985383853),(function (spec__$1){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"class","class",-2030961996),"w-full h-full overflow-auto p-4",new cljs.core.Keyword(null,"ref","ref",1289896967),(function (p1__31231_SHARP_){
return cljs.core.reset_BANG_(container_ref,p1__31231_SHARP_);
})], null)], null);
})], null));
});

//# sourceMappingURL=clj_yavl.viz.js.map
