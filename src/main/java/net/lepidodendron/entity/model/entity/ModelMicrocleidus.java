package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrocleidus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMicrocleidus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Lefthindflipper1;
    private final AdvancedModelRenderer Lefthindflipper2;
    private final AdvancedModelRenderer Lefthindflipper3;
    private final AdvancedModelRenderer Righthindflipper1;
    private final AdvancedModelRenderer Righthindflipper2;
    private final AdvancedModelRenderer Righthindflipper3;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer Neck5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer snout2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer forehead2;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Leftfrontflipper1;
    private final AdvancedModelRenderer Leftfrontflipper2;
    private final AdvancedModelRenderer Leftfrontflipper3;
    private final AdvancedModelRenderer Rightfrontflipper1;
    private final AdvancedModelRenderer Rightfrontflipper2;
    private final AdvancedModelRenderer Rightfrontflipper3;

    private ModelAnimator animator;

    public ModelMicrocleidus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 24.5F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -10.0F, 15.5F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -5.5F, 0.0F, -1.5F, 11, 8, 9, 0.0F, false));

        this.Lefthindflipper1 = new AdvancedModelRenderer(this);
        this.Lefthindflipper1.setRotationPoint(5.0F, -4.7694F, 17.38F);
        this.Hips.addChild(Lefthindflipper1);
        this.setRotateAngle(Lefthindflipper1, 0.0216F, 0.0522F, 0.1748F);
        this.Lefthindflipper1.cubeList.add(new ModelBox(Lefthindflipper1, 0, 7, 0.0F, -0.5F, -1.0F, 3, 3, 4, 0.0F, false));

        this.Lefthindflipper2 = new AdvancedModelRenderer(this);
        this.Lefthindflipper2.setRotationPoint(3.0F, 0.0F, -0.4F);
        this.Lefthindflipper1.addChild(Lefthindflipper2);
        this.setRotateAngle(Lefthindflipper2, 0.0F, -0.1309F, 0.0F);
        this.Lefthindflipper2.cubeList.add(new ModelBox(Lefthindflipper2, 31, 26, -0.2511F, 0.0F, -0.7734F, 7, 2, 5, 0.0F, false));

        this.Lefthindflipper3 = new AdvancedModelRenderer(this);
        this.Lefthindflipper3.setRotationPoint(6.2489F, 0.5F, 0.4266F);
        this.Lefthindflipper2.addChild(Lefthindflipper3);
        this.setRotateAngle(Lefthindflipper3, 0.0F, -0.1309F, 0.0F);
        this.Lefthindflipper3.cubeList.add(new ModelBox(Lefthindflipper3, 64, 36, 0.0F, 0.0F, -0.6F, 7, 1, 4, 0.0F, false));

        this.Righthindflipper1 = new AdvancedModelRenderer(this);
        this.Righthindflipper1.setRotationPoint(-5.0F, -4.7694F, 17.38F);
        this.Hips.addChild(Righthindflipper1);
        this.setRotateAngle(Righthindflipper1, 0.0216F, -0.0522F, -0.1748F);
        this.Righthindflipper1.cubeList.add(new ModelBox(Righthindflipper1, 0, 7, -3.0F, -0.5F, -1.0F, 3, 3, 4, 0.0F, true));

        this.Righthindflipper2 = new AdvancedModelRenderer(this);
        this.Righthindflipper2.setRotationPoint(-3.0F, 0.0F, -0.4F);
        this.Righthindflipper1.addChild(Righthindflipper2);
        this.setRotateAngle(Righthindflipper2, 0.0F, 0.1309F, 0.0F);
        this.Righthindflipper2.cubeList.add(new ModelBox(Righthindflipper2, 31, 26, -6.7489F, 0.0F, -0.7734F, 7, 2, 5, 0.0F, true));

        this.Righthindflipper3 = new AdvancedModelRenderer(this);
        this.Righthindflipper3.setRotationPoint(-6.2489F, 0.5F, 0.4266F);
        this.Righthindflipper2.addChild(Righthindflipper3);
        this.setRotateAngle(Righthindflipper3, 0.0F, 0.1309F, 0.0F);
        this.Righthindflipper3.cubeList.add(new ModelBox(Righthindflipper3, 64, 36, -7.0F, 0.0F, -0.6F, 7, 1, 4, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -8.875F, 21.75F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1309F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 38, 52, -4.0F, -0.7009F, -0.6496F, 8, 6, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.2991F, 6.3504F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 21, 61, -2.5F, -1.5F, -1.0F, 5, 4, 7, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 65, 0, -1.5F, -1.5F, -1.0F, 3, 3, 6, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0436F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 64, 44, -1.0F, -1.5748F, 0.0289F, 2, 2, 8, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, -1.5748F, 8.0289F);
        this.Tail4.addChild(tailfin);
        this.setRotateAngle(tailfin, -0.9163F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.5241F, -2.3632F);
        this.tailfin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 2.1206F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -0.5F, -0.65F, -1.15F, 1, 4, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.7741F, -4.3632F);
        this.tailfin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.6144F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 43, -0.5F, 0.2046F, -3.9095F, 1, 2, 4, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.5241F, -2.3632F);
        this.tailfin.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.1345F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 1, 0.001F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -7.5F, 14.0F);
        this.Hips.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -7.0F, -2.75F, -14.0F, 14, 10, 16, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0436F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 32, 35, -6.0F, -2.5F, -8.0F, 12, 9, 8, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Bodyfront.addChild(Neck1);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 0, 43, -4.0F, -2.0F, -9.0F, 8, 6, 11, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -0.25F, -7.0F);
        this.Neck1.addChild(Neck3);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 44, 0, -3.0F, -1.5F, -10.0F, 6, 5, 9, 0.0F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -0.25F, -9.0F);
        this.Neck3.addChild(Neck4);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 50, 16, -2.5F, -1.0F, -10.0F, 5, 4, 10, 0.01F, false));

        this.Neck5 = new AdvancedModelRenderer(this);
        this.Neck5.setRotationPoint(0.0F, 0.25F, -10.0F);
        this.Neck4.addChild(Neck5);
        this.Neck5.cubeList.add(new ModelBox(Neck5, 59, 56, -2.0F, -1.0F, -8.0F, 4, 3, 9, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -8.0F);
        this.Neck5.addChild(head);
        this.setRotateAngle(head, -0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 45, 65, -2.0F, -0.5F, -2.0F, 4, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 68, -2.0F, -1.5F, -1.0F, 4, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 33, -1.5F, -1.075F, -3.575F, 3, 1, 1, 0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.5F, -1.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1396F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, -2.0F, 0.0F, -1.0F, 4, 1, 1, -0.001F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.head.addChild(snout);
        this.setRotateAngle(snout, 0.0436F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 0, 68, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, 0.0F, -1.0F);
        this.snout.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.8727F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 7, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, 0.0F, -1.0F);
        this.snout.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.8727F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 7, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.snout2 = new AdvancedModelRenderer(this);
        this.snout2.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.snout.addChild(snout2);
        this.setRotateAngle(snout2, -0.0873F, 0.0F, 0.0F);
        this.snout2.cubeList.add(new ModelBox(snout2, 44, 3, -1.0F, -1.975F, -2.075F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -1.0F, -1.0F);
        this.snout2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 9, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -1.0F, -1.0F);
        this.snout2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 9, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.snout2.addChild(forehead);
        this.setRotateAngle(forehead, 0.3578F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 44, 0, -1.0F, -0.025F, -0.1F, 2, 1, 2, -0.001F, false));

        this.forehead2 = new AdvancedModelRenderer(this);
        this.forehead2.setRotationPoint(0.0F, -0.025F, 1.8F);
        this.forehead.addChild(forehead2);
        this.setRotateAngle(forehead2, -0.1876F, 0.0F, 0.0F);
        this.forehead2.cubeList.add(new ModelBox(forehead2, 57, 68, -1.5F, 0.0F, 0.0F, 3, 1, 2, -0.001F, false));
        this.forehead2.cubeList.add(new ModelBox(forehead2, 41, 33, -1.5F, 0.0F, 1.2F, 3, 1, 1, 0.01F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 52, 30, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0F, -2.0F);
        this.Lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 49, -1.0F, -2.0F, 0.0F, 3, 2, 2, -0.02F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0436F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 38, 65, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 3, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 3, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.0873F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 0, 32, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.jaw3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1745F, 0.7854F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 8, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.jaw3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.1745F, -0.7854F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 8, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.Leftfrontflipper1 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper1.setRotationPoint(5.0F, 1.9806F, -4.62F);
        this.Bodyfront.addChild(Leftfrontflipper1);
        this.setRotateAngle(Leftfrontflipper1, 0.0216F, 0.0522F, 0.1748F);
        this.Leftfrontflipper1.cubeList.add(new ModelBox(Leftfrontflipper1, 0, 0, 0.0F, -0.5F, -1.0F, 4, 3, 4, 0.0F, false));

        this.Leftfrontflipper2 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper2.setRotationPoint(4.0F, 0.0F, -0.4F);
        this.Leftfrontflipper1.addChild(Leftfrontflipper2);
        this.setRotateAngle(Leftfrontflipper2, 0.0F, -0.1309F, 0.0F);
        this.Leftfrontflipper2.cubeList.add(new ModelBox(Leftfrontflipper2, 0, 60, -0.2511F, 0.0F, -0.7734F, 8, 2, 6, 0.0F, false));

        this.Leftfrontflipper3 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper3.setRotationPoint(7.2489F, 0.5F, 0.4266F);
        this.Leftfrontflipper2.addChild(Leftfrontflipper3);
        this.setRotateAngle(Leftfrontflipper3, 0.0F, -0.1309F, 0.0F);
        this.Leftfrontflipper3.cubeList.add(new ModelBox(Leftfrontflipper3, 64, 30, 0.0F, 0.0F, -0.6F, 8, 1, 5, 0.0F, false));

        this.Rightfrontflipper1 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper1.setRotationPoint(-5.0F, 1.9806F, -4.62F);
        this.Bodyfront.addChild(Rightfrontflipper1);
        this.setRotateAngle(Rightfrontflipper1, 0.0216F, -0.0522F, -0.1748F);
        this.Rightfrontflipper1.cubeList.add(new ModelBox(Rightfrontflipper1, 0, 0, -4.0F, -0.5F, -1.0F, 4, 3, 4, 0.0F, true));

        this.Rightfrontflipper2 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper2.setRotationPoint(-4.0F, 0.0F, -0.4F);
        this.Rightfrontflipper1.addChild(Rightfrontflipper2);
        this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.1309F, 0.0F);
        this.Rightfrontflipper2.cubeList.add(new ModelBox(Rightfrontflipper2, 0, 60, -7.7489F, 0.0F, -0.7734F, 8, 2, 6, 0.0F, true));

        this.Rightfrontflipper3 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper3.setRotationPoint(-7.2489F, 0.5F, 0.4266F);
        this.Rightfrontflipper2.addChild(Rightfrontflipper3);
        this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.1309F, 0.0F);
        this.Rightfrontflipper3.cubeList.add(new ModelBox(Rightfrontflipper3, 64, 30, -8.0F, 0.0F, -0.6F, 8, 1, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }
        public void renderStaticWall(float f) {
            this.Bodyfront.rotateAngleY = (float) Math.toRadians(0);
            this.setRotateAngle(Neck1, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(Neck3, 0.0F, -0.3F, 0.0F);
            this.setRotateAngle(Neck4, 0.0F, 0.4F, 0.0F);
            this.setRotateAngle(Neck5, 0.0F, 0.5F, 0.0F);
            this.setRotateAngle(Lowerjaw, 0.4F, 0.0F, 0.0F);
            this.Bodyfront.offsetY = -0.04F;
            this.Bodyfront.offsetX = 0.0F;
            this.Bodyfront.offsetZ = -0.08F;
            this.Bodyfront.render(0.01F);
            resetToDefaultPose();
        }
        public void renderStaticFloor(float f) {
            this.setRotateAngle(Hips, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(Bodyfront, -0.2F, 0.0F, 0.0F);
            this.setRotateAngle(Bodymiddle, -0.15F, 0.3F, 0.0F);
            this.setRotateAngle(Neck1, -0.1F, 0.3F, 0.0F);
            this.setRotateAngle(Neck3, -0.1F, 0.3F, 0.0F);
            this.setRotateAngle(Neck4, -0.05F, 0.2F, 0.0F);
            this.setRotateAngle(Neck5, -0.05F, 0.1F, 0.0F);
            this.setRotateAngle(Lowerjaw, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Leftfrontflipper1, 0.3F, 0.3F, 0.2F);
            this.setRotateAngle(Leftfrontflipper2, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(Leftfrontflipper3, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(Rightfrontflipper1, 0.3F, 0.3F, -0.2F);
            this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.0F, 0.2F);
            this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.0F, 0.2F);
            this.setRotateAngle(Righthindflipper1, 0.3F, 0.3F, -0.2F);
            this.setRotateAngle(Righthindflipper2, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(Righthindflipper3, 0.0F, 0.0F, -0.2F);
            this.setRotateAngle(Lefthindflipper1, 0.3F, 0.3F, 0.2F);
            this.setRotateAngle(Lefthindflipper2, 0.0F, 0.0F, 0.2F);
            this.setRotateAngle(Lefthindflipper3, 0.0F, 0.0F, 0.2F);
            this.setRotateAngle(Tail1, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(Tail2, 0.0F, 0.2F, 0.0F);
            this.setRotateAngle(Tail3, 0.0F, 0.3F, 0.0F);
            this.setRotateAngle(Tail4, 0.0F, 0.4F, 0.0F);
            this.Hips.offsetX = 0.03F;
            this.Hips.offsetZ = -0.08F;
            this.Hips.offsetY = -0.25F;
            this.Hips.render(0.01F);
            resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Hips, 0.0F, 0.0F, 0.3F);
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Neck3, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(Neck4, 0.2F, 0.3F, 0.0F);
        this.setRotateAngle(Neck5, 0.2F, 0.4F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Leftfrontflipper1, 0.3F, 0.3F, 0.2F);
        this.setRotateAngle(Leftfrontflipper2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(Leftfrontflipper3, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(Rightfrontflipper1, 0.3F, 0.3F, -0.2F);
        this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(Righthindflipper1, 0.3F, 0.3F, -0.2F);
        this.setRotateAngle(Righthindflipper2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(Righthindflipper3, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(Lefthindflipper1, 0.3F, 0.3F, 0.2F);
        this.setRotateAngle(Lefthindflipper2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(Lefthindflipper3, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(Tail1, -0.1F, -0.2F, 0.0F);
        this.setRotateAngle(Tail2, -0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Tail3, -0.3F, -0.2F, 0.0F);
        this.setRotateAngle(Tail4, -0.3F, -0.2F, 0.0F);
        this.Hips.offsetY = -0.14F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMicrocleidus ee = (EntityPrehistoricFloraMicrocleidus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicrocleidus entity = (EntityPrehistoricFloraMicrocleidus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 0) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*5)-(2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5)))-(0));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*5) + (((tickAnim - 10) / 10) * (0-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+180))*-5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-90))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-90))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-90))*-5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5)) + (((tickAnim - 10) / 3) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-5))));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)) + (((tickAnim - 13) / 7) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)))));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5) + (((tickAnim - 0) / 10) * (25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1)-(25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15))));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1))));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)) + (((tickAnim - 0) / 10) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)) + (((tickAnim - 10) / 10) * (0-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicrocleidus entity = (EntityPrehistoricFloraMicrocleidus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(-2);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5))));
            zz = 5 + (((tickAnim - 0) / 20) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5))));
            zz = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 20) / 20) * (5-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5))));
            zz = 5 + (((tickAnim - 40) / 120) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5))));
            zz = -10 + (((tickAnim - 0) / 20) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5))));
            zz = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 20) / 20) * (-10-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5))));
            zz = -10 + (((tickAnim - 40) / 120) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 30) * (-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 30) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 30) * (-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 30) / 30) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 60) / 70) * (-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5) + (((tickAnim - 60) / 70) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-12.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 130) / 30) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 30) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 60) / 70) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5) + (((tickAnim - 60) / 70) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 130) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 0) / 30) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 0) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 30) / 30) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 30) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 60) / 70) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3) + (((tickAnim - 60) / 70) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 130) / 30) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 130) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 0) / 30) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10)));
            yy = 0 + (((tickAnim - 0) / 30) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)))-(0));
            zz = 0 + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 30) / 30) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)) + (((tickAnim - 30) / 30) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 60) / 70) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3)) + (((tickAnim - 60) / 70) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 130) / 30) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)) + (((tickAnim - 130) / 30) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)) + (((tickAnim - 0) / 20) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)) + (((tickAnim - 0) / 20) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)) + (((tickAnim - 20) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)) + (((tickAnim - 20) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1) + (((tickAnim - 60) / 40) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)) + (((tickAnim - 60) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)) + (((tickAnim - 60) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)) + (((tickAnim - 100) / 60) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)) + (((tickAnim - 100) / 60) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        //this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)) + (((tickAnim - 0) / 20) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)) + (((tickAnim - 0) / 20) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)) + (((tickAnim - 20) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)) + (((tickAnim - 20) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1) + (((tickAnim - 60) / 40) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1))));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)) + (((tickAnim - 60) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)) + (((tickAnim - 60) / 40) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)) + (((tickAnim - 100) / 60) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)) + (((tickAnim - 100) / 60) * (-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)))-(-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        //this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 130) {
            xx = 5.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-1) + (((tickAnim - 0) / 130) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-1)-(5.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-1))));
            yy = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 130) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 130) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-1) + (((tickAnim - 130) / 30) * (5.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-1)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-1))));
            yy = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 130) / 30) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-120))*1)), Neck3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*3)), Neck3.rotateAngleZ + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-180))*-3)));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*1)), Neck4.rotateAngleY + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-1))), Neck4.rotateAngleZ + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3)));


        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1)), Neck5.rotateAngleY + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-1))), Neck5.rotateAngleZ + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3)));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1)), head.rotateAngleY + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*5))), head.rotateAngleZ + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*-3)));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(6+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1)), Lowerjaw.rotateAngleY + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-200))*1))), Lowerjaw.rotateAngleZ + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-200))*3))));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 2.5 + (((tickAnim - 0) / 60) * (2.5-(2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 2.5 + (((tickAnim - 60) / 30) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(2.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 90) / 30) * (2.5-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 2.5 + (((tickAnim - 120) / 40) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5 + (((tickAnim - 0) / 60) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5 + (((tickAnim - 60) / 30) * (-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(-7.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 90) / 30) * (-7.5-(-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5 + (((tickAnim - 120) / 40) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5))));
            zz = -2.5 + (((tickAnim - 0) / 120) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5))));
            zz = -2.5 + (((tickAnim - 120) / 20) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(-2.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5))));
            zz = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 140) / 20) * (-2.5-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5))));
            zz = 7.5 + (((tickAnim - 0) / 120) * (7.5-(7.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5))));
            zz = 7.5 + (((tickAnim - 120) / 20) * (7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(7.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5))));
            zz = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 140) / 20) * (7.5-(7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = -5 + (((tickAnim - 0) / 79) * (-5-(-5)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = -5 + (((tickAnim - 79) / 21) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 100) / 20) * (-5-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = -5 + (((tickAnim - 120) / 40) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10 + (((tickAnim - 0) / 79) * (10-(10)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10 + (((tickAnim - 79) / 21) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(10)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 100) / 20) * (10-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10 + (((tickAnim - 120) / 40) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicrocleidus entity = (EntityPrehistoricFloraMicrocleidus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*3)), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-5)));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(4+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.5));
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*4));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-30)), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-20+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-35)), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-10)));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-5)), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*-5)), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*-10)));
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-5)), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-5)), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-210))*-10)));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*2.5)), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3)));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2.5)), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3)));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5)), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-3)));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*5)), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-3)));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2)), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(-((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*3))));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1)), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-20))*3)));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1)), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1)));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2)), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*2)));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-3)), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*3)));
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*2)), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*2)));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*2.5)), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*5)));
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1)), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*30)), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*40)), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*20)));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*5)), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*5)), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*10)));
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*5)), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*5)), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10)));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30)), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-40)), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-20)));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-40))*5)), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*-5)), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*-10)));
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*5)), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+110))*-5)), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*-10)));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-30)), Righthindflipper1.rotateAngleY + (float) Math.toRadians(20+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*35)), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*10)));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-5)), Righthindflipper2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*5)), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*10)));
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*-5)), Righthindflipper3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*5)), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*10)));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicrocleidus entity = (EntityPrehistoricFloraMicrocleidus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*1)), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+80))*-3)));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(4+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1));
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3.5));
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*20)), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-10+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+80))*-20)), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*-15)));
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*5)), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+110))*-15)), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-80))*-10)));
        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*5)), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+140))*-15)), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-110))*-10)));
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*5)), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*-3)));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*2.5)), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-10))*-3)));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*2.5)), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*2.5)), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-70))*-3)));
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-2.5)), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+60))*3)));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1)), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+50))*2)));
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-1)), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*3)));
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*1)), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-180))*-1)), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-160))*3)));
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5)), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-190))*3)));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-190))*-1)), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-80))*3)));
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+260))*-20)), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20)), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*20)));
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+290))*-5)), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*10)), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*15)));
        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+320))*-5)), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*10)), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*15)));
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+240))*-20)), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20)), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+10))*-20)));
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5)), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-10)), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15)));
        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+300))*-5)), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*-10)), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*-15)));
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20)), Righthindflipper1.rotateAngleY + (float) Math.toRadians(10+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100))*20)), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*15)));
        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*5)), Righthindflipper2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+130))*15)), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*10)));
        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*5)), Righthindflipper3.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+160))*15)), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*10)));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 12, Neck1);
        this.faceTarget(f3, f4, 12, Neck3);
        this.faceTarget(f3, f4, 12, Neck4);
        this.faceTarget(f3, f4, 12, Neck5);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        EntityPrehistoricFloraMicrocleidus ee = (EntityPrehistoricFloraMicrocleidus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

