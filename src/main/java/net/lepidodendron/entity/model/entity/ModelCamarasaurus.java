package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCamarasaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCamarasaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer basin3_r1;
    private final AdvancedModelRenderer basin2_r1;
    private final AdvancedModelRenderer upperlegright;
    private final AdvancedModelRenderer lowerlegright;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer upperlegleft;
    private final AdvancedModelRenderer lowerlegleft;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer lowerteeth1;
    private final AdvancedModelRenderer gums1;
    private final AdvancedModelRenderer nose1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head2_r1;
    private final AdvancedModelRenderer nose2;
    private final AdvancedModelRenderer nose3;
    private final AdvancedModelRenderer teeth1;
    private final AdvancedModelRenderer fleshyspike1;
    private final AdvancedModelRenderer fleshyspike2;
    private final AdvancedModelRenderer fleshyspike3;
    private final AdvancedModelRenderer fleshyspike4;
    private final AdvancedModelRenderer fleshyspike5;
    private final AdvancedModelRenderer neckspikes;
    private final AdvancedModelRenderer upperarmright;
    private final AdvancedModelRenderer lowerarmright;
    private final AdvancedModelRenderer handright;
    private final AdvancedModelRenderer clawright;
    private final AdvancedModelRenderer upperarmleft;
    private final AdvancedModelRenderer lowerarmleft;
    private final AdvancedModelRenderer handleft;
    private final AdvancedModelRenderer clawleft;

    private ModelAnimator animator;

    public ModelCamarasaurus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -35.1F, 17.2F);
        this.base.addChild(hip);
        this.setRotateAngle(hip, -0.2618F, 0.0F, 0.0F);
        this.hip.cubeList.add(new ModelBox(hip, 0, 76, -13.5F, -2.5F, 0.0F, 27, 34, 24, 0.0F, false));

        this.basin3_r1 = new AdvancedModelRenderer(this);
        this.basin3_r1.setRotationPoint(-2.5F, -1.9F, 23.8F);
        this.hip.addChild(basin3_r1);
        this.setRotateAngle(basin3_r1, 0.3054F, 0.0F, 0.0F);
        this.basin3_r1.cubeList.add(new ModelBox(basin3_r1, 100, 0, -8.5F, -5.55F, -15.425F, 22, 2, 5, -0.01F, false));

        this.basin2_r1 = new AdvancedModelRenderer(this);
        this.basin2_r1.setRotationPoint(-2.5F, -1.9F, 23.8F);
        this.hip.addChild(basin2_r1);
        this.setRotateAngle(basin2_r1, -0.1309F, 0.0F, 0.0F);
        this.basin2_r1.cubeList.add(new ModelBox(basin2_r1, 94, 171, -8.5F, -0.6F, -11.8F, 22, 2, 12, 0.0F, false));

        this.upperlegright = new AdvancedModelRenderer(this);
        this.upperlegright.setRotationPoint(-12.5F, 7.5F, 13.2F);
        this.hip.addChild(upperlegright);
        this.setRotateAngle(upperlegright, 0.1745F, 0.0F, 0.0F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 156, 130, -5.0F, -1.0F, -9.0F, 10, 26, 15, 0.0F, false));

        this.lowerlegright = new AdvancedModelRenderer(this);
        this.lowerlegright.setRotationPoint(0.0F, 24.1F, -4.9F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.2618F, 0.0F, 0.0F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 111, 185, -4.5F, 0.0F, -3.0F, 9, 22, 12, 0.0F, false));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 20.1F, 3.5F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.1745F, 0.0F, 0.0F);
        this.footright.cubeList.add(new ModelBox(footright, 172, 67, -5.5F, -2.0F, -11.0F, 11, 8, 16, 0.0F, false));

        this.upperlegleft = new AdvancedModelRenderer(this);
        this.upperlegleft.setRotationPoint(12.5F, 7.5F, 13.2F);
        this.hip.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, 0.1745F, 0.0F, 0.0F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 156, 130, -5.0F, -1.0F, -9.0F, 10, 26, 15, 0.0F, true));

        this.lowerlegleft = new AdvancedModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.0F, 24.1F, -4.9F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.2618F, 0.0F, 0.0F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 111, 185, -4.5F, 0.0F, -3.0F, 9, 22, 12, 0.0F, true));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 20.1F, 3.5F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.1745F, 0.0F, 0.0F);
        this.footleft.cubeList.add(new ModelBox(footleft, 172, 67, -5.5F, -2.0F, -11.0F, 11, 8, 16, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 6.5F, 21.0F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 134, -8.0F, -9.0F, 0.0F, 16, 18, 20, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.3F, 18.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 134, 36, -5.0F, -7.0F, -1.0F, 10, 13, 16, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3F, 14.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 172, -3.5F, -4.9F, -2.0F, 7, 9, 17, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.7F, 14.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 193, 156, -2.5F, -1.4F, 0.0F, 5, 6, 15, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 1.2F, 14.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 178, 0, -1.5F, -2.0F, 0.0F, 3, 4, 16, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2182F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 168, 41, -1.0F, -1.25F, 0.0F, 2, 2, 24, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 10.25F, 2.8F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -16.5F, -15.0F, -33.0F, 33, 42, 34, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -10.85F, -32.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0436F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 102, 76, -13.5F, -4.0F, -16.0F, 27, 38, 16, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 4.8F, -15.6F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3927F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 80, 130, -8.0F, -7.5F, -16.0F, 16, 19, 22, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6F, -14.4F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 134, 0, -6.0F, -5.4F, -18.0F, 12, 16, 20, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -17.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0436F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 59, 171, -4.5F, -4.4F, -16.0F, 9, 14, 17, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 1.6F, -15.9F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.3491F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 188, 91, -3.5F, -5.0F, -14.0F, 7, 12, 16, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.65F, -13.15F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.3491F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 192, 120, -2.5F, -3.5F, -12.5F, 5, 10, 15, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-1.0F, 0.9F, -10.2F);
        this.neck5.addChild(head);
        this.setRotateAngle(head, 0.4554F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 18, -2.0F, -5.0F, -5.0F, 6, 7, 5, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7F, 0.2F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 78, 85, -2.0F, 0.0F, -5.25F, 6, 3, 5, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 1.0F, -5.8F);
        this.jaw.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 78, 76, -1.5F, -1.0F, -5.0F, 5, 3, 6, -0.01F, false));

        this.lowerteeth1 = new AdvancedModelRenderer(this);
        this.lowerteeth1.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.jaw2.addChild(lowerteeth1);
        this.setRotateAngle(lowerteeth1, -0.0873F, 0.0F, 0.0F);
        this.lowerteeth1.cubeList.add(new ModelBox(lowerteeth1, 78, 93, -1.0F, -1.5F, -2.5F, 4, 1, 4, -0.01F, false));

        this.gums1 = new AdvancedModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 2.1F, -3.0F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.5463F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 0, 76, -1.5F, -6.0F, -3.75F, 5, 6, 5, -0.02F, false));

        this.nose1 = new AdvancedModelRenderer(this);
        this.nose1.setRotationPoint(0.0F, -2.9F, -6.0F);
        this.head.addChild(nose1);
        this.setRotateAngle(nose1, 0.2618F, 0.0F, 0.0F);
        this.nose1.cubeList.add(new ModelBox(nose1, 22, 0, -1.0F, -1.775F, -0.45F, 4, 5, 2, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.0F, -6.7F);
        this.head.addChild(head2);


        this.head2_r1 = new AdvancedModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, 1.9F, 1.7F);
        this.head2.addChild(head2_r1);
        this.setRotateAngle(head2_r1, 0.2182F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 0, 87, -1.5F, -2.9F, -4.2F, 5, 3, 5, 0.015F, false));

        this.nose2 = new AdvancedModelRenderer(this);
        this.nose2.setRotationPoint(0.0F, -1.15F, -0.85F);
        this.head2.addChild(nose2);
        this.setRotateAngle(nose2, 0.9163F, 0.0F, 0.0F);
        this.nose2.cubeList.add(new ModelBox(nose2, 95, 80, -1.0F, -1.5F, -1.95F, 4, 3, 5, 0.01F, false));

        this.nose3 = new AdvancedModelRenderer(this);
        this.nose3.setRotationPoint(0.0F, 0.9F, -2.15F);
        this.head2.addChild(nose3);
        this.setRotateAngle(nose3, 1.2217F, 0.0F, 0.0F);
        this.nose3.cubeList.add(new ModelBox(nose3, 17, 18, -1.5F, -1.5F, -1.975F, 5, 2, 3, 0.01F, false));

        this.teeth1 = new AdvancedModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 1.05F, -5.2F);
        this.head2.addChild(teeth1);
        this.setRotateAngle(teeth1, 0.1384F, 0.0F, 0.0F);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 18, 26, -1.0F, 1.65F, 1.5F, 4, 1, 4, 0.0F, false));

        this.fleshyspike1 = new AdvancedModelRenderer(this);
        this.fleshyspike1.setRotationPoint(0.0F, -1.3F, -10.1F);
        this.neck5.addChild(fleshyspike1);
        this.setRotateAngle(fleshyspike1, 0.2276F, 0.0F, 0.0F);
        this.fleshyspike1.cubeList.add(new ModelBox(fleshyspike1, 30, 12, -0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.fleshyspike2 = new AdvancedModelRenderer(this);
        this.fleshyspike2.setRotationPoint(0.0F, -2.4F, -7.9F);
        this.neck5.addChild(fleshyspike2);
        this.setRotateAngle(fleshyspike2, 0.0911F, 0.0F, 0.0F);
        this.fleshyspike2.cubeList.add(new ModelBox(fleshyspike2, 30, 7, -0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.fleshyspike3 = new AdvancedModelRenderer(this);
        this.fleshyspike3.setRotationPoint(0.0F, -2.6F, -5.6F);
        this.neck5.addChild(fleshyspike3);
        this.setRotateAngle(fleshyspike3, -0.1367F, 0.0F, 0.0F);
        this.fleshyspike3.cubeList.add(new ModelBox(fleshyspike3, 0, 18, -0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.fleshyspike4 = new AdvancedModelRenderer(this);
        this.fleshyspike4.setRotationPoint(0.0F, -2.9F, -3.0F);
        this.neck5.addChild(fleshyspike4);
        this.setRotateAngle(fleshyspike4, -0.2276F, 0.0F, 0.0F);
        this.fleshyspike4.cubeList.add(new ModelBox(fleshyspike4, 4, 0, -0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.fleshyspike5 = new AdvancedModelRenderer(this);
        this.fleshyspike5.setRotationPoint(0.0F, -2.3F, -0.7F);
        this.neck5.addChild(fleshyspike5);
        this.setRotateAngle(fleshyspike5, -0.2731F, 0.0F, 0.0F);
        this.fleshyspike5.cubeList.add(new ModelBox(fleshyspike5, 0, 0, -0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.neckspikes = new AdvancedModelRenderer(this);
        this.neckspikes.setRotationPoint(0.0F, -5.5F, -12.0F);
        this.neck4.addChild(neckspikes);
        this.neckspikes.cubeList.add(new ModelBox(neckspikes, 0, 2, 0.0F, -1.0F, -2.0F, 0, 2, 14, 0.0F, false));

        this.upperarmright = new AdvancedModelRenderer(this);
        this.upperarmright.setRotationPoint(-12.5F, 22.8F, -7.0F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, 0.1745F, 0.0F, 0.0F);
        this.upperarmright.cubeList.add(new ModelBox(upperarmright, 162, 171, -4.5F, 1.0F, -6.5F, 9, 24, 13, 0.0F, false));

        this.lowerarmright = new AdvancedModelRenderer(this);
        this.lowerarmright.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.upperarmright.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, -0.2182F, 0.0F, 0.0F);
        this.lowerarmright.cubeList.add(new ModelBox(lowerarmright, 196, 26, -4.0F, 0.0F, -5.0F, 8, 17, 10, 0.0F, false));

        this.handright = new AdvancedModelRenderer(this);
        this.handright.setRotationPoint(0.0F, 15.6F, -3.6F);
        this.lowerarmright.addChild(handright);
        this.setRotateAngle(handright, 0.2182F, 0.0F, 0.0F);
        this.handright.cubeList.add(new ModelBox(handright, 0, 0, -3.5F, 0.0F, -1.0F, 7, 8, 8, 0.0F, false));

        this.clawright = new AdvancedModelRenderer(this);
        this.clawright.setRotationPoint(2.6F, 11.8F, 0.9F);
        this.handright.addChild(clawright);
        this.setRotateAngle(clawright, 0.0F, 0.2276F, 0.0F);
        this.clawright.cubeList.add(new ModelBox(clawright, 0, 30, 0.0F, -6.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.upperarmleft = new AdvancedModelRenderer(this);
        this.upperarmleft.setRotationPoint(12.5F, 22.8F, -7.0F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, 0.1745F, 0.0F, 0.0F);
        this.upperarmleft.cubeList.add(new ModelBox(upperarmleft, 162, 171, -4.5F, 1.0F, -6.5F, 9, 24, 13, 0.0F, true));

        this.lowerarmleft = new AdvancedModelRenderer(this);
        this.lowerarmleft.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.upperarmleft.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, -0.2182F, 0.0F, 0.0F);
        this.lowerarmleft.cubeList.add(new ModelBox(lowerarmleft, 196, 26, -4.0F, 0.0F, -5.0F, 8, 17, 10, 0.0F, true));

        this.handleft = new AdvancedModelRenderer(this);
        this.handleft.setRotationPoint(0.0F, 15.6F, -3.6F);
        this.lowerarmleft.addChild(handleft);
        this.setRotateAngle(handleft, 0.2182F, 0.0F, 0.0F);
        this.handleft.cubeList.add(new ModelBox(handleft, 0, 0, -3.5F, 0.0F, -1.0F, 7, 8, 8, 0.0F, true));

        this.clawleft = new AdvancedModelRenderer(this);
        this.clawleft.setRotationPoint(-2.6F, 11.8F, 0.9F);
        this.handleft.addChild(clawleft);
        this.setRotateAngle(clawleft, 0.0F, -0.2276F, 0.0F);
        this.clawleft.cubeList.add(new ModelBox(clawleft, 0, 30, -4.0F, -6.0F, -1.0F, 4, 2, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.50F;
        this.base.offsetX = 0.0F;
        this.base.rotateAngleY = (float)Math.toRadians(0);
        this.base.rotateAngleX = (float)Math.toRadians(-88);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 0.6F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraCamarasaurus camara = (EntityPrehistoricFloraCamarasaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = camara.getJuvenile();

        if (isBaby) {
            this.neck4.scaleChildren = true;
            this.neck5.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1.025F, 1.025F, 1.025F);
            this.neck5.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck5.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1F, 1, 1F);
            this.neck5.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        camara.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = camara.getTravelSpeed()/2;

            if (!camara.isInWater()) {

                if (f3 == 0.0F || !camara.getIsMoving()) {
                    if (camara.getAnimation() != camara.EAT_ANIMATION
                        && camara.getAnimation() != camara.DRINK_ANIMATION
                        && camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Tail, (0.15F * 0.1F), 0.1F, 0.2F, f2, 1F);
                        this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.35F, 0.12F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.35F, 0F, f2, 1F);
                    }

                    return;
                }

                if (camara.getIsFast()) { //Running
                    float speed = masterSpeed / 2F;
                    this.chainFlap(Tail, (speed * 1.2F), 0.1F, 0.5F, f2, 1F);
                    this.chainWave(Tail, (speed * 0.6F) , 0.05F, 0.12F, f2, 1F);

                } else { //Walking
                    float speed = masterSpeed / 1.50F;
                    this.chainFlap(Tail, (speed * 0.5F), 0.1F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (speed * 0.5F), 0.05F * 0.65F, 0.12F, f2, 1F);
                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCamarasaurus ee = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The drink anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animLeafGrazeUpwards(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (3-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 3 + (((tickAnim - 33) / 68) * (3-(3)));
            yy = 0 + (((tickAnim - 33) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 68) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 115) {
            xx = 3 + (((tickAnim - 101) / 14) * (0-(3)));
            yy = 0 + (((tickAnim - 101) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 14) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 115) / 13) * (-2-(0)));
            yy = 0 + (((tickAnim - 115) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 13) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 160) {
            xx = -2 + (((tickAnim - 128) / 32) * (0-(-2)));
            yy = 0 + (((tickAnim - 128) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-3-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -3 + (((tickAnim - 33) / 69) * (-3-(-3)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -3 + (((tickAnim - 102) / 15) * (-1-(-3)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (0-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-2-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2 + (((tickAnim - 33) / 69) * (-2-(-2)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -2 + (((tickAnim - 102) / 15) * (1-(-2)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 1 + (((tickAnim - 117) / 11) * (2-(1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 2 + (((tickAnim - 128) / 25) * (0-(2)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (4-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 4 + (((tickAnim - 33) / 69) * (4-(4)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = 4 + (((tickAnim - 102) / 15) * (1-(4)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 1 + (((tickAnim - 117) / 11) * (1-(1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 1 + (((tickAnim - 128) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-3-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -3 + (((tickAnim - 33) / 69) * (-3-(-3)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -3 + (((tickAnim - 102) / 15) * (-1-(-3)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (0-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-2-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2 + (((tickAnim - 33) / 69) * (-2-(-2)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -2 + (((tickAnim - 102) / 15) * (2-(-2)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 2 + (((tickAnim - 117) / 11) * (2-(2)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 2 + (((tickAnim - 128) / 25) * (0-(2)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (4-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 4 + (((tickAnim - 33) / 69) * (4-(4)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = 4 + (((tickAnim - 102) / 15) * (-1-(4)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (1-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 1 + (((tickAnim - 128) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 101) {
            xx = 8 + (((tickAnim - 24) / 77) * (8-(8)));
            yy = 0 + (((tickAnim - 24) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 77) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 115) {
            xx = 8 + (((tickAnim - 101) / 14) * (11-(8)));
            yy = 0 + (((tickAnim - 101) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 14) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 128) {
            xx = 11 + (((tickAnim - 115) / 13) * (8-(11)));
            yy = 0 + (((tickAnim - 115) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 13) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 8 + (((tickAnim - 128) / 25) * (0-(8)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 1 + (((tickAnim - 6) / 5) * (0-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (3.8533-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.22141-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (-1.98771-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 3.8533 + (((tickAnim - 18) / 5) * (6-(3.8533)));
            yy = 0.22141 + (((tickAnim - 18) / 5) * (0-(0.22141)));
            zz = -1.98771 + (((tickAnim - 18) / 5) * (0-(-1.98771)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 23) / 10) * (10-(6)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 10 + (((tickAnim - 33) / 68) * (10-(10)));
            yy = 0 + (((tickAnim - 33) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 68) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 104) {
            xx = 10 + (((tickAnim - 101) / 3) * (5.25265-(10)));
            yy = 0 + (((tickAnim - 101) / 3) * (0.40505-(0)));
            zz = 0 + (((tickAnim - 101) / 3) * (-0.97255-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 109) {
            xx = 5.25265 + (((tickAnim - 104) / 5) * (10-(5.25265)));
            yy = 0.40505 + (((tickAnim - 104) / 5) * (0-(0.40505)));
            zz = -0.97255 + (((tickAnim - 104) / 5) * (0-(-0.97255)));
        }
        else if (tickAnim >= 109 && tickAnim < 113) {
            xx = 10 + (((tickAnim - 109) / 4) * (1.66098-(10)));
            yy = 0 + (((tickAnim - 109) / 4) * (0.21787-(0)));
            zz = 0 + (((tickAnim - 109) / 4) * (-0.99209-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 1.66098 + (((tickAnim - 113) / 4) * (-5-(1.66098)));
            yy = 0.21787 + (((tickAnim - 113) / 4) * (0-(0.21787)));
            zz = -0.99209 + (((tickAnim - 113) / 4) * (0-(-0.99209)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -5 + (((tickAnim - 117) / 11) * (-5-(-5)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = -5 + (((tickAnim - 128) / 25) * (0-(-5)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (14.69611-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.68061-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (4.95358-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 48) {
            xx = 14.69611 + (((tickAnim - 18) / 30) * (44-(14.69611)));
            yy = 0.68061 + (((tickAnim - 18) / 30) * (0-(0.68061)));
            zz = 4.95358 + (((tickAnim - 18) / 30) * (0-(4.95358)));
        }
        else if (tickAnim >= 48 && tickAnim < 101) {
            xx = 44 + (((tickAnim - 48) / 53) * (44-(44)));
            yy = 0 + (((tickAnim - 48) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 53) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 44 + (((tickAnim - 101) / 8) * (33-(44)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 33 + (((tickAnim - 109) / 8) * (25-(33)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 137) {
            xx = 25 + (((tickAnim - 117) / 20) * (-7-(25)));
            yy = 0 + (((tickAnim - 117) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 20) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 143) {
            xx = -7 + (((tickAnim - 137) / 6) * (-5.08-(-7)));
            yy = 0 + (((tickAnim - 137) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 6) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 151) {
            xx = -5.08 + (((tickAnim - 143) / 8) * (0-(-5.08)));
            yy = 0 + (((tickAnim - 143) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (8.90366-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0.42549-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (3.97734-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 8.90366 + (((tickAnim - 30) / 21) * (20-(8.90366)));
            yy = 0.42549 + (((tickAnim - 30) / 21) * (0-(0.42549)));
            zz = 3.97734 + (((tickAnim - 30) / 21) * (0-(3.97734)));
        }
        else if (tickAnim >= 51 && tickAnim < 101) {
            xx = 20 + (((tickAnim - 51) / 50) * (20-(20)));
            yy = 0 + (((tickAnim - 51) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 50) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 20 + (((tickAnim - 101) / 8) * (14-(20)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 14 + (((tickAnim - 109) / 8) * (9-(14)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 137) {
            xx = 9 + (((tickAnim - 117) / 20) * (1-(9)));
            yy = 0 + (((tickAnim - 117) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 20) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 146) {
            xx = 1 + (((tickAnim - 137) / 9) * (-3.58-(1)));
            yy = 0 + (((tickAnim - 137) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 9) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 152) {
            xx = -3.58 + (((tickAnim - 146) / 6) * (3.21-(-3.58)));
            yy = 0 + (((tickAnim - 146) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 6) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 158) {
            xx = 3.21 + (((tickAnim - 152) / 6) * (0-(3.21)));
            yy = 0 + (((tickAnim - 152) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 22 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 22) / 34) * (8.93728-(0)));
            yy = 0 + (((tickAnim - 22) / 34) * (-0.90272-(0)));
            zz = 0 + (((tickAnim - 22) / 34) * (7.94923-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 101) {
            xx = 8.93728 + (((tickAnim - 56) / 45) * (9-(8.93728)));
            yy = -0.90272 + (((tickAnim - 56) / 45) * (0-(-0.90272)));
            zz = 7.94923 + (((tickAnim - 56) / 45) * (0-(7.94923)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 9 + (((tickAnim - 101) / 8) * (2-(9)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 2 + (((tickAnim - 109) / 8) * (12-(2)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 137) {
            xx = 12 + (((tickAnim - 117) / 20) * (-15-(12)));
            yy = 0 + (((tickAnim - 117) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 20) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 146) {
            xx = -15 + (((tickAnim - 137) / 9) * (-2.25-(-15)));
            yy = 0 + (((tickAnim - 137) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 9) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 152) {
            xx = -2.25 + (((tickAnim - 146) / 6) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 146) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0.92702-(0)));
            yy = 0 + (((tickAnim - 25) / 26) * (1.78986-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (-4.66942-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 101) {
            xx = 0.92702 + (((tickAnim - 51) / 50) * (1-(0.92702)));
            yy = 1.78986 + (((tickAnim - 51) / 50) * (0-(1.78986)));
            zz = -4.66942 + (((tickAnim - 51) / 50) * (0-(-4.66942)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 1 + (((tickAnim - 101) / 8) * (-9-(1)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = -9 + (((tickAnim - 109) / 8) * (-10-(-9)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -10 + (((tickAnim - 117) / 11) * (-4.38-(-10)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 137) {
            xx = -4.38 + (((tickAnim - 128) / 9) * (-20-(-4.38)));
            yy = 0 + (((tickAnim - 128) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 9) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 151) {
            xx = -20 + (((tickAnim - 137) / 14) * (0-(-20)));
            yy = 0 + (((tickAnim - 137) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 31 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 31) / 27) * (-7-(0)));
            yy = 0 + (((tickAnim - 31) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 27) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 101) {
            xx = -7 + (((tickAnim - 58) / 43) * (-8-(-7)));
            yy = 0 + (((tickAnim - 58) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 43) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = -8 + (((tickAnim - 101) / 8) * (-13-(-8)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = -13 + (((tickAnim - 109) / 8) * (-4-(-13)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -4 + (((tickAnim - 117) / 11) * (10-(-4)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 137) {
            xx = 10 + (((tickAnim - 128) / 9) * (-6-(10)));
            yy = 0 + (((tickAnim - 128) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 9) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 153) {
            xx = -6 + (((tickAnim - 137) / 16) * (0-(-6)));
            yy = 0 + (((tickAnim - 137) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (-17-(0)));
            yy = 0 + (((tickAnim - 11) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 16) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 101) {
            xx = -17 + (((tickAnim - 27) / 74) * (-17-(-17)));
            yy = 0 + (((tickAnim - 27) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 74) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = -17 + (((tickAnim - 101) / 8) * (8-(-17)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 124) {
            xx = 8 + (((tickAnim - 109) / 15) * (12-(8)));
            yy = 0 + (((tickAnim - 109) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 15) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 12 + (((tickAnim - 124) / 4) * (15.5-(12)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 137) {
            xx = 15.5 + (((tickAnim - 128) / 9) * (-5-(15.5)));
            yy = 0 + (((tickAnim - 128) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 9) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 142) {
            xx = -5 + (((tickAnim - 137) / 5) * (9.67-(-5)));
            yy = 0 + (((tickAnim - 137) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 5) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 148) {
            xx = 9.67 + (((tickAnim - 142) / 6) * (0.83-(9.67)));
            yy = 0 + (((tickAnim - 142) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 6) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = 0.83 + (((tickAnim - 148) / 5) * (0-(0.83)));
            yy = 0 + (((tickAnim - 148) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.54777-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.72187-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.9817-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.54777 + (((tickAnim - 3) / 4) * (13.53998-(9.54777)));
            yy = -0.72187 + (((tickAnim - 3) / 4) * (-1.44374-(-0.72187)));
            zz = 2.9817 + (((tickAnim - 3) / 4) * (5.96341-(2.9817)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 13.53998 + (((tickAnim - 7) / 4) * (6.85189-(13.53998)));
            yy = -1.44374 + (((tickAnim - 7) / 4) * (19.75338-(-1.44374)));
            zz = 5.96341 + (((tickAnim - 7) / 4) * (9.26051-(5.96341)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 6.85189 + (((tickAnim - 11) / 7) * (-3.01808-(6.85189)));
            yy = 19.75338 + (((tickAnim - 11) / 7) * (22.1444-(19.75338)));
            zz = 9.26051 + (((tickAnim - 11) / 7) * (12.36935-(9.26051)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -3.01808 + (((tickAnim - 18) / 6) * (-12.87029-(-3.01808)));
            yy = 22.1444 + (((tickAnim - 18) / 6) * (24.59597-(22.1444)));
            zz = 12.36935 + (((tickAnim - 18) / 6) * (9.05791-(12.36935)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -12.87029 + (((tickAnim - 24) / 9) * (-15.87029-(-12.87029)));
            yy = 24.59597 + (((tickAnim - 24) / 9) * (24.59597-(24.59597)));
            zz = 9.05791 + (((tickAnim - 24) / 9) * (9.05791-(9.05791)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -15.87029 + (((tickAnim - 33) / 68) * (-15.87029-(-15.87029)));
            yy = 24.59597 + (((tickAnim - 33) / 68) * (24.59597-(24.59597)));
            zz = 9.05791 + (((tickAnim - 33) / 68) * (9.05791-(9.05791)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = -15.87029 + (((tickAnim - 101) / 5) * (-9.97519-(-15.87029)));
            yy = 24.59597 + (((tickAnim - 101) / 5) * (24.69403-(24.59597)));
            zz = 9.05791 + (((tickAnim - 101) / 5) * (14.55832-(9.05791)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = -9.97519 + (((tickAnim - 106) / 3) * (-3.87029-(-9.97519)));
            yy = 24.69403 + (((tickAnim - 106) / 3) * (24.59597-(24.69403)));
            zz = 14.55832 + (((tickAnim - 106) / 3) * (9.05791-(14.55832)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = -3.87029 + (((tickAnim - 109) / 3) * (4.06514-(-3.87029)));
            yy = 24.59597 + (((tickAnim - 109) / 3) * (17.07198-(24.59597)));
            zz = 9.05791 + (((tickAnim - 109) / 3) * (7.87966-(9.05791)));
        }
        else if (tickAnim >= 112 && tickAnim < 113) {
            xx = 4.06514 + (((tickAnim - 112) / 1) * (13.00057-(4.06514)));
            yy = 17.07198 + (((tickAnim - 112) / 1) * (9.54798-(17.07198)));
            zz = 7.87966 + (((tickAnim - 112) / 1) * (6.7014-(7.87966)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 13.00057 + (((tickAnim - 113) / 4) * (3.90373-(13.00057)));
            yy = 9.54798 + (((tickAnim - 113) / 4) * (-1.73801-(9.54798)));
            zz = 6.7014 + (((tickAnim - 113) / 4) * (4.93402-(6.7014)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 3.90373 + (((tickAnim - 117) / 6) * (5.84189-(3.90373)));
            yy = -1.73801 + (((tickAnim - 117) / 6) * (-5.63614-(-1.73801)));
            zz = 4.93402 + (((tickAnim - 117) / 6) * (4.03284-(4.93402)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 5.84189 + (((tickAnim - 123) / 5) * (7.04552-(5.84189)));
            yy = -5.63614 + (((tickAnim - 123) / 5) * (-8.55973-(-5.63614)));
            zz = 4.03284 + (((tickAnim - 123) / 5) * (3.35695-(4.03284)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 7.04552 + (((tickAnim - 128) / 25) * (0-(7.04552)));
            yy = -8.55973 + (((tickAnim - 128) / 25) * (0-(-8.55973)));
            zz = 3.35695 + (((tickAnim - 128) / 25) * (0-(3.35695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-32.72492-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.90604-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.89938-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -32.72492 + (((tickAnim - 3) / 4) * (-37.00539-(-32.72492)));
            yy = 3.90604 + (((tickAnim - 3) / 4) * (7.81208-(3.90604)));
            zz = -1.89938 + (((tickAnim - 3) / 4) * (-3.79876-(-1.89938)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -37.00539 + (((tickAnim - 7) / 4) * (-17.35597-(-37.00539)));
            yy = 7.81208 + (((tickAnim - 7) / 4) * (12.69463-(7.81208)));
            zz = -3.79876 + (((tickAnim - 7) / 4) * (-6.17298-(-3.79876)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -17.35597 + (((tickAnim - 11) / 7) * (-29.29392-(-17.35597)));
            yy = 12.69463 + (((tickAnim - 11) / 7) * (4.36081-(12.69463)));
            zz = -6.17298 + (((tickAnim - 11) / 7) * (-3.65573-(-6.17298)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -29.29392 + (((tickAnim - 18) / 6) * (-31.72102-(-29.29392)));
            yy = 4.36081 + (((tickAnim - 18) / 6) * (-5.39515-(4.36081)));
            zz = -3.65573 + (((tickAnim - 18) / 6) * (-5.91574-(-3.65573)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -31.72102 + (((tickAnim - 24) / 9) * (-36.72102-(-31.72102)));
            yy = -5.39515 + (((tickAnim - 24) / 9) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 24) / 9) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -36.72102 + (((tickAnim - 33) / 68) * (-36.72102-(-36.72102)));
            yy = -5.39515 + (((tickAnim - 33) / 68) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 33) / 68) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = -36.72102 + (((tickAnim - 101) / 5) * (-37.82447-(-36.72102)));
            yy = -5.39515 + (((tickAnim - 101) / 5) * (-3.85689-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 101) / 5) * (-4.63333-(-5.91574)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = -37.82447 + (((tickAnim - 106) / 3) * (-48.72102-(-37.82447)));
            yy = -3.85689 + (((tickAnim - 106) / 3) * (-5.39515-(-3.85689)));
            zz = -4.63333 + (((tickAnim - 106) / 3) * (-5.91574-(-4.63333)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = -48.72102 + (((tickAnim - 109) / 3) * (-55.57817-(-48.72102)));
            yy = -5.39515 + (((tickAnim - 109) / 3) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 109) / 3) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 112 && tickAnim < 113) {
            xx = -55.57817 + (((tickAnim - 112) / 1) * (-63.23531-(-55.57817)));
            yy = -5.39515 + (((tickAnim - 112) / 1) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 112) / 1) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = -63.23531 + (((tickAnim - 113) / 4) * (-34.72102-(-63.23531)));
            yy = -5.39515 + (((tickAnim - 113) / 4) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 113) / 4) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = -34.72102 + (((tickAnim - 117) / 6) * (-27.00674-(-34.72102)));
            yy = -5.39515 + (((tickAnim - 117) / 6) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 117) / 6) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = -27.00674 + (((tickAnim - 123) / 5) * (-21.72102-(-27.00674)));
            yy = -5.39515 + (((tickAnim - 123) / 5) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 123) / 5) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = -21.72102 + (((tickAnim - 128) / 25) * (0-(-21.72102)));
            yy = -5.39515 + (((tickAnim - 128) / 25) * (0-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 128) / 25) * (0-(-5.91574)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (18.72111-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.14292-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.04603-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 18.72111 + (((tickAnim - 3) / 4) * (45.3311-(18.72111)));
            yy = -0.14292 + (((tickAnim - 3) / 4) * (-0.28584-(-0.14292)));
            zz = -0.04603 + (((tickAnim - 3) / 4) * (-0.09206-(-0.04603)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 45.3311 + (((tickAnim - 7) / 4) * (12.8436-(45.3311)));
            yy = -0.28584 + (((tickAnim - 7) / 4) * (-0.4645-(-0.28584)));
            zz = -0.09206 + (((tickAnim - 7) / 4) * (-0.1496-(-0.09206)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 12.8436 + (((tickAnim - 11) / 7) * (29.97238-(12.8436)));
            yy = -0.4645 + (((tickAnim - 11) / 7) * (1.09866-(-0.4645)));
            zz = -0.1496 + (((tickAnim - 11) / 7) * (-1.13942-(-0.1496)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 29.97238 + (((tickAnim - 18) / 6) * (37.96143-(29.97238)));
            yy = 1.09866 + (((tickAnim - 18) / 6) * (2.31445-(1.09866)));
            zz = -1.13942 + (((tickAnim - 18) / 6) * (-1.90927-(-1.13942)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 37.96143 + (((tickAnim - 24) / 9) * (37.84544-(37.96143)));
            yy = 2.31445 + (((tickAnim - 24) / 9) * (4.62632-(2.31445)));
            zz = -1.90927 + (((tickAnim - 24) / 9) * (-3.82479-(-1.90927)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 37.84544 + (((tickAnim - 33) / 68) * (37.84544-(37.84544)));
            yy = 4.62632 + (((tickAnim - 33) / 68) * (4.62632-(4.62632)));
            zz = -3.82479 + (((tickAnim - 33) / 68) * (-3.82479-(-3.82479)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 37.84544 + (((tickAnim - 101) / 5) * (37.78945-(37.84544)));
            yy = 4.62632 + (((tickAnim - 101) / 5) * (5.39592-(4.62632)));
            zz = -3.82479 + (((tickAnim - 101) / 5) * (-4.46577-(-3.82479)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = 37.78945 + (((tickAnim - 106) / 3) * (37.84544-(37.78945)));
            yy = 5.39592 + (((tickAnim - 106) / 3) * (4.62632-(5.39592)));
            zz = -4.46577 + (((tickAnim - 106) / 3) * (-3.82479-(-4.46577)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = 37.84544 + (((tickAnim - 109) / 3) * (16.74675-(37.84544)));
            yy = 4.62632 + (((tickAnim - 109) / 3) * (3.30451-(4.62632)));
            zz = -3.82479 + (((tickAnim - 109) / 3) * (-2.73199-(-3.82479)));
        }
        else if (tickAnim >= 112 && tickAnim < 113) {
            xx = 16.74675 + (((tickAnim - 112) / 1) * (44.84805-(16.74675)));
            yy = 3.30451 + (((tickAnim - 112) / 1) * (1.98271-(3.30451)));
            zz = -2.73199 + (((tickAnim - 112) / 1) * (-1.6392-(-2.73199)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 44.84805 + (((tickAnim - 113) / 4) * (27-(44.84805)));
            yy = 1.98271 + (((tickAnim - 113) / 4) * (0-(1.98271)));
            zz = -1.6392 + (((tickAnim - 113) / 4) * (0-(-1.6392)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 27 + (((tickAnim - 117) / 6) * (20.29-(27)));
            yy = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 6) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 20.29 + (((tickAnim - 123) / 5) * (13-(20.29)));
            yy = 0 + (((tickAnim - 123) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 5) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 13 + (((tickAnim - 128) / 25) * (0-(13)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.60252-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.60097-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-4.05978-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0.60252 + (((tickAnim - 6) / 5) * (1.14553-(0.60252)));
            yy = 0.60097 + (((tickAnim - 6) / 5) * (0.43216-(0.60097)));
            zz = -4.05978 + (((tickAnim - 6) / 5) * (-3.88871-(-4.05978)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 1.14553 + (((tickAnim - 11) / 4) * (-0.32406-(1.14553)));
            yy = 0.43216 + (((tickAnim - 11) / 4) * (-11.84141-(0.43216)));
            zz = -3.88871 + (((tickAnim - 11) / 4) * (-6.72711-(-3.88871)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -0.32406 + (((tickAnim - 15) / 4) * (1.90326-(-0.32406)));
            yy = -11.84141 + (((tickAnim - 15) / 4) * (-17.10152-(-11.84141)));
            zz = -6.72711 + (((tickAnim - 15) / 4) * (-7.94357-(-6.72711)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 1.90326 + (((tickAnim - 19) / 5) * (-13.64209-(1.90326)));
            yy = -17.10152 + (((tickAnim - 19) / 5) * (-27.62172-(-17.10152)));
            zz = -7.94357 + (((tickAnim - 19) / 5) * (-10.37649-(-7.94357)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -13.64209 + (((tickAnim - 24) / 9) * (-13.64209-(-13.64209)));
            yy = -27.62172 + (((tickAnim - 24) / 9) * (-27.62172-(-27.62172)));
            zz = -10.37649 + (((tickAnim - 24) / 9) * (-10.37649-(-10.37649)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -13.64209 + (((tickAnim - 33) / 68) * (-13.64209-(-13.64209)));
            yy = -27.62172 + (((tickAnim - 33) / 68) * (-27.62172-(-27.62172)));
            zz = -10.37649 + (((tickAnim - 33) / 68) * (-10.37649-(-10.37649)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = -13.64209 + (((tickAnim - 101) / 2) * (-5.02873-(-13.64209)));
            yy = -27.62172 + (((tickAnim - 101) / 2) * (-19.51372-(-27.62172)));
            zz = -10.37649 + (((tickAnim - 101) / 2) * (-9.35613-(-10.37649)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = -5.02873 + (((tickAnim - 103) / 4) * (6.19131-(-5.02873)));
            yy = -19.51372 + (((tickAnim - 103) / 4) * (-7.35172-(-19.51372)));
            zz = -9.35613 + (((tickAnim - 103) / 4) * (-7.8256-(-9.35613)));
        }
        else if (tickAnim >= 107 && tickAnim < 109) {
            xx = 6.19131 + (((tickAnim - 107) / 2) * (-5.99533-(6.19131)));
            yy = -7.35172 + (((tickAnim - 107) / 2) * (0.75628-(-7.35172)));
            zz = -7.8256 + (((tickAnim - 107) / 2) * (-6.80525-(-7.8256)));
        }
        else if (tickAnim >= 109 && tickAnim < 113) {
            xx = -5.99533 + (((tickAnim - 109) / 4) * (-1.19591-(-5.99533)));
            yy = 0.75628 + (((tickAnim - 109) / 4) * (-0.08461-(0.75628)));
            zz = -6.80525 + (((tickAnim - 109) / 4) * (-1.17794-(-6.80525)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = -1.19591 + (((tickAnim - 113) / 3) * (2.84263-(-1.19591)));
            yy = -0.08461 + (((tickAnim - 113) / 3) * (0.6343-(-0.08461)));
            zz = -1.17794 + (((tickAnim - 113) / 3) * (-5.70763-(-1.17794)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = 2.84263 + (((tickAnim - 116) / 9) * (7.69269-(2.84263)));
            yy = 0.6343 + (((tickAnim - 116) / 9) * (0.46353-(0.6343)));
            zz = -5.70763 + (((tickAnim - 116) / 9) * (-4.17096-(-5.70763)));
        }
        else if (tickAnim >= 125 && tickAnim < 153) {
            xx = 7.69269 + (((tickAnim - 125) / 28) * (0-(7.69269)));
            yy = 0.46353 + (((tickAnim - 125) / 28) * (0-(0.46353)));
            zz = -4.17096 + (((tickAnim - 125) / 28) * (0-(-4.17096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-23.06703-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (4.78822-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (4.92614-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -23.06703 + (((tickAnim - 11) / 4) * (-44.35657-(-23.06703)));
            yy = 4.78822 + (((tickAnim - 11) / 4) * (6.99957-(4.78822)));
            zz = 4.92614 + (((tickAnim - 11) / 4) * (5.93843-(4.92614)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -44.35657 + (((tickAnim - 15) / 4) * (-51.26637-(-44.35657)));
            yy = 6.99957 + (((tickAnim - 15) / 4) * (7.94729-(6.99957)));
            zz = 5.93843 + (((tickAnim - 15) / 4) * (6.37227-(5.93843)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -51.26637 + (((tickAnim - 19) / 5) * (-30.58598-(-51.26637)));
            yy = 7.94729 + (((tickAnim - 19) / 5) * (9.84273-(7.94729)));
            zz = 6.37227 + (((tickAnim - 19) / 5) * (7.23996-(6.37227)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -30.58598 + (((tickAnim - 24) / 9) * (-36.58598-(-30.58598)));
            yy = 9.84273 + (((tickAnim - 24) / 9) * (9.84273-(9.84273)));
            zz = 7.23996 + (((tickAnim - 24) / 9) * (7.23996-(7.23996)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -36.58598 + (((tickAnim - 33) / 68) * (-36.58598-(-36.58598)));
            yy = 9.84273 + (((tickAnim - 33) / 68) * (9.84273-(9.84273)));
            zz = 7.23996 + (((tickAnim - 33) / 68) * (7.23996-(7.23996)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = -36.58598 + (((tickAnim - 101) / 2) * (-51.38064-(-36.58598)));
            yy = 9.84273 + (((tickAnim - 101) / 2) * (9.42463-(9.84273)));
            zz = 7.23996 + (((tickAnim - 101) / 2) * (7.63447-(7.23996)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = -51.38064 + (((tickAnim - 103) / 4) * (-57.17264-(-51.38064)));
            yy = 9.42463 + (((tickAnim - 103) / 4) * (8.79749-(9.42463)));
            zz = 7.63447 + (((tickAnim - 103) / 4) * (8.22623-(7.63447)));
        }
        else if (tickAnim >= 107 && tickAnim < 109) {
            xx = -57.17264 + (((tickAnim - 107) / 2) * (-49.3673-(-57.17264)));
            yy = 8.79749 + (((tickAnim - 107) / 2) * (8.37939-(8.79749)));
            zz = 8.22623 + (((tickAnim - 107) / 2) * (8.62074-(8.22623)));
        }
        else if (tickAnim >= 109 && tickAnim < 116) {
            xx = -49.3673 + (((tickAnim - 109) / 7) * (-34.53387-(-49.3673)));
            yy = 8.37939 + (((tickAnim - 109) / 7) * (7.02788-(8.37939)));
            zz = 8.62074 + (((tickAnim - 109) / 7) * (7.2303-(8.62074)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = -34.53387 + (((tickAnim - 116) / 7) * (-25.9312-(-34.53387)));
            yy = 7.02788 + (((tickAnim - 116) / 7) * (5.67636-(7.02788)));
            zz = 7.2303 + (((tickAnim - 116) / 7) * (5.83986-(7.2303)));
        }
        else if (tickAnim >= 123 && tickAnim < 153) {
            xx = -25.9312 + (((tickAnim - 123) / 30) * (0-(-25.9312)));
            yy = 5.67636 + (((tickAnim - 123) / 30) * (0-(5.67636)));
            zz = 5.83986 + (((tickAnim - 123) / 30) * (0-(5.83986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (18.54915-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.13563-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-1.28444-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 18.54915 + (((tickAnim - 11) / 4) * (31.83041-(18.54915)));
            yy = 1.13563 + (((tickAnim - 11) / 4) * (-1.66184-(1.13563)));
            zz = -1.28444 + (((tickAnim - 11) / 4) * (1.3125-(-1.28444)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 31.83041 + (((tickAnim - 15) / 4) * (43.64142-(31.83041)));
            yy = -1.66184 + (((tickAnim - 15) / 4) * (-2.86076-(-1.66184)));
            zz = 1.3125 + (((tickAnim - 15) / 4) * (2.42547-(1.3125)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 43.64142 + (((tickAnim - 19) / 5) * (39.76345-(43.64142)));
            yy = -2.86076 + (((tickAnim - 19) / 5) * (-5.25859-(-2.86076)));
            zz = 2.42547 + (((tickAnim - 19) / 5) * (4.65142-(2.42547)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 39.76345 + (((tickAnim - 24) / 9) * (29.76345-(39.76345)));
            yy = -5.25859 + (((tickAnim - 24) / 9) * (-5.25859-(-5.25859)));
            zz = 4.65142 + (((tickAnim - 24) / 9) * (4.65142-(4.65142)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 29.76345 + (((tickAnim - 33) / 68) * (29.76345-(29.76345)));
            yy = -5.25859 + (((tickAnim - 33) / 68) * (-5.25859-(-5.25859)));
            zz = 4.65142 + (((tickAnim - 33) / 68) * (4.65142-(4.65142)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 29.76345 + (((tickAnim - 101) / 2) * (47.53418-(29.76345)));
            yy = -5.25859 + (((tickAnim - 101) / 2) * (-3.18832-(-5.25859)));
            zz = 4.65142 + (((tickAnim - 101) / 2) * (2.68022-(4.65142)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = 47.53418 + (((tickAnim - 103) / 4) * (46.59028-(47.53418)));
            yy = -3.18832 + (((tickAnim - 103) / 4) * (-0.08292-(-3.18832)));
            zz = 2.68022 + (((tickAnim - 103) / 4) * (-0.27657-(2.68022)));
        }
        else if (tickAnim >= 107 && tickAnim < 109) {
            xx = 46.59028 + (((tickAnim - 107) / 2) * (35.96101-(46.59028)));
            yy = -0.08292 + (((tickAnim - 107) / 2) * (1.98735-(-0.08292)));
            zz = -0.27657 + (((tickAnim - 107) / 2) * (-2.24777-(-0.27657)));
        }
        else if (tickAnim >= 109 && tickAnim < 116) {
            xx = 35.96101 + (((tickAnim - 109) / 7) * (27.64472-(35.96101)));
            yy = 1.98735 + (((tickAnim - 109) / 7) * (1.66681-(1.98735)));
            zz = -2.24777 + (((tickAnim - 109) / 7) * (-1.88523-(-2.24777)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 27.64472 + (((tickAnim - 116) / 7) * (18.63612-(27.64472)));
            yy = 1.66681 + (((tickAnim - 116) / 7) * (1.34627-(1.66681)));
            zz = -1.88523 + (((tickAnim - 116) / 7) * (-1.52268-(-1.88523)));
        }
        else if (tickAnim >= 123 && tickAnim < 153) {
            xx = 18.63612 + (((tickAnim - 123) / 30) * (0-(18.63612)));
            yy = 1.34627 + (((tickAnim - 123) / 30) * (0-(1.34627)));
            zz = -1.52268 + (((tickAnim - 123) / 30) * (0-(-1.52268)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8+50))*2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8+50))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8+50))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8))*1.5));

        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-70))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-70))*4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-70))*3));

        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLeafGrazeUpwards(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;

        int animCycle = 90;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (-2.8-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = -2.8 + (((tickAnim - 33) / 27) * (-2.8-(-2.8)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = -2.8 + (((tickAnim - 60) / 13) * (0-(-2.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 5 + (((tickAnim - 33) / 4) * (-1-(5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -1 + (((tickAnim - 37) / 5) * (-9-(-1)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = -9 + (((tickAnim - 42) / 5) * (-10-(-9)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = -10 + (((tickAnim - 47) / 5) * (-5-(-10)));
            yy = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 67) {
            xx = -5 + (((tickAnim - 52) / 15) * (-5-(-5)));
            yy = 0 + (((tickAnim - 52) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 15) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = -5 + (((tickAnim - 67) / 5) * (-11.64-(-5)));
            yy = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = -11.64 + (((tickAnim - 72) / 6) * (1.18-(-11.64)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = 1.18 + (((tickAnim - 78) / 7) * (0-(1.18)));
            yy = 0 + (((tickAnim - 78) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (11-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 11 + (((tickAnim - 37) / 5) * (18-(11)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 18 + (((tickAnim - 42) / 5) * (-13-(18)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = -13 + (((tickAnim - 47) / 5) * (-8-(-13)));
            yy = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 67) {
            xx = -8 + (((tickAnim - 52) / 15) * (-8-(-8)));
            yy = 0 + (((tickAnim - 52) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 15) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = -8 + (((tickAnim - 67) / 5) * (10.18-(-8)));
            yy = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 10.18 + (((tickAnim - 72) / 6) * (10.09-(10.18)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = 10.09 + (((tickAnim - 78) / 7) * (0-(10.09)));
            yy = 0 + (((tickAnim - 78) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (-4-(0)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -4 + (((tickAnim - 33) / 4) * (2-(-4)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 2 + (((tickAnim - 37) / 5) * (-16-(2)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = -16 + (((tickAnim - 42) / 5) * (24-(-16)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 24 + (((tickAnim - 47) / 5) * (13-(24)));
            yy = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 67) {
            xx = 13 + (((tickAnim - 52) / 15) * (13-(13)));
            yy = 0 + (((tickAnim - 52) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 15) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 13 + (((tickAnim - 67) / 5) * (5.45-(13)));
            yy = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 76) {
            xx = 5.45 + (((tickAnim - 72) / 4) * (-13.12-(5.45)));
            yy = 0 + (((tickAnim - 72) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 4) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 78) {
            xx = -13.12 + (((tickAnim - 76) / 2) * (-16.27-(-13.12)));
            yy = 0 + (((tickAnim - 76) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 2) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = -16.27 + (((tickAnim - 78) / 7) * (0-(-16.27)));
            yy = 0 + (((tickAnim - 78) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-7-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -7 + (((tickAnim - 17) / 6) * (-2.5-(-7)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 23) / 4) * (-13.39-(-2.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -13.39 + (((tickAnim - 27) / 6) * (0-(-13.39)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 15) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 48) / 9) * (-5.2669-(0)));
            yy = 0 + (((tickAnim - 48) / 9) * (-0.6618-(0)));
            zz = 0 + (((tickAnim - 48) / 9) * (2.92616-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 68) {
            xx = -5.2669 + (((tickAnim - 57) / 11) * (6-(-5.2669)));
            yy = -0.6618 + (((tickAnim - 57) / 11) * (0-(-0.6618)));
            zz = 2.92616 + (((tickAnim - 57) / 11) * (0-(2.92616)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = 6 + (((tickAnim - 68) / 17) * (0-(6)));
            yy = 0 + (((tickAnim - 68) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (14-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 14 + (((tickAnim - 17) / 6) * (22-(14)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 22 + (((tickAnim - 23) / 4) * (27.44-(22)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 27.44 + (((tickAnim - 27) / 6) * (0-(27.44)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 15) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 48) / 9) * (15.54-(0)));
            yy = 0 + (((tickAnim - 48) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 9) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = 15.54 + (((tickAnim - 57) / 5) * (14.91-(15.54)));
            yy = 0 + (((tickAnim - 57) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 5) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 14.91 + (((tickAnim - 62) / 6) * (-1-(14.91)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 6) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = -1 + (((tickAnim - 68) / 17) * (0-(-1)));
            yy = 0 + (((tickAnim - 68) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 17) / 6) * (5.5-(5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 5.5 + (((tickAnim - 23) / 4) * (-15.72-(5.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -15.72 + (((tickAnim - 27) / 6) * (0-(-15.72)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 15) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 48) / 9) * (-13.92-(0)));
            yy = 0 + (((tickAnim - 48) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 9) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = -13.92 + (((tickAnim - 57) / 5) * (-3.42-(-13.92)));
            yy = 0 + (((tickAnim - 57) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 5) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -3.42 + (((tickAnim - 62) / 6) * (-2-(-3.42)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 6) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = -2 + (((tickAnim - 68) / 17) * (0-(-2)));
            yy = 0 + (((tickAnim - 68) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.2917+50))*2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.2917+50))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.2917+50))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.2917))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.2917))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.2917))*1.5));

        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.2917-70))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.2917-70))*4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.2917-70))*3));

        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 48) {
            xx = -1 + (((tickAnim - 9) / 39) * (-1-(-1)));
            yy = 0 + (((tickAnim - 9) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 39) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 68) {
            xx = -1 + (((tickAnim - 48) / 20) * (-1-(-1)));
            yy = 0 + (((tickAnim - 48) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 20) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = -1 + (((tickAnim - 68) / 17) * (0-(-1)));
            yy = 0 + (((tickAnim - 68) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2 + (((tickAnim - 5) / 4) * (0-(2)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 58) {
            xx = 2 + (((tickAnim - 18) / 40) * (-11-(2)));
            yy = 0 + (((tickAnim - 18) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 40) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -11 + (((tickAnim - 58) / 5) * (3.25-(-11)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = 3.25 + (((tickAnim - 63) / 8) * (11.84-(3.25)));
            yy = 0 + (((tickAnim - 63) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 8) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = 11.84 + (((tickAnim - 71) / 7) * (15.82-(11.84)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = 15.82 + (((tickAnim - 78) / 12) * (0-(15.82)));
            yy = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 58) {
            xx = 3 + (((tickAnim - 18) / 40) * (-7-(3)));
            yy = 0 + (((tickAnim - 18) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 40) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -7 + (((tickAnim - 58) / 5) * (-5.21-(-7)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = -5.21 + (((tickAnim - 63) / 8) * (2.46-(-5.21)));
            yy = 0 + (((tickAnim - 63) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 8) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = 2.46 + (((tickAnim - 71) / 7) * (7.04-(2.46)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = 7.04 + (((tickAnim - 78) / 12) * (0-(7.04)));
            yy = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 58) {
            xx = 4 + (((tickAnim - 18) / 40) * (-4-(4)));
            yy = 0 + (((tickAnim - 18) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 40) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -4 + (((tickAnim - 58) / 5) * (-9.55-(-4)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = -9.55 + (((tickAnim - 63) / 8) * (-18.33-(-9.55)));
            yy = 0 + (((tickAnim - 63) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 8) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = -18.33 + (((tickAnim - 71) / 7) * (-6.2-(-18.33)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = -6.2 + (((tickAnim - 78) / 12) * (0-(-6.2)));
            yy = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 58) {
            xx = 9 + (((tickAnim - 18) / 40) * (-20-(9)));
            yy = 0 + (((tickAnim - 18) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 40) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -20 + (((tickAnim - 58) / 5) * (-28.74-(-20)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = -28.74 + (((tickAnim - 63) / 8) * (-34.07-(-28.74)));
            yy = 0 + (((tickAnim - 63) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 8) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = -34.07 + (((tickAnim - 71) / 7) * (-14.25-(-34.07)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = -14.25 + (((tickAnim - 78) / 12) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 58) {
            xx = 9 + (((tickAnim - 18) / 40) * (-24-(9)));
            yy = 0 + (((tickAnim - 18) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 40) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -24 + (((tickAnim - 58) / 5) * (-25.28-(-24)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = -25.28 + (((tickAnim - 63) / 8) * (-27.05-(-25.28)));
            yy = 0 + (((tickAnim - 63) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 8) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = -27.05 + (((tickAnim - 71) / 7) * (-6.43-(-27.05)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = -6.43 + (((tickAnim - 78) / 12) * (0-(-6.43)));
            yy = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 58) {
            xx = 4 + (((tickAnim - 7) / 51) * (-17-(4)));
            yy = 0 + (((tickAnim - 7) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 51) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -17 + (((tickAnim - 58) / 5) * (-24.07-(-17)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 71) {
            xx = -24.07 + (((tickAnim - 63) / 8) * (-14.15-(-24.07)));
            yy = 0 + (((tickAnim - 63) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 8) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = -14.15 + (((tickAnim - 71) / 7) * (3.27-(-14.15)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = 3.27 + (((tickAnim - 78) / 12) * (0-(3.27)));
            yy = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (22-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 22 + (((tickAnim - 60) / 3) * (0-(22)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.09-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -2.09 + (((tickAnim - 5) / 4) * (-2-(-2.09)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 9) / 4) * (-2-(-2)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 13) / 20) * (2-(-2)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 2 + (((tickAnim - 33) / 27) * (2-(2)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 2 + (((tickAnim - 60) / 13) * (0-(2)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.55-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 5.55 + (((tickAnim - 5) / 4) * (12-(5.55)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 12 + (((tickAnim - 9) / 4) * (12-(12)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 13) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 12 + (((tickAnim - 33) / 27) * (12-(12)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 12 + (((tickAnim - 60) / 13) * (0-(12)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.73-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.73 + (((tickAnim - 5) / 4) * (-5-(-0.73)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 9) / 4) * (-5-(-5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 13) / 20) * (-12-(-5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = -12 + (((tickAnim - 33) / 27) * (-12-(-12)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = -12 + (((tickAnim - 60) / 13) * (0-(-12)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.09-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -2.09 + (((tickAnim - 5) / 4) * (-2-(-2.09)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 9) / 4) * (-2-(-2)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 13) / 20) * (2-(-2)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 2 + (((tickAnim - 33) / 27) * (2-(2)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 2 + (((tickAnim - 60) / 13) * (0-(2)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.55-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 5.55 + (((tickAnim - 5) / 4) * (12-(5.55)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 12 + (((tickAnim - 9) / 4) * (12-(12)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 13) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 12 + (((tickAnim - 33) / 27) * (12-(12)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 12 + (((tickAnim - 60) / 13) * (0-(12)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.73-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.73 + (((tickAnim - 5) / 4) * (-5-(-0.73)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 9) / 4) * (-5-(-5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 13) / 20) * (-12-(-5)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = -12 + (((tickAnim - 33) / 27) * (-12-(-12)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = -12 + (((tickAnim - 60) / 13) * (0-(-12)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;
        int animCycle = 39;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-3-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = -3 + (((tickAnim - 11) / 4) * (3-(-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 3 + (((tickAnim - 15) / 4) * (0-(3)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (2-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 2 + (((tickAnim - 21) / 2) * (0-(2)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (-3-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = -3 + (((tickAnim - 26) / 2) * (4-(-3)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 4 + (((tickAnim - 28) / 3) * (-2-(4)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = -2 + (((tickAnim - 31) / 2) * (0-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (2-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 2 + (((tickAnim - 11) / 4) * (-1.8-(2)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = -1.8 + (((tickAnim - 15) / 4) * (0-(-1.8)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (-2-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = -2 + (((tickAnim - 21) / 2) * (0-(-2)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (2-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 2 + (((tickAnim - 26) / 2) * (-1.8-(2)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = -1.8 + (((tickAnim - 28) / 3) * (2-(-1.8)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 2 + (((tickAnim - 31) / 2) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (2-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 2 + (((tickAnim - 11) / 4) * (-1-(2)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = -1 + (((tickAnim - 15) / 4) * (0-(-1)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (7-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 7 + (((tickAnim - 26) / 2) * (-2-(7)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = -2 + (((tickAnim - 28) / 3) * (4-(-2)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 4 + (((tickAnim - 31) / 2) * (-3-(4)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = -3 + (((tickAnim - 33) / 3) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-1.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = -1.5 + (((tickAnim - 15) / 2) * (-1-(-1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 17) / 5) * (0-(-1)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (1-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 1 + (((tickAnim - 26) / 2) * (-1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = -1 + (((tickAnim - 28) / 3) * (0-(-1)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 12 + (((tickAnim - 4) / 4) * (10.33-(12)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10.33 + (((tickAnim - 8) / 1) * (-4-(10.33)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -4 + (((tickAnim - 9) / 5) * (-8-(-4)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8 + (((tickAnim - 14) / 4) * (-8.37671-(-8)));
            yy = 0 + (((tickAnim - 14) / 4) * (-0.06541-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (1.87386-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -8.37671 + (((tickAnim - 18) / 3) * (0-(-8.37671)));
            yy = -0.06541 + (((tickAnim - 18) / 3) * (0-(-0.06541)));
            zz = 1.87386 + (((tickAnim - 18) / 3) * (0-(1.87386)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0.03289-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (-1.82606-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (-0.98531-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0.03289 + (((tickAnim - 24) / 2) * (-0.00373-(0.03289)));
            yy = -1.82606 + (((tickAnim - 24) / 2) * (-0.76058-(-1.82606)));
            zz = -0.98531 + (((tickAnim - 24) / 2) * (1.47702-(-0.98531)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -0.00373 + (((tickAnim - 26) / 2) * (3-(-0.00373)));
            yy = -0.76058 + (((tickAnim - 26) / 2) * (1-(-0.76058)));
            zz = 1.47702 + (((tickAnim - 26) / 2) * (0-(1.47702)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 28) / 0) * (2.00997-(3)));
            yy = 1 + (((tickAnim - 28) / 0) * (-0.08397-(1)));
            zz = 0 + (((tickAnim - 28) / 0) * (-1.95628-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 2.00997 + (((tickAnim - 28) / 3) * (-1-(2.00997)));
            yy = -0.08397 + (((tickAnim - 28) / 3) * (-5-(-0.08397)));
            zz = -1.95628 + (((tickAnim - 28) / 3) * (0-(-1.95628)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -1 + (((tickAnim - 31) / 3) * (-2-(-1)));
            yy = -5 + (((tickAnim - 31) / 3) * (0-(-5)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -16 + (((tickAnim - 4) / 4) * (-27.5-(-16)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -27.5 + (((tickAnim - 8) / 3) * (-19-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -19 + (((tickAnim - 11) / 5) * (-11-(-19)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -11 + (((tickAnim - 16) / 2) * (5-(-11)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 5 + (((tickAnim - 18) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (-0.02717-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (6.12146-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0.10944-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -0.02717 + (((tickAnim - 24) / 2) * (3.98642-(-0.02717)));
            yy = 6.12146 + (((tickAnim - 24) / 2) * (3.06073-(6.12146)));
            zz = 0.10944 + (((tickAnim - 24) / 2) * (0.05472-(0.10944)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 3.98642 + (((tickAnim - 26) / 2) * (-3-(3.98642)));
            yy = 3.06073 + (((tickAnim - 26) / 2) * (0-(3.06073)));
            zz = 0.05472 + (((tickAnim - 26) / 2) * (0-(0.05472)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -3 + (((tickAnim - 28) / 3) * (6.80234-(-3)));
            yy = 0 + (((tickAnim - 28) / 3) * (5.56371-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (-1.96182-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 6.80234 + (((tickAnim - 31) / 3) * (6-(6.80234)));
            yy = 5.56371 + (((tickAnim - 31) / 3) * (0-(5.56371)));
            zz = -1.96182 + (((tickAnim - 31) / 3) * (0-(-1.96182)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 4) / 4) * (28-(20)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 28 + (((tickAnim - 8) / 3) * (-1.27135-(28)));
            yy = 0 + (((tickAnim - 8) / 3) * (-20.63216-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-4.00153-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -1.27135 + (((tickAnim - 11) / 5) * (-10.9665-(-1.27135)));
            yy = -20.63216 + (((tickAnim - 11) / 5) * (-11.99583-(-20.63216)));
            zz = -4.00153 + (((tickAnim - 11) / 5) * (-0.3188-(-4.00153)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -10.9665 + (((tickAnim - 16) / 5) * (0-(-10.9665)));
            yy = -11.99583 + (((tickAnim - 16) / 5) * (0-(-11.99583)));
            zz = -0.3188 + (((tickAnim - 16) / 5) * (0-(-0.3188)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (-4-(0)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -4 + (((tickAnim - 26) / 2) * (0-(-4)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (-7-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -7 + (((tickAnim - 31) / 3) * (-1-(-7)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.9583+50))*2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.9583+50))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.9583+50))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.9583))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.9583))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.9583))*1.5));

        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.9583-70))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.9583-70))*4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.9583-70))*3));

        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (6-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 6 + (((tickAnim - 28) / 3) * (-6-(6)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = -6 + (((tickAnim - 31) / 3) * (7-(-6)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 7 + (((tickAnim - 34) / 4) * (0-(7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (-0.0061-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (3.99619-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (-3.17476-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -0.0061 + (((tickAnim - 25) / 1) * (-0.34581-(-0.0061)));
            yy = 3.99619 + (((tickAnim - 25) / 1) * (6.15364-(3.99619)));
            zz = -3.17476 + (((tickAnim - 25) / 1) * (-6.96148-(-3.17476)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -0.34581 + (((tickAnim - 26) / 2) * (-0.345-(-0.34581)));
            yy = 6.15364 + (((tickAnim - 26) / 2) * (3.76264-(6.15364)));
            zz = -6.96148 + (((tickAnim - 26) / 2) * (-8.18078-(-6.96148)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = -0.345 + (((tickAnim - 28) / 0) * (-0.04833-(-0.345)));
            yy = 3.76264 + (((tickAnim - 28) / 0) * (0.95615-(3.76264)));
            zz = -8.18078 + (((tickAnim - 28) / 0) * (-3.5586-(-8.18078)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -0.04833 + (((tickAnim - 28) / 3) * (0.7033-(-0.04833)));
            yy = 0.95615 + (((tickAnim - 28) / 3) * (1.17024-(0.95615)));
            zz = -3.5586 + (((tickAnim - 28) / 3) * (1.92317-(-3.5586)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0.7033 + (((tickAnim - 31) / 2) * (0.59835-(0.7033)));
            yy = 1.17024 + (((tickAnim - 31) / 2) * (-0.89358-(1.17024)));
            zz = 1.92317 + (((tickAnim - 31) / 2) * (-0.01094-(1.92317)));
        }
        else if (tickAnim >= 33 && tickAnim < 33) {
            xx = 0.59835 + (((tickAnim - 33) / 0) * (0.50869-(0.59835)));
            yy = -0.89358 + (((tickAnim - 33) / 0) * (-1.92293-(-0.89358)));
            zz = -0.01094 + (((tickAnim - 33) / 0) * (-0.97532-(-0.01094)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0.50869 + (((tickAnim - 33) / 1) * (0.55797-(0.50869)));
            yy = -1.92293 + (((tickAnim - 33) / 1) * (0.90885-(-1.92293)));
            zz = -0.97532 + (((tickAnim - 33) / 1) * (-6.07389-(-0.97532)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0.55797 + (((tickAnim - 34) / 4) * (0-(0.55797)));
            yy = 0.90885 + (((tickAnim - 34) / 4) * (0-(0.90885)));
            zz = -6.07389 + (((tickAnim - 34) / 4) * (0-(-6.07389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;
        int animCycle = 93;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 11 + (((tickAnim - 18) / 45) * (11-(11)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 11 + (((tickAnim - 63) / 23) * (0-(11)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (7.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            yy = -5.7 + (((tickAnim - 18) / 45) * (-5.7-(-5.7)));
            zz = 7.1 + (((tickAnim - 18) / 45) * (7.1-(7.1)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            yy = -5.7 + (((tickAnim - 63) / 23) * (0-(-5.7)));
            zz = 7.1 + (((tickAnim - 63) / 23) * (0-(7.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = -30 + (((tickAnim - 18) / 45) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = -30 + (((tickAnim - 63) / 23) * (0-(-30)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 17 + (((tickAnim - 18) / 45) * (17-(17)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 17 + (((tickAnim - 63) / 23) * (0-(17)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 2 + (((tickAnim - 18) / 45) * (2-(2)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 2 + (((tickAnim - 63) / 23) * (0-(2)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = -30 + (((tickAnim - 18) / 45) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = -30 + (((tickAnim - 63) / 23) * (0-(-30)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 17 + (((tickAnim - 18) / 45) * (17-(17)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 17 + (((tickAnim - 63) / 23) * (0-(17)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 63) {
            xx = 2 + (((tickAnim - 18) / 45) * (2-(2)));
            yy = 0 + (((tickAnim - 18) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 45) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 86) {
            xx = 2 + (((tickAnim - 63) / 23) * (0-(2)));
            yy = 0 + (((tickAnim - 63) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667+50))*2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667+50))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667+50))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667))*1.5));

        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-70))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-70))*4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/4.6667-70))*3));

        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-7-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = -7 + (((tickAnim - 18) / 12) * (0-(-7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 28 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 28) / 13) * (44-(0)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 59) {
            xx = 44 + (((tickAnim - 41) / 18) * (44-(44)));
            yy = 0 + (((tickAnim - 41) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 18) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = 44 + (((tickAnim - 59) / 14) * (18.71-(44)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = 18.71 + (((tickAnim - 73) / 11) * (0-(18.71)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (16.6-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 59) {
            xx = 16.6 + (((tickAnim - 43) / 16) * (16.6-(16.6)));
            yy = 0 + (((tickAnim - 43) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 16) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = 16.6 + (((tickAnim - 59) / 14) * (-2.19-(16.6)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = -2.19 + (((tickAnim - 73) / 11) * (0-(-2.19)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 39 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 39) / 9) * (15-(0)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 59) {
            xx = 15 + (((tickAnim - 48) / 11) * (15-(15)));
            yy = 0 + (((tickAnim - 48) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 11) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = 15 + (((tickAnim - 59) / 14) * (-5.94-(15)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = -5.94 + (((tickAnim - 73) / 11) * (0-(-5.94)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (2-(0)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 59) {
            xx = 2 + (((tickAnim - 52) / 7) * (2-(2)));
            yy = 0 + (((tickAnim - 52) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 7) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = 2 + (((tickAnim - 59) / 14) * (-15.06-(2)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = -15.06 + (((tickAnim - 73) / 11) * (0-(-15.06)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 44 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 44) / 12) * (-8-(0)));
            yy = 0 + (((tickAnim - 44) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 12) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 59) {
            xx = -8 + (((tickAnim - 56) / 3) * (-8-(-8)));
            yy = 0 + (((tickAnim - 56) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 3) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = -8 + (((tickAnim - 59) / 14) * (1.71-(-8)));
            yy = 0 + (((tickAnim - 59) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 14) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = 1.71 + (((tickAnim - 73) / 11) * (-1-(1.71)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (-9-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = -9 + (((tickAnim - 53) / 17) * (-24-(-9)));
            yy = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = -24 + (((tickAnim - 70) / 14) * (0-(-24)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (35-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 35 + (((tickAnim - 53) / 6) * (0-(35)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (18.76103-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (5.87455-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (2.64424-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 18.76103 + (((tickAnim - 6) / 5) * (20.80467-(18.76103)));
            yy = 5.87455 + (((tickAnim - 6) / 5) * (11.35747-(5.87455)));
            zz = 2.64424 + (((tickAnim - 6) / 5) * (5.1122-(2.64424)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 20.80467 + (((tickAnim - 11) / 7) * (12.9511-(20.80467)));
            yy = 11.35747 + (((tickAnim - 11) / 7) * (17.0013-(11.35747)));
            zz = 5.1122 + (((tickAnim - 11) / 7) * (15.57186-(5.1122)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.9511 + (((tickAnim - 18) / 2) * (12.86097-(12.9511)));
            yy = 17.0013 + (((tickAnim - 18) / 2) * (21.42505-(17.0013)));
            zz = 15.57186 + (((tickAnim - 18) / 2) * (15.23441-(15.57186)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 12.86097 + (((tickAnim - 20) / 2) * (11.81437-(12.86097)));
            yy = 21.42505 + (((tickAnim - 20) / 2) * (17.58946-(21.42505)));
            zz = 15.23441 + (((tickAnim - 20) / 2) * (12.05653-(15.23441)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 11.81437 + (((tickAnim - 22) / 1) * (12.9511-(11.81437)));
            yy = 17.58946 + (((tickAnim - 22) / 1) * (17.0013-(17.58946)));
            zz = 12.05653 + (((tickAnim - 22) / 1) * (15.57186-(12.05653)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 12.9511 + (((tickAnim - 23) / 7) * (9.76723-(12.9511)));
            yy = 17.0013 + (((tickAnim - 23) / 7) * (20.65288-(17.0013)));
            zz = 15.57186 + (((tickAnim - 23) / 7) * (5.73266-(15.57186)));
        }
        else if (tickAnim >= 30 && tickAnim < 63) {
            xx = 9.76723 + (((tickAnim - 30) / 33) * (9.76723-(9.76723)));
            yy = 20.65288 + (((tickAnim - 30) / 33) * (20.65288-(20.65288)));
            zz = 5.73266 + (((tickAnim - 30) / 33) * (5.73266-(5.73266)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 9.76723 + (((tickAnim - 63) / 4) * (14.21761-(9.76723)));
            yy = 20.65288 + (((tickAnim - 63) / 4) * (14.377-(20.65288)));
            zz = 5.73266 + (((tickAnim - 63) / 4) * (4.00045-(5.73266)));
        }
        else if (tickAnim >= 67 && tickAnim < 69) {
            xx = 14.21761 + (((tickAnim - 67) / 2) * (17.8054-(14.21761)));
            yy = 14.377 + (((tickAnim - 67) / 2) * (9.67009-(14.377)));
            zz = 4.00045 + (((tickAnim - 67) / 2) * (2.70129-(4.00045)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = 17.8054 + (((tickAnim - 69) / 4) * (5.11838-(17.8054)));
            yy = 9.67009 + (((tickAnim - 69) / 4) * (1.82524-(9.67009)));
            zz = 2.70129 + (((tickAnim - 69) / 4) * (0.53603-(2.70129)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 5.11838 + (((tickAnim - 73) / 2) * (4.52346-(5.11838)));
            yy = 1.82524 + (((tickAnim - 73) / 2) * (6.42325-(1.82524)));
            zz = 0.53603 + (((tickAnim - 73) / 2) * (1.71743-(0.53603)));
        }
        else if (tickAnim >= 75 && tickAnim < 77) {
            xx = 4.52346 + (((tickAnim - 75) / 2) * (3.76487-(4.52346)));
            yy = 6.42325 + (((tickAnim - 75) / 2) * (0.57913-(6.42325)));
            zz = 1.71743 + (((tickAnim - 75) / 2) * (0.25958-(1.71743)));
        }
        else if (tickAnim >= 77 && tickAnim < 78) {
            xx = 3.76487 + (((tickAnim - 77) / 1) * (3.10331-(3.76487)));
            yy = 0.57913 + (((tickAnim - 77) / 1) * (3.3959-(0.57913)));
            zz = 0.25958 + (((tickAnim - 77) / 1) * (0.89223-(0.25958)));
        }
        else if (tickAnim >= 78 && tickAnim < 86) {
            xx = 3.10331 + (((tickAnim - 78) / 8) * (0-(3.10331)));
            yy = 3.3959 + (((tickAnim - 78) / 8) * (0-(3.3959)));
            zz = 0.89223 + (((tickAnim - 78) / 8) * (0-(0.89223)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-50.07001-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (3.97113-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (3.8843-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -50.07001 + (((tickAnim - 6) / 5) * (-63.93535-(-50.07001)));
            yy = 3.97113 + (((tickAnim - 6) / 5) * (7.67751-(3.97113)));
            zz = 3.8843 + (((tickAnim - 6) / 5) * (7.50964-(3.8843)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -63.93535 + (((tickAnim - 11) / 7) * (-69.11714-(-63.93535)));
            yy = 7.67751 + (((tickAnim - 11) / 7) * (12.7076-(7.67751)));
            zz = 7.50964 + (((tickAnim - 11) / 7) * (12.42975-(7.50964)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -69.11714 + (((tickAnim - 18) / 2) * (-69.15834-(-69.11714)));
            yy = 12.7076 + (((tickAnim - 18) / 2) * (6.07294-(12.7076)));
            zz = 12.42975 + (((tickAnim - 18) / 2) * (12.73376-(12.42975)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -69.15834 + (((tickAnim - 20) / 2) * (-68.98767-(-69.15834)));
            yy = 6.07294 + (((tickAnim - 20) / 2) * (10.71756-(6.07294)));
            zz = 12.73376 + (((tickAnim - 20) / 2) * (14.29446-(12.73376)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -68.98767 + (((tickAnim - 22) / 1) * (-69.28182-(-68.98767)));
            yy = 10.71756 + (((tickAnim - 22) / 1) * (5.78075-(10.71756)));
            zz = 14.29446 + (((tickAnim - 22) / 1) * (11.40652-(14.29446)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -69.28182 + (((tickAnim - 23) / 7) * (-68.7742-(-69.28182)));
            yy = 5.78075 + (((tickAnim - 23) / 7) * (4.26664-(5.78075)));
            zz = 11.40652 + (((tickAnim - 23) / 7) * (17.64021-(11.40652)));
        }
        else if (tickAnim >= 30 && tickAnim < 63) {
            xx = -68.7742 + (((tickAnim - 30) / 33) * (-68.7742-(-68.7742)));
            yy = 4.26664 + (((tickAnim - 30) / 33) * (4.26664-(4.26664)));
            zz = 17.64021 + (((tickAnim - 30) / 33) * (17.64021-(17.64021)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = -68.7742 + (((tickAnim - 63) / 4) * (-69.58648-(-68.7742)));
            yy = 4.26664 + (((tickAnim - 63) / 4) * (2.08609-(4.26664)));
            zz = 17.64021 + (((tickAnim - 63) / 4) * (13.76069-(17.64021)));
        }
        else if (tickAnim >= 67 && tickAnim < 69) {
            xx = -69.58648 + (((tickAnim - 67) / 2) * (-68.8207-(-69.58648)));
            yy = 2.08609 + (((tickAnim - 67) / 2) * (0.45068-(2.08609)));
            zz = 13.76069 + (((tickAnim - 67) / 2) * (10.85104-(13.76069)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = -68.8207 + (((tickAnim - 69) / 4) * (-38.21105-(-68.8207)));
            yy = 0.45068 + (((tickAnim - 69) / 4) * (-2.27501-(0.45068)));
            zz = 10.85104 + (((tickAnim - 69) / 4) * (6.00164-(10.85104)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -38.21105 + (((tickAnim - 73) / 2) * (-32.94974-(-38.21105)));
            yy = -2.27501 + (((tickAnim - 73) / 2) * (-4.82687-(-2.27501)));
            zz = 6.00164 + (((tickAnim - 73) / 2) * (2.39478-(6.00164)));
        }
        else if (tickAnim >= 75 && tickAnim < 77) {
            xx = -32.94974 + (((tickAnim - 75) / 2) * (-27.97197-(-32.94974)));
            yy = -4.82687 + (((tickAnim - 75) / 2) * (-2.78726-(-4.82687)));
            zz = 2.39478 + (((tickAnim - 75) / 2) * (3.55154-(2.39478)));
        }
        else if (tickAnim >= 77 && tickAnim < 78) {
            xx = -27.97197 + (((tickAnim - 77) / 1) * (-22.84955-(-27.97197)));
            yy = -2.78726 + (((tickAnim - 77) / 1) * (-2.85932-(-2.78726)));
            zz = 3.55154 + (((tickAnim - 77) / 1) * (2.08954-(3.55154)));
        }
        else if (tickAnim >= 78 && tickAnim < 86) {
            xx = -22.84955 + (((tickAnim - 78) / 8) * (0-(-22.84955)));
            yy = -2.85932 + (((tickAnim - 78) / 8) * (0-(-2.85932)));
            zz = 2.08954 + (((tickAnim - 78) / 8) * (0-(2.08954)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (33.55656-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (5.29752-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-5.61672-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 33.55656 + (((tickAnim - 6) / 5) * (49.40936-(33.55656)));
            yy = 5.29752 + (((tickAnim - 6) / 5) * (10.24188-(5.29752)));
            zz = -5.61672 + (((tickAnim - 6) / 5) * (-10.85899-(-5.61672)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 49.40936 + (((tickAnim - 11) / 7) * (49.81549-(49.40936)));
            yy = 10.24188 + (((tickAnim - 11) / 7) * (16.95208-(10.24188)));
            zz = -10.85899 + (((tickAnim - 11) / 7) * (-17.97349-(-10.85899)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 49.81549 + (((tickAnim - 18) / 12) * (50.14337-(49.81549)));
            yy = 16.95208 + (((tickAnim - 18) / 12) * (14.73488-(16.95208)));
            zz = -17.97349 + (((tickAnim - 18) / 12) * (-16.77278-(-17.97349)));
        }
        else if (tickAnim >= 30 && tickAnim < 63) {
            xx = 50.14337 + (((tickAnim - 30) / 33) * (50.14337-(50.14337)));
            yy = 14.73488 + (((tickAnim - 30) / 33) * (14.73488-(14.73488)));
            zz = -16.77278 + (((tickAnim - 30) / 33) * (-16.77278-(-16.77278)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 50.14337 + (((tickAnim - 63) / 4) * (53.91261-(50.14337)));
            yy = 14.73488 + (((tickAnim - 63) / 4) * (10.81297-(14.73488)));
            zz = -16.77278 + (((tickAnim - 63) / 4) * (-12.25592-(-16.77278)));
        }
        else if (tickAnim >= 67 && tickAnim < 69) {
            xx = 53.91261 + (((tickAnim - 67) / 2) * (51.36454-(53.91261)));
            yy = 10.81297 + (((tickAnim - 67) / 2) * (7.87154-(10.81297)));
            zz = -12.25592 + (((tickAnim - 67) / 2) * (-8.86827-(-12.25592)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = 51.36454 + (((tickAnim - 69) / 4) * (28.45109-(51.36454)));
            yy = 7.87154 + (((tickAnim - 69) / 4) * (2.96915-(7.87154)));
            zz = -8.86827 + (((tickAnim - 69) / 4) * (-3.22218-(-8.86827)));
        }
        else if (tickAnim >= 73 && tickAnim < 86) {
            xx = 28.45109 + (((tickAnim - 73) / 13) * (0-(28.45109)));
            yy = 2.96915 + (((tickAnim - 73) / 13) * (0-(2.96915)));
            zz = -3.22218 + (((tickAnim - 73) / 13) * (0-(-3.22218)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 10 + (((tickAnim - 18) / 4) * (17.84519-(10)));
            yy = 0 + (((tickAnim - 18) / 4) * (-9.1121-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (-2.10278-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 17.84519 + (((tickAnim - 22) / 2) * (21.7346-(17.84519)));
            yy = -9.1121 + (((tickAnim - 22) / 2) * (-15.62074-(-9.1121)));
            zz = -2.10278 + (((tickAnim - 22) / 2) * (-3.60477-(-2.10278)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 21.7346 + (((tickAnim - 24) / 1) * (22.13474-(21.7346)));
            yy = -15.62074 + (((tickAnim - 24) / 1) * (-17.2944-(-15.62074)));
            zz = -3.60477 + (((tickAnim - 24) / 1) * (-3.991-(-3.60477)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 22.13474 + (((tickAnim - 25) / 5) * (3.53556-(22.13474)));
            yy = -17.2944 + (((tickAnim - 25) / 5) * (-27.3363-(-17.2944)));
            zz = -3.991 + (((tickAnim - 25) / 5) * (-6.30835-(-3.991)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 3.53556 + (((tickAnim - 30) / 3) * (4.38028-(3.53556)));
            yy = -27.3363 + (((tickAnim - 30) / 3) * (-33.15961-(-27.3363)));
            zz = -6.30835 + (((tickAnim - 30) / 3) * (-7.983-(-6.30835)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 4.38028 + (((tickAnim - 33) / 1) * (3.19904-(4.38028)));
            yy = -33.15961 + (((tickAnim - 33) / 1) * (-24.41753-(-33.15961)));
            zz = -7.983 + (((tickAnim - 33) / 1) * (-5.53757-(-7.983)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 3.19904 + (((tickAnim - 34) / 2) * (3.53556-(3.19904)));
            yy = -24.41753 + (((tickAnim - 34) / 2) * (-27.3363-(-24.41753)));
            zz = -5.53757 + (((tickAnim - 34) / 2) * (-6.30835-(-5.53757)));
        }
        else if (tickAnim >= 36 && tickAnim < 63) {
            xx = 3.53556 + (((tickAnim - 36) / 27) * (3.53556-(3.53556)));
            yy = -27.3363 + (((tickAnim - 36) / 27) * (-27.3363-(-27.3363)));
            zz = -6.30835 + (((tickAnim - 36) / 27) * (-6.30835-(-6.30835)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 3.53556 + (((tickAnim - 63) / 10) * (1.9642-(3.53556)));
            yy = -27.3363 + (((tickAnim - 63) / 10) * (-15.18683-(-27.3363)));
            zz = -6.30835 + (((tickAnim - 63) / 10) * (-3.50464-(-6.30835)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 1.9642 + (((tickAnim - 73) / 5) * (13.30947-(1.9642)));
            yy = -15.18683 + (((tickAnim - 73) / 5) * (-10.12456-(-15.18683)));
            zz = -3.50464 + (((tickAnim - 73) / 5) * (-2.33643-(-3.50464)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = 13.30947 + (((tickAnim - 78) / 3) * (16.98568-(13.30947)));
            yy = -10.12456 + (((tickAnim - 78) / 3) * (-6.07473-(-10.12456)));
            zz = -2.33643 + (((tickAnim - 78) / 3) * (-1.40186-(-2.33643)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 16.98568 + (((tickAnim - 81) / 5) * (0-(16.98568)));
            yy = -6.07473 + (((tickAnim - 81) / 5) * (0-(-6.07473)));
            zz = -1.40186 + (((tickAnim - 81) / 5) * (0-(-1.40186)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (-5-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 88) / 1) * (0-(0)));
            yy = -5 + (((tickAnim - 88) / 1) * (1-(-5)));
            zz = 0 + (((tickAnim - 88) / 1) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 89) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 89) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 89) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-66-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -66 + (((tickAnim - 18) / 4) * (-76.67-(-66)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -76.67 + (((tickAnim - 22) / 2) * (-83.43-(-76.67)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -83.43 + (((tickAnim - 24) / 1) * (-89.37-(-83.43)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 1) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -89.37 + (((tickAnim - 25) / 5) * (-62-(-89.37)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -62 + (((tickAnim - 30) / 3) * (-61.94365-(-62)));
            yy = 0 + (((tickAnim - 30) / 3) * (4.81771-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (1.33935-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -61.94365 + (((tickAnim - 33) / 1) * (-61.99101-(-61.94365)));
            yy = 4.81771 + (((tickAnim - 33) / 1) * (-1.92723-(4.81771)));
            zz = 1.33935 + (((tickAnim - 33) / 1) * (-0.53468-(1.33935)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = -61.99101 + (((tickAnim - 34) / 2) * (-62-(-61.99101)));
            yy = -1.92723 + (((tickAnim - 34) / 2) * (0-(-1.92723)));
            zz = -0.53468 + (((tickAnim - 34) / 2) * (0-(-0.53468)));
        }
        else if (tickAnim >= 36 && tickAnim < 63) {
            xx = -62 + (((tickAnim - 36) / 27) * (-62-(-62)));
            yy = 0 + (((tickAnim - 36) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 27) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -62 + (((tickAnim - 63) / 10) * (-34.44444-(-62)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = -34.44444 + (((tickAnim - 73) / 5) * (-45.96-(-34.44444)));
            yy = 0 + (((tickAnim - 73) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 5) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = -45.96 + (((tickAnim - 78) / 3) * (-47.58-(-45.96)));
            yy = 0 + (((tickAnim - 78) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 3) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = -47.58 + (((tickAnim - 81) / 5) * (0-(-47.58)));
            yy = 0 + (((tickAnim - 81) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 5) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (-0.12907-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (3.56488-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (-1.95636-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 89) {
            xx = -0.12907 + (((tickAnim - 88) / 1) * (-0.24475-(-0.12907)));
            yy = 3.56488 + (((tickAnim - 88) / 1) * (-4.99788-(3.56488)));
            zz = -1.95636 + (((tickAnim - 88) / 1) * (0.99126-(-1.95636)));
        }
        else if (tickAnim >= 89 && tickAnim < 91) {
            xx = -0.24475 + (((tickAnim - 89) / 2) * (0-(-0.24475)));
            yy = -4.99788 + (((tickAnim - 89) / 2) * (0-(-4.99788)));
            zz = 0.99126 + (((tickAnim - 89) / 2) * (0-(0.99126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (36.7203-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5.49739-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (5.82089-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 36.7203 + (((tickAnim - 18) / 4) * (55.7203-(36.7203)));
            yy = -5.49739 + (((tickAnim - 18) / 4) * (-5.49739-(-5.49739)));
            zz = 5.82089 + (((tickAnim - 18) / 4) * (5.82089-(5.82089)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 55.7203 + (((tickAnim - 22) / 8) * (54.7203-(55.7203)));
            yy = -5.49739 + (((tickAnim - 22) / 8) * (-5.49739-(-5.49739)));
            zz = 5.82089 + (((tickAnim - 22) / 8) * (5.82089-(5.82089)));
        }
        else if (tickAnim >= 30 && tickAnim < 63) {
            xx = 54.7203 + (((tickAnim - 30) / 33) * (54.7203-(54.7203)));
            yy = -5.49739 + (((tickAnim - 30) / 33) * (-5.49739-(-5.49739)));
            zz = 5.82089 + (((tickAnim - 30) / 33) * (5.82089-(5.82089)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 54.7203 + (((tickAnim - 63) / 10) * (30.40016-(54.7203)));
            yy = -5.49739 + (((tickAnim - 63) / 10) * (-3.05411-(-5.49739)));
            zz = 5.82089 + (((tickAnim - 63) / 10) * (3.23383-(5.82089)));
        }
        else if (tickAnim >= 73 && tickAnim < 78) {
            xx = 30.40016 + (((tickAnim - 73) / 5) * (49.26678-(30.40016)));
            yy = -3.05411 + (((tickAnim - 73) / 5) * (-2.03607-(-3.05411)));
            zz = 3.23383 + (((tickAnim - 73) / 5) * (2.15589-(3.23383)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = 49.26678 + (((tickAnim - 78) / 3) * (42.56007-(49.26678)));
            yy = -2.03607 + (((tickAnim - 78) / 3) * (-1.22164-(-2.03607)));
            zz = 2.15589 + (((tickAnim - 78) / 3) * (1.29353-(2.15589)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 42.56007 + (((tickAnim - 81) / 5) * (0-(42.56007)));
            yy = -1.22164 + (((tickAnim - 81) / 5) * (0-(-1.22164)));
            zz = 1.29353 + (((tickAnim - 81) / 5) * (0-(1.29353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;
    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 3 + (((tickAnim - 9) / 5) * (11.45-(3)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 11.45 + (((tickAnim - 14) / 5) * (17.87-(11.45)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 17.87 + (((tickAnim - 19) / 9) * (3.14-(17.87)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 3.14 + (((tickAnim - 28) / 7) * (-0.62-(3.14)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -0.62 + (((tickAnim - 35) / 7) * (-11.21-(-0.62)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -11.21 + (((tickAnim - 42) / 8) * (0-(-11.21)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 11 + (((tickAnim - 9) / 5) * (16.98-(11)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 16.98 + (((tickAnim - 14) / 5) * (18.16-(16.98)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 18.16 + (((tickAnim - 19) / 9) * (35.73-(18.16)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 35.73 + (((tickAnim - 28) / 7) * (32.54-(35.73)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 32.54 + (((tickAnim - 35) / 7) * (-13.15-(32.54)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -13.15 + (((tickAnim - 42) / 8) * (0-(-13.15)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 4 + (((tickAnim - 9) / 5) * (11.27-(4)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 11.27 + (((tickAnim - 14) / 5) * (21.73-(11.27)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 21.73 + (((tickAnim - 19) / 4) * (28.54-(21.73)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 28.54 + (((tickAnim - 23) / 5) * (13.36-(28.54)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 13.36 + (((tickAnim - 28) / 7) * (-9.38-(13.36)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -9.38 + (((tickAnim - 35) / 7) * (-9.13-(-9.38)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -9.13 + (((tickAnim - 42) / 3) * (10.52-(-9.13)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 10.52 + (((tickAnim - 45) / 5) * (0-(10.52)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*1.5));

        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*3));

        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 63) {
            xx = 1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5 + (((tickAnim - 54) / 9) * (1.78-(1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5)));
            yy = 0 + (((tickAnim - 54) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = 1.78 + (((tickAnim - 63) / 16) * (0-(1.78)));
            yy = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5 + (((tickAnim - 63) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 10) / 23) * (3.64059-(-0.5)));
            yy = 0 + (((tickAnim - 10) / 23) * (0.13373-(0)));
            zz = 0 + (((tickAnim - 10) / 23) * (-1.24283-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = 3.64059 + (((tickAnim - 33) / 20) * (6.25-(3.64059)));
            yy = 0.13373 + (((tickAnim - 33) / 20) * (0-(0.13373)));
            zz = -1.24283 + (((tickAnim - 33) / 20) * (0-(-1.24283)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = 6.25 + (((tickAnim - 53) / 10) * (3.04-(6.25)));
            yy = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.28-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = 3.04 + (((tickAnim - 63) / 16) * (0-(3.04)));
            yy = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.28 + (((tickAnim - 63) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (2.0039+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*5.8-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*320+550))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-2.5445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*0.5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 59) {
            xx = 2.0039+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*5.8 + (((tickAnim - 28) / 31) * (5.66-(2.0039+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*5.8)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*320+550))*1 + (((tickAnim - 28) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*320+550))*1)));
            zz = -2.5445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*0.5 + (((tickAnim - 28) / 31) * (0-(-2.5445+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*0.5)));
        }
        else if (tickAnim >= 59 && tickAnim < 61) {
            xx = 5.66 + (((tickAnim - 59) / 2) * (5.66-(5.66)));
            yy = 0 + (((tickAnim - 59) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.9-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 81) {
            xx = 5.66 + (((tickAnim - 61) / 20) * (0-(5.66)));
            yy = 0 + (((tickAnim - 61) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.9 + (((tickAnim - 61) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (2.4473+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-450))*-1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-2.4996+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*1-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 56) {
            xx = 2.4473+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 28) / 28) * (-4.2974+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3-(2.4473+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-450))*-1.2 + (((tickAnim - 28) / 28) * (0.4758+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-450))*-1.2)));
            zz = -2.4996+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*1 + (((tickAnim - 28) / 28) * (-0.5041-(-2.4996+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*1)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = -4.2974+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3 + (((tickAnim - 56) / 5) * (-4.29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3-(-4.2974+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3)));
            yy = 0.4758+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.8 + (((tickAnim - 56) / 5) * (0-(0.4758+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.8)));
            zz = -0.5041 + (((tickAnim - 56) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-0.6-(-0.5041)));
        }
        else if (tickAnim >= 61 && tickAnim < 81) {
            xx = -4.29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3 + (((tickAnim - 61) / 20) * (0-(-4.29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*3)));
            yy = 0 + (((tickAnim - 61) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-0.6 + (((tickAnim - 61) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 30) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 58) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (2.4577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-1.6145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-1.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 56) {
            xx = 2.4577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 33) / 23) * (-5.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450-40))*-1-(2.4577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*1 + (((tickAnim - 33) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*1)));
            zz = -1.6145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-1.5 + (((tickAnim - 33) / 23) * (0-(-1.6145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-1.5)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = -5.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450-40))*-1 + (((tickAnim - 56) / 5) * (-6.21-(-5.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450-40))*-1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*0.5 + (((tickAnim - 56) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*0.5)));
            zz = 0 + (((tickAnim - 56) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1660))*0.5-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 81) {
            xx = -6.21 + (((tickAnim - 61) / 20) * (0-(-6.21)));
            yy = 0 + (((tickAnim - 61) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1660))*0.5 + (((tickAnim - 61) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1660))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 33 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 33) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 24) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 57) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5.8-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-520))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5.8 + (((tickAnim - 54) / 7) * (-4.353-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5.8)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-520))*-3 + (((tickAnim - 54) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350-520))*-3)));
            zz = 0 + (((tickAnim - 54) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.5-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 81) {
            xx = -4.353 + (((tickAnim - 61) / 20) * (0-(-4.353)));
            yy = 0 + (((tickAnim - 61) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.5 + (((tickAnim - 61) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = 3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*15 + (((tickAnim - 54) / 7) * (-1.81-(3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*1.5 + (((tickAnim - 54) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*550))*1.5)));
            zz = 0 + (((tickAnim - 54) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 81) {
            xx = -1.81 + (((tickAnim - 61) / 20) * (0-(-1.81)));
            yy = 0 + (((tickAnim - 61) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5 + (((tickAnim - 61) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = -16.5 + (((tickAnim - 33) / 20) * (-14.31-(-16.5)));
            yy = 0 + (((tickAnim - 33) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 20) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 66) {
            xx = -14.31 + (((tickAnim - 53) / 13) * (-1.8703-(-14.31)));
            yy = 0 + (((tickAnim - 53) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 13) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 81) {
            xx = -1.8703 + (((tickAnim - 66) / 15) * (0-(-1.8703)));
            yy = 0 + (((tickAnim - 66) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 33) / 48) * (0-(0)));
            yy = 0.1 + (((tickAnim - 33) / 48) * (0-(0.1)));
            zz = 1 + (((tickAnim - 33) / 48) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 33) {
            xx = 0.75 + (((tickAnim - 10) / 23) * (-4.25-(0.75)));
            yy = 0 + (((tickAnim - 10) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 23) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -4.25 + (((tickAnim - 33) / 12) * (-1-(-4.25)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -1 + (((tickAnim - 45) / 8) * (-2.75-(-1)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -2.75 + (((tickAnim - 53) / 6) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 79) {
            xx = -2.75 + (((tickAnim - 59) / 20) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 59) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 12) * (-2.695-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (-1.745-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = -2.695 + (((tickAnim - 45) / 8) * (-1.52-(-2.695)));
            zz = -1.745 + (((tickAnim - 45) / 8) * (-1.745-(-1.745)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            yy = -1.52 + (((tickAnim - 53) / 6) * (0.18-(-1.52)));
            zz = -1.745 + (((tickAnim - 53) / 6) * (-1.745-(-1.745)));
        }
        else if (tickAnim >= 59 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 59) / 20) * (0-(0)));
            yy = 0.18 + (((tickAnim - 59) / 20) * (0-(0.18)));
            zz = -1.745 + (((tickAnim - 59) / 20) * (0-(-1.745)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmright.rotationPointX = this.upperarmright.rotationPointX + (float)(xx);
        this.upperarmright.rotationPointY = this.upperarmright.rotationPointY - (float)(yy);
        this.upperarmright.rotationPointZ = this.upperarmright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -3.5 + (((tickAnim - 18) / 17) * (-1.5-(-3.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 35) / 15) * (-8.48651-(-1.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (-3.21426-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (-0.48089-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = -8.48651 + (((tickAnim - 50) / 9) * (0-(-8.48651)));
            yy = -3.21426 + (((tickAnim - 50) / 9) * (0-(-3.21426)));
            zz = -0.48089 + (((tickAnim - 50) / 9) * (0-(-0.48089)));
        }
        else if (tickAnim >= 59 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 59) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2.8-(0)));
            zz = 0 + (((tickAnim - 59) / 3) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 62) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2.8 + (((tickAnim - 62) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2.8)));
            zz = 0 + (((tickAnim - 62) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0.825-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0.825 + (((tickAnim - 18) / 17) * (1.975-(0.825)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.975 + (((tickAnim - 35) / 15) * (3.825-(1.975)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 50) / 9) * (0-(0)));
            yy = 3.825 + (((tickAnim - 50) / 9) * (0.975-(3.825)));
            zz = 0 + (((tickAnim - 50) / 9) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 59) / 20) * (0-(0)));
            yy = 0.975 + (((tickAnim - 59) / 20) * (0-(0.975)));
            zz = 0 + (((tickAnim - 59) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmleft.rotationPointX = this.upperarmleft.rotationPointX + (float)(xx);
        this.upperarmleft.rotationPointY = this.upperarmleft.rotationPointY - (float)(yy);
        this.upperarmleft.rotationPointZ = this.upperarmleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.75 + (((tickAnim - 35) / 15) * (-19.75-(-12.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = -19.75 + (((tickAnim - 50) / 9) * (0-(-19.75)));
            yy = 0 + (((tickAnim - 50) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 9) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 59) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-2.8-(0)));
            zz = 0 + (((tickAnim - 59) / 3) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 62) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-2.8 + (((tickAnim - 62) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-2.8)));
            zz = 0 + (((tickAnim - 62) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (2.5-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.5 + (((tickAnim - 35) / 15) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 50) / 9) * (0-(0)));
            yy = 2.5 + (((tickAnim - 50) / 9) * (0-(2.5)));
            zz = 0 + (((tickAnim - 50) / 9) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 59) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmleft.rotationPointX = this.lowerarmleft.rotationPointX + (float)(xx);
        this.lowerarmleft.rotationPointY = this.lowerarmleft.rotationPointY - (float)(yy);
        this.lowerarmleft.rotationPointZ = this.lowerarmleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (22.5-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 35) / 15) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 22.5 + (((tickAnim - 50) / 7) * (-8.5-(22.5)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = -8.5 + (((tickAnim - 57) / 2) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 57) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 2) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 59) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 53) {
            xx = 0.25 + (((tickAnim - 10) / 43) * (-2.75-(0.25)));
            yy = 0 + (((tickAnim - 10) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 43) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = -2.75 + (((tickAnim - 53) / 10) * (-1.63281-(-2.75)));
            yy = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.2-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = -1.63281 + (((tickAnim - 63) / 16) * (0-(-1.63281)));
            yy = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.2 + (((tickAnim - 63) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 53) {
            xx = -0.75 + (((tickAnim - 10) / 43) * (3-(-0.75)));
            yy = 0 + (((tickAnim - 10) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 43) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 79) {
            xx = 3 + (((tickAnim - 53) / 26) * (0-(3)));
            yy = 0 + (((tickAnim - 53) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 53) {
            xx = -0.75 + (((tickAnim - 10) / 43) * (3-(-0.75)));
            yy = 0 + (((tickAnim - 10) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 43) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 79) {
            xx = 3 + (((tickAnim - 53) / 26) * (0-(3)));
            yy = 0 + (((tickAnim - 53) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 63) {
            xx = 27.5 + (((tickAnim - 39) / 24) * (20.75-(27.5)));
            yy = 0 + (((tickAnim - 39) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 24) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 79) {
            xx = 20.75 + (((tickAnim - 63) / 16) * (0-(20.75)));
            yy = 0 + (((tickAnim - 63) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 19 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 19) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440-60))*0.1-(0)));
            zz = 0 + (((tickAnim - 19) / 27) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 46) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440-60))*0.1 + (((tickAnim - 46) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*2440-60))*0.1)));
            zz = 0 + (((tickAnim - 46) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 2.5 + (((tickAnim - 33) / 12) * (0-(2.5)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));

        this.lowerarmright.rotationPointX = this.lowerarmright.rotationPointX + (float)(0);
        this.lowerarmright.rotationPointY = this.lowerarmright.rotationPointY - (float)(0);
        this.lowerarmright.rotationPointZ = this.lowerarmright.rotationPointZ + (float)(0);



        if (tickAnim >= 33 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));

        this.handright.rotationPointX = this.handright.rotationPointX + (float)(0);
        this.handright.rotationPointY = this.handright.rotationPointY - (float)(0);
        this.handright.rotationPointZ = this.handright.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 5.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3 + (((tickAnim - 0) / 31) * (2.0577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-3-(5.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3)));
            yy = 0 + (((tickAnim - 0) / 31) * (6.2613+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190-5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0.18801-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 61) {
            xx = 2.0577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-3 + (((tickAnim - 31) / 30) * (3.3397+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-3-(2.0577+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-3)));
            yy = 6.2613+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190-5))*-3 + (((tickAnim - 31) / 30) * (-4.1646+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(6.2613+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190-5))*-3)));
            zz = 0.18801 + (((tickAnim - 31) / 30) * (-0.1758+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5-(0.18801)));
        }
        else if (tickAnim >= 61 && tickAnim < 81) {
            xx = 3.3397+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-3 + (((tickAnim - 61) / 20) * (5.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3-(3.3397+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-3)));
            yy = -4.1646+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 61) / 20) * (0-(-4.1646+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            zz = -0.1758+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5 + (((tickAnim - 61) / 20) * (0-(-0.1758+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3 + (((tickAnim - 0) / 35) * (-2.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3)));
            yy = 0 + (((tickAnim - 0) / 35) * (4.0164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190-5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (1.56476-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 53) {
            xx = -2.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3 + (((tickAnim - 35) / 18) * (-2.5472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3-(-2.7173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3)));
            yy = 4.0164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190-5))*-3 + (((tickAnim - 35) / 18) * (-3.6164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3-(4.0164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190-5))*-3)));
            zz = 1.56476 + (((tickAnim - 35) / 18) * (-3.0976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.8-(1.56476)));
        }
        else if (tickAnim >= 53 && tickAnim < 81) {
            xx = -2.5472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3 + (((tickAnim - 53) / 28) * (0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3-(-2.5472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3)));
            yy = -3.6164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3 + (((tickAnim - 53) / 28) * (0-(-3.6164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3)));
            zz = -3.0976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.8 + (((tickAnim - 53) / 28) * (0-(-3.0976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3 + (((tickAnim - 0) / 26) * (4.5698+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3)));
            yy = 0 + (((tickAnim - 0) / 26) * (13.78905-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (2.38971-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 58) {
            xx = 4.5698+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3 + (((tickAnim - 26) / 32) * (1.9565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3-(4.5698+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3)));
            yy = 13.78905 + (((tickAnim - 26) / 32) * (-5.0483+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(13.78905)));
            zz = 2.38971 + (((tickAnim - 26) / 32) * (0.8277+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(2.38971)));
        }
        else if (tickAnim >= 58 && tickAnim < 81) {
            xx = 1.9565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3 + (((tickAnim - 58) / 23) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3-(1.9565+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3)));
            yy = -5.0483+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 58) / 23) * (0-(-5.0483+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            zz = 0.8277+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 58) / 23) * (0-(0.8277+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 26) * (-0.4842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            yy = 0 + (((tickAnim - 0) / 26) * (10.75061-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0.60272-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 60) {
            xx = -0.4842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3 + (((tickAnim - 26) / 34) * (9.4941+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*3-(-0.4842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-3)));
            yy = 10.75061 + (((tickAnim - 26) / 34) * (-3.3903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2-(10.75061)));
            zz = 0.60272 + (((tickAnim - 26) / 34) * (-2.0019+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2-(0.60272)));
        }
        else if (tickAnim >= 60 && tickAnim < 81) {
            xx = 9.4941+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*3 + (((tickAnim - 60) / 21) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(9.4941+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*3)));
            yy = -3.3903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2 + (((tickAnim - 60) / 21) * (0-(-3.3903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2)));
            zz = -2.0019+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2 + (((tickAnim - 60) / 21) * (0-(-2.0019+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 12) * (-0.6463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            yy = 0 + (((tickAnim - 0) / 12) * (2.60891-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (2.67258-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = -0.6463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*3 + (((tickAnim - 12) / 14) * (13.5255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*3-(-0.6463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*3)));
            yy = 2.60891 + (((tickAnim - 12) / 14) * (13.79646-(2.60891)));
            zz = 2.67258 + (((tickAnim - 12) / 14) * (3.87051-(2.67258)));
        }
        else if (tickAnim >= 26 && tickAnim < 45) {
            xx = 13.5255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*3 + (((tickAnim - 26) / 19) * (13.5255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*3-(13.5255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*3)));
            yy = 13.79646 + (((tickAnim - 26) / 19) * (13.79646-(13.79646)));
            zz = 3.87051 + (((tickAnim - 26) / 19) * (3.87051-(3.87051)));
        }
        else if (tickAnim >= 45 && tickAnim < 61) {
            xx = 13.5255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*3 + (((tickAnim - 45) / 16) * (14.0403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(13.5255+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*3)));
            yy = 13.79646 + (((tickAnim - 45) / 16) * (-8.65109-(13.79646)));
            zz = 3.87051 + (((tickAnim - 45) / 16) * (-0.1189-(3.87051)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 14.0403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 61) / 7) * (6.0204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(14.0403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            yy = -8.65109 + (((tickAnim - 61) / 7) * (-13.90014-(-8.65109)));
            zz = -0.1189 + (((tickAnim - 61) / 7) * (-0.01701-(-0.1189)));
        }
        else if (tickAnim >= 68 && tickAnim < 81) {
            xx = 6.0204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 68) / 13) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(6.0204+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            yy = -13.90014 + (((tickAnim - 68) / 13) * (0-(-13.90014)));
            zz = -0.01701 + (((tickAnim - 68) / 13) * (0-(-0.01701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 4) * (0.7014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            yy = 0 + (((tickAnim - 0) / 4) * (-15.10512-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2.08976-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 26) {
            xx = 0.7014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 4) / 22) * (34.6955+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(0.7014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            yy = -15.10512 + (((tickAnim - 4) / 22) * (17.52801-(-15.10512)));
            zz = 2.08976 + (((tickAnim - 4) / 22) * (7.09816-(2.08976)));
        }
        else if (tickAnim >= 26 && tickAnim < 44) {
            xx = 34.6955+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 26) / 18) * (-6.4645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*5-(34.6955+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            yy = 17.52801 + (((tickAnim - 26) / 18) * (13.53136-(17.52801)));
            zz = 7.09816 + (((tickAnim - 26) / 18) * (2.26622-(7.09816)));
        }
        else if (tickAnim >= 44 && tickAnim < 61) {
            xx = -6.4645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*5 + (((tickAnim - 44) / 17) * (25.4777+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+50))*3-(-6.4645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*5)));
            yy = 13.53136 + (((tickAnim - 44) / 17) * (-7.69957-(13.53136)));
            zz = 2.26622 + (((tickAnim - 44) / 17) * (-0.5746+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1990))*5-(2.26622)));
        }
        else if (tickAnim >= 61 && tickAnim < 81) {
            xx = 25.4777+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+50))*3 + (((tickAnim - 61) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(25.4777+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200+50))*3)));
            yy = -7.69957 + (((tickAnim - 61) / 20) * (0-(-7.69957)));
            zz = -0.5746+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1990))*5 + (((tickAnim - 61) / 20) * (0-(-0.5746+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1990))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;

        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*310/1.5+120))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*310/1.5+50))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*310/1.5+50))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 9 + (((tickAnim - 9) / 16) * (19.25-(9)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 19.25 + (((tickAnim - 25) / 10) * (0-(19.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 12) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 17) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 24) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 29) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1 + (((tickAnim - 0) / 2) * (-14-(-1)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -14 + (((tickAnim - 2) / 3) * (-18.75-(-14)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -18.75 + (((tickAnim - 5) / 3) * (-13-(-18.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -13 + (((tickAnim - 8) / 3) * (-7.37998-(-13)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.00532-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.00312-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7.37998 + (((tickAnim - 11) / 4) * (-1.99993-(-7.37998)));
            yy = -0.00532 + (((tickAnim - 11) / 4) * (-0.01-(-0.00532)));
            zz = 0.00312 + (((tickAnim - 11) / 4) * (0.00588-(0.00312)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.99993 + (((tickAnim - 15) / 3) * (7-(-1.99993)));
            yy = -0.01 + (((tickAnim - 15) / 3) * (0-(-0.01)));
            zz = 0.00588 + (((tickAnim - 15) / 3) * (0-(0.00588)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 7 + (((tickAnim - 18) / 1) * (8.2-(7)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 8.2 + (((tickAnim - 19) / 1) * (-1-(8.2)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17 + (((tickAnim - 0) / 2) * (9-(17)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 9 + (((tickAnim - 2) / 3) * (-3.07-(9)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3.07 + (((tickAnim - 5) / 3) * (-9-(-3.07)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -9 + (((tickAnim - 8) / 3) * (-0.92006-(-9)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.01569-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.00981-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.92006 + (((tickAnim - 11) / 4) * (4.99958-(-0.92006)));
            yy = 0.01569 + (((tickAnim - 11) / 4) * (0.05629-(0.01569)));
            zz = -0.00981 + (((tickAnim - 11) / 4) * (-0.04085-(-0.00981)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.99958 + (((tickAnim - 15) / 3) * (4.5-(4.99958)));
            yy = 0.05629 + (((tickAnim - 15) / 3) * (0-(0.05629)));
            zz = -0.04085 + (((tickAnim - 15) / 3) * (0-(-0.04085)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 4.5 + (((tickAnim - 18) / 1) * (7-(4.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 19) / 1) * (17-(7)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5 + (((tickAnim - 0) / 2) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 13.5 + (((tickAnim - 2) / 3) * (13.93-(13.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 13.93 + (((tickAnim - 5) / 1) * (8.53-(13.93)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.53 + (((tickAnim - 6) / 2) * (20-(8.53)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 8) / 3) * (7.85004-(20)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.00863-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.00882-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 7.85004 + (((tickAnim - 11) / 4) * (-2.99956-(7.85004)));
            yy = -0.00863 + (((tickAnim - 11) / 4) * (-0.04482-(-0.00863)));
            zz = 0.00882 + (((tickAnim - 11) / 4) * (0.06762-(0.00882)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2.99956 + (((tickAnim - 15) / 3) * (-9.44-(-2.99956)));
            yy = -0.04482 + (((tickAnim - 15) / 3) * (0-(-0.04482)));
            zz = 0.06762 + (((tickAnim - 15) / 3) * (0-(0.06762)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -9.44 + (((tickAnim - 18) / 1) * (-6.98-(-9.44)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -6.98 + (((tickAnim - 19) / 1) * (-5-(-6.98)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (9-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 9 + (((tickAnim - 3) / 2) * (18-(9)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 18 + (((tickAnim - 5) / 3) * (19.00006-(18)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.0136-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.00817-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 19.00006 + (((tickAnim - 8) / 1) * (5-(19.00006)));
            yy = 0.0136 + (((tickAnim - 8) / 1) * (0-(0.0136)));
            zz = -0.00817 + (((tickAnim - 8) / 1) * (0-(-0.00817)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 5 + (((tickAnim - 9) / 2) * (-13-(5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -13 + (((tickAnim - 11) / 2) * (-21.36-(-13)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -21.36 + (((tickAnim - 13) / 1) * (-15-(-21.36)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 14) / 4) * (-11-(-15)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -11 + (((tickAnim - 18) / 2) * (-5-(-11)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3 + (((tickAnim - 0) / 3) * (1-(3)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 3) / 2) * (-6-(1)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6 + (((tickAnim - 5) / 3) * (1.99977-(-6)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.02983-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.04679-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1.99977 + (((tickAnim - 8) / 1) * (25-(1.99977)));
            yy = -0.02983 + (((tickAnim - 8) / 1) * (0-(-0.02983)));
            zz = 0.04679 + (((tickAnim - 8) / 1) * (0-(0.04679)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 25 + (((tickAnim - 9) / 2) * (23-(25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 23 + (((tickAnim - 11) / 3) * (-10-(23)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 14) / 4) * (-13-(-10)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -13 + (((tickAnim - 18) / 2) * (3-(-13)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 0) / 3) * (-10-(2)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 3) / 2) * (-11-(-10)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -11 + (((tickAnim - 5) / 3) * (-4.5-(-11)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -4.5 + (((tickAnim - 8) / 1) * (-3-(-4.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -3 + (((tickAnim - 9) / 2) * (8-(-3)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 8 + (((tickAnim - 11) / 3) * (3-(8)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 14) / 4) * (24-(3)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 24 + (((tickAnim - 18) / 2) * (2-(24)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1+50))*2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1+50))*3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1+50))*2));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17 + (((tickAnim - 0) / 4) * (25-(17)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 25 + (((tickAnim - 4) / 2) * (32-(25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 32 + (((tickAnim - 6) / 2) * (21-(32)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 8) / 2) * (-4-(21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -4 + (((tickAnim - 10) / 2) * (-7-(-4)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -7 + (((tickAnim - 12) / 5) * (6-(-7)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 6 + (((tickAnim - 17) / 3) * (17-(6)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -4.00137 + (((tickAnim - 0) / 4) * (4.99611-(-4.00137)));
            yy = 0.07119 + (((tickAnim - 0) / 4) * (-0.1703-(0.07119)));
            zz = 0.1562 + (((tickAnim - 0) / 4) * (0.1901-(0.1562)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 4.99611 + (((tickAnim - 4) / 2) * (-22-(4.99611)));
            yy = -0.1703 + (((tickAnim - 4) / 2) * (0-(-0.1703)));
            zz = 0.1901 + (((tickAnim - 4) / 2) * (0-(0.1901)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -22 + (((tickAnim - 6) / 2) * (-33-(-22)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -33 + (((tickAnim - 8) / 2) * (-8-(-33)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -8 + (((tickAnim - 10) / 2) * (9-(-8)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 9 + (((tickAnim - 12) / 5) * (2.49756-(9)));
            yy = 0 + (((tickAnim - 12) / 5) * (0.1968-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-0.00956-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 2.49756 + (((tickAnim - 17) / 3) * (-4.00137-(2.49756)));
            yy = 0.1968 + (((tickAnim - 17) / 3) * (0.07119-(0.1968)));
            zz = -0.00956 + (((tickAnim - 17) / 3) * (0.1562-(-0.00956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -9.99865 + (((tickAnim - 0) / 4) * (-9-(-9.99865)));
            yy = -0.02017 + (((tickAnim - 0) / 4) * (0-(-0.02017)));
            zz = -0.1532 + (((tickAnim - 0) / 4) * (0-(-0.1532)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -9 + (((tickAnim - 4) / 2) * (9-(-9)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9 + (((tickAnim - 6) / 2) * (14-(9)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14 + (((tickAnim - 8) / 2) * (11-(14)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 11 + (((tickAnim - 10) / 2) * (0-(11)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (-3.9988+Math.sin((Math.PI/180)*(1)) -(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (-0.0973-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-0.01579-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -3.9988+Math.sin((Math.PI/180)*(1))  + (((tickAnim - 17) / 3) * (-9.99865-(-3.9988+Math.sin((Math.PI/180)*(1)) )));
            yy = -0.0973 + (((tickAnim - 17) / 3) * (-0.02017-(-0.0973)));
            zz = -0.01579 + (((tickAnim - 17) / 3) * (-0.1532-(-0.01579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -13 + (((tickAnim - 0) / 3) * (-0.38-(-13)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.38 + (((tickAnim - 3) / 3) * (7.69-(-0.38)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 7.69 + (((tickAnim - 6) / 4) * (16.24-(7.69)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16.24 + (((tickAnim - 10) / 3) * (23.41-(16.24)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 23.41 + (((tickAnim - 13) / 1) * (21-(23.41)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 21 + (((tickAnim - 14) / 3) * (17-(21)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 17 + (((tickAnim - 17) / 1) * (1.14-(17)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.14 + (((tickAnim - 18) / 2) * (-13-(1.14)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 0) / 3) * (-1.44-(15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -1.44 + (((tickAnim - 3) / 3) * (-0.66232-(-1.44)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.17773-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.02121-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.66232 + (((tickAnim - 6) / 4) * (-0.61082-(-0.66232)));
            yy = -0.17773 + (((tickAnim - 6) / 4) * (-0.03201-(-0.17773)));
            zz = 0.02121 + (((tickAnim - 6) / 4) * (-0.08595-(0.02121)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.61082 + (((tickAnim - 10) / 3) * (-7.2-(-0.61082)));
            yy = -0.03201 + (((tickAnim - 10) / 3) * (0-(-0.03201)));
            zz = -0.08595 + (((tickAnim - 10) / 3) * (0-(-0.08595)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -7.2 + (((tickAnim - 13) / 1) * (-17-(-7.2)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -17 + (((tickAnim - 14) / 3) * (-24-(-17)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -24 + (((tickAnim - 17) / 1) * (-16.29-(-24)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -16.29 + (((tickAnim - 18) / 2) * (15-(-16.29)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4 + (((tickAnim - 0) / 3) * (2.17-(-4)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.17 + (((tickAnim - 3) / 3) * (-3.78835-(2.17)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.12684-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.01638-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -3.78835 + (((tickAnim - 6) / 4) * (-11.89949-(-3.78835)));
            yy = 0.12684 + (((tickAnim - 6) / 4) * (0.00606-(0.12684)));
            zz = 0.01638 + (((tickAnim - 6) / 4) * (0.05471-(0.01638)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11.89949 + (((tickAnim - 10) / 3) * (5.03-(-11.89949)));
            yy = 0.00606 + (((tickAnim - 10) / 3) * (0-(0.00606)));
            zz = 0.05471 + (((tickAnim - 10) / 3) * (0-(0.05471)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 5.03 + (((tickAnim - 13) / 1) * (14-(5.03)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 14 + (((tickAnim - 14) / 3) * (22-(14)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 22 + (((tickAnim - 17) / 1) * (14.86-(22)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 14.86 + (((tickAnim - 18) / 2) * (-4-(14.86)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*0.1), hip.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.5), hip.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-115))*1.2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1-70))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-70))*4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-70))*3));

        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*0.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*-1.5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.9));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(9+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360-55))*1), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-115))*3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*-2), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*-5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360+20))*-1), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*1), neck4.rotateAngleZ + (float) Math.toRadians(Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360-55))*-1));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-12), neck5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*-2), neck5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-55))*5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(5+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360/1-200))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCamarasaurus entity = (EntityPrehistoricFloraCamarasaurus) entitylivingbaseIn;
        int animCycle = 42;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1 + (((tickAnim - 0) / 4) * (-14-(-1)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -14 + (((tickAnim - 4) / 6) * (-18.75-(-14)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -18.75 + (((tickAnim - 10) / 8) * (-13-(-18.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -13 + (((tickAnim - 18) / 6) * (-7.37998-(-13)));
            yy = 0 + (((tickAnim - 18) / 6) * (-0.00532-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.00312-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -7.37998 + (((tickAnim - 24) / 9) * (-1.99993-(-7.37998)));
            yy = -0.00532 + (((tickAnim - 24) / 9) * (-0.01-(-0.00532)));
            zz = 0.00312 + (((tickAnim - 24) / 9) * (0.00588-(0.00312)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -1.99993 + (((tickAnim - 33) / 5) * (7-(-1.99993)));
            yy = -0.01 + (((tickAnim - 33) / 5) * (0-(-0.01)));
            zz = 0.00588 + (((tickAnim - 33) / 5) * (0-(0.00588)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 7 + (((tickAnim - 38) / 3) * (8.2-(7)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 8.2 + (((tickAnim - 41) / 2) * (-1-(8.2)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17 + (((tickAnim - 0) / 4) * (9-(17)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 9 + (((tickAnim - 4) / 6) * (-3.07-(9)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -3.07 + (((tickAnim - 10) / 8) * (-9-(-3.07)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -9 + (((tickAnim - 18) / 6) * (-0.92006-(-9)));
            yy = 0 + (((tickAnim - 18) / 6) * (0.01569-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (-0.00981-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -0.92006 + (((tickAnim - 24) / 9) * (4.99958-(-0.92006)));
            yy = 0.01569 + (((tickAnim - 24) / 9) * (0.05629-(0.01569)));
            zz = -0.00981 + (((tickAnim - 24) / 9) * (-0.04085-(-0.00981)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 4.99958 + (((tickAnim - 33) / 5) * (4.5-(4.99958)));
            yy = 0.05629 + (((tickAnim - 33) / 5) * (0-(0.05629)));
            zz = -0.04085 + (((tickAnim - 33) / 5) * (0-(-0.04085)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 4.5 + (((tickAnim - 38) / 3) * (7-(4.5)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 7 + (((tickAnim - 41) / 2) * (17-(7)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5 + (((tickAnim - 0) / 4) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 13.5 + (((tickAnim - 4) / 6) * (13.93-(13.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 13.93 + (((tickAnim - 10) / 3) * (8.53-(13.93)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 8.53 + (((tickAnim - 13) / 5) * (20-(8.53)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 20 + (((tickAnim - 18) / 6) * (7.85004-(20)));
            yy = 0 + (((tickAnim - 18) / 6) * (-0.00863-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.00882-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 7.85004 + (((tickAnim - 24) / 9) * (-2.99956-(7.85004)));
            yy = -0.00863 + (((tickAnim - 24) / 9) * (-0.04482-(-0.00863)));
            zz = 0.00882 + (((tickAnim - 24) / 9) * (0.06762-(0.00882)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -2.99956 + (((tickAnim - 33) / 5) * (-9.44-(-2.99956)));
            yy = -0.04482 + (((tickAnim - 33) / 5) * (0-(-0.04482)));
            zz = 0.06762 + (((tickAnim - 33) / 5) * (0-(0.06762)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -9.44 + (((tickAnim - 38) / 3) * (-6.98-(-9.44)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = -6.98 + (((tickAnim - 41) / 2) * (-5-(-6.98)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -5 + (((tickAnim - 0) / 7) * (9-(-5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 9 + (((tickAnim - 7) / 4) * (18-(9)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 18 + (((tickAnim - 11) / 4) * (19.00006-(18)));
            yy = 0 + (((tickAnim - 11) / 4) * (0.0136-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-0.00817-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 19.00006 + (((tickAnim - 15) / 5) * (5-(19.00006)));
            yy = 0.0136 + (((tickAnim - 15) / 5) * (0-(0.0136)));
            zz = -0.00817 + (((tickAnim - 15) / 5) * (0-(-0.00817)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 5 + (((tickAnim - 20) / 4) * (-13-(5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -13 + (((tickAnim - 24) / 4) * (-21.36-(-13)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -21.36 + (((tickAnim - 28) / 4) * (-15-(-21.36)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -15 + (((tickAnim - 32) / 6) * (-11-(-15)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -11 + (((tickAnim - 38) / 5) * (-5-(-11)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3 + (((tickAnim - 0) / 7) * (1-(3)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 7) / 4) * (-6-(1)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 11) / 4) * (1.99977-(-6)));
            yy = 0 + (((tickAnim - 11) / 4) * (-0.02983-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.04679-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.99977 + (((tickAnim - 15) / 5) * (25-(1.99977)));
            yy = -0.02983 + (((tickAnim - 15) / 5) * (0-(-0.02983)));
            zz = 0.04679 + (((tickAnim - 15) / 5) * (0-(0.04679)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 25 + (((tickAnim - 20) / 4) * (23-(25)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 23 + (((tickAnim - 24) / 8) * (-10-(23)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -10 + (((tickAnim - 32) / 6) * (-13-(-10)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -13 + (((tickAnim - 38) / 5) * (3-(-13)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2 + (((tickAnim - 0) / 7) * (-10-(2)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -10 + (((tickAnim - 7) / 4) * (-11-(-10)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11 + (((tickAnim - 11) / 4) * (-4.5-(-11)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.5 + (((tickAnim - 15) / 5) * (-3-(-4.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -3 + (((tickAnim - 20) / 4) * (8-(-3)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 8 + (((tickAnim - 24) / 8) * (3-(8)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 3 + (((tickAnim - 32) / 6) * (24-(3)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 24 + (((tickAnim - 38) / 5) * (2-(24)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+50))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+50))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+50))*2));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 17 + (((tickAnim - 0) / 9) * (25-(17)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 9) / 4) * (32-(25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 32 + (((tickAnim - 13) / 5) * (21-(32)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 21 + (((tickAnim - 18) / 5) * (-4-(21)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -4 + (((tickAnim - 23) / 5) * (-7-(-4)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 28) / 7) * (6-(-7)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 6 + (((tickAnim - 35) / 8) * (17-(6)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -4.00137 + (((tickAnim - 0) / 9) * (4.99611-(-4.00137)));
            yy = 0.07119 + (((tickAnim - 0) / 9) * (-0.1703-(0.07119)));
            zz = 0.1562 + (((tickAnim - 0) / 9) * (0.1901-(0.1562)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 4.99611 + (((tickAnim - 9) / 4) * (-22-(4.99611)));
            yy = -0.1703 + (((tickAnim - 9) / 4) * (0-(-0.1703)));
            zz = 0.1901 + (((tickAnim - 9) / 4) * (0-(0.1901)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -22 + (((tickAnim - 13) / 5) * (-33-(-22)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -33 + (((tickAnim - 18) / 5) * (-8-(-33)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -8 + (((tickAnim - 23) / 5) * (9-(-8)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 9 + (((tickAnim - 28) / 7) * (2.49756-(9)));
            yy = 0 + (((tickAnim - 28) / 7) * (0.1968-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-0.00956-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 2.49756 + (((tickAnim - 35) / 8) * (-4.00137-(2.49756)));
            yy = 0.1968 + (((tickAnim - 35) / 8) * (0.07119-(0.1968)));
            zz = -0.00956 + (((tickAnim - 35) / 8) * (0.1562-(-0.00956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -9.99865 + (((tickAnim - 0) / 9) * (-9-(-9.99865)));
            yy = -0.02017 + (((tickAnim - 0) / 9) * (0-(-0.02017)));
            zz = -0.1532 + (((tickAnim - 0) / 9) * (0-(-0.1532)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -9 + (((tickAnim - 9) / 4) * (9-(-9)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 9 + (((tickAnim - 13) / 5) * (14-(9)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14 + (((tickAnim - 18) / 5) * (11-(14)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 11 + (((tickAnim - 23) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (-3.9988+Math.sin((Math.PI/180)*(1)) -(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (-0.0973-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-0.01579-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -3.9988+Math.sin((Math.PI/180)*(1))  + (((tickAnim - 35) / 8) * (-9.99865-(-3.9988+Math.sin((Math.PI/180)*(1)) )));
            yy = -0.0973 + (((tickAnim - 35) / 8) * (-0.02017-(-0.0973)));
            zz = -0.01579 + (((tickAnim - 35) / 8) * (-0.1532-(-0.01579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -13 + (((tickAnim - 0) / 6) * (-0.38-(-13)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.38 + (((tickAnim - 6) / 7) * (7.69-(-0.38)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 7.69 + (((tickAnim - 13) / 9) * (16.24-(7.69)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 16.24 + (((tickAnim - 22) / 4) * (23.41-(16.24)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 23.41 + (((tickAnim - 26) / 5) * (21-(23.41)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 21 + (((tickAnim - 31) / 4) * (17-(21)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 17 + (((tickAnim - 35) / 3) * (1.14-(17)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 1.14 + (((tickAnim - 38) / 5) * (-13-(1.14)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15 + (((tickAnim - 0) / 6) * (-1.44-(15)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.44 + (((tickAnim - 6) / 7) * (-0.66232-(-1.44)));
            yy = 0 + (((tickAnim - 6) / 7) * (-0.17773-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0.02121-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = -0.66232 + (((tickAnim - 13) / 9) * (-0.61082-(-0.66232)));
            yy = -0.17773 + (((tickAnim - 13) / 9) * (-0.03201-(-0.17773)));
            zz = 0.02121 + (((tickAnim - 13) / 9) * (-0.08595-(0.02121)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -0.61082 + (((tickAnim - 22) / 4) * (-7.2-(-0.61082)));
            yy = -0.03201 + (((tickAnim - 22) / 4) * (0-(-0.03201)));
            zz = -0.08595 + (((tickAnim - 22) / 4) * (0-(-0.08595)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -7.2 + (((tickAnim - 26) / 5) * (-17-(-7.2)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -17 + (((tickAnim - 31) / 4) * (-24-(-17)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -24 + (((tickAnim - 35) / 3) * (-16.29-(-24)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -16.29 + (((tickAnim - 38) / 5) * (15-(-16.29)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -4 + (((tickAnim - 0) / 6) * (2.17-(-4)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 2.17 + (((tickAnim - 6) / 7) * (-3.78835-(2.17)));
            yy = 0 + (((tickAnim - 6) / 7) * (0.12684-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0.01638-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = -3.78835 + (((tickAnim - 13) / 9) * (-11.89949-(-3.78835)));
            yy = 0.12684 + (((tickAnim - 13) / 9) * (0.00606-(0.12684)));
            zz = 0.01638 + (((tickAnim - 13) / 9) * (0.05471-(0.01638)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -11.89949 + (((tickAnim - 22) / 4) * (5.03-(-11.89949)));
            yy = 0.00606 + (((tickAnim - 22) / 4) * (0-(0.00606)));
            zz = 0.05471 + (((tickAnim - 22) / 4) * (0-(0.05471)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 5.03 + (((tickAnim - 26) / 5) * (14-(5.03)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 31) / 4) * (22-(14)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 22 + (((tickAnim - 35) / 3) * (14.86-(22)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 14.86 + (((tickAnim - 38) / 5) * (-4-(14.86)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+50))*0.1), hip.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*0.5), hip.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-115))*0.8));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-6.9713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-50))*1), tail3.rotateAngleY + (float) Math.toRadians(-0.454+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-50))*4), tail3.rotateAngleZ + (float) Math.toRadians(-0.1963+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-50))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-70))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-70))*4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-70))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(8.8713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-90))*5), tail5.rotateAngleY + (float) Math.toRadians(1.5519+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-90))*4), tail5.rotateAngleZ + (float) Math.toRadians(-0.8816+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-90))*3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(20.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.125-50))*10), tail6.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-50))*2), tail6.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-50))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.125))*0.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+100))*1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.125))*0.9));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0.0624+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.125-200))*0.75), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+100))*-1.5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.125-200))*.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+100))*0.25), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*-0.05));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.125-200))*0.5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+200))*0.1), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*-0.05));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.125-200))*0.25), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+300))*0.5), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125))*-0.2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-15.6838+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.125-200))*1), neck5.rotateAngleY + (float) Math.toRadians(2.5475+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.125+400))*0.5), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(16+Math.cos((Math.PI/180)*((((double)tickAnim/20D))*360/2.125-200))*1.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCamarasaurus e = (EntityPrehistoricFloraCamarasaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
