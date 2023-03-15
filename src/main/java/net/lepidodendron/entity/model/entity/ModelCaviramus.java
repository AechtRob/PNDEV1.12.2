package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFlyingBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCaviramus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended hips;
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperlegL;
    public AdvancedModelRendererExtended upperlegR;
    public AdvancedModelRendererExtended chest;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended wing1L;
    public AdvancedModelRendererExtended wing1R;
    public AdvancedModelRendererExtended neck2;
    public AdvancedModelRendererExtended head;
    public AdvancedModelRendererExtended jaw;
    public AdvancedModelRendererExtended Upperjawback;
    public AdvancedModelRendererExtended Lowerjawmiddle;
    public AdvancedModelRendererExtended Jawparting;
    public AdvancedModelRendererExtended Lowerjawfront;
    public AdvancedModelRendererExtended Lowerjawteeth;
    public AdvancedModelRendererExtended Lowerjawfronttip;
    public AdvancedModelRendererExtended Chinkeel;
    public AdvancedModelRendererExtended Leftlowerteeth;
    public AdvancedModelRendererExtended Rightlowerteeth;
    public AdvancedModelRendererExtended Upperjawfront;
    public AdvancedModelRendererExtended Headslopeback;
    public AdvancedModelRendererExtended Upperjawteeth;
    public AdvancedModelRendererExtended Headslopefront;
    public AdvancedModelRendererExtended Leftupperteeth;
    public AdvancedModelRendererExtended Rightupperteeth;
    public AdvancedModelRendererExtended Crest;
    public AdvancedModelRendererExtended wing2L;
    public AdvancedModelRendererExtended wing3L;
    public AdvancedModelRendererExtended handL;
    public AdvancedModelRendererExtended wing4L;
    public AdvancedModelRendererExtended wing2R;
    public AdvancedModelRendererExtended wing3R;
    public AdvancedModelRendererExtended handR;
    public AdvancedModelRendererExtended wing4R;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended tail4;
    public AdvancedModelRendererExtended Rudder;
    public AdvancedModelRendererExtended lowerlegL;
    public AdvancedModelRendererExtended Leftthighmembrane;
    public AdvancedModelRendererExtended footL;
    public AdvancedModelRendererExtended Leftshinmembrane;
    public AdvancedModelRendererExtended lowerlegR;
    public AdvancedModelRendererExtended Rightthighmembrane;
    public AdvancedModelRendererExtended footR;
    public AdvancedModelRendererExtended Rightshinmembrane;

    private ModelAnimator animator;

    private float scaler;

    public ModelCaviramus() {
        this.textureWidth = 100;
        this.textureHeight = 100;
        this.Chinkeel = new AdvancedModelRendererExtended(this, 67, 0);
        this.Chinkeel.setRotationPoint(0.0F, 2.5999999046325684F, -1.899999976158142F);
        this.Chinkeel.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Chinkeel, 0.169820528229565F, 0.0F, 0.0F);
        this.Rudder = new AdvancedModelRendererExtended(this, 83, 2);
        this.Rudder.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Rudder.addBox(0.0F, -3.0F, 0.0F, 0, 6, 7, 0.0F);
        this.Rightshinmembrane = new AdvancedModelRendererExtended(this, 53, 53);
        this.Rightshinmembrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Rightshinmembrane.addBox(0.0F, 0.0F, 0.0F, 0, 10, 2, 0.0F);
        this.setRotateAngle(Rightshinmembrane, -0.08482300397719036F, 0.0F, 0.0F);
        this.Rightlowerteeth = new AdvancedModelRendererExtended(this, 1, 4);
        this.Rightlowerteeth.setRotationPoint(-0.10000000149011612F, 0.20000000298023224F, -2.5999999046325684F);
        this.Rightlowerteeth.addBox(-1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Rightlowerteeth, -0.06370451936226872F, 0.0F, -0.42446406875869874F);
        this.tail3 = new AdvancedModelRendererExtended(this, 51, 0);
        this.tail3.setRotationPoint(0.01F, 0.01F, 10.5F);
        this.tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 13, 0.0F);
        this.setRotateAngle(tail3, 0.10611601852125524F, 0.0F, 0.0F);
        this.tail4 = new AdvancedModelRendererExtended(this, 63, 0);
        this.tail4.setRotationPoint(-0.01F, -0.01F, 12.5F);
        this.tail4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 17, 0.0F);
        this.setRotateAngle(tail4, 0.08482300164692443F, 0.0F, 0.0F);
        this.Upperjawteeth = new AdvancedModelRendererExtended(this, 9, 7);
        this.Upperjawteeth.setRotationPoint(0.0F, 1.399999976158142F, -3.200000047683716F);
        this.Upperjawteeth.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.wing3R = new AdvancedModelRendererExtended(this, 58, 55);
        this.wing3R.setRotationPoint(-17.5F, 0.01F, -0.5F);
        this.wing3R.addBox(-12.0F, -0.5F, 0.0F, 12, 1, 9, 0.0F);
        this.setRotateAngle(wing3R, 0.40334559013588955F, 1.5070918090971035F, 0.33964107243809655F);
        this.body = new AdvancedModelRendererExtended(this, 43, 39);
        this.body.setRotationPoint(0.0F, -0.7F, -1.5F);
        this.body.addBox(-3.5F, -0.5F, -6.0F, 7, 6, 6, 0.0F);
        this.setRotateAngle(body, -0.08482300164692443F, 0.0F, 0.0F);
        this.wing3L = new AdvancedModelRendererExtended(this, 58, 66);
        this.wing3L.setRotationPoint(17.5F, 0.01F, -0.5F);
        this.wing3L.addBox(0.0F, -0.5F, 0.0F, 12, 1, 9, 0.0F);
        this.setRotateAngle(wing3L, 0.40334559013588955F, -1.5070918090971035F, -0.33964107243809655F);
        this.Leftlowerteeth = new AdvancedModelRendererExtended(this, 8, 0);
        this.Leftlowerteeth.setRotationPoint(0.10000000149011612F, 0.20000000298023224F, -2.5999999046325684F);
        this.Leftlowerteeth.addBox(0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Leftlowerteeth, -0.06370451936226872F, 0.0F, 0.42446406875869874F);
        this.wing2R = new AdvancedModelRendererExtended(this, 0, 55);
        this.wing2R.setRotationPoint(-7.0F, -0.3F, -0.5F);
        this.wing2R.addBox(-18.0F, -0.5F, -1.0F, 18, 1, 11, 0.0F);
        this.setRotateAngle(wing2R, -0.04241150082346221F, 0.06370451769779302F, -1.4009757905758482F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 35, 24);
        this.Jawparting.setRotationPoint(0.009999999776482582F, 0.0F, -4.599999904632568F);
        this.Jawparting.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Jawparting, -0.2546435405291338F, 0.0F, 0.0F);
        this.Leftshinmembrane = new AdvancedModelRendererExtended(this, 48, 53);
        this.Leftshinmembrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Leftshinmembrane.addBox(0.0F, 0.0F, 0.0F, 0, 10, 2, 0.0F);
        this.setRotateAngle(Leftshinmembrane, -0.08482300397719036F, 0.0F, 0.0F);
        this.Rightupperteeth = new AdvancedModelRendererExtended(this, 1, 0);
        this.Rightupperteeth.setRotationPoint(-1.0F, 0.6000000238418579F, -3.0F);
        this.Rightupperteeth.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Rightupperteeth, -0.08482300397719036F, 0.0F, 0.23352505591421208F);
        this.hips = new AdvancedModelRendererExtended(this, 63, 29);
        this.hips.setRotationPoint(0.0F, 10.1F, 5.0F);
        this.hips.addBox(-2.5F, -1.0F, -2.5F, 5, 5, 5, 0.0F);
        this.setRotateAngle(hips, -0.2546435378659727F, 0.0F, 0.0F);
        this.jaw = new AdvancedModelRendererExtended(this, 35, 13);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.jaw.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F);
        this.wing1L = new AdvancedModelRendererExtended(this, 0, 40);
        this.wing1L.setRotationPoint(2.5F, 2.0F, -4.5F);
        this.wing1L.addBox(-2.0F, -1.0F, -2.0F, 10, 2, 12, 0.0F);
        this.setRotateAngle(wing1L, 0.02129301687433082F, 0.21223203704251048F, -0.14852751934471745F);
        this.Crest = new AdvancedModelRendererExtended(this, 0, 4);
        this.Crest.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Crest.addBox(0.0F, -10.0F, 0.0F, 0, 10, 10, 0.0F);
        this.setRotateAngle(Crest, -0.08482300397719036F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 39, 0);
        this.tail2.setRotationPoint(0.0F, 0.3F, 5.0F);
        this.tail2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F);
        this.setRotateAngle(tail2, 0.06370451769779302F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 83, 0);
        this.tail1.setRotationPoint(0.0F, -0.3F, 2.0F);
        this.tail1.addBox(-1.0F, -0.5F, -0.5F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tail1, -0.08482300164692443F, 0.0F, 0.0F);
        this.Lowerjawfront = new AdvancedModelRendererExtended(this, 54, 5);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -2.5999999046325684F);
        this.Lowerjawfront.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Lowerjawfront, 0.12740903872453743F, 0.0F, 0.0F);
        this.Rightthighmembrane = new AdvancedModelRendererExtended(this, 48, 68);
        this.Rightthighmembrane.setRotationPoint(-0.5F, -1.0F, 1.5F);
        this.Rightthighmembrane.addBox(-0.5F, -0.5F, 0.0F, 1, 8, 2, 0.0F);
        this.Lowerjawfronttip = new AdvancedModelRendererExtended(this, 43, 4);
        this.Lowerjawfronttip.setRotationPoint(0.009999999776482582F, 2.200000047683716F, -2.0F);
        this.Lowerjawfronttip.addBox(-1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Lowerjawfronttip, 0.46705011182842415F, 0.0F, 0.0F);
        this.handR = new AdvancedModelRendererExtended(this, 77, 77);
        this.handR.setRotationPoint(-17.5F, 0.0F, 0.0F);
        this.handR.addBox(-1.5F, -0.5F, -2.5F, 3, 1, 3, 0.0F);
        this.setRotateAngle(handR, 0.08482300397719036F, 1.8043213327748382F, 1.273566776485551F);
        this.neck2 = new AdvancedModelRendererExtended(this, 79, 23);
        this.neck2.setRotationPoint(0.0F, 0.1F, -4.0F);
        this.neck2.addBox(-1.5F, -1.0F, -5.0F, 3, 5, 5, 0.0F);
        this.setRotateAngle(neck2, -0.16982053621904827F, 0.0F, 0.0F);
        this.wing2L = new AdvancedModelRendererExtended(this, 0, 68);
        this.wing2L.setRotationPoint(7.0F, -0.3F, -0.5F);
        this.wing2L.addBox(0.0F, -0.5F, -1.0F, 18, 1, 11, 0.0F);
        this.setRotateAngle(wing2L, -0.04241150082346221F, -0.06370451769779302F, 1.4009757905758482F);
        this.Upperjawfront = new AdvancedModelRendererExtended(this, 53, 0);
        this.Upperjawfront.setRotationPoint(0.0F, 0.699999988079071F, -3.0999999046325684F);
        this.Upperjawfront.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Upperjawfront, 0.06370451936226872F, 0.0F, 0.0F);
        this.Leftthighmembrane = new AdvancedModelRendererExtended(this, 59, 53);
        this.Leftthighmembrane.setRotationPoint(0.5F, -1.0F, 1.5F);
        this.Leftthighmembrane.addBox(-0.5F, -0.5F, 0.0F, 1, 8, 2, 0.0F);
        this.Headslopeback = new AdvancedModelRendererExtended(this, 32, 4);
        this.Headslopeback.setRotationPoint(0.0F, -1.0F, 0.30000001192092896F);
        this.Headslopeback.addBox(-1.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(Headslopeback, 0.2546435405291338F, 0.0F, 0.0F);
        this.Leftupperteeth = new AdvancedModelRendererExtended(this, 15, 0);
        this.Leftupperteeth.setRotationPoint(1.0F, 0.6000000238418579F, -3.0F);
        this.Leftupperteeth.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Leftupperteeth, -0.08482300397719036F, 0.0F, -0.23352505591421208F);
        this.handL = new AdvancedModelRendererExtended(this, 64, 77);
        this.handL.setRotationPoint(17.5F, 0.0F, 0.0F);
        this.handL.addBox(-1.5F, -0.5F, -2.5F, 3, 1, 3, 0.0F);
        this.setRotateAngle(handL, 0.08482300397719036F, -1.8043213327748382F, -1.273566776485551F);
        this.head = new AdvancedModelRendererExtended(this, 21, 16);
        this.head.setRotationPoint(0.0F, -0.5F, -3.5F);
        this.head.addBox(-2.0F, -1.0F, -5.0F, 4, 3, 5, 0.0F);
        this.setRotateAngle(head, 0.6155776271784F, 0.0F, 0.0F);
        this.wing4R = new AdvancedModelRendererExtended(this, 0, 81);
        this.wing4R.setRotationPoint(-11.0F, 0.01F, 0.5F);
        this.wing4R.addBox(-28.0F, -0.5F, 0.0F, 28, 1, 8, 0.0F);
        this.setRotateAngle(wing4R, 0.14852751934471745F, 1.0400417012634209F, 0.19111355309337907F);
        this.wing4L = new AdvancedModelRendererExtended(this, 0, 91);
        this.wing4L.setRotationPoint(11.0F, 0.01F, 0.5F);
        this.wing4L.addBox(0.0F, -0.5F, 0.0F, 28, 1, 8, 0.0F);
        this.setRotateAngle(wing4L, 0.14852751934471745F, -1.0400417012634209F, -0.19111355309337907F);
        this.wing1R = new AdvancedModelRendererExtended(this, 0, 25);
        this.wing1R.setRotationPoint(-2.5F, 2.0F, -4.5F);
        this.wing1R.addBox(-8.0F, -1.0F, -2.0F, 10, 2, 12, 0.0F);
        this.setRotateAngle(wing1R, 0.02129301687433082F, -0.21223203704251048F, 0.14852751934471745F);
        this.Lowerjawteeth = new AdvancedModelRendererExtended(this, 0, 8);
        this.Lowerjawteeth.setRotationPoint(0.009999999776482582F, 0.5F, -3.0F);
        this.Lowerjawteeth.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(Lowerjawteeth, -0.10611601718967469F, 0.0F, 0.0F);
        this.lowerlegR = new AdvancedModelRendererExtended(this, 83, 82);
        this.lowerlegR.setRotationPoint(-0.5F, 5.5F, -1.0F);
        this.lowerlegR.addBox(-0.5F, 0.0F, -0.5F, 1, 10, 2, 0.0F);
        this.setRotateAngle(lowerlegR, 0.7641051465231175F, 0.08482300164692443F, -0.2759365547403035F);
        this.footL = new AdvancedModelRendererExtended(this, 0, 68);
        this.footL.setRotationPoint(-0.01F, 9.9F, 0.7F);
        this.footL.addBox(-1.0F, -0.5F, -0.5F, 2, 7, 1, 0.0F);
        this.setRotateAngle(footL, -1.9104373992329928F, 0.0F, 0.21223203704251048F);
        this.Lowerjawmiddle = new AdvancedModelRendererExtended(this, 23, 2);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjawmiddle.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Lowerjawmiddle, 0.1485275233394591F, 0.0F, 0.0F);
        this.chest = new AdvancedModelRendererExtended(this, 70, 40);
        this.chest.setRotationPoint(0.0F, -0.3F, -5.0F);
        this.chest.addBox(-4.0F, -0.5F, -7.0F, 8, 7, 7, 0.0F);
        this.setRotateAngle(chest, 0.21223203704251048F, 0.0F, 0.0F);
        this.Upperjawback = new AdvancedModelRendererExtended(this, 21, 9);
        this.Upperjawback.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Upperjawback.addBox(-1.5F, 0.0F, -3.5F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Upperjawback, 0.1485275233394591F, 0.0F, 0.0F);
        this.Headslopefront = new AdvancedModelRendererExtended(this, 46, 21);
        this.Headslopefront.setRotationPoint(0.0F, -0.699999988079071F, 0.0F);
        this.Headslopefront.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Headslopefront, 0.04241150198859518F, 0.0F, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 44, 27);
        this.neck1.setRotationPoint(0.0F, 0.6F, -5.5F);
        this.neck1.addBox(-2.0F, -1.0F, -5.0F, 4, 5, 5, 0.0F);
        this.setRotateAngle(neck1, -0.3609340893124273F, 0.0F, 0.0F);
        this.footR = new AdvancedModelRendererExtended(this, 4, 55);
        this.footR.setRotationPoint(0.01F, 9.9F, 0.7F);
        this.footR.addBox(-1.0F, -0.5F, -0.5F, 2, 7, 1, 0.0F);
        this.setRotateAngle(footR, -1.9104373992329928F, 0.0F, -0.21223203704251048F);
        this.upperlegR = new AdvancedModelRendererExtended(this, 90, 88);
        this.upperlegR.setRotationPoint(-2.3F, 0.7F, -0.3F);
        this.upperlegR.addBox(-1.5F, -1.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(upperlegR, -0.10611601852125524F, 0.06370451769779302F, 0.5094616086571448F);
        this.upperlegL = new AdvancedModelRendererExtended(this, 90, 77);
        this.upperlegL.setRotationPoint(2.3F, 0.7F, -0.3F);
        this.upperlegL.addBox(-0.5F, -1.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(upperlegL, -0.10611601852125524F, -0.06370451769779302F, -0.5094616086571448F);
        this.lowerlegL = new AdvancedModelRendererExtended(this, 76, 82);
        this.lowerlegL.setRotationPoint(0.5F, 5.5F, -1.0F);
        this.lowerlegL.addBox(-0.5F, 0.0F, -0.5F, 1, 10, 2, 0.0F);
        this.setRotateAngle(lowerlegL, 0.7641051465231175F, -0.08482300164692443F, 0.2759365547403035F);
        this.Lowerjawfront.addChild(this.Chinkeel);
        this.tail4.addChild(this.Rudder);
        this.lowerlegR.addChild(this.Rightshinmembrane);
        this.Lowerjawfront.addChild(this.Rightlowerteeth);
        this.tail2.addChild(this.tail3);
        this.tail3.addChild(this.tail4);
        this.Upperjawback.addChild(this.Upperjawteeth);
        this.wing2R.addChild(this.wing3R);
        this.hips.addChild(this.body);
        this.wing2L.addChild(this.wing3L);
        this.Lowerjawfront.addChild(this.Leftlowerteeth);
        this.wing1R.addChild(this.wing2R);
        this.jaw.addChild(this.Jawparting);
        this.lowerlegL.addChild(this.Leftshinmembrane);
        this.Upperjawfront.addChild(this.Rightupperteeth);
        this.head.addChild(this.jaw);
        this.chest.addChild(this.wing1L);
        this.Headslopefront.addChild(this.Crest);
        this.tail1.addChild(this.tail2);
        this.hips.addChild(this.tail1);
        this.Lowerjawmiddle.addChild(this.Lowerjawfront);
        this.upperlegR.addChild(this.Rightthighmembrane);
        this.Lowerjawfront.addChild(this.Lowerjawfronttip);
        this.wing2R.addChild(this.handR);
        this.neck1.addChild(this.neck2);
        this.wing1L.addChild(this.wing2L);
        this.Upperjawback.addChild(this.Upperjawfront);
        this.upperlegL.addChild(this.Leftthighmembrane);
        this.Upperjawback.addChild(this.Headslopeback);
        this.Upperjawfront.addChild(this.Leftupperteeth);
        this.wing2L.addChild(this.handL);
        this.neck2.addChild(this.head);
        this.wing3R.addChild(this.wing4R);
        this.wing3L.addChild(this.wing4L);
        this.chest.addChild(this.wing1R);
        this.Lowerjawmiddle.addChild(this.Lowerjawteeth);
        this.upperlegR.addChild(this.lowerlegR);
        this.lowerlegL.addChild(this.footL);
        this.jaw.addChild(this.Lowerjawmiddle);
        this.body.addChild(this.chest);
        this.head.addChild(this.Upperjawback);
        this.Upperjawfront.addChild(this.Headslopefront);
        this.chest.addChild(this.neck1);
        this.lowerlegR.addChild(this.footR);
        this.hips.addChild(this.upperlegR);
        this.hips.addChild(this.upperlegL);
        this.upperlegL.addChild(this.lowerlegL);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.hips.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.hips.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraAgeableFlyingBase flier = (EntityPrehistoricFloraAgeableFlyingBase) e;
        if (flier.isReallyFlying() || flier.getAnimation() == flier.UNFLY_ANIMATION) { //flight pose
            this.setRotateAngle(tail4, 0.04241150082346221F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegL, 0.6368706440527309F, -0.14852751934471745F, -1.5920893436692274F);
            this.setRotateAngle(wing2R, 0.0F, -0.08482300164692443F, 0.06370451769779302F);
            this.setRotateAngle(footL, -0.06370451769779302F, 0.0F, 0.0F);
            this.setRotateAngle(neck1, -0.12740903539558604F, 0.0F, 0.0F);
            this.setRotateAngle(wing3R, 0.0F, 0.08482300164692443F, -0.06370451769779302F);
            this.setRotateAngle(tail3, 0.04241150082346221F, 0.0F, 0.0F);
            this.setRotateAngle(wing3L, 0.0F, -0.08482300164692443F, 0.06370451769779302F);
            this.setRotateAngle(wing4L, 0.0F, -0.02129301687433082F, 0.08482300164692443F);
            this.setRotateAngle(handR, -0.10611601852125524F, 0.46705010783368256F, 0.0F);
            this.setRotateAngle(lowerlegR, 0.7641051465231175F, -0.08482300164692443F, 0.02129301687433082F);
            this.setRotateAngle(upperlegR, 0.6368706440527309F, 0.14852751934471745F, 1.5920893436692274F);
            this.setRotateAngle(wing2L, 0.0F, 0.08482300164692443F, -0.06370451769779302F);
            this.setRotateAngle(wing1R, -0.02129301687433082F, 0.02129301687433082F, 0.14852751934471745F);
            this.setRotateAngle(chest, 0.12740903539558604F, 0.0F, 0.0F);
            this.setRotateAngle(footR, -0.06370451769779302F, 0.0F, 0.0F);
            this.setRotateAngle(handL, -0.10611601852125524F, -0.46705010783368256F, 0.0F);
            this.setRotateAngle(tail2, 0.12740903539558604F, 0.0F, 0.0F);
            this.setRotateAngle(wing1L, -0.02129301687433082F, -0.02129301687433082F, -0.14852751934471745F);
            this.setRotateAngle(lowerlegL, 0.7641051465231175F, 0.08482300164692443F, -0.02129301687433082F);
            this.setRotateAngle(head, 0.42446407408502096F, 0.0F, 0.0F);
            this.setRotateAngle(hips, -0.06370451769779302F, 0.0F, 0.0F);
            this.setRotateAngle(wing4R, 0.0F, 0.02129301687433082F, -0.08482300164692443F);
            this.setRotateAngle(neck2, -0.2546435378659727F, 0.0F, 0.0F);
        } else {
            resetToDefaultPose();
        }

        AdvancedModelRenderer[] wingLeft = {this.wing1L, this.wing2L, this.wing3L};
        AdvancedModelRenderer[] wingRight = {this.wing1R, this.wing2R, this.wing3R};

        AdvancedModelRenderer[] legLeft = {this.upperlegL, this.lowerlegL, this.footL};
        AdvancedModelRenderer[] legRight = {this.upperlegR, this.lowerlegR, this.footR};

        AdvancedModelRenderer[] tailFull = {this.tail1, this.tail2, this.tail3, this.tail4};

        float speed = 0.48F;
        float fixedY = 1.1F; //The standard offset to centre the mob

        //Animations:

        if (flier.isReallyFlying()) {

            this.faceTarget(f3, f4, 8, neck1);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 4, head);

            this.chainFlap(wingLeft, speed, 0.25F, 0.2F, f2, 1F);
            this.chainFlap(wingRight, speed, -0.25F, -0.2F, f2, 1F);

            this.swing(wing4L, speed, 0.2F, false, 2.0F, 0.12F, f2, 1F);
            this.swing(wing4R, speed, -0.2F, false, 2.0F, -0.12F, f2, 1F);

            this.swing(wing1L, speed, 0.05F, false, 2.0F, 0.025F, f2, 1F);
            this.swing(wing1R, speed, -0.05F, false, 2.0F, -0.025F, f2, 1F);

            float floatMoveZ = this.moveBoxExtended(speed, 0.30F, false, 4, f2, 1);
            this.hips.offsetZ = floatMoveZ * this.scaler;
            float floatMoveY = this.moveBoxExtended(speed, 0.30F, false, 4, f2, 1);
            this.hips.offsetY = (floatMoveY  * this.scaler) + fixedY;

            this.chainWaveExtended(legLeft, speed, 0.055F, 0.1F, 0F, f2, 1F);
            this.chainWaveExtended(legRight, speed, -0.055F, -0.1F, 3F, f2, 1F);
            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.5F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.15F, 2.0F, f2, 1F);

        }
        else { //not flying

            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }

            this.faceTarget(f3, f4, 12, neck1);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 8, head);

            this.hips.offsetY = fixedY;

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

            if (f3 == 0 || !flier.getIsMoving() || flier.getAnimation() == flier.FLY_ANIMATION || flier.getAnimation() == flier.UNFLY_ANIMATION) {
                return;
            }

            //body walking:
            this.flap(wing1L, speed, -0.2F, true, 4, 0.15F, f2, 1F);
            this.flap(wing1R, speed, 0.2F, true, 7, -0.15F, f2, 1F);

            this.walk(chest, speed, -0.2F, true, 6.5F, -0.1F, f2, 1F);
            this.walk(body, speed, -0.2F, true, 6.5F, -0.1F, f2, 1F);
            this.walk(tail1, speed, 0.4F, true, 6.5F, 0.2F, f2, 1F);
            this.walk(neck1, speed, 0.4F, true, 6.5F, 0.2F, f2, 1F);

            //this.walk(upperlegL, speed, -0.1F, true, 6.5F, 0.05F, f2, 1F);
            //this.walk(upperlegR, speed, -0.1F, true, 6.5F, 0.05F, f2, 1F);

            this.flap(upperlegL, speed, 0.05F, false, 6.5F, 0.05F, f2, 1F);
            this.flap(upperlegR, speed, -0.05F, false, 6.5F, -0.05F, f2, 1F);

            this.swing(hips, speed, -0.1F, true, 6.5F, -0.05F, f2, 1F);

            this.walk(wing1L, speed, 0.40F, true, 5, 0.30F, f2, 1F);
            this.walk(wing1R, speed, 0.40F, true, 8, 0.30F, f2, 1F);

            this.walk(upperlegL, speed, 0.20F, true, 6.5F, -0.08F, f2, 1F);
            this.walk(upperlegR, speed, 0.20F, true, 6.5F, -0.08F, f2, 1F);

            this.walk(wing2L, speed, 0.25F, true, 6, 0F, f2, 1F);
            this.walk(wing2R, speed, 0.25F, true, 9, 0F, f2, 1F);

            this.walk(lowerlegL, speed, 0.15F, true, 7.5F, 0F, f2, 1F);
            this.walk(lowerlegR, speed, 0.15F, true, 7.5F, 0F, f2, 1F);

            this.flap(wing2L, speed, 0.10F, true, 0, 0.05F, f2, 1F);
            this.flap(wing2R, speed, -0.10F, true, 3, -0.05F, f2, 1F);

            this.walk(handL, speed, 0.30F, true, 2, -0.10F, f2, 1F);
            this.walk(handR, speed, 0.30F, true, 5, -0.10F, f2, 1F);

            this.walk(footL, speed, 0.25F, true, 3.5F, -0.08F, f2, 1F);
            this.walk(footR, speed, 0.25F, true, 3.5F, -0.08F, f2, 1F);

            this.bobExtended(hips, speed * 2F, 0.185F, false, 2.5F,  f2, 1F);

            this.flap(hips, speed, 0.04F, false, 5.0F,0.04F, f2, 1.0F);
            this.flap(body, speed, 0.06F, false, 5.0F,0.04F, f2, 1.0F);
            this.flap(chest, speed, -0.06F, false, 5.0F,-0.04F, f2, 1.0F);
            this.flap(neck1, speed, 0.04F, false, 5.0F,0.04F, f2, 1.0F);

            this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);
            this.walk(body, speed * 2, -0.05F, false, 2.5F,0.01F, f2, 0.8F);

            this.hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.85), false, 1.5F, f2, 1);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableFlyingBase e = (EntityPrehistoricFloraAgeableFlyingBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(tail4, -0.0424115008234622F, 0F, 0F);
        animator.rotate(upperlegL, 0.742986662573985F, -0.084823001646924F, -1.08262773501208F);
        animator.rotate(wing2R, 0.0424115008234622F, -0.148527519344717F, 1.46468030827363F);
        animator.rotate(footL, 1.8467328815352F, 0F, -0.21223203704251F);
        animator.rotate(neck1, 0.233525053916841F, 0F, 0F);
        animator.rotate(wing3R, -0.403345590135889F, -1.42226880745018F, -0.403345590135889F);
        animator.rotate(tail3, -0.0637045176977928F, 0F, 0F);
        animator.rotate(wing3L, -0.403345590135889F, 1.42226880745018F, 0.403345590135889F);
        animator.rotate(wing4L, -0.148527519344717F, 1.01874868438909F, 0.275936554740303F);
        animator.rotate(handR, -0.190939020168179F, -1.33727127287805F, -1.27356675518026F);
        animator.rotate(lowerlegR, 0F, -0.169646003293849F, 0.297229571614634F);
        animator.rotate(upperlegR, 0.742986662573985F, 0.084823001646924F, 1.08262773501208F);
        animator.rotate(wing2L, 0.0424115008234622F, 0.148527519344717F, -1.46468030827363F);
        animator.rotate(wing1R, -0.0425860337486616F, 0.233525053916841F, 0F);
        animator.rotate(chest, -0.084823001646924F, 0F, 0F);
        animator.rotate(footR, 1.8467328815352F, 0F, 0.21223203704251F);
        animator.rotate(handL, -0.190939020168179F, 1.33727127287805F, 1.27356675518026F);
        animator.rotate(tail2, 0.063704517697793F, 0F, 0F);
        animator.rotate(wing1L, -0.0425860337486616F, -0.233525053916841F, 0F);
        animator.rotate(lowerlegL, 0F, 0.169646003293849F, -0.297229571614634F);
        animator.rotate(head, -0.19111355309338F, 0F, 0F);
        animator.rotate(hips, 0.190939020168179F, 0F, 0F);
        animator.rotate(wing4R, -0.148527519344717F, -1.01874868438909F, -0.275936554740303F);
        animator.rotate(neck2, -0.084823001646924F, 0F, 0F);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(tail4, 0.0424115008234622F, 0F, 0F);
        animator.rotate(upperlegL, -0.742986662573985F, 0.084823001646924F, 1.08262773501208F);
        animator.rotate(wing2R, -0.0424115008234622F, 0.148527519344717F, -1.46468030827363F);
        animator.rotate(footL, -1.8467328815352F, 0F, 0.21223203704251F);
        animator.rotate(neck1, -0.233525053916841F, 0F, 0F);
        animator.rotate(wing3R, 0.403345590135889F, 1.42226880745018F, 0.403345590135889F);
        animator.rotate(tail3, 0.0637045176977928F, 0F, 0F);
        animator.rotate(wing3L, 0.403345590135889F, -1.42226880745018F, -0.403345590135889F);
        animator.rotate(wing4L, 0.148527519344717F, -1.01874868438909F, -0.275936554740303F);
        animator.rotate(handR, 0.190939020168179F, 1.33727127287805F, 1.27356675518026F);
        animator.rotate(lowerlegR, 0F, 0.169646003293849F, -0.297229571614634F);
        animator.rotate(upperlegR, -0.742986662573985F, -0.084823001646924F, -1.08262773501208F);
        animator.rotate(wing2L, -0.0424115008234622F, -0.148527519344717F, 1.46468030827363F);
        animator.rotate(wing1R, 0.0425860337486616F, -0.233525053916841F, 0F);
        animator.rotate(chest, 0.084823001646924F, 0F, 0F);
        animator.rotate(footR, -1.8467328815352F, 0F, -0.21223203704251F);
        animator.rotate(handL, 0.190939020168179F, -1.33727127287805F, -1.27356675518026F);
        animator.rotate(tail2, -0.063704517697793F, 0F, 0F);
        animator.rotate(wing1L, 0.0425860337486616F, 0.233525053916841F, 0F);
        animator.rotate(lowerlegL, 0F, -0.169646003293849F, 0.297229571614634F);
        animator.rotate(head, 0.19111355309338F, 0F, 0F);
        animator.rotate(hips, -0.190939020168179F, 0F, 0F);
        animator.rotate(wing4R, 0.148527519344717F, 1.01874868438909F, 0.275936554740303F);
        animator.rotate(neck2, 0.084823001646924F, 0F, 0F);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-12), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(2);
        animator.rotate(this.neck1, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(4);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        ///Anim code in here for laying
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);

    }
}
