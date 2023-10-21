package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHuayangosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHuayangosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended hips;
    private final AdvancedModelRendererExtended Hips_r1;
    private final AdvancedModelRendererExtended HipPlates;
    private final AdvancedModelRendererExtended LeftPlate11;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r1;
    private final AdvancedModelRendererExtended RightPlate11;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r2;
    private final AdvancedModelRendererExtended LeftPlate12;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r3;
    private final AdvancedModelRendererExtended RightPlate12;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r4;
    private final AdvancedModelRendererExtended leftLeg;
    private final AdvancedModelRendererExtended leftLeg2;
    private final AdvancedModelRendererExtended leftFoot;
    private final AdvancedModelRendererExtended rightLeg;
    private final AdvancedModelRendererExtended rightLeg2;
    private final AdvancedModelRendererExtended rightFoot;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended TailPlates;
    private final AdvancedModelRendererExtended leftPlate13;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r5;
    private final AdvancedModelRendererExtended rightPlate13;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r6;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended Tail2Plates;
    private final AdvancedModelRendererExtended leftPlate14;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r7;
    private final AdvancedModelRendererExtended rightPlate14;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r8;
    private final AdvancedModelRendererExtended leftPlate15;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r9;
    private final AdvancedModelRendererExtended rightPlate15;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r10;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended Tail3Plates;
    private final AdvancedModelRendererExtended leftPlate16;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r11;
    private final AdvancedModelRendererExtended rightPlate16;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r12;
    private final AdvancedModelRendererExtended leftPlate17;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r13;
    private final AdvancedModelRendererExtended rightPlate17;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r14;
    private final AdvancedModelRendererExtended leftPlate18;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r15;
    private final AdvancedModelRendererExtended rightPlate18;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r16;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended Tail4Spikes;
    private final AdvancedModelRendererExtended leftTailSpike1;
    private final AdvancedModelRendererExtended babyskewer_r1;
    private final AdvancedModelRendererExtended Lefttailmiddleendspike_r1;
    private final AdvancedModelRendererExtended rightTailSpike1;
    private final AdvancedModelRendererExtended babyskewer_r2;
    private final AdvancedModelRendererExtended Lefttailmiddleendspike_r2;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended Tail5Spikes;
    private final AdvancedModelRendererExtended leftTailSpike2;
    private final AdvancedModelRendererExtended babyskewer_r3;
    private final AdvancedModelRendererExtended Lefttailendspike_r1;
    private final AdvancedModelRendererExtended rightTailSpike2;
    private final AdvancedModelRendererExtended babyskewer_r4;
    private final AdvancedModelRendererExtended Lefttailendspike_r2;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended BodyPlates;
    private final AdvancedModelRendererExtended leftPlate7;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r17;
    private final AdvancedModelRendererExtended rightPlate7;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r18;
    private final AdvancedModelRendererExtended leftPlate8;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r19;
    private final AdvancedModelRendererExtended rightPlate8;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r20;
    private final AdvancedModelRendererExtended leftPlate9;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r21;
    private final AdvancedModelRendererExtended rightPlate9;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r22;
    private final AdvancedModelRendererExtended leftPlate10;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r23;
    private final AdvancedModelRendererExtended rightPlate10;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r24;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended Bodyfrontslope_r1;
    private final AdvancedModelRendererExtended ChestPlates;
    private final AdvancedModelRendererExtended leftPlate5;
    private final AdvancedModelRendererExtended rightPlate5;
    private final AdvancedModelRendererExtended leftPlate6;
    private final AdvancedModelRendererExtended rightPlate6;
    private final AdvancedModelRendererExtended Leftlegspike;
    private final AdvancedModelRendererExtended Leftlegspiketip_r1;
    private final AdvancedModelRendererExtended Leftlegspikebase_r1;
    private final AdvancedModelRendererExtended Rightlegspike;
    private final AdvancedModelRendererExtended Leftlegspiketip_r2;
    private final AdvancedModelRendererExtended Leftlegspikebase_r2;
    private final AdvancedModelRendererExtended leftArm;
    private final AdvancedModelRendererExtended leftArm2;
    private final AdvancedModelRendererExtended leftHand;
    private final AdvancedModelRendererExtended rightArm;
    private final AdvancedModelRendererExtended rightArm2;
    private final AdvancedModelRendererExtended rightHand;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended NeckPlates;
    private final AdvancedModelRendererExtended leftPlate3;
    private final AdvancedModelRendererExtended rightPlate3;
    private final AdvancedModelRendererExtended leftPlate4;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r25;
    private final AdvancedModelRendererExtended rightPlate4;
    private final AdvancedModelRendererExtended Leftneckfrontplate_r26;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended Neck2Plates;
    private final AdvancedModelRendererExtended leftPlate2;
    private final AdvancedModelRendererExtended rightPlate2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended Neck3Plates;
    private final AdvancedModelRendererExtended leftPlate1;
    private final AdvancedModelRendererExtended rightPlate1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r1;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r2;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended Upperjawfront_r1;
    private final AdvancedModelRendererExtended Upperjawfront_r2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Upperjawslopefront_r1;
    private final AdvancedModelRendererExtended Upperjawslopefront_r2;
    private final AdvancedModelRendererExtended Upperjawslopebase_r1;
    private final AdvancedModelRendererExtended Upperjawfront_r3;
    private final AdvancedModelRendererExtended Upperjawfront_r4;
    private final AdvancedModelRendererExtended Upperjawfront_r5;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended Rightcheeklower_r1;
    private final AdvancedModelRendererExtended Lowerjawfront_r1;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r3;
    private final AdvancedModelRendererExtended Lowerjawfront_r2;
    private final AdvancedModelRendererExtended Lowerjawfront_r3;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r4;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r5;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r6;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r7;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r8;
    private final AdvancedModelRendererExtended Lowerjawbase_r1;

    private ModelAnimator animator;

    public ModelHuayangosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 6.9F, 0.0F);


        this.hips = new AdvancedModelRendererExtended(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.root.addChild(hips);


        this.Hips_r1 = new AdvancedModelRendererExtended(this);
        this.Hips_r1.setRotationPoint(0.0F, -7.25F, 1.0F);
        this.hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1745F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 27, -4.5F, 0.1F, -0.75F, 9, 12, 10, 0.0F, false));

        this.HipPlates = new AdvancedModelRendererExtended(this);
        this.HipPlates.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(HipPlates);


        this.LeftPlate11 = new AdvancedModelRendererExtended(this);
        this.LeftPlate11.setRotationPoint(2.5F, -9.25F, 7.85F);
        this.HipPlates.addChild(LeftPlate11);
        this.setRotateAngle(LeftPlate11, -0.7298F, 0.1468F, 0.162F);
        this.LeftPlate11.cubeList.add(new ModelBox(LeftPlate11, 49, 68, -1.0F, -1.0F, -0.25F, 1, 6, 1, 0.0F, false));

        this.Leftneckfrontplate_r1 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r1.setRotationPoint(0.0F, -1.0F, -0.25F);
        this.LeftPlate11.addChild(Leftneckfrontplate_r1);
        this.setRotateAngle(Leftneckfrontplate_r1, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r1.cubeList.add(new ModelBox(Leftneckfrontplate_r1, 56, 82, -1.0F, 0.0F, 0.0F, 1, 7, 1, -0.01F, false));

        this.RightPlate11 = new AdvancedModelRendererExtended(this);
        this.RightPlate11.setRotationPoint(-2.5F, -9.25F, 7.85F);
        this.HipPlates.addChild(RightPlate11);
        this.setRotateAngle(RightPlate11, -0.7298F, -0.1468F, -0.162F);
        this.RightPlate11.cubeList.add(new ModelBox(RightPlate11, 49, 68, 0.0F, -1.0F, -0.25F, 1, 6, 1, 0.0F, true));

        this.Leftneckfrontplate_r2 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r2.setRotationPoint(0.0F, -1.0F, -0.25F);
        this.RightPlate11.addChild(Leftneckfrontplate_r2);
        this.setRotateAngle(Leftneckfrontplate_r2, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r2.cubeList.add(new ModelBox(Leftneckfrontplate_r2, 56, 82, 0.0F, 0.0F, 0.0F, 1, 7, 1, -0.01F, true));

        this.LeftPlate12 = new AdvancedModelRendererExtended(this);
        this.LeftPlate12.setRotationPoint(2.25F, -7.0F, 10.3F);
        this.HipPlates.addChild(LeftPlate12);
        this.setRotateAngle(LeftPlate12, -0.5996F, 0.1245F, 0.1796F);


        this.Leftneckfrontplate_r3 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r3.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.LeftPlate12.addChild(Leftneckfrontplate_r3);
        this.setRotateAngle(Leftneckfrontplate_r3, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r3.cubeList.add(new ModelBox(Leftneckfrontplate_r3, 50, 0, -1.0F, -2.15F, -1.15F, 1, 5, 2, 0.0F, false));

        this.RightPlate12 = new AdvancedModelRendererExtended(this);
        this.RightPlate12.setRotationPoint(-2.25F, -7.0F, 10.3F);
        this.HipPlates.addChild(RightPlate12);
        this.setRotateAngle(RightPlate12, -0.5996F, -0.1245F, -0.1796F);


        this.Leftneckfrontplate_r4 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r4.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.RightPlate12.addChild(Leftneckfrontplate_r4);
        this.setRotateAngle(Leftneckfrontplate_r4, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r4.cubeList.add(new ModelBox(Leftneckfrontplate_r4, 50, 0, 0.0F, -2.15F, -1.15F, 1, 5, 2, 0.0F, true));

        this.leftLeg = new AdvancedModelRendererExtended(this);
        this.leftLeg.setRotationPoint(4.25F, -2.25F, 3.75F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0865F, -0.0114F, -0.1304F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 69, 17, -2.5F, -1.5F, -3.0F, 5, 11, 6, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRendererExtended(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.25F, -2.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1731F, -0.0227F, 0.1289F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 34, 78, -1.5F, -0.1375F, -0.3567F, 3, 10, 4, 0.0F, false));

        this.leftFoot = new AdvancedModelRendererExtended(this);
        this.leftFoot.setRotationPoint(0.0F, 8.6125F, 1.8933F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.0873F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 69, 0, -2.5F, -0.0436F, -4.251F, 5, 2, 6, 0.0F, false));

        this.rightLeg = new AdvancedModelRendererExtended(this);
        this.rightLeg.setRotationPoint(-4.25F, -2.25F, 3.75F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0865F, 0.0114F, 0.1304F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 69, 17, -2.5F, -1.5F, -3.0F, 5, 11, 6, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRendererExtended(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.25F, -2.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1731F, 0.0227F, -0.1289F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 34, 78, -1.5F, -0.1375F, -0.3567F, 3, 10, 4, 0.0F, true));

        this.rightFoot = new AdvancedModelRendererExtended(this);
        this.rightFoot.setRotationPoint(0.0F, 8.6125F, 1.8933F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.0873F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 69, 0, -2.5F, -0.0436F, -4.251F, 5, 2, 6, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(-0.5F, -5.45F, 9.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 50, -3.0F, 0.0F, -0.25F, 7, 9, 7, 0.0F, false));

        this.TailPlates = new AdvancedModelRendererExtended(this);
        this.TailPlates.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(TailPlates);


        this.leftPlate13 = new AdvancedModelRendererExtended(this);
        this.leftPlate13.setRotationPoint(2.5F, -1.3F, 4.45F);
        this.TailPlates.addChild(leftPlate13);
        this.setRotateAngle(leftPlate13, -0.2132F, 0.0469F, 0.2132F);


        this.Leftneckfrontplate_r5 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r5.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate13.addChild(Leftneckfrontplate_r5);
        this.setRotateAngle(Leftneckfrontplate_r5, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r5.cubeList.add(new ModelBox(Leftneckfrontplate_r5, 49, 82, -1.0F, -2.15F, -1.25F, 1, 4, 2, 0.0F, false));

        this.rightPlate13 = new AdvancedModelRendererExtended(this);
        this.rightPlate13.setRotationPoint(-1.5F, -1.3F, 4.45F);
        this.TailPlates.addChild(rightPlate13);
        this.setRotateAngle(rightPlate13, -0.2132F, -0.0469F, -0.2132F);


        this.Leftneckfrontplate_r6 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r6.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate13.addChild(Leftneckfrontplate_r6);
        this.setRotateAngle(Leftneckfrontplate_r6, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r6.cubeList.add(new ModelBox(Leftneckfrontplate_r6, 49, 82, 0.0F, -2.15F, -1.25F, 1, 4, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 6.75F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 49, 0, -2.0F, 0.0F, -2.0F, 5, 7, 9, 0.0F, false));

        this.Tail2Plates = new AdvancedModelRendererExtended(this);
        this.Tail2Plates.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(Tail2Plates);


        this.leftPlate14 = new AdvancedModelRendererExtended(this);
        this.leftPlate14.setRotationPoint(2.0F, -1.8F, 1.5F);
        this.Tail2Plates.addChild(leftPlate14);
        this.setRotateAngle(leftPlate14, -0.3011F, 0.0522F, 0.1666F);


        this.Leftneckfrontplate_r7 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r7.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate14.addChild(Leftneckfrontplate_r7);
        this.setRotateAngle(Leftneckfrontplate_r7, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r7.cubeList.add(new ModelBox(Leftneckfrontplate_r7, 0, 50, -1.0F, -1.45F, -1.25F, 1, 4, 2, 0.0F, false));

        this.rightPlate14 = new AdvancedModelRendererExtended(this);
        this.rightPlate14.setRotationPoint(-1.0F, -1.8F, 1.5F);
        this.Tail2Plates.addChild(rightPlate14);
        this.setRotateAngle(rightPlate14, -0.3011F, -0.0522F, -0.1666F);


        this.Leftneckfrontplate_r8 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r8.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate14.addChild(Leftneckfrontplate_r8);
        this.setRotateAngle(Leftneckfrontplate_r8, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r8.cubeList.add(new ModelBox(Leftneckfrontplate_r8, 0, 50, 0.0F, -1.45F, -1.25F, 1, 4, 2, 0.0F, true));

        this.leftPlate15 = new AdvancedModelRendererExtended(this);
        this.leftPlate15.setRotationPoint(2.0F, -1.15F, 5.2F);
        this.Tail2Plates.addChild(leftPlate15);
        this.setRotateAngle(leftPlate15, -0.303F, 0.0393F, 0.1249F);


        this.Leftneckfrontplate_r9 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r9.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate15.addChild(Leftneckfrontplate_r9);
        this.setRotateAngle(Leftneckfrontplate_r9, 0.0436F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r9.cubeList.add(new ModelBox(Leftneckfrontplate_r9, 83, 68, -1.0F, -1.45F, -1.25F, 1, 3, 2, 0.0F, false));

        this.rightPlate15 = new AdvancedModelRendererExtended(this);
        this.rightPlate15.setRotationPoint(-1.0F, -1.15F, 5.2F);
        this.Tail2Plates.addChild(rightPlate15);
        this.setRotateAngle(rightPlate15, -0.303F, -0.0393F, -0.1249F);


        this.Leftneckfrontplate_r10 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r10.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate15.addChild(Leftneckfrontplate_r10);
        this.setRotateAngle(Leftneckfrontplate_r10, 0.0436F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r10.cubeList.add(new ModelBox(Leftneckfrontplate_r10, 83, 68, 0.0F, -1.45F, -1.25F, 1, 3, 2, 0.0F, true));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 58, 55, -1.5F, 0.0F, -1.0F, 4, 5, 9, 0.0F, false));

        this.Tail3Plates = new AdvancedModelRendererExtended(this);
        this.Tail3Plates.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(Tail3Plates);


        this.leftPlate16 = new AdvancedModelRendererExtended(this);
        this.leftPlate16.setRotationPoint(1.5F, -1.0F, 0.85F);
        this.Tail3Plates.addChild(leftPlate16);
        this.setRotateAngle(leftPlate16, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r11 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r11.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate16.addChild(Leftneckfrontplate_r11);
        this.setRotateAngle(Leftneckfrontplate_r11, -0.3491F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r11.cubeList.add(new ModelBox(Leftneckfrontplate_r11, 69, 0, 0.0F, -1.45F, -0.85F, 0, 3, 2, 0.0F, false));

        this.rightPlate16 = new AdvancedModelRendererExtended(this);
        this.rightPlate16.setRotationPoint(-0.5F, -1.0F, 0.85F);
        this.Tail3Plates.addChild(rightPlate16);
        this.setRotateAngle(rightPlate16, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r12 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r12.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate16.addChild(Leftneckfrontplate_r12);
        this.setRotateAngle(Leftneckfrontplate_r12, -0.3491F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r12.cubeList.add(new ModelBox(Leftneckfrontplate_r12, 69, 0, 0.0F, -1.45F, -0.85F, 0, 3, 2, 0.0F, true));

        this.leftPlate17 = new AdvancedModelRendererExtended(this);
        this.leftPlate17.setRotationPoint(1.25F, 0.25F, 3.85F);
        this.Tail3Plates.addChild(leftPlate17);
        this.setRotateAngle(leftPlate17, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r13 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r13.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate17.addChild(Leftneckfrontplate_r13);
        this.setRotateAngle(Leftneckfrontplate_r13, -0.2182F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r13.cubeList.add(new ModelBox(Leftneckfrontplate_r13, 29, 27, 0.0F, -2.0F, -0.55F, 0, 2, 2, 0.0F, false));

        this.rightPlate17 = new AdvancedModelRendererExtended(this);
        this.rightPlate17.setRotationPoint(-0.25F, 0.25F, 3.85F);
        this.Tail3Plates.addChild(rightPlate17);
        this.setRotateAngle(rightPlate17, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r14 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r14.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate17.addChild(Leftneckfrontplate_r14);
        this.setRotateAngle(Leftneckfrontplate_r14, -0.2182F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r14.cubeList.add(new ModelBox(Leftneckfrontplate_r14, 29, 27, 0.0F, -2.0F, -0.55F, 0, 2, 2, 0.0F, true));

        this.leftPlate18 = new AdvancedModelRendererExtended(this);
        this.leftPlate18.setRotationPoint(1.0F, 0.5F, 7.35F);
        this.Tail3Plates.addChild(leftPlate18);
        this.setRotateAngle(leftPlate18, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r15 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r15.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate18.addChild(Leftneckfrontplate_r15);
        this.setRotateAngle(Leftneckfrontplate_r15, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r15.cubeList.add(new ModelBox(Leftneckfrontplate_r15, 37, 0, 0.0F, -1.75F, -0.75F, 0, 1, 1, 0.0F, false));

        this.rightPlate18 = new AdvancedModelRendererExtended(this);
        this.rightPlate18.setRotationPoint(0.0F, 0.5F, 7.35F);
        this.Tail3Plates.addChild(rightPlate18);
        this.setRotateAngle(rightPlate18, 0.1309F, 0.0F, 0.0F);


        this.Leftneckfrontplate_r16 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r16.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate18.addChild(Leftneckfrontplate_r16);
        this.setRotateAngle(Leftneckfrontplate_r16, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r16.cubeList.add(new ModelBox(Leftneckfrontplate_r16, 37, 0, 0.0F, -1.75F, -0.75F, 0, 1, 1, 0.0F, true));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 70, 38, -1.0F, 0.0F, -1.0F, 3, 3, 8, 0.0F, false));

        this.Tail4Spikes = new AdvancedModelRendererExtended(this);
        this.Tail4Spikes.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(Tail4Spikes);


        this.leftTailSpike1 = new AdvancedModelRendererExtended(this);
        this.leftTailSpike1.setRotationPoint(1.5F, 4.15F, 3.65F);
        this.Tail4Spikes.addChild(leftTailSpike1);
        this.setRotateAngle(leftTailSpike1, -0.4504F, -0.039F, 1.0778F);
        this.leftTailSpike1.cubeList.add(new ModelBox(leftTailSpike1, 76, 54, -3.25F, -9.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.babyskewer_r1 = new AdvancedModelRendererExtended(this);
        this.babyskewer_r1.setRotationPoint(-2.75F, -8.95F, -0.5F);
        this.leftTailSpike1.addChild(babyskewer_r1);
        this.setRotateAngle(babyskewer_r1, -0.1309F, 0.0F, 0.0F);
        this.babyskewer_r1.cubeList.add(new ModelBox(babyskewer_r1, 85, 9, -0.5F, 2.75F, 0.1F, 1, 5, 1, -0.02F, false));

        this.Lefttailmiddleendspike_r1 = new AdvancedModelRendererExtended(this);
        this.Lefttailmiddleendspike_r1.setRotationPoint(-2.75F, -8.95F, -0.5F);
        this.leftTailSpike1.addChild(Lefttailmiddleendspike_r1);
        this.setRotateAngle(Lefttailmiddleendspike_r1, -0.1745F, 0.0F, 0.0F);
        this.Lefttailmiddleendspike_r1.cubeList.add(new ModelBox(Lefttailmiddleendspike_r1, 5, 27, -0.5F, -0.05F, 0.0F, 1, 8, 1, -0.01F, false));

        this.rightTailSpike1 = new AdvancedModelRendererExtended(this);
        this.rightTailSpike1.setRotationPoint(-0.5F, 4.15F, 3.65F);
        this.Tail4Spikes.addChild(rightTailSpike1);
        this.setRotateAngle(rightTailSpike1, -0.4504F, 0.039F, -1.0778F);
        this.rightTailSpike1.cubeList.add(new ModelBox(rightTailSpike1, 76, 54, 2.25F, -9.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.babyskewer_r2 = new AdvancedModelRendererExtended(this);
        this.babyskewer_r2.setRotationPoint(2.75F, -8.95F, -0.5F);
        this.rightTailSpike1.addChild(babyskewer_r2);
        this.setRotateAngle(babyskewer_r2, -0.1309F, 0.0F, 0.0F);
        this.babyskewer_r2.cubeList.add(new ModelBox(babyskewer_r2, 85, 9, -0.5F, 2.75F, 0.1F, 1, 5, 1, -0.02F, true));

        this.Lefttailmiddleendspike_r2 = new AdvancedModelRendererExtended(this);
        this.Lefttailmiddleendspike_r2.setRotationPoint(2.75F, -8.95F, -0.5F);
        this.rightTailSpike1.addChild(Lefttailmiddleendspike_r2);
        this.setRotateAngle(Lefttailmiddleendspike_r2, -0.1745F, 0.0F, 0.0F);
        this.Lefttailmiddleendspike_r2.cubeList.add(new ModelBox(Lefttailmiddleendspike_r2, 5, 27, -0.5F, -0.05F, 0.0F, 1, 8, 1, -0.01F, true));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.5F, 7.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 70, 70, -0.5F, -0.25F, -1.0F, 2, 2, 8, 0.0F, false));

        this.Tail5Spikes = new AdvancedModelRendererExtended(this);
        this.Tail5Spikes.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail5.addChild(Tail5Spikes);


        this.leftTailSpike2 = new AdvancedModelRendererExtended(this);
        this.leftTailSpike2.setRotationPoint(0.2F, 1.9F, 0.85F);
        this.Tail5Spikes.addChild(leftTailSpike2);
        this.setRotateAngle(leftTailSpike2, -0.7352F, -0.0196F, 1.1086F);
        this.leftTailSpike2.cubeList.add(new ModelBox(leftTailSpike2, 81, 50, -1.25F, -8.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.babyskewer_r3 = new AdvancedModelRendererExtended(this);
        this.babyskewer_r3.setRotationPoint(-0.75F, -7.95F, -0.5F);
        this.leftTailSpike2.addChild(babyskewer_r3);
        this.setRotateAngle(babyskewer_r3, -0.1309F, 0.0F, 0.0F);
        this.babyskewer_r3.cubeList.add(new ModelBox(babyskewer_r3, 14, 83, -0.5F, 2.2F, 0.0F, 1, 5, 1, -0.02F, false));

        this.Lefttailendspike_r1 = new AdvancedModelRendererExtended(this);
        this.Lefttailendspike_r1.setRotationPoint(-0.75F, -7.95F, -0.5F);
        this.leftTailSpike2.addChild(Lefttailendspike_r1);
        this.setRotateAngle(Lefttailendspike_r1, -0.1745F, 0.0F, 0.0F);
        this.Lefttailendspike_r1.cubeList.add(new ModelBox(Lefttailendspike_r1, 0, 27, -0.5F, -0.05F, 0.0F, 1, 8, 1, -0.01F, false));

        this.rightTailSpike2 = new AdvancedModelRendererExtended(this);
        this.rightTailSpike2.setRotationPoint(0.8F, 1.9F, 0.85F);
        this.Tail5Spikes.addChild(rightTailSpike2);
        this.setRotateAngle(rightTailSpike2, -0.7352F, 0.0196F, -1.1086F);
        this.rightTailSpike2.cubeList.add(new ModelBox(rightTailSpike2, 81, 50, 0.25F, -8.0F, -0.5F, 1, 7, 1, 0.0F, true));

        this.babyskewer_r4 = new AdvancedModelRendererExtended(this);
        this.babyskewer_r4.setRotationPoint(0.75F, -7.95F, -0.5F);
        this.rightTailSpike2.addChild(babyskewer_r4);
        this.setRotateAngle(babyskewer_r4, -0.1309F, 0.0F, 0.0F);
        this.babyskewer_r4.cubeList.add(new ModelBox(babyskewer_r4, 14, 83, -0.5F, 2.2F, 0.0F, 1, 5, 1, -0.02F, true));

        this.Lefttailendspike_r2 = new AdvancedModelRendererExtended(this);
        this.Lefttailendspike_r2.setRotationPoint(0.75F, -7.95F, -0.5F);
        this.rightTailSpike2.addChild(Lefttailendspike_r2);
        this.setRotateAngle(Lefttailendspike_r2, -0.1745F, 0.0F, 0.0F);
        this.Lefttailendspike_r2.cubeList.add(new ModelBox(Lefttailendspike_r2, 0, 27, -0.5F, -0.05F, 0.0F, 1, 8, 1, -0.01F, true));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -7.25F, -10.0F, 12, 14, 12, 0.2F, false));

        this.BodyPlates = new AdvancedModelRendererExtended(this);
        this.BodyPlates.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(BodyPlates);


        this.leftPlate7 = new AdvancedModelRendererExtended(this);
        this.leftPlate7.setRotationPoint(2.5F, -8.85F, -7.9F);
        this.BodyPlates.addChild(leftPlate7);
        this.setRotateAngle(leftPlate7, 0.0F, 0.0F, 0.2618F);


        this.Leftneckfrontplate_r17 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r17.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate7.addChild(Leftneckfrontplate_r17);
        this.setRotateAngle(Leftneckfrontplate_r17, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r17.cubeList.add(new ModelBox(Leftneckfrontplate_r17, 61, 84, -1.0F, -1.75F, -1.25F, 1, 3, 2, 0.0F, false));

        this.rightPlate7 = new AdvancedModelRendererExtended(this);
        this.rightPlate7.setRotationPoint(-2.5F, -8.85F, -7.9F);
        this.BodyPlates.addChild(rightPlate7);
        this.setRotateAngle(rightPlate7, 0.0F, 0.0F, -0.2618F);


        this.Leftneckfrontplate_r18 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r18.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate7.addChild(Leftneckfrontplate_r18);
        this.setRotateAngle(Leftneckfrontplate_r18, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r18.cubeList.add(new ModelBox(Leftneckfrontplate_r18, 61, 84, 0.0F, -1.75F, -1.25F, 1, 3, 2, 0.0F, true));

        this.leftPlate8 = new AdvancedModelRendererExtended(this);
        this.leftPlate8.setRotationPoint(2.75F, -9.5F, -4.05F);
        this.BodyPlates.addChild(leftPlate8);
        this.setRotateAngle(leftPlate8, -0.211F, 0.056F, 0.2559F);


        this.Leftneckfrontplate_r19 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r19.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate8.addChild(Leftneckfrontplate_r19);
        this.setRotateAngle(Leftneckfrontplate_r19, -0.0873F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r19.cubeList.add(new ModelBox(Leftneckfrontplate_r19, 0, 83, -1.0F, -1.75F, -1.5F, 1, 4, 2, 0.0F, false));

        this.rightPlate8 = new AdvancedModelRendererExtended(this);
        this.rightPlate8.setRotationPoint(-2.75F, -9.5F, -4.05F);
        this.BodyPlates.addChild(rightPlate8);
        this.setRotateAngle(rightPlate8, -0.211F, -0.056F, -0.2559F);


        this.Leftneckfrontplate_r20 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r20.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate8.addChild(Leftneckfrontplate_r20);
        this.setRotateAngle(Leftneckfrontplate_r20, -0.0873F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r20.cubeList.add(new ModelBox(Leftneckfrontplate_r20, 0, 83, 0.0F, -1.75F, -1.5F, 1, 4, 2, 0.0F, true));

        this.leftPlate9 = new AdvancedModelRendererExtended(this);
        this.leftPlate9.setRotationPoint(2.75F, -9.75F, -0.45F);
        this.BodyPlates.addChild(leftPlate9);
        this.setRotateAngle(leftPlate9, -0.211F, 0.056F, 0.2559F);


        this.Leftneckfrontplate_r21 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r21.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.leftPlate9.addChild(Leftneckfrontplate_r21);
        this.setRotateAngle(Leftneckfrontplate_r21, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r21.cubeList.add(new ModelBox(Leftneckfrontplate_r21, 78, 9, -1.0F, -1.75F, -1.25F, 1, 5, 2, 0.0F, false));

        this.rightPlate9 = new AdvancedModelRendererExtended(this);
        this.rightPlate9.setRotationPoint(-2.75F, -9.75F, -0.45F);
        this.BodyPlates.addChild(rightPlate9);
        this.setRotateAngle(rightPlate9, -0.211F, -0.056F, -0.2559F);


        this.Leftneckfrontplate_r22 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r22.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.rightPlate9.addChild(Leftneckfrontplate_r22);
        this.setRotateAngle(Leftneckfrontplate_r22, -0.1309F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r22.cubeList.add(new ModelBox(Leftneckfrontplate_r22, 78, 9, 0.0F, -1.75F, -1.25F, 1, 5, 2, 0.0F, true));

        this.leftPlate10 = new AdvancedModelRendererExtended(this);
        this.leftPlate10.setRotationPoint(2.5F, -10.0F, 3.4F);
        this.BodyPlates.addChild(leftPlate10);
        this.setRotateAngle(leftPlate10, -0.5133F, 0.1084F, 0.1897F);
        this.leftPlate10.cubeList.add(new ModelBox(leftPlate10, 86, 16, -1.0F, -1.0F, -0.25F, 1, 5, 1, 0.0F, false));

        this.Leftneckfrontplate_r23 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r23.setRotationPoint(0.0F, -1.0F, -0.25F);
        this.leftPlate10.addChild(Leftneckfrontplate_r23);
        this.setRotateAngle(Leftneckfrontplate_r23, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r23.cubeList.add(new ModelBox(Leftneckfrontplate_r23, 85, 35, -1.0F, 0.0F, 0.0F, 1, 5, 1, -0.01F, false));

        this.rightPlate10 = new AdvancedModelRendererExtended(this);
        this.rightPlate10.setRotationPoint(-2.5F, -10.0F, 3.4F);
        this.BodyPlates.addChild(rightPlate10);
        this.setRotateAngle(rightPlate10, -0.5133F, -0.1084F, -0.1897F);
        this.rightPlate10.cubeList.add(new ModelBox(rightPlate10, 86, 16, 0.0F, -1.0F, -0.25F, 1, 5, 1, 0.0F, true));

        this.Leftneckfrontplate_r24 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r24.setRotationPoint(0.0F, -1.0F, -0.25F);
        this.rightPlate10.addChild(Leftneckfrontplate_r24);
        this.setRotateAngle(Leftneckfrontplate_r24, -0.1745F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r24.cubeList.add(new ModelBox(Leftneckfrontplate_r24, 85, 35, 0.0F, 0.0F, 0.0F, 1, 5, 1, -0.01F, true));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, -0.954F, -8.8452F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 39, 27, -5.0F, -3.046F, -8.9048F, 10, 9, 9, -0.01F, false));

        this.Bodyfrontslope_r1 = new AdvancedModelRendererExtended(this);
        this.Bodyfrontslope_r1.setRotationPoint(0.0F, -2.4822F, -8.6834F);
        this.chest.addChild(Bodyfrontslope_r1);
        this.setRotateAngle(Bodyfrontslope_r1, 0.3927F, 0.0F, 0.0F);
        this.Bodyfrontslope_r1.cubeList.add(new ModelBox(Bodyfrontslope_r1, 30, 46, -4.5F, -0.4076F, -0.018F, 9, 8, 9, 0.0F, false));

        this.ChestPlates = new AdvancedModelRendererExtended(this);
        this.ChestPlates.setRotationPoint(3.35F, -0.746F, -4.6548F);
        this.chest.addChild(ChestPlates);


        this.leftPlate5 = new AdvancedModelRendererExtended(this);
        this.leftPlate5.setRotationPoint(-1.35F, -4.45F, -3.15F);
        this.ChestPlates.addChild(leftPlate5);
        this.setRotateAngle(leftPlate5, 0.1278F, -0.0283F, 0.2164F);
        this.leftPlate5.cubeList.add(new ModelBox(leftPlate5, 0, 0, -1.0F, -1.5F, 0.25F, 1, 4, 3, 0.0F, false));

        this.rightPlate5 = new AdvancedModelRendererExtended(this);
        this.rightPlate5.setRotationPoint(-5.35F, -4.45F, -3.15F);
        this.ChestPlates.addChild(rightPlate5);
        this.setRotateAngle(rightPlate5, 0.1278F, 0.0283F, -0.2164F);
        this.rightPlate5.cubeList.add(new ModelBox(rightPlate5, 0, 0, 0.0F, -1.5F, 0.25F, 1, 4, 3, 0.0F, true));

        this.leftPlate6 = new AdvancedModelRendererExtended(this);
        this.leftPlate6.setRotationPoint(-1.1F, -5.95F, -0.15F);
        this.ChestPlates.addChild(leftPlate6);
        this.setRotateAngle(leftPlate6, 0.0F, 0.0F, 0.2182F);
        this.leftPlate6.cubeList.add(new ModelBox(leftPlate6, 7, 83, -1.0F, -1.5F, 1.25F, 1, 4, 2, 0.0F, false));

        this.rightPlate6 = new AdvancedModelRendererExtended(this);
        this.rightPlate6.setRotationPoint(-5.6F, -5.95F, -0.15F);
        this.ChestPlates.addChild(rightPlate6);
        this.setRotateAngle(rightPlate6, 0.0F, 0.0F, -0.2182F);
        this.rightPlate6.cubeList.add(new ModelBox(rightPlate6, 7, 83, 0.0F, -1.5F, 1.25F, 1, 4, 2, 0.0F, true));

        this.Leftlegspike = new AdvancedModelRendererExtended(this);
        this.Leftlegspike.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestPlates.addChild(Leftlegspike);
        this.setRotateAngle(Leftlegspike, -0.0061F, 0.4402F, -0.1009F);


        this.Leftlegspiketip_r1 = new AdvancedModelRendererExtended(this);
        this.Leftlegspiketip_r1.setRotationPoint(3.1819F, -0.9069F, 3.5014F);
        this.Leftlegspike.addChild(Leftlegspiketip_r1);
        this.setRotateAngle(Leftlegspiketip_r1, 2.0425F, -1.3967F, -2.1322F);
        this.Leftlegspiketip_r1.cubeList.add(new ModelBox(Leftlegspiketip_r1, 49, 17, -1.5009F, -1.0468F, -1.1014F, 7, 1, 1, 0.0F, false));

        this.Leftlegspikebase_r1 = new AdvancedModelRendererExtended(this);
        this.Leftlegspikebase_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Leftlegspike.addChild(Leftlegspikebase_r1);
        this.setRotateAngle(Leftlegspikebase_r1, 0.2986F, -0.841F, -0.3189F);
        this.Leftlegspikebase_r1.cubeList.add(new ModelBox(Leftlegspikebase_r1, 49, 20, -0.75F, -1.5F, -1.7F, 5, 2, 2, 0.0F, false));

        this.Rightlegspike = new AdvancedModelRendererExtended(this);
        this.Rightlegspike.setRotationPoint(-6.7F, 0.0F, 0.0F);
        this.ChestPlates.addChild(Rightlegspike);
        this.setRotateAngle(Rightlegspike, -0.0061F, -0.4402F, 0.1009F);


        this.Leftlegspiketip_r2 = new AdvancedModelRendererExtended(this);
        this.Leftlegspiketip_r2.setRotationPoint(-3.1819F, -0.9069F, 3.5014F);
        this.Rightlegspike.addChild(Leftlegspiketip_r2);
        this.setRotateAngle(Leftlegspiketip_r2, 2.0425F, 1.3967F, 2.1322F);
        this.Leftlegspiketip_r2.cubeList.add(new ModelBox(Leftlegspiketip_r2, 49, 17, -5.4991F, -1.0468F, -1.1014F, 7, 1, 1, 0.0F, true));

        this.Leftlegspikebase_r2 = new AdvancedModelRendererExtended(this);
        this.Leftlegspikebase_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Rightlegspike.addChild(Leftlegspikebase_r2);
        this.setRotateAngle(Leftlegspikebase_r2, 0.2986F, 0.841F, 0.3189F);
        this.Leftlegspikebase_r2.cubeList.add(new ModelBox(Leftlegspikebase_r2, 49, 20, -4.25F, -1.5F, -1.7F, 5, 2, 2, 0.0F, true));

        this.leftArm = new AdvancedModelRendererExtended(this);
        this.leftArm.setRotationPoint(3.75F, 2.954F, -5.4048F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.6981F, 0.0F, -0.1745F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 67, -1.5F, -1.5F, -3.0F, 4, 10, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRendererExtended(this);
        this.leftArm2.setRotationPoint(0.0F, 7.5F, 0.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9581F, 0.0561F, 0.0669F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 19, 78, -1.0F, -1.0F, -2.5F, 3, 10, 4, 0.0F, false));

        this.leftHand = new AdvancedModelRendererExtended(this);
        this.leftHand.setRotationPoint(0.0F, 8.0F, -0.75F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2608F, -0.0226F, 0.0843F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 29, 27, -1.5F, 0.0F, -3.0F, 4, 2, 5, 0.0F, false));

        this.rightArm = new AdvancedModelRendererExtended(this);
        this.rightArm.setRotationPoint(-3.75F, 2.954F, -5.4048F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.6981F, 0.0F, 0.1745F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 67, -2.5F, -1.5F, -3.0F, 4, 10, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRendererExtended(this);
        this.rightArm2.setRotationPoint(0.0F, 7.5F, 0.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.9581F, -0.0561F, -0.0669F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 19, 78, -2.0F, -1.0F, -2.5F, 3, 10, 4, 0.0F, true));

        this.rightHand = new AdvancedModelRendererExtended(this);
        this.rightHand.setRotationPoint(0.0F, 8.0F, -0.75F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2608F, 0.0226F, -0.0843F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 29, 27, -2.5F, 0.0F, -3.0F, 4, 2, 5, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(-0.5F, -2.5371F, -9.0454F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 22, 64, -2.5F, -0.009F, -3.8595F, 6, 6, 7, 0.0F, false));

        this.NeckPlates = new AdvancedModelRendererExtended(this);
        this.NeckPlates.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addChild(NeckPlates);


        this.leftPlate3 = new AdvancedModelRendererExtended(this);
        this.leftPlate3.setRotationPoint(2.0F, -1.309F, -3.2595F);
        this.NeckPlates.addChild(leftPlate3);
        this.setRotateAngle(leftPlate3, 0.0F, 0.0F, 0.1309F);
        this.leftPlate3.cubeList.add(new ModelBox(leftPlate3, 83, 84, -1.0F, -1.0F, -0.7F, 1, 3, 2, 0.0F, false));

        this.rightPlate3 = new AdvancedModelRendererExtended(this);
        this.rightPlate3.setRotationPoint(-1.0F, -1.309F, -3.2595F);
        this.NeckPlates.addChild(rightPlate3);
        this.setRotateAngle(rightPlate3, 0.0F, 0.0F, -0.1309F);
        this.rightPlate3.cubeList.add(new ModelBox(rightPlate3, 83, 84, 0.0F, -1.0F, -0.7F, 1, 3, 2, 0.0F, true));

        this.leftPlate4 = new AdvancedModelRendererExtended(this);
        this.leftPlate4.setRotationPoint(2.25F, -2.659F, 0.7405F);
        this.NeckPlates.addChild(leftPlate4);
        this.setRotateAngle(leftPlate4, 0.0886F, 0.0151F, 0.1739F);
        this.leftPlate4.cubeList.add(new ModelBox(leftPlate4, 86, 50, -1.0F, -1.0F, -1.25F, 1, 4, 1, 0.0F, false));

        this.Leftneckfrontplate_r25 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r25.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.leftPlate4.addChild(Leftneckfrontplate_r25);
        this.setRotateAngle(Leftneckfrontplate_r25, -0.2618F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r25.cubeList.add(new ModelBox(Leftneckfrontplate_r25, 86, 0, -1.0F, 0.0F, 0.0F, 1, 4, 1, -0.01F, false));

        this.rightPlate4 = new AdvancedModelRendererExtended(this);
        this.rightPlate4.setRotationPoint(-1.25F, -2.659F, 0.7405F);
        this.NeckPlates.addChild(rightPlate4);
        this.setRotateAngle(rightPlate4, 0.0886F, -0.0151F, -0.1739F);
        this.rightPlate4.cubeList.add(new ModelBox(rightPlate4, 86, 50, 0.0F, -1.0F, -1.25F, 1, 4, 1, 0.0F, true));

        this.Leftneckfrontplate_r26 = new AdvancedModelRendererExtended(this);
        this.Leftneckfrontplate_r26.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.rightPlate4.addChild(Leftneckfrontplate_r26);
        this.setRotateAngle(Leftneckfrontplate_r26, -0.2618F, 0.0F, 0.0F);
        this.Leftneckfrontplate_r26.cubeList.add(new ModelBox(Leftneckfrontplate_r26, 86, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, -0.01F, true));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.241F, -3.3595F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 49, 70, -1.5F, 0.0F, -4.0F, 4, 5, 6, 0.0F, false));

        this.Neck2Plates = new AdvancedModelRendererExtended(this);
        this.Neck2Plates.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck2.addChild(Neck2Plates);


        this.leftPlate2 = new AdvancedModelRendererExtended(this);
        this.leftPlate2.setRotationPoint(1.25F, -0.1F, -2.6F);
        this.Neck2Plates.addChild(leftPlate2);
        this.setRotateAngle(leftPlate2, 0.1745F, 0.0F, 0.0F);
        this.leftPlate2.cubeList.add(new ModelBox(leftPlate2, 68, 86, 0.05F, -1.1F, -1.0F, 0, 2, 2, 0.0F, false));

        this.rightPlate2 = new AdvancedModelRendererExtended(this);
        this.rightPlate2.setRotationPoint(-0.25F, -0.1F, -2.6F);
        this.Neck2Plates.addChild(rightPlate2);
        this.setRotateAngle(rightPlate2, 0.1745F, 0.0F, 0.0F);
        this.rightPlate2.cubeList.add(new ModelBox(rightPlate2, 68, 86, -0.05F, -1.1F, -1.0F, 0, 2, 2, 0.0F, true));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.25F, -4.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1309F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 37, 0, -1.0F, 0.0F, -2.0F, 3, 4, 3, -0.02F, false));

        this.Neck3Plates = new AdvancedModelRendererExtended(this);
        this.Neck3Plates.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck3.addChild(Neck3Plates);


        this.leftPlate1 = new AdvancedModelRendererExtended(this);
        this.leftPlate1.setRotationPoint(1.0F, -0.25F, -0.9F);
        this.Neck3Plates.addChild(leftPlate1);
        this.setRotateAngle(leftPlate1, 0.0436F, 0.0F, 0.0F);
        this.leftPlate1.cubeList.add(new ModelBox(leftPlate1, 9, 3, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.rightPlate1 = new AdvancedModelRendererExtended(this);
        this.rightPlate1.setRotationPoint(0.0F, -0.25F, -0.9F);
        this.Neck3Plates.addChild(rightPlate1);
        this.setRotateAngle(rightPlate1, 0.0436F, 0.0F, 0.0F);
        this.rightPlate1.cubeList.add(new ModelBox(rightPlate1, 9, 3, 0.0F, -1.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(1.0F, 1.9F, -1.7F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 22, 50, -2.5F, -2.0F, -1.5F, 4, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 37, 8, -2.5F, -2.0F, -2.0F, 4, 2, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 64, 70, -2.0F, -1.0F, -3.85F, 3, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 58, 52, 0.51F, -1.75F, -1.75F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 58, 52, -2.51F, -1.75F, -1.75F, 1, 1, 1, 0.01F, true));

        this.Lowerjawmiddle_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r1.setRotationPoint(-1.5F, 0.4F, -1.8F);
        this.head.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.0436F, -0.2182F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 72, 87, -0.2F, -1.2F, -4.25F, 0, 1, 4, 0.0F, true));

        this.Lowerjawmiddle_r2 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r2.setRotationPoint(0.5F, 0.4F, -1.8F);
        this.head.addChild(Lowerjawmiddle_r2);
        this.setRotateAngle(Lowerjawmiddle_r2, 0.0436F, 0.2182F, 0.0F);
        this.Lowerjawmiddle_r2.cubeList.add(new ModelBox(Lowerjawmiddle_r2, 72, 87, 0.2F, -1.2F, -4.25F, 0, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-1.7F, -4.5181F, -2.6167F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0436F, 1.3963F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 85, 42, 2.1517F, 0.3438F, 0.6757F, 1, 1, 2, -0.05F, true));

        this.Upperjawfront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r1.setRotationPoint(-0.5F, -1.0F, -3.75F);
        this.head.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, 0.0903F, -0.2608F, -0.0233F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 81, 59, -1.1F, 0.0F, -2.2F, 1, 1, 3, -0.01F, true));

        this.Upperjawfront_r2 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r2.setRotationPoint(-0.5F, -1.0F, -3.75F);
        this.head.addChild(Upperjawfront_r2);
        this.setRotateAngle(Upperjawfront_r2, 0.0031F, -0.2608F, -0.0233F);
        this.Upperjawfront_r2.cubeList.add(new ModelBox(Upperjawfront_r2, 83, 74, -1.35F, -0.05F, 0.7F, 1, 1, 2, -0.01F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.7F, -4.5181F, -2.6167F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0436F, -1.3963F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 85, 42, -3.1517F, 0.3438F, 0.6757F, 1, 1, 2, -0.05F, false));

        this.Upperjawslopefront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, -1.5F, -4.75F);
        this.head.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.6545F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 63, 52, -1.0F, -0.3149F, -1.6018F, 1, 1, 1, -0.02F, false));

        this.Upperjawslopefront_r2 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopefront_r2.setRotationPoint(0.0F, -1.75F, -3.75F);
        this.head.addChild(Upperjawslopefront_r2);
        this.setRotateAngle(Upperjawslopefront_r2, 0.1745F, 0.0F, 0.0F);
        this.Upperjawslopefront_r2.cubeList.add(new ModelBox(Upperjawslopefront_r2, 76, 81, -1.0F, 0.0577F, -1.73F, 1, 1, 3, -0.01F, false));

        this.Upperjawslopebase_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopebase_r1.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.head.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1745F, 0.0F, 0.0F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 69, 50, -2.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.Upperjawfront_r3 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r3.setRotationPoint(-0.5F, -1.0F, -3.75F);
        this.head.addChild(Upperjawfront_r3);
        this.setRotateAngle(Upperjawfront_r3, 0.0873F, 0.0F, 0.0F);
        this.Upperjawfront_r3.cubeList.add(new ModelBox(Upperjawfront_r3, 67, 81, -0.5F, 0.0F, -2.5F, 1, 1, 3, 0.0F, false));

        this.Upperjawfront_r4 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r4.setRotationPoint(-0.5F, -1.0F, -3.75F);
        this.head.addChild(Upperjawfront_r4);
        this.setRotateAngle(Upperjawfront_r4, 0.0031F, 0.2608F, 0.0233F);
        this.Upperjawfront_r4.cubeList.add(new ModelBox(Upperjawfront_r4, 83, 74, 0.35F, -0.05F, 0.7F, 1, 1, 2, -0.01F, false));

        this.Upperjawfront_r5 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r5.setRotationPoint(-0.5F, -1.0F, -3.75F);
        this.head.addChild(Upperjawfront_r5);
        this.setRotateAngle(Upperjawfront_r5, 0.0903F, 0.2608F, 0.0233F);
        this.Upperjawfront_r5.cubeList.add(new ModelBox(Upperjawfront_r5, 81, 59, 0.1F, 0.0F, -2.2F, 1, 1, 3, -0.01F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 42, 64, -2.0F, 0.0F, -2.0F, 4, 1, 2, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 64, 18, -1.5F, -1.75F, -2.0F, 3, 2, 2, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 27, -1.49F, -1.75F, -3.25F, 0, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 67, 1.46F, -1.75F, -3.25F, 0, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 67, -1.46F, -1.75F, -3.25F, 0, 2, 2, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 27, 1.49F, -1.75F, -3.25F, 0, 2, 2, 0.0F, true));

        this.Rightcheeklower_r1 = new AdvancedModelRendererExtended(this);
        this.Rightcheeklower_r1.setRotationPoint(1.25F, -0.25F, -3.0F);
        this.jaw.addChild(Rightcheeklower_r1);
        this.setRotateAngle(Rightcheeklower_r1, -0.4363F, 0.0F, 0.0F);
        this.Rightcheeklower_r1.cubeList.add(new ModelBox(Rightcheeklower_r1, 0, 0, 0.23F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));
        this.Rightcheeklower_r1.cubeList.add(new ModelBox(Rightcheeklower_r1, 0, 0, -2.73F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));
        this.Rightcheeklower_r1.cubeList.add(new ModelBox(Rightcheeklower_r1, 9, 7, -2.72F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));
        this.Rightcheeklower_r1.cubeList.add(new ModelBox(Rightcheeklower_r1, 9, 7, 0.22F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, -0.0695F, -3.7256F);
        this.jaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.0436F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 6, 0, -0.5F, -0.0105F, -2.3638F, 1, 1, 1, -0.02F, false));
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 70, 74, -0.5F, -0.0105F, -1.9638F, 1, 1, 2, -0.01F, false));

        this.Lowerjawmiddle_r3 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r3.setRotationPoint(-1.0F, 1.0F, -1.75F);
        this.jaw.addChild(Lowerjawmiddle_r3);
        this.setRotateAngle(Lowerjawmiddle_r3, -0.0452F, -0.2615F, 0.0117F);
        this.Lowerjawmiddle_r3.cubeList.add(new ModelBox(Lowerjawmiddle_r3, 30, 78, -0.8F, -1.0F, -1.8F, 1, 1, 2, -0.01F, true));

        this.Lowerjawfront_r2 = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront_r2.setRotationPoint(0.0F, -0.0695F, -3.7256F);
        this.jaw.addChild(Lowerjawfront_r2);
        this.setRotateAngle(Lowerjawfront_r2, 0.0452F, -0.2615F, -0.0117F);
        this.Lowerjawfront_r2.cubeList.add(new ModelBox(Lowerjawfront_r2, 62, 23, -0.95F, -0.0105F, -1.7138F, 1, 1, 2, -0.02F, true));

        this.Lowerjawfront_r3 = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront_r3.setRotationPoint(0.0F, -0.0695F, -3.7256F);
        this.jaw.addChild(Lowerjawfront_r3);
        this.setRotateAngle(Lowerjawfront_r3, 0.0452F, 0.2615F, 0.0117F);
        this.Lowerjawfront_r3.cubeList.add(new ModelBox(Lowerjawfront_r3, 62, 23, -0.05F, -0.0105F, -1.7138F, 1, 1, 2, -0.02F, false));

        this.Lowerjawmiddle_r4 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r4.setRotationPoint(1.0F, 1.0F, -1.75F);
        this.jaw.addChild(Lowerjawmiddle_r4);
        this.setRotateAngle(Lowerjawmiddle_r4, -0.2618F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r4.cubeList.add(new ModelBox(Lowerjawmiddle_r4, 0, 8, -2.5F, -0.55F, -1.95F, 3, 1, 2, -0.01F, false));

        this.Lowerjawmiddle_r5 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r5.setRotationPoint(1.0F, 1.0F, -1.75F);
        this.jaw.addChild(Lowerjawmiddle_r5);
        this.setRotateAngle(Lowerjawmiddle_r5, -0.0452F, 0.2615F, -0.0117F);
        this.Lowerjawmiddle_r5.cubeList.add(new ModelBox(Lowerjawmiddle_r5, 30, 78, -0.2F, -1.0F, -1.8F, 1, 1, 2, -0.01F, false));

        this.Lowerjawmiddle_r6 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r6.setRotationPoint(1.0F, 1.0F, -1.75F);
        this.jaw.addChild(Lowerjawmiddle_r6);
        this.setRotateAngle(Lowerjawmiddle_r6, 0.0862F, 0.218F, -0.0097F);
        this.Lowerjawmiddle_r6.cubeList.add(new ModelBox(Lowerjawmiddle_r6, 72, 87, 0.2F, -1.4F, -3.8F, 0, 1, 4, 0.0F, false));

        this.Lowerjawmiddle_r7 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r7.setRotationPoint(-1.0F, 1.0F, -1.75F);
        this.jaw.addChild(Lowerjawmiddle_r7);
        this.setRotateAngle(Lowerjawmiddle_r7, 0.0862F, -0.218F, 0.0097F);
        this.Lowerjawmiddle_r7.cubeList.add(new ModelBox(Lowerjawmiddle_r7, 72, 87, -0.2F, -1.4F, -3.8F, 0, 1, 4, 0.0F, true));

        this.Lowerjawmiddle_r8 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r8.setRotationPoint(1.0F, 1.0F, -1.75F);
        this.jaw.addChild(Lowerjawmiddle_r8);
        this.setRotateAngle(Lowerjawmiddle_r8, -0.0436F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r8.cubeList.add(new ModelBox(Lowerjawmiddle_r8, 14, 67, -2.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.Lowerjawbase_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawbase_r1.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.jaw.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, -0.3054F, 0.0F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 58, 48, -2.0F, -0.6F, -0.1F, 4, 1, 2, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.chest.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.0F);
        this.rightArm.setScale(0,0,0);
        this.leftArm.setScale(0,0,0);
        this.rightArm.scaleChildren = true;
        this.leftArm.scaleChildren = true;
        this.chest.offsetY = 0.0F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = 0.05F;
        this.chest.render(0.01F);
        this.rightArm.setScale(1,1,1);
        this.leftArm.setScale(1,1,1);
        resetToDefaultPose();
    }
        public void renderStaticFloor(float f) {
            this.setRotateAngle(hips, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(body, 0.0F, -0.25F, 0.0F);
            this.setRotateAngle(chest, 0.0F, 0.25F, 0.0F);
            this.setRotateAngle(leftArm, 0.6F, 0.0F, -0.3F);
            this.setRotateAngle(leftArm2, -0.9F, 0.2F, 0.15F);
            this.setRotateAngle(leftHand, 0.3F, 0.0F, 0.1F);
            this.setRotateAngle(rightArm, 0.6F, 0.3F, 0.3F);
            this.setRotateAngle(rightArm2, -1.0F, 0.0F, -0.2F);
            this.setRotateAngle(rightHand, 0.5F, 0.0F, -0.1F);
            this.setRotateAngle(neck, 0.0F, 0.2F, 0.0F);
            this.setRotateAngle(neck2, -0.3F, 0.1F, 0.0F);
            this.setRotateAngle(neck3, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.3F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg, 0.1F, -0.2F, 0.0F);
            this.setRotateAngle(leftLeg2, 0.52F, 0.0F, 0.0F);
            this.setRotateAngle(leftFoot, -0.15F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg, -0.1F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg2, 0.1F, 0.0F, 0.0F);
            this.setRotateAngle(rightFoot, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.15F, -0.1F, 0.05F);
            this.setRotateAngle(tail2, 0.09F, -0.1F, 0.02F);
            this.setRotateAngle(tail3, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(tail4, 0.0F, 0.19F, 0.0F);
            this.setRotateAngle(tail5, 0.0F, 0.23F, 0.0F);
        this.root.offsetY = -0.138F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.main.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraHuayangosaurus kentrosaurus = (EntityPrehistoricFloraHuayangosaurus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        kentrosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (kentrosaurus.getAnimation() == kentrosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!kentrosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !kentrosaurus.getIsMoving()) {
                    if (kentrosaurus.getAnimation() != kentrosaurus.EAT_ANIMATION
                        && kentrosaurus.getAnimation() != kentrosaurus.DRINK_ANIMATION
                        && kentrosaurus.getAnimation() != kentrosaurus.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (kentrosaurus.getAnimation() != kentrosaurus.ATTACK_ANIMATION) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (kentrosaurus.getIsFast()) { //Running


                } else { //Walking

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
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraHuayangosaurus ee = (EntityPrehistoricFloraHuayangosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHuayangosaurus entity = (EntityPrehistoricFloraHuayangosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 20 + (((tickAnim - 13) / 13) * (20-(20)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 20 + (((tickAnim - 26) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 13) / 13) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -10 + (((tickAnim - 26) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -20 + (((tickAnim - 13) / 13) * (-20-(-20)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -20 + (((tickAnim - 26) / 10) * (0-(-20)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 13) / 13) * (10-(10)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 10 + (((tickAnim - 26) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 7) * (-0.2-(0.3)));
            zz = -0.4 + (((tickAnim - 6) / 7) * (-0.6-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 13) * (-0.2-(-0.2)));
            zz = -0.6 + (((tickAnim - 13) / 13) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 26) / 5) * (0.3-(-0.2)));
            zz = -0.6 + (((tickAnim - 26) / 5) * (-0.4-(-0.6)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 31) / 5) * (0-(0.3)));
            zz = -0.4 + (((tickAnim - 31) / 5) * (0-(-0.4)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 13) / 13) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -10 + (((tickAnim - 26) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -20 + (((tickAnim - 13) / 13) * (-20-(-20)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -20 + (((tickAnim - 26) / 10) * (0-(-20)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 13) / 13) * (10-(10)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 10 + (((tickAnim - 26) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 7) * (-0.2-(0.3)));
            zz = -0.4 + (((tickAnim - 6) / 7) * (-0.6-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 13) * (-0.2-(-0.2)));
            zz = -0.6 + (((tickAnim - 13) / 13) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 26) / 5) * (0.3-(-0.2)));
            zz = -0.6 + (((tickAnim - 26) / 5) * (-0.4-(-0.6)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 31) / 5) * (0-(0.3)));
            zz = -0.4 + (((tickAnim - 31) / 5) * (0-(-0.4)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (20-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 20 + (((tickAnim - 20) / 13) * (-15-(20)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 33) / 7) * (0-(-15)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 13) / 10) * (20-(25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 20 + (((tickAnim - 23) / 8) * (-5-(20)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 31) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 25 + (((tickAnim - 10) / 9) * (20-(25)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 19) / 11) * (0-(20)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-15-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -15 + (((tickAnim - 18) / 7) * (25-(-15)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 25 + (((tickAnim - 25) / 8) * (15-(25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 15 + (((tickAnim - 33) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 10 + (((tickAnim - 43) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 48) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (25-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 25 + (((tickAnim - 19) / 3) * (0-(25)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (15-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 30) / 3) * (5-(15)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 33) / 2) * (5-(5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 35) / 3) * (20-(5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 38) / 2) * (5-(20)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 40) / 3) * (5-(5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 5 + (((tickAnim - 43) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 45) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHuayangosaurus entity = (EntityPrehistoricFloraHuayangosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 8) / 5) * (25-(20)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 13) / 7) * (0-(25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 20 + (((tickAnim - 8) / 8) * (25-(20)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 16) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 6) / 7) * (20-(15)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 13) / 7) * (0-(20)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 8) / 8) * (5-(15)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 16) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 6) / 4) * (20-(15)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHuayangosaurus entity = (EntityPrehistoricFloraHuayangosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 3) * (-17.59639-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 3) * (4.90361-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -17.59639 + (((tickAnim - 13) / 1) * (-33.36525-(-17.59639)));
            yy = 4.90361 + (((tickAnim - 13) / 1) * (1.63475-(4.90361)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -33.36525 + (((tickAnim - 14) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(-33.36525)));
            yy = 1.63475 + (((tickAnim - 14) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(1.63475)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 22) / 6) * (-13.2435-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 22) / 6) * (2.71804-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -13.2435 + (((tickAnim - 28) / 5) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(-13.2435)));
            yy = 2.71804 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(2.71804)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*0.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-0.5)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*0.5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*0.5)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+80))*-50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+80))*-50 + (((tickAnim - 10) / 10) * (32.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+80))*-50)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 32.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140-(32.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*140)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 10) / 10) * (-17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*1 + (((tickAnim - 20) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*1)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = -17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*6 + (((tickAnim - 20) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1-(-17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*6)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-10))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+10))*5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-10))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-10))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-15 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+40))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*20)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*30 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1 + (((tickAnim - 10) / 10) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2 + (((tickAnim - 20) / 2) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-1-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-2)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-1 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-1)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-60 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-60)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 10) * (-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30 + (((tickAnim - 20) / 2) * (-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30-(-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*20-(-60+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*30)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*20 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*20)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.42928-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 5) * (1.58966-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 5) * (0.46966-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.42928 + (((tickAnim - 15) / 5) * (0-(0.42928)));
            yy = 1.58966 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*50-(1.58966)));
            zz = 0.46966 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-5-(0.46966)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*50 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-5)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-120))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.01047-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (-7.4361+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (-0.9777+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.01047 + (((tickAnim - 10) / 5) * (-0.54492-(-0.01047)));
            yy = -7.4361+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-10.53366-(-7.4361+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
            zz = -0.9777+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-5.41284-(-0.9777+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.54492 + (((tickAnim - 15) / 5) * (0-(-0.54492)));
            yy = -10.53366 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50-(-10.53366)));
            zz = -5.41284 + (((tickAnim - 15) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5-(-5.41284)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*50)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-110))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.01836-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (-12.488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (-0.5466+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.01836 + (((tickAnim - 10) / 5) * (-0.31464-(0.01836)));
            yy = -12.488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-9.52801-(-12.488+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
            zz = -0.5466+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-2.81176-(-0.5466+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.31464 + (((tickAnim - 15) / 3) * (1.83721-(-0.31464)));
            yy = -9.52801 + (((tickAnim - 15) / 3) * (21.62164-(-9.52801)));
            zz = -2.81176 + (((tickAnim - 15) / 3) * (1.74603-(-2.81176)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.83721 + (((tickAnim - 18) / 2) * (9.8017-(1.83721)));
            yy = 21.62164 + (((tickAnim - 18) / 2) * (-1.2961+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60-(21.62164)));
            zz = 1.74603 + (((tickAnim - 18) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*8.934-(1.74603)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 9.8017 + (((tickAnim - 20) / 2) * (0-(9.8017)));
            yy = -1.2961+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60-(-1.2961+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*8.934 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*8.934)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*60)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*-5 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+20))*-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-100))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.05187-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 7) * (10.33194-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 7) * (2.02753-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.05187 + (((tickAnim - 7) / 3) * (0.01836-(0.05187)));
            yy = 10.33194 + (((tickAnim - 7) / 3) * (-12.4881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(10.33194)));
            zz = 2.02753 + (((tickAnim - 7) / 3) * (-0.5465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(2.02753)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.01836 + (((tickAnim - 10) / 5) * (-1.76638-(0.01836)));
            yy = -12.4881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-6.12607-(-12.4881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
            zz = -0.5465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (12.70321-(-0.5465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.76638 + (((tickAnim - 15) / 3) * (-1.72567-(-1.76638)));
            yy = -6.12607 + (((tickAnim - 15) / 3) * (-6.90301-(-6.12607)));
            zz = 12.70321 + (((tickAnim - 15) / 3) * (8.5836-(12.70321)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.72567 + (((tickAnim - 18) / 2) * (9.67328-(-1.72567)));
            yy = -6.90301 + (((tickAnim - 18) / 2) * (-1.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70-(-6.90301)));
            zz = 8.5836 + (((tickAnim - 18) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*12.7294-(8.5836)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 9.67328 + (((tickAnim - 20) / 2) * (0-(9.67328)));
            yy = -1.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70-(-1.9332+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*12.7294 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*12.7294)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0.03646-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70 + (((tickAnim - 22) / 4) * (10.64089-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*70)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*-5 + (((tickAnim - 22) / 4) * (1.69756-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+40))*-5)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0.03646 + (((tickAnim - 26) / 7) * (0-(0.03646)));
            yy = 10.64089 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*-10-(10.64089)));
            zz = 1.69756 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*5-(1.69756)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-90))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.3983-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 7) * (11.08282-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 7) * (0.92819-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -0.3983 + (((tickAnim - 7) / 3) * (-0.47923-(-0.3983)));
            yy = 11.08282 + (((tickAnim - 7) / 3) * (-22.1506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(11.08282)));
            zz = 0.92819 + (((tickAnim - 7) / 3) * (4.0025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5-(0.92819)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.47923 + (((tickAnim - 10) / 5) * (-0.01488-(-0.47923)));
            yy = -22.1506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (-15.21767-(-22.1506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
            zz = 4.0025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5 + (((tickAnim - 10) / 5) * (7.49842-(4.0025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.01488 + (((tickAnim - 15) / 3) * (-0.07602-(-0.01488)));
            yy = -15.21767 + (((tickAnim - 15) / 3) * (-15.51425-(-15.21767)));
            zz = 7.49842 + (((tickAnim - 15) / 3) * (7.56935-(7.49842)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.07602 + (((tickAnim - 18) / 2) * (7.55447-(-0.07602)));
            yy = -15.51425 + (((tickAnim - 18) / 2) * (1.6388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80-(-15.51425)));
            zz = 7.56935 + (((tickAnim - 18) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*11.7056-(7.56935)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 7.55447 + (((tickAnim - 20) / 2) * (0-(7.55447)));
            yy = 1.6388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80-(1.6388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*11.7056 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*11.7056)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0.11215-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80 + (((tickAnim - 22) / 4) * (10.85356-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*80)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*-5 + (((tickAnim - 22) / 4) * (-2.42895-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+50))*-5)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0.11215 + (((tickAnim - 26) / 7) * (0-(0.11215)));
            yy = 10.85356 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*-10-(10.85356)));
            zz = -2.42895 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*5-(-2.42895)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-80))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*42.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*10)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*42.5 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*42.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*30 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*30)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-40)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2.5 + (((tickAnim - 20) / 5) * (-3-(2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -3 + (((tickAnim - 25) / 8) * (20-(-3)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 20 + (((tickAnim - 33) / 2) * (-20-(20)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 35) / 5) * (2.5-(-20)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-30 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            zz = 0 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-10-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*40 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*40)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-10)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*40 + (((tickAnim - 22) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*50-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*40)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 22) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-10 + (((tickAnim - 22) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*50 + (((tickAnim - 25) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62))*50)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 25) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-10 + (((tickAnim - 25) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-10)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*30 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*30)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5 + (((tickAnim - 22) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62-120))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62-120))*20 + (((tickAnim - 25) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62-120))*20)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*30 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*30)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5 + (((tickAnim - 22) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62-120))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-60))*-5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62-120))*20 + (((tickAnim - 25) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.62-120))*20)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+90))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-20)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-30 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*2)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*1 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*1)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-60 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-60)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10 + (((tickAnim - 10) / 10) * (-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30 + (((tickAnim - 20) / 2) * (-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30-(-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-20-(-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-30)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-20 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-20)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*30 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*30)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*40)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-30))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*20)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+10))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+10))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+10))*20)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+70))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+30))*-30)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+70))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+70))*-10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+20))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+20))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+20))*20)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+60))*-30)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+80))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62))*-30)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+80))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+80))*-10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+90))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*20)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+90))*-30 + (((tickAnim - 20) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62+90))*-30)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-30 + (((tickAnim - 22) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.62-30))*-30)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10 + (((tickAnim - 33) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHuayangosaurus entity = (EntityPrehistoricFloraHuayangosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -11.25 + (((tickAnim - 23) / 7) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 30) / 20) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-3.475-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -3.475 + (((tickAnim - 23) / 7) * (-3.475-(-3.475)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3.475 + (((tickAnim - 30) / 20) * (0-(-3.475)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -13.25 + (((tickAnim - 23) / 7) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 30) / 20) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (52.23683-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.10336-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.11175-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 52.23683 + (((tickAnim - 23) / 7) * (52.23683-(52.23683)));
            yy = -0.10336 + (((tickAnim - 23) / 7) * (-0.10336-(-0.10336)));
            zz = 0.11175 + (((tickAnim - 23) / 7) * (0.11175-(0.11175)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 52.23683 + (((tickAnim - 30) / 20) * (0-(52.23683)));
            yy = -0.10336 + (((tickAnim - 30) / 20) * (0-(-0.10336)));
            zz = 0.11175 + (((tickAnim - 30) / 20) * (0-(0.11175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -27.75 + (((tickAnim - 23) / 7) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -27.75 + (((tickAnim - 30) / 20) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.39-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.39 + (((tickAnim - 6) / 6) * (0.525-(0.39)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 12) / 8) * (0.195-(0.525)));
            zz = 0 + (((tickAnim - 12) / 8) * (0.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.195 + (((tickAnim - 20) / 3) * (0.05-(0.195)));
            zz = 0.1 + (((tickAnim - 20) / 3) * (0-(0.1)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.05 + (((tickAnim - 23) / 7) * (0.05-(0.05)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.05 + (((tickAnim - 30) / 5) * (0.32-(0.05)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 0.32 + (((tickAnim - 35) / 6) * (0.4-(0.32)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 41) / 5) * (0.23-(0.4)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0.23 + (((tickAnim - 46) / 4) * (0-(0.23)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -13.25 + (((tickAnim - 23) / 7) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 30) / 20) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (52.23683-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.10336-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.11175-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 52.23683 + (((tickAnim - 23) / 7) * (52.23683-(52.23683)));
            yy = -0.10336 + (((tickAnim - 23) / 7) * (-0.10336-(-0.10336)));
            zz = 0.11175 + (((tickAnim - 23) / 7) * (0.11175-(0.11175)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 52.23683 + (((tickAnim - 30) / 20) * (0-(52.23683)));
            yy = -0.10336 + (((tickAnim - 30) / 20) * (0-(-0.10336)));
            zz = 0.11175 + (((tickAnim - 30) / 20) * (0-(0.11175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -27.75 + (((tickAnim - 23) / 7) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -27.75 + (((tickAnim - 30) / 20) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.39-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.39 + (((tickAnim - 6) / 6) * (0.525-(0.39)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 12) / 8) * (0.195-(0.525)));
            zz = 0 + (((tickAnim - 12) / 8) * (0.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.195 + (((tickAnim - 20) / 3) * (0.05-(0.195)));
            zz = 0.1 + (((tickAnim - 20) / 3) * (0-(0.1)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.05 + (((tickAnim - 23) / 7) * (0.05-(0.05)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.05 + (((tickAnim - 30) / 5) * (0.445-(0.05)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 0.445 + (((tickAnim - 35) / 6) * (0.4-(0.445)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 41) / 5) * (0.23-(0.4)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0.23 + (((tickAnim - 46) / 4) * (0-(0.23)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 5.5 + (((tickAnim - 23) / 7) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5.5 + (((tickAnim - 30) / 20) * (0-(5.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 8.25 + (((tickAnim - 23) / 7) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 30) / 20) * (0-(8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -18 + (((tickAnim - 23) / 7) * (-18-(-18)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 30) / 20) * (0-(-18)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 14.75 + (((tickAnim - 23) / 7) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 30) / 20) * (0-(14.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 8.25 + (((tickAnim - 23) / 7) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 30) / 20) * (0-(8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -18 + (((tickAnim - 23) / 7) * (-18-(-18)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 30) / 20) * (0-(-18)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 14.75 + (((tickAnim - 23) / 7) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 30) / 20) * (0-(14.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHuayangosaurus entity = (EntityPrehistoricFloraHuayangosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 25) / 25) * (0-(22.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 21.75 + (((tickAnim - 25) / 13) * (27.63-(21.75)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 27.63 + (((tickAnim - 38) / 12) * (0-(27.63)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(-0.05);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-3.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -3.67 + (((tickAnim - 4) / 6) * (-5.2-(-3.67)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -5.2 + (((tickAnim - 10) / 7) * (2.51-(-5.2)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 2.51 + (((tickAnim - 17) / 8) * (22-(2.51)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = 22 + (((tickAnim - 25) / 17) * (-12.51-(22)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -12.51 + (((tickAnim - 42) / 4) * (-20.63-(-12.51)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -20.63 + (((tickAnim - 46) / 4) * (0-(-20.63)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));

        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+220))*-5));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-18-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (0.64354-(0)));
            yy = -18 + (((tickAnim - 17) / 16) * (-17.81448-(-18)));
            zz = 0 + (((tickAnim - 17) / 16) * (-2.09277-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.64354 + (((tickAnim - 33) / 17) * (0-(0.64354)));
            yy = -17.81448 + (((tickAnim - 33) / 17) * (0-(-17.81448)));
            zz = -2.09277 + (((tickAnim - 33) / 17) * (0-(-2.09277)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-10.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (0.31395-(0)));
            yy = -10.5 + (((tickAnim - 17) / 16) * (-11.09407-(-10.5)));
            zz = 0 + (((tickAnim - 17) / 16) * (-1.67576-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.31395 + (((tickAnim - 33) / 17) * (0-(0.31395)));
            yy = -11.09407 + (((tickAnim - 33) / 17) * (0-(-11.09407)));
            zz = -1.67576 + (((tickAnim - 33) / 17) * (0-(-1.67576)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-8.75-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (0.55523-(0)));
            yy = -8.75 + (((tickAnim - 17) / 16) * (-8.24233-(-8.75)));
            zz = 0 + (((tickAnim - 17) / 16) * (-3.75673-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.55523 + (((tickAnim - 33) / 17) * (0-(0.55523)));
            yy = -8.24233 + (((tickAnim - 33) / 17) * (0-(-8.24233)));
            zz = -3.75673 + (((tickAnim - 33) / 17) * (0-(-3.75673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (0.50116-(0)));
            yy = -9.5 + (((tickAnim - 17) / 16) * (-8.14611-(-9.5)));
            zz = 0 + (((tickAnim - 17) / 16) * (-3.26628-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.50116 + (((tickAnim - 33) / 17) * (0-(0.50116)));
            yy = -8.14611 + (((tickAnim - 33) / 17) * (0-(-8.14611)));
            zz = -3.26628 + (((tickAnim - 33) / 17) * (0-(-3.26628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHuayangosaurus entity = (EntityPrehistoricFloraHuayangosaurus) entitylivingbaseIn;

        int animCycle = 24;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 8) / 5) * (15-(7.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 13) / 7) * (10-(15)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 10 + (((tickAnim - 20) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 8) / 4) * (-5.0547-(-5)));
            yy = 0 + (((tickAnim - 8) / 4) * (2.8292-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-1.29717-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -5.0547 + (((tickAnim - 12) / 6) * (5-(-5.0547)));
            yy = 2.8292 + (((tickAnim - 12) / 6) * (-3.9423-(2.8292)));
            zz = -1.29717 + (((tickAnim - 12) / 6) * (0.88642-(-1.29717)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 18) / 2) * (2.5-(5)));
            yy = -3.9423 + (((tickAnim - 18) / 2) * (0-(-3.9423)));
            zz = 0.88642 + (((tickAnim - 18) / 2) * (0-(0.88642)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 2.5 + (((tickAnim - 20) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 8) / 4) * (3.20114-(-5)));
            yy = 0 + (((tickAnim - 8) / 4) * (5.8216-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (2.78058-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 3.20114 + (((tickAnim - 12) / 6) * (-22-(3.20114)));
            yy = 5.8216 + (((tickAnim - 12) / 6) * (1.3439-(5.8216)));
            zz = 2.78058 + (((tickAnim - 12) / 6) * (0.72036-(2.78058)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -22 + (((tickAnim - 18) / 2) * (-30-(-22)));
            yy = 1.3439 + (((tickAnim - 18) / 2) * (-7.5-(1.3439)));
            zz = 0.72036 + (((tickAnim - 18) / 2) * (0-(0.72036)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -30 + (((tickAnim - 20) / 4) * (0-(-30)));
            yy = -7.5 + (((tickAnim - 20) / 4) * (0-(-7.5)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 7) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (2.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 14) / 4) * (-11-(2.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -11 + (((tickAnim - 18) / 0) * (-5-(-11)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 18) / 2) * (6.67-(-5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 6.67 + (((tickAnim - 20) / 1) * (5-(6.67)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 21) / 2) * (7.5-(5)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 7.5 + (((tickAnim - 23) / 1) * (0-(7.5)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 13) / 5) * (15-(15)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 18) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
         EntityPrehistoricFloraHuayangosaurus entity = (EntityPrehistoricFloraHuayangosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-2), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3));

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -17.5 + (((tickAnim - 0) / 4) * (-16.25-(-17.5)));
            yy = -5 + (((tickAnim - 0) / 4) * (-2.5-(-5)));
            zz = -5 + (((tickAnim - 0) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -16.25 + (((tickAnim - 4) / 4) * (-10-(-16.25)));
            yy = -2.5 + (((tickAnim - 4) / 4) * (0-(-2.5)));
            zz = -5 + (((tickAnim - 4) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -10 + (((tickAnim - 8) / 9) * (12.5-(-10)));
            yy = 0 + (((tickAnim - 8) / 9) * (-5-(0)));
            zz = -5 + (((tickAnim - 8) / 9) * (0-(-5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 17) / 3) * (15-(12.5)));
            yy = -5 + (((tickAnim - 17) / 3) * (-10-(-5)));
            zz = 0 + (((tickAnim - 17) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 20) / 8) * (-22.5-(15)));
            yy = -10 + (((tickAnim - 20) / 8) * (-10-(-10)));
            zz = -5 + (((tickAnim - 20) / 8) * (-5-(-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -22.5 + (((tickAnim - 28) / 5) * (-37.5-(-22.5)));
            yy = -10 + (((tickAnim - 28) / 5) * (-10-(-10)));
            zz = -5 + (((tickAnim - 28) / 5) * (-5-(-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -37.5 + (((tickAnim - 33) / 4) * (-32.5-(-37.5)));
            yy = -10 + (((tickAnim - 33) / 4) * (-10-(-10)));
            zz = -5 + (((tickAnim - 33) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -32.5 + (((tickAnim - 37) / 3) * (-17.5-(-32.5)));
            yy = -10 + (((tickAnim - 37) / 3) * (-5-(-10)));
            zz = -5 + (((tickAnim - 37) / 3) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 3) * (-0.51-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.51 + (((tickAnim - 3) / 1) * (-0.15-(-0.51)));
            zz = -0.15 + (((tickAnim - 3) / 1) * (-0.25-(-0.15)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.15 + (((tickAnim - 4) / 4) * (-1-(-0.15)));
            zz = -0.25 + (((tickAnim - 4) / 4) * (-0.5-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 8) / 5) * (-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5-(-1)));
            zz = -0.5 + (((tickAnim - 8) / 5) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5 + (((tickAnim - 13) / 4) * (-0.5-(-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5)));
            zz = -0.25 + (((tickAnim - 13) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 17) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.5 + (((tickAnim - 0) / 4) * (11.25-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 11.25 + (((tickAnim - 4) / 4) * (15-(11.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 15 + (((tickAnim - 8) / 9) * (15-(15)));
            yy = 0 + (((tickAnim - 8) / 9) * (5-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 17) / 3) * (25-(15)));
            yy = 5 + (((tickAnim - 17) / 3) * (5-(5)));
            zz = 0 + (((tickAnim - 17) / 3) * (5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 25 + (((tickAnim - 20) / 8) * (53.44546-(25)));
            yy = 5 + (((tickAnim - 20) / 8) * (2.77551-(5)));
            zz = 5 + (((tickAnim - 20) / 8) * (3.01148-(5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 53.44546 + (((tickAnim - 28) / 5) * (46.73399-(53.44546)));
            yy = 2.77551 + (((tickAnim - 28) / 5) * (2.26585-(2.77551)));
            zz = 3.01148 + (((tickAnim - 28) / 5) * (4.80494-(3.01148)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 46.73399 + (((tickAnim - 33) / 4) * (17.42158-(46.73399)));
            yy = 2.26585 + (((tickAnim - 33) / 4) * (2.78161-(2.26585)));
            zz = 4.80494 + (((tickAnim - 33) / 4) * (8.84456-(4.80494)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 17.42158 + (((tickAnim - 37) / 3) * (-7.5-(17.42158)));
            yy = 2.78161 + (((tickAnim - 37) / 3) * (0-(2.78161)));
            zz = 8.84456 + (((tickAnim - 37) / 3) * (0-(8.84456)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 13) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 24.98072 + (((tickAnim - 0) / 4) * (7.49527-(24.98072)));
            yy = 0.95645 + (((tickAnim - 0) / 4) * (0.21782-(0.95645)));
            zz = 2.69009 + (((tickAnim - 0) / 4) * (2.5095-(2.69009)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.49527 + (((tickAnim - 4) / 4) * (-4.99294-(7.49527)));
            yy = 0.21782 + (((tickAnim - 4) / 4) * (-0.32621-(0.21782)));
            zz = 2.5095 + (((tickAnim - 4) / 4) * (2.52136-(2.5095)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -4.99294 + (((tickAnim - 8) / 9) * (-5-(-4.99294)));
            yy = -0.32621 + (((tickAnim - 8) / 9) * (0-(-0.32621)));
            zz = 2.52136 + (((tickAnim - 8) / 9) * (0-(2.52136)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 17) / 3) * (35-(-5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 35 + (((tickAnim - 20) / 8) * (30-(35)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 30 + (((tickAnim - 28) / 9) * (30-(30)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 30 + (((tickAnim - 37) / 3) * (24.98072-(30)));
            yy = 0 + (((tickAnim - 37) / 3) * (0.95645-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (2.69009-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 13) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 0) / 6) * (-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 6) * (-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 0) / 6) * (-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = -0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 6) / 13) * (-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 6) / 13) * (-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 6) / 13) * (-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 19) / 5) * (-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 19) / 5) * (-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 19) / 5) * (2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 24) / 8) * (-3.35325-(-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 24) / 8) * (-4.59467-(-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 24) / 8) * (0.91332-(2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.35325 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-3.35325)));
            yy = -4.59467 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-4.59467)));
            zz = 0.91332 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0.91332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*7.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*10), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 0) / 4) * (-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999)));
        }
        else if (tickAnim >= 4 && tickAnim < 40) {
            xx = -0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 4) / 36) * (-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*-3.051), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-2.878), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-2.0062));

        if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 27.5 + (((tickAnim - 0) / 6) * (-6.25-(27.5)));
            yy = 10 + (((tickAnim - 0) / 6) * (10-(10)));
            zz = -10 + (((tickAnim - 0) / 6) * (-10-(-10)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.25 + (((tickAnim - 6) / 2) * (-17.5-(-6.25)));
            yy = 10 + (((tickAnim - 6) / 2) * (10-(10)));
            zz = -10 + (((tickAnim - 6) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17.5 + (((tickAnim - 8) / 4) * (-30-(-17.5)));
            yy = 10 + (((tickAnim - 8) / 4) * (0-(10)));
            zz = -10 + (((tickAnim - 8) / 4) * (-5-(-10)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -30 + (((tickAnim - 12) / 4) * (-15-(-30)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 12) / 4) * (-3.75-(-5)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 16) / 4) * (7.5-(-15)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = -3.75 + (((tickAnim - 16) / 4) * (-2.5-(-3.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 7.5 + (((tickAnim - 20) / 6) * (17.75-(7.5)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = -2.5 + (((tickAnim - 20) / 6) * (-0.75-(-2.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 17.75 + (((tickAnim - 26) / 2) * (17.5-(17.75)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = -0.75 + (((tickAnim - 26) / 2) * (0-(-0.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 28) / 7) * (22.5-(17.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 22.5 + (((tickAnim - 35) / 5) * (27.5-(22.5)));
            yy = 2.5 + (((tickAnim - 35) / 5) * (10-(2.5)));
            zz = -2.5 + (((tickAnim - 35) / 5) * (-10-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 12) / 4) * (-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.25)));
            zz = 0 + (((tickAnim - 12) / 4) * (-0.25-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 16) / 4) * (-1.2-(-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = -0.25 + (((tickAnim - 16) / 4) * (-0.5-(-0.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -1.2 + (((tickAnim - 20) / 4) * (-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25-(-1.2)));
            zz = -0.5 + (((tickAnim - 20) / 4) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = -1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25 + (((tickAnim - 24) / 2) * (-1.75-(-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25)));
            zz = -0.25 + (((tickAnim - 24) / 2) * (-0.15-(-0.25)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = -1.75 + (((tickAnim - 26) / 2) * (-1.3-(-1.75)));
            zz = -0.15 + (((tickAnim - 26) / 2) * (0-(-0.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -1.3 + (((tickAnim - 28) / 4) * (-0.6-(-1.3)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = -0.6 + (((tickAnim - 32) / 3) * (-0.5-(-0.6)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 35) / 5) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -56.0482 + (((tickAnim - 0) / 5) * (-56.12249-(-56.0482)));
            yy = 1.69871 + (((tickAnim - 0) / 5) * (-0.72162-(1.69871)));
            zz = -2.10316 + (((tickAnim - 0) / 5) * (-2.21221-(-2.10316)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -56.12249 + (((tickAnim - 5) / 7) * (4.78306-(-56.12249)));
            yy = -0.72162 + (((tickAnim - 5) / 7) * (2.69952-(-0.72162)));
            zz = -2.21221 + (((tickAnim - 5) / 7) * (0.7854-(-2.21221)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 4.78306 + (((tickAnim - 12) / 4) * (-6.46178-(4.78306)));
            yy = 2.69952 + (((tickAnim - 12) / 4) * (2.31367-(2.69952)));
            zz = 0.7854 + (((tickAnim - 12) / 4) * (-0.66643-(0.7854)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -6.46178 + (((tickAnim - 16) / 4) * (-16.20662-(-6.46178)));
            yy = 2.31367 + (((tickAnim - 16) / 4) * (1.92782-(2.31367)));
            zz = -0.66643 + (((tickAnim - 16) / 4) * (-2.11825-(-0.66643)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -16.20662 + (((tickAnim - 20) / 6) * (-17.61198-(-16.20662)));
            yy = 1.92782 + (((tickAnim - 20) / 6) * (0.57834-(1.92782)));
            zz = -2.11825 + (((tickAnim - 20) / 6) * (-0.63547-(-2.11825)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -17.61198 + (((tickAnim - 26) / 2) * (-12.5-(-17.61198)));
            yy = 0.57834 + (((tickAnim - 26) / 2) * (0-(0.57834)));
            zz = -0.63547 + (((tickAnim - 26) / 2) * (0-(-0.63547)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 28) / 7) * (-17.68327-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (3.5637-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0.23014-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -17.68327 + (((tickAnim - 35) / 5) * (-56.0482-(-17.68327)));
            yy = 3.5637 + (((tickAnim - 35) / 5) * (1.69871-(3.5637)));
            zz = 0.23014 + (((tickAnim - 35) / 5) * (-2.10316-(0.23014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 16) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 87.5 + (((tickAnim - 0) / 8) * (67.5-(87.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 67.5 + (((tickAnim - 8) / 4) * (23.46783-(67.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (-1.38475-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (2.66155-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 23.46783 + (((tickAnim - 12) / 8) * (10.98436-(23.46783)));
            yy = -1.38475 + (((tickAnim - 12) / 8) * (-0.75155-(-1.38475)));
            zz = 2.66155 + (((tickAnim - 12) / 8) * (2.38443-(2.66155)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 10.98436 + (((tickAnim - 20) / 6) * (2.54531-(10.98436)));
            yy = -0.75155 + (((tickAnim - 20) / 6) * (-0.22546-(-0.75155)));
            zz = 2.38443 + (((tickAnim - 20) / 6) * (0.71533-(2.38443)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 2.54531 + (((tickAnim - 26) / 2) * (-2.5-(2.54531)));
            yy = -0.22546 + (((tickAnim - 26) / 2) * (0-(-0.22546)));
            zz = 0.71533 + (((tickAnim - 26) / 2) * (0-(0.71533)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 28) / 7) * (42.5-(-2.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 42.5 + (((tickAnim - 35) / 5) * (87.5-(42.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 0) / 8) * (-22.5-(15)));
            yy = 10 + (((tickAnim - 0) / 8) * (10-(10)));
            zz = 5 + (((tickAnim - 0) / 8) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -22.5 + (((tickAnim - 8) / 5) * (-37.5-(-22.5)));
            yy = 10 + (((tickAnim - 8) / 5) * (10-(10)));
            zz = 5 + (((tickAnim - 8) / 5) * (5-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -37.5 + (((tickAnim - 13) / 4) * (-32.5-(-37.5)));
            yy = 10 + (((tickAnim - 13) / 4) * (10-(10)));
            zz = 5 + (((tickAnim - 13) / 4) * (5-(5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -32.5 + (((tickAnim - 17) / 3) * (-17.5-(-32.5)));
            yy = 10 + (((tickAnim - 17) / 3) * (5-(10)));
            zz = 5 + (((tickAnim - 17) / 3) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -17.5 + (((tickAnim - 20) / 4) * (-16.25-(-17.5)));
            yy = 5 + (((tickAnim - 20) / 4) * (2.5-(5)));
            zz = 5 + (((tickAnim - 20) / 4) * (5-(5)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -16.25 + (((tickAnim - 24) / 4) * (-10-(-16.25)));
            yy = 2.5 + (((tickAnim - 24) / 4) * (0-(2.5)));
            zz = 5 + (((tickAnim - 24) / 4) * (5-(5)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -10 + (((tickAnim - 28) / 9) * (12.5-(-10)));
            yy = 0 + (((tickAnim - 28) / 9) * (5-(0)));
            zz = 5 + (((tickAnim - 28) / 9) * (0-(5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 37) / 3) * (15-(12.5)));
            yy = 5 + (((tickAnim - 37) / 3) * (10-(5)));
            zz = 0 + (((tickAnim - 37) / 3) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.65 + (((tickAnim - 20) / 2) * (-0.21-(-0.65)));
            zz = 0 + (((tickAnim - 20) / 2) * (-0.3-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.21 + (((tickAnim - 22) / 1) * (-0.13-(-0.21)));
            zz = -0.3 + (((tickAnim - 22) / 1) * (-0.6-(-0.3)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -0.13 + (((tickAnim - 23) / 1) * (-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(-0.13)));
            zz = -0.6 + (((tickAnim - 23) / 1) * (-0.75-(-0.6)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 24) / 4) * (-0.9-(-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = -0.75 + (((tickAnim - 24) / 4) * (-0.5-(-0.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -0.9 + (((tickAnim - 28) / 5) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5-(-0.9)));
            zz = -0.5 + (((tickAnim - 28) / 5) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5 + (((tickAnim - 33) / 4) * (-0.5-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5)));
            zz = -0.25 + (((tickAnim - 33) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 37) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 0) / 8) * (53.44546-(25)));
            yy = -5 + (((tickAnim - 0) / 8) * (-2.77551-(-5)));
            zz = -5 + (((tickAnim - 0) / 8) * (-3.01148-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 53.44546 + (((tickAnim - 8) / 5) * (46.73399-(53.44546)));
            yy = -2.77551 + (((tickAnim - 8) / 5) * (-2.26585-(-2.77551)));
            zz = -3.01148 + (((tickAnim - 8) / 5) * (-4.80494-(-3.01148)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 46.73399 + (((tickAnim - 13) / 4) * (19.91451-(46.73399)));
            yy = -2.26585 + (((tickAnim - 13) / 4) * (-2.83392-(-2.26585)));
            zz = -4.80494 + (((tickAnim - 13) / 4) * (-8.74877-(-4.80494)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.91451 + (((tickAnim - 17) / 3) * (-7.5-(19.91451)));
            yy = -2.83392 + (((tickAnim - 17) / 3) * (0-(-2.83392)));
            zz = -8.74877 + (((tickAnim - 17) / 3) * (0-(-8.74877)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -7.5 + (((tickAnim - 20) / 4) * (11.25-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 11.25 + (((tickAnim - 24) / 4) * (15-(11.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 15 + (((tickAnim - 28) / 9) * (15-(15)));
            yy = 0 + (((tickAnim - 28) / 9) * (-5-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 37) / 3) * (25-(15)));
            yy = -5 + (((tickAnim - 37) / 3) * (-5-(-5)));
            zz = 0 + (((tickAnim - 37) / 3) * (-5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 33) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 0) / 8) * (30-(35)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 30 + (((tickAnim - 8) / 9) * (30-(30)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 30 + (((tickAnim - 17) / 3) * (24.98072-(30)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.95645-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-2.69009-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 24.98072 + (((tickAnim - 20) / 4) * (7.49527-(24.98072)));
            yy = -0.95645 + (((tickAnim - 20) / 4) * (-0.21782-(-0.95645)));
            zz = -2.69009 + (((tickAnim - 20) / 4) * (-2.5095-(-2.69009)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 7.49527 + (((tickAnim - 24) / 4) * (-4.99294-(7.49527)));
            yy = -0.21782 + (((tickAnim - 24) / 4) * (0.32621-(-0.21782)));
            zz = -2.5095 + (((tickAnim - 24) / 4) * (-2.52136-(-2.5095)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -4.99294 + (((tickAnim - 28) / 5) * (-7.5-(-4.99294)));
            yy = 0.32621 + (((tickAnim - 28) / 5) * (0-(0.32621)));
            zz = -2.52136 + (((tickAnim - 28) / 5) * (-2.5-(-2.52136)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -7.5 + (((tickAnim - 33) / 4) * (-5-(-7.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 33) / 4) * (0-(-2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 37) / 3) * (35-(-5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 33) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 0) / 8) * (15-(7.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 2.5 + (((tickAnim - 0) / 8) * (0-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 8) / 8) * (18.03571-(15)));
            yy = 0 + (((tickAnim - 8) / 8) * (-6.42857-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (6.42857-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 18.03571 + (((tickAnim - 16) / 4) * (27.5-(18.03571)));
            yy = -6.42857 + (((tickAnim - 16) / 4) * (-10-(-6.42857)));
            zz = 6.42857 + (((tickAnim - 16) / 4) * (10-(6.42857)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 27.5 + (((tickAnim - 20) / 8) * (-27.5-(27.5)));
            yy = -10 + (((tickAnim - 20) / 8) * (-10-(-10)));
            zz = 10 + (((tickAnim - 20) / 8) * (10-(10)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -27.5 + (((tickAnim - 28) / 4) * (-19.5-(-27.5)));
            yy = -10 + (((tickAnim - 28) / 4) * (0-(-10)));
            zz = 10 + (((tickAnim - 28) / 4) * (5-(10)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -19.5 + (((tickAnim - 32) / 8) * (7.5-(-19.5)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 5 + (((tickAnim - 32) / 8) * (2.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 2) * (-1.23-(-0.9)));
            zz = -0.5 + (((tickAnim - 0) / 2) * (-0.4-(-0.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -1.23 + (((tickAnim - 2) / 2) * (-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25-(-1.23)));
            zz = -0.4 + (((tickAnim - 2) / 2) * (-0.25-(-0.4)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25 + (((tickAnim - 4) / 3) * (-1.21-(-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25)));
            zz = -0.25 + (((tickAnim - 4) / 3) * (-0.1-(-0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -1.21 + (((tickAnim - 7) / 1) * (-0.9-(-1.21)));
            zz = -0.1 + (((tickAnim - 7) / 1) * (0-(-0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 8) / 2) * (-0.65-(-0.9)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.65 + (((tickAnim - 10) / 10) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 32) / 1) * (-0.25-(-0.4)));
            zz = 0 + (((tickAnim - 32) / 1) * (-0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 33) / 3) * (-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.25)));
            zz = -0.1 + (((tickAnim - 33) / 3) * (-0.25-(-0.1)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = -0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 36) / 2) * (-0.61-(-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = -0.25 + (((tickAnim - 36) / 2) * (-0.35-(-0.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.61 + (((tickAnim - 38) / 2) * (-0.9-(-0.61)));
            zz = -0.35 + (((tickAnim - 38) / 2) * (-0.5-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10.08426 + (((tickAnim - 0) / 8) * (2.5-(-10.08426)));
            yy = -1.16329 + (((tickAnim - 0) / 8) * (0-(-1.16329)));
            zz = -0.2855 + (((tickAnim - 0) / 8) * (0-(-0.2855)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 8) / 8) * (-14.14782-(2.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (-3.63642-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0.62082-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -14.14782 + (((tickAnim - 16) / 4) * (-58.74987-(-14.14782)));
            yy = -3.63642 + (((tickAnim - 16) / 4) * (-3.28469-(-3.63642)));
            zz = 0.62082 + (((tickAnim - 16) / 4) * (2.44489-(0.62082)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -58.74987 + (((tickAnim - 20) / 4) * (-58.37537-(-58.74987)));
            yy = -3.28469 + (((tickAnim - 20) / 4) * (-0.94768-(-3.28469)));
            zz = 2.44489 + (((tickAnim - 20) / 4) * (1.18031-(2.44489)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -58.37537 + (((tickAnim - 24) / 4) * (-12.67367-(-58.37537)));
            yy = -0.94768 + (((tickAnim - 24) / 4) * (1.5984-(-0.94768)));
            zz = 1.18031 + (((tickAnim - 24) / 4) * (2.399-(1.18031)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.67367 + (((tickAnim - 28) / 4) * (-1.21678-(-12.67367)));
            yy = 1.5984 + (((tickAnim - 28) / 4) * (-2.66269-(1.5984)));
            zz = 2.399 + (((tickAnim - 28) / 4) * (-0.76204-(2.399)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -1.21678 + (((tickAnim - 32) / 8) * (-10.08426-(-1.21678)));
            yy = -2.66269 + (((tickAnim - 32) / 8) * (-1.16329-(-2.66269)));
            zz = -0.76204 + (((tickAnim - 32) / 8) * (-0.2855-(-0.76204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 8) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 24) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.4972 + (((tickAnim - 0) / 4) * (-5.31659-(2.4972)));
            yy = 0.342 + (((tickAnim - 0) / 4) * (0.18155-(0.342)));
            zz = -0.9397 + (((tickAnim - 0) / 4) * (-0.97202-(-0.9397)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -5.31659 + (((tickAnim - 4) / 3) * (-12.10056-(-5.31659)));
            yy = 0.18155 + (((tickAnim - 4) / 3) * (0.0684-(0.18155)));
            zz = -0.97202 + (((tickAnim - 4) / 3) * (-0.18794-(-0.97202)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -12.10056 + (((tickAnim - 7) / 1) * (-12-(-12.10056)));
            yy = 0.0684 + (((tickAnim - 7) / 1) * (0-(0.0684)));
            zz = -0.18794 + (((tickAnim - 7) / 1) * (0-(-0.18794)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 8) / 2) * (2.25-(-12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 10) / 2) * (8.17-(2.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 8.17 + (((tickAnim - 12) / 8) * (87.5-(8.17)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 87.5 + (((tickAnim - 20) / 8) * (77.5-(87.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 77.5 + (((tickAnim - 28) / 4) * (17.47476-(77.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (1.02565-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (-2.81938-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 17.47476 + (((tickAnim - 32) / 8) * (2.4972-(17.47476)));
            yy = 1.02565 + (((tickAnim - 32) / 8) * (0.342-(1.02565)));
            zz = -2.81938 + (((tickAnim - 32) / 8) * (-0.9397-(-2.81938)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 4) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 26) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*6), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHuayangosaurus entity = (EntityPrehistoricFloraHuayangosaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -20 + (((tickAnim - 0) / 1) * (-21.66667-(-20)));
            yy = -10 + (((tickAnim - 0) / 1) * (-6.66667-(-10)));
            zz = -10 + (((tickAnim - 0) / 1) * (-10-(-10)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -21.66667 + (((tickAnim - 1) / 2) * (-10-(-21.66667)));
            yy = -6.66667 + (((tickAnim - 1) / 2) * (0-(-6.66667)));
            zz = -10 + (((tickAnim - 1) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 3) / 2) * (15-(-10)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 3) / 2) * (-5-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 5) / 3) * (25-(15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (-7.5-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (-10-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 10) / 3) * (-30-(-7.5)));
            yy = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
            zz = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30 + (((tickAnim - 13) / 2) * (-20-(-30)));
            yy = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
            zz = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -1.5 + (((tickAnim - 0) / 1) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(-1.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 1) / 1) * (-0.28-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 2) / 1) * (-0.6-(-0.28)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 0) * (-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.6)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 3) / 2) * (-0.5-(-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 5) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (-1.5-(1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-10))*3), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -5 + (((tickAnim - 0) / 1) * (6.66667-(-5)));
            yy = -5 + (((tickAnim - 0) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 0) / 1) * (5-(5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 6.66667 + (((tickAnim - 1) / 2) * (15-(6.66667)));
            yy = -5 + (((tickAnim - 1) / 2) * (-5-(-5)));
            zz = 5 + (((tickAnim - 1) / 2) * (5-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 15 + (((tickAnim - 3) / 2) * (17.5-(15)));
            yy = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            zz = 5 + (((tickAnim - 3) / 2) * (5-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 5) / 3) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 3) * (0-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 8) / 2) * (49.71686-(17.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (2.48811-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (5.66716-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 49.71686 + (((tickAnim - 10) / 3) * (22.40747-(49.71686)));
            yy = 2.48811 + (((tickAnim - 10) / 3) * (2.89034-(2.48811)));
            zz = 5.66716 + (((tickAnim - 10) / 3) * (8.65534-(5.66716)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.40747 + (((tickAnim - 13) / 2) * (-5-(22.40747)));
            yy = 2.89034 + (((tickAnim - 13) / 2) * (-5-(2.89034)));
            zz = 8.65534 + (((tickAnim - 13) / 2) * (5-(8.65534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.5 + (((tickAnim - 0) / 2) * (1.69153-(27.5)));
            yy = 2.5 + (((tickAnim - 0) / 2) * (0.25522-(2.5)));
            zz = 5 + (((tickAnim - 0) / 2) * (1.71706-(5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.69153 + (((tickAnim - 2) / 1) * (-7.46271-(1.69153)));
            yy = 0.25522 + (((tickAnim - 2) / 1) * (-0.86717-(0.25522)));
            zz = 1.71706 + (((tickAnim - 2) / 1) * (0.07558-(1.71706)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -7.46271 + (((tickAnim - 3) / 0) * (-7.47514-(-7.46271)));
            yy = -0.86717 + (((tickAnim - 3) / 0) * (-0.57811-(-0.86717)));
            zz = 0.07558 + (((tickAnim - 3) / 0) * (0.05039-(0.07558)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.47514 + (((tickAnim - 3) / 2) * (0-(-7.47514)));
            yy = -0.57811 + (((tickAnim - 3) / 2) * (0-(-0.57811)));
            zz = 0.05039 + (((tickAnim - 3) / 2) * (0-(0.05039)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (40-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (47.5-(40)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 47.5 + (((tickAnim - 10) / 3) * (57.5-(47.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 57.5 + (((tickAnim - 13) / 2) * (27.5-(57.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (2.5-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+10))*-3), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 0) / 2) * (25.83333-(15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25.83333 + (((tickAnim - 2) / 1) * (27.5-(25.83333)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (32.5-(27.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (10-(0)));
            zz = -5 + (((tickAnim - 3) / 2) * (-10-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 5) / 3) * (-17.5-(32.5)));
            yy = 10 + (((tickAnim - 5) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 5) / 3) * (-15-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (-17.5-(-17.5)));
            yy = 10 + (((tickAnim - 8) / 2) * (5-(10)));
            zz = -15 + (((tickAnim - 8) / 2) * (-10-(-15)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -17.5 + (((tickAnim - 10) / 1) * (-12.5-(-17.5)));
            yy = 5 + (((tickAnim - 10) / 1) * (3.33333-(5)));
            zz = -10 + (((tickAnim - 10) / 1) * (-8.33333-(-10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.5 + (((tickAnim - 11) / 2) * (-7.5-(-12.5)));
            yy = 3.33333 + (((tickAnim - 11) / 2) * (0-(3.33333)));
            zz = -8.33333 + (((tickAnim - 11) / 2) * (-5-(-8.33333)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 13) / 2) * (15-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 13) / 2) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 1) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.4)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 11) / 1) * (-0.28-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 12) / 1) * (-0.5-(-0.28)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 0) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 13) / 2) * (0-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 3) * (0-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (-60.05965-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.4239-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-2.46453-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -60.05965 + (((tickAnim - 5) / 3) * (-32.22845-(-60.05965)));
            yy = -0.4239 + (((tickAnim - 5) / 3) * (-0.36445-(-0.4239)));
            zz = -2.46453 + (((tickAnim - 5) / 3) * (-1.77222-(-2.46453)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.22845 + (((tickAnim - 8) / 2) * (5.04703-(-32.22845)));
            yy = -0.36445 + (((tickAnim - 8) / 2) * (-0.55262-(-0.36445)));
            zz = -1.77222 + (((tickAnim - 8) / 2) * (2.71402-(-1.77222)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 5.04703 + (((tickAnim - 10) / 1) * (0.03135-(5.04703)));
            yy = -0.55262 + (((tickAnim - 10) / 1) * (-0.36842-(-0.55262)));
            zz = 2.71402 + (((tickAnim - 10) / 1) * (1.80935-(2.71402)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.03135 + (((tickAnim - 11) / 2) * (-7.5-(0.03135)));
            yy = -0.36842 + (((tickAnim - 11) / 2) * (0-(-0.36842)));
            zz = 1.80935 + (((tickAnim - 11) / 2) * (0-(1.80935)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 13) / 2) * (-5-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 0) / 3) * (40-(15)));
            yy = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 40 + (((tickAnim - 3) / 2) * (105-(40)));
            yy = 5 + (((tickAnim - 3) / 2) * (0-(5)));
            zz = 5 + (((tickAnim - 3) / 2) * (0-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 105 + (((tickAnim - 5) / 3) * (77.5-(105)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.5 + (((tickAnim - 8) / 2) * (12.5-(77.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 10) / 3) * (15-(12.5)));
            yy = -2.5 + (((tickAnim - 10) / 3) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 3) * (5-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 13) / 2) * (15-(15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-10), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-3), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (-7.5-(25)));
            yy = 0 + (((tickAnim - 0) / 3) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.5 + (((tickAnim - 3) / 3) * (-30-(-7.5)));
            yy = 10 + (((tickAnim - 3) / 3) * (10-(10)));
            zz = 10 + (((tickAnim - 3) / 3) * (10-(10)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 6) / 2) * (-20-(-30)));
            yy = 10 + (((tickAnim - 6) / 2) * (10-(10)));
            zz = 10 + (((tickAnim - 6) / 2) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 8) / 0) * (-23.33333-(-20)));
            yy = 10 + (((tickAnim - 8) / 0) * (6.66667-(10)));
            zz = 10 + (((tickAnim - 8) / 0) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -23.33333 + (((tickAnim - 8) / 1) * (-21.66667-(-23.33333)));
            yy = 6.66667 + (((tickAnim - 8) / 1) * (3.33333-(6.66667)));
            zz = 10 + (((tickAnim - 8) / 1) * (10-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -21.66667 + (((tickAnim - 9) / 1) * (-15-(-21.66667)));
            yy = 3.33333 + (((tickAnim - 9) / 1) * (0-(3.33333)));
            zz = 10 + (((tickAnim - 9) / 1) * (10-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -15 + (((tickAnim - 10) / 3) * (15-(-15)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 10) / 3) * (5-(10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 13) / 2) * (25-(15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 6) / 2) * (-1.5-(1)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -1.5 + (((tickAnim - 8) / 0) * (-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(-1.5)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 8) / 1) * (-0.72-(-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.72 + (((tickAnim - 9) / 1) * (-1-(-0.72)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 1) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 11) / 2) * (-0.5-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (49.71686-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.48811-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-5.66716-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 49.71686 + (((tickAnim - 3) / 3) * (22.40747-(49.71686)));
            yy = -2.48811 + (((tickAnim - 3) / 3) * (-2.89034-(-2.48811)));
            zz = -5.66716 + (((tickAnim - 3) / 3) * (-8.65534-(-5.66716)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22.40747 + (((tickAnim - 6) / 2) * (-5-(22.40747)));
            yy = -2.89034 + (((tickAnim - 6) / 2) * (5-(-2.89034)));
            zz = -8.65534 + (((tickAnim - 6) / 2) * (-5-(-8.65534)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 8) / 0) * (8.33333-(-5)));
            yy = 5 + (((tickAnim - 8) / 0) * (5-(5)));
            zz = -5 + (((tickAnim - 8) / 0) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 8.33333 + (((tickAnim - 8) / 1) * (16.66667-(8.33333)));
            yy = 5 + (((tickAnim - 8) / 1) * (5-(5)));
            zz = -5 + (((tickAnim - 8) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 16.66667 + (((tickAnim - 9) / 1) * (20-(16.66667)));
            yy = 5 + (((tickAnim - 9) / 1) * (5-(5)));
            zz = -5 + (((tickAnim - 9) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (17.5-(20)));
            yy = 5 + (((tickAnim - 10) / 3) * (0-(5)));
            zz = -5 + (((tickAnim - 10) / 3) * (-5-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 13) / 2) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 13) / 2) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 8) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40 + (((tickAnim - 0) / 3) * (47.5-(40)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 47.5 + (((tickAnim - 3) / 3) * (57.5-(47.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 57.5 + (((tickAnim - 6) / 2) * (27.5-(57.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (-2.5-(0)));
            zz = -5 + (((tickAnim - 6) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 27.5 + (((tickAnim - 8) / 1) * (4.12874-(27.5)));
            yy = -2.5 + (((tickAnim - 8) / 1) * (-0.90523-(-2.5)));
            zz = -5 + (((tickAnim - 8) / 1) * (-2.50075-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 4.12874 + (((tickAnim - 9) / 1) * (-7.5-(4.12874)));
            yy = -0.90523 + (((tickAnim - 9) / 1) * (0-(-0.90523)));
            zz = -2.50075 + (((tickAnim - 9) / 1) * (-5-(-2.50075)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 10) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (40-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 8) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (-27.5-(-17.5)));
            yy = -10 + (((tickAnim - 0) / 3) * (-5-(-10)));
            zz = 15 + (((tickAnim - 0) / 3) * (10-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -27.5 + (((tickAnim - 3) / 0) * (-20.83333-(-27.5)));
            yy = -5 + (((tickAnim - 3) / 0) * (-3.33333-(-5)));
            zz = 10 + (((tickAnim - 3) / 0) * (8.33333-(10)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -20.83333 + (((tickAnim - 3) / 2) * (-7.5-(-20.83333)));
            yy = -3.33333 + (((tickAnim - 3) / 2) * (0-(-3.33333)));
            zz = 8.33333 + (((tickAnim - 3) / 2) * (5-(8.33333)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 5) / 3) * (15-(-7.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 3) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 8) / 0) * (25-(15)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 0) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (22.5-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 2) * (5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 10) / 3) * (32.5-(22.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (-10-(0)));
            zz = 5 + (((tickAnim - 10) / 3) * (10-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 13) / 2) * (-17.5-(32.5)));
            yy = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
            zz = 10 + (((tickAnim - 13) / 2) * (15-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 0) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.25)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 3) / 2) * (-0.8-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.8 + (((tickAnim - 5) / 1) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.8)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 6) / 2) * (0.2-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 2) * (0-(0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.22845 + (((tickAnim - 0) / 3) * (2.54703-(-32.22845)));
            yy = 0.36445 + (((tickAnim - 0) / 3) * (0.55262-(0.36445)));
            zz = 1.77222 + (((tickAnim - 0) / 3) * (-2.71402-(1.77222)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 2.54703 + (((tickAnim - 3) / 0) * (2.53135-(2.54703)));
            yy = 0.55262 + (((tickAnim - 3) / 0) * (0.36842-(0.55262)));
            zz = -2.71402 + (((tickAnim - 3) / 0) * (-1.80935-(-2.71402)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.53135 + (((tickAnim - 3) / 2) * (-10-(2.53135)));
            yy = 0.36842 + (((tickAnim - 3) / 2) * (0-(0.36842)));
            zz = -1.80935 + (((tickAnim - 3) / 2) * (0-(-1.80935)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (0-(-10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 0) * (-3.33333-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -3.33333 + (((tickAnim - 8) / 2) * (0-(-3.33333)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 10) / 3) * (-60.05965-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.4239-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (2.46453-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -60.05965 + (((tickAnim - 13) / 2) * (-32.22845-(-60.05965)));
            yy = 0.4239 + (((tickAnim - 13) / 2) * (0.36445-(0.4239)));
            zz = 2.46453 + (((tickAnim - 13) / 2) * (1.77222-(2.46453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 77.5 + (((tickAnim - 0) / 3) * (30-(77.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 3) / 0) * (18.33333-(30)));
            yy = 2.5 + (((tickAnim - 3) / 0) * (1.66667-(2.5)));
            zz = -2.5 + (((tickAnim - 3) / 0) * (-3.33333-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 18.33333 + (((tickAnim - 3) / 2) * (17.5-(18.33333)));
            yy = 1.66667 + (((tickAnim - 3) / 2) * (0-(1.66667)));
            zz = -3.33333 + (((tickAnim - 3) / 2) * (-5-(-3.33333)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 5) / 3) * (15-(17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 8) / 2) * (57.5-(15)));
            yy = 0 + (((tickAnim - 8) / 2) * (-5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 57.5 + (((tickAnim - 10) / 3) * (105-(57.5)));
            yy = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
            zz = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 105 + (((tickAnim - 13) / 2) * (77.5-(105)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-3), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*-3), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*5), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-3), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

   

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHuayangosaurus e = (EntityPrehistoricFloraHuayangosaurus) entity;
        animator.update(entity);


    }
}
