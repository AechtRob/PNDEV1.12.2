package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlesiosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPlesiosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Lefthindflipper1;
    private final AdvancedModelRenderer Lefthindflipper2;
    private final AdvancedModelRenderer Lefthindflipper3;
    private final AdvancedModelRenderer Righthindflipper1;
    private final AdvancedModelRenderer Righthindflipper2;
    private final AdvancedModelRenderer Righthindflipper3;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer snout2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer forehead2;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Leftfrontflipper1;
    private final AdvancedModelRenderer Leftfrontflipper2;
    private final AdvancedModelRenderer Leftfrontflipper3;
    private final AdvancedModelRenderer Rightfrontflipper1;
    private final AdvancedModelRenderer Rightfrontflipper2;
    private final AdvancedModelRenderer Rightfrontflipper3;

    private ModelAnimator animator;

    public ModelPlesiosaurus() {
        this.textureWidth = 88;
        this.textureHeight = 77;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 16.5F, 10.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 26, -5.5F, -2.0F, 1.0F, 11, 8, 8, 0.0F, false));

        this.Lefthindflipper1 = new AdvancedModelRenderer(this);
        this.Lefthindflipper1.setRotationPoint(5.0F, 2.2306F, 4.38F);
        this.Hips.addChild(Lefthindflipper1);
        this.setRotateAngle(Lefthindflipper1, -0.1624F, 0.0552F, 0.0F);
        this.Lefthindflipper1.cubeList.add(new ModelBox(Lefthindflipper1, 0, 0, 0.0F, -0.5F, -1.0F, 3, 3, 4, 0.0F, false));

        this.Lefthindflipper2 = new AdvancedModelRenderer(this);
        this.Lefthindflipper2.setRotationPoint(3.0F, 0.0F, -0.4F);
        this.Lefthindflipper1.addChild(Lefthindflipper2);
        this.setRotateAngle(Lefthindflipper2, 0.0F, -0.1309F, 0.0F);
        this.Lefthindflipper2.cubeList.add(new ModelBox(Lefthindflipper2, 27, 66, -0.2511F, 0.0F, -0.7734F, 7, 2, 5, 0.0F, false));

        this.Lefthindflipper3 = new AdvancedModelRenderer(this);
        this.Lefthindflipper3.setRotationPoint(6.2489F, 0.5F, 0.4266F);
        this.Lefthindflipper2.addChild(Lefthindflipper3);
        this.setRotateAngle(Lefthindflipper3, 0.0F, -0.1309F, 0.0F);
        this.Lefthindflipper3.cubeList.add(new ModelBox(Lefthindflipper3, 0, 43, 0.0F, 0.0F, -0.6F, 7, 1, 4, 0.0F, false));

        this.Righthindflipper1 = new AdvancedModelRenderer(this);
        this.Righthindflipper1.setRotationPoint(-5.0F, 2.2306F, 4.38F);
        this.Hips.addChild(Righthindflipper1);
        this.setRotateAngle(Righthindflipper1, -0.1624F, -0.0552F, 0.0F);
        this.Righthindflipper1.cubeList.add(new ModelBox(Righthindflipper1, 0, 0, -3.0F, -0.5F, -1.0F, 3, 3, 4, 0.0F, true));

        this.Righthindflipper2 = new AdvancedModelRenderer(this);
        this.Righthindflipper2.setRotationPoint(-3.0F, 0.0F, -0.4F);
        this.Righthindflipper1.addChild(Righthindflipper2);
        this.setRotateAngle(Righthindflipper2, 0.0F, 0.1309F, 0.0F);
        this.Righthindflipper2.cubeList.add(new ModelBox(Righthindflipper2, 27, 66, -6.7489F, 0.0F, -0.7734F, 7, 2, 5, 0.0F, true));

        this.Righthindflipper3 = new AdvancedModelRenderer(this);
        this.Righthindflipper3.setRotationPoint(-6.2489F, 0.5F, 0.4266F);
        this.Righthindflipper2.addChild(Righthindflipper3);
        this.setRotateAngle(Righthindflipper3, 0.0F, 0.1309F, 0.0F);
        this.Righthindflipper3.cubeList.add(new ModelBox(Righthindflipper3, 0, 43, -7.0F, 0.0F, -0.6F, 7, 1, 4, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0873F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 44, 0, -3.5F, -1.75F, 0.0F, 7, 6, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 63, 42, -2.0F, -1.5F, 0.0F, 4, 4, 7, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.5F, 6.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 44, 66, -1.0F, -1.75F, 0.0F, 2, 3, 8, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, -1.75F, 8.0F);
        this.Tail3.addChild(tailfin);
        this.setRotateAngle(tailfin, -0.9163F, 0.0F, 0.0F);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 19, 43, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.tailfin.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -0.5F, 0.0F, 0.0F, 1, 4, 2, 0.001F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.25F, 1.0F);
        this.Hips.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -7.0F, -2.5F, -14.0F, 14, 10, 15, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.25F, -13.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 49, -6.0F, -2.5F, -6.0F, 12, 9, 6, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, 0.25F, -5.0F);
        this.Bodyfront.addChild(Neck1);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 37, 49, -4.0F, -2.5F, -9.0F, 8, 7, 9, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Neck1.addChild(Neck2);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 27, 31, -3.0F, -2.0F, -12.0F, 6, 5, 12, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.Neck2.addChild(Neck3);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 47, 14, -2.0F, -1.5F, -12.0F, 4, 4, 12, 0.0F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.Neck3.addChild(Neck4);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 62, 56, -1.5F, -1.0F, -10.0F, 3, 3, 10, -0.001F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.5F, -10.0F);
        this.Neck4.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 8, -2.0F, -0.5F, -2.0F, 4, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 31, 49, -2.0F, -1.5F, -1.0F, 4, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 73, 6, -1.5F, -1.0F, -3.5F, 3, 1, 1, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.5F, -1.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 40, -2.0F, 0.0F, -1.0F, 4, 1, 1, -0.001F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.Head.addChild(snout);
        this.setRotateAngle(snout, 0.0436F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 31, 26, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 0.0F, -1.0F);
        this.snout.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.8727F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 0, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 0.0F, -1.0F);
        this.snout.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.8727F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 0, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.snout2 = new AdvancedModelRenderer(this);
        this.snout2.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.snout.addChild(snout2);
        this.setRotateAngle(snout2, -0.0873F, 0.0F, 0.0F);
        this.snout2.cubeList.add(new ModelBox(snout2, 22, 65, -1.0F, -2.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -1.0F, -1.0F);
        this.snout2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 4, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -1.0F, -1.0F);
        this.snout2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 4, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.snout2.addChild(forehead);
        this.setRotateAngle(forehead, 0.3578F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.forehead.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 54, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.001F, false));

        this.forehead2 = new AdvancedModelRenderer(this);
        this.forehead2.setRotationPoint(0.0F, -0.025F, 1.8F);
        this.forehead.addChild(forehead2);
        this.setRotateAngle(forehead2, -0.1876F, 0.0F, 0.0F);
        this.forehead2.cubeList.add(new ModelBox(forehead2, 0, 72, -1.5F, 0.0F, 0.0F, 3, 1, 2, -0.001F, false));
        this.forehead2.cubeList.add(new ModelBox(forehead2, 11, 72, -1.5F, 0.0F, 1.2F, 3, 1, 1, -0.002F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 66, 0, -2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.0F, -2.0F);
        this.Lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 65, 70, -1.0F, -1.75F, 0.0F, 3, 2, 2, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Lowerjaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0436F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 68, 22, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 26, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 26, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.0873F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 37, 53, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.jaw3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1745F, 0.7854F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 2, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.jaw3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1745F, -0.7854F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 2, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.Leftfrontflipper1 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper1.setRotationPoint(5.0F, 1.9806F, -4.62F);
        this.Bodyfront.addChild(Leftfrontflipper1);
        this.setRotateAngle(Leftfrontflipper1, -0.1624F, 0.0552F, 0.0F);
        this.Leftfrontflipper1.cubeList.add(new ModelBox(Leftfrontflipper1, 68, 14, 0.0F, -0.5F, -1.0F, 4, 3, 4, 0.0F, false));

        this.Leftfrontflipper2 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper2.setRotationPoint(4.0F, 0.0F, -0.4F);
        this.Leftfrontflipper1.addChild(Leftfrontflipper2);
        this.setRotateAngle(Leftfrontflipper2, 0.0F, -0.1309F, 0.0F);
        this.Leftfrontflipper2.cubeList.add(new ModelBox(Leftfrontflipper2, 52, 31, -0.2511F, 0.0F, -0.7734F, 8, 2, 6, 0.0F, false));

        this.Leftfrontflipper3 = new AdvancedModelRenderer(this);
        this.Leftfrontflipper3.setRotationPoint(7.2489F, 0.5F, 0.4266F);
        this.Leftfrontflipper2.addChild(Leftfrontflipper3);
        this.setRotateAngle(Leftfrontflipper3, 0.0F, -0.1309F, 0.0F);
        this.Leftfrontflipper3.cubeList.add(new ModelBox(Leftfrontflipper3, 0, 65, 0.0F, 0.0F, -0.6F, 8, 1, 5, 0.0F, false));

        this.Rightfrontflipper1 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper1.setRotationPoint(-5.0F, 1.9806F, -4.62F);
        this.Bodyfront.addChild(Rightfrontflipper1);
        this.setRotateAngle(Rightfrontflipper1, -0.1624F, -0.0552F, 0.0F);
        this.Rightfrontflipper1.cubeList.add(new ModelBox(Rightfrontflipper1, 68, 14, -4.0F, -0.5F, -1.0F, 4, 3, 4, 0.0F, true));

        this.Rightfrontflipper2 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper2.setRotationPoint(-4.0F, 0.0F, -0.4F);
        this.Rightfrontflipper1.addChild(Rightfrontflipper2);
        this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.1309F, 0.0F);
        this.Rightfrontflipper2.cubeList.add(new ModelBox(Rightfrontflipper2, 52, 31, -7.7489F, 0.0F, -0.7734F, 8, 2, 6, 0.0F, true));

        this.Rightfrontflipper3 = new AdvancedModelRenderer(this);
        this.Rightfrontflipper3.setRotationPoint(-7.2489F, 0.5F, 0.4266F);
        this.Rightfrontflipper2.addChild(Rightfrontflipper3);
        this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.1309F, 0.0F);
        this.Rightfrontflipper3.cubeList.add(new ModelBox(Rightfrontflipper3, 0, 65, -8.0F, 0.0F, -0.6F, 8, 1, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

        public void renderStaticWall(float f) {
            this.setRotateAngle(tailfin, -0.9163F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(snout2, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(snout, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(Righthindflipper3, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(Righthindflipper2, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(Righthindflipper1, -0.1624F, -0.0552F, 0.0F);
            this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(Rightfrontflipper1, -0.1624F, -0.0552F, 0.0F);
            this.setRotateAngle(Lefthindflipper3, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(Lefthindflipper2, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(Lefthindflipper1, -0.1624F, 0.0552F, 0.0F);
            this.setRotateAngle(Leftfrontflipper3, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(Leftfrontflipper2, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(Leftfrontflipper1, -0.1624F, 0.0552F, 0.0F);
            this.setRotateAngle(jaw3, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(jaw2, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(forehead2, -0.1876F, 0.0F, 0.0F);
            this.setRotateAngle(forehead, 0.3578F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.8727F);
            this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.8727F);
            this.setRotateAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.0F, 0.1745F, -0.7854F);
            this.setRotateAngle(cube_r11, 0.0F, -0.1745F, 0.7854F);
            this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
            this.Neck3.offsetY = -0.01F;
            this.Neck3.offsetZ = 0.1F;
            this.Neck3.render(0.01f);
            resetToDefaultPose();
        }
        public void renderStaticFloor(float f) {
            this.setRotateAngle(tailfin, -0.9163F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(snout2, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(snout, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(Righthindflipper3, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(Righthindflipper2, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(Righthindflipper1, -0.1643F, 0.1601F, -0.0355F);
            this.setRotateAngle(Rightfrontflipper3, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(Rightfrontflipper2, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(Rightfrontflipper1, -0.1468F, -0.0889F, -0.2161F);
            this.setRotateAngle(Neck4, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(Neck3, -0.1306F, 0.0076F, -0.044F);
            this.setRotateAngle(Neck2, -0.1309F, 0.0F, -0.0873F);
            this.setRotateAngle(Neck1, -0.0436F, 0.0F, -0.0436F);
            this.setRotateAngle(Lowerjaw, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(Lefthindflipper3, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(Lefthindflipper2, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(Lefthindflipper1, -0.1643F, -0.1601F, 0.0355F);
            this.setRotateAngle(Leftfrontflipper3, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(Leftfrontflipper2, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(Leftfrontflipper1, -0.1468F, 0.0889F, 0.2161F);
            this.setRotateAngle(jaw3, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(jaw2, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(Hips, 0.1745F, -0.0436F, 0.1764F);
            this.setRotateAngle(Head, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(forehead2, -0.1876F, 0.0F, 0.0F);
            this.setRotateAngle(forehead, 0.3578F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.8727F);
            this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.8727F);
            this.setRotateAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.0F, 0.1745F, -0.7854F);
            this.setRotateAngle(cube_r11, 0.0F, -0.1745F, 0.7854F);
            this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(Bodymiddle, -0.0038F, 0.0872F, -0.0438F);
            this.setRotateAngle(Bodyfront, -0.0436F, 0.0F, -0.0436F);
            this.Hips.offsetY = -0.4F;
            this.Hips.render(0.01f);
            resetToDefaultPose();
        }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = 0.2F;
        this.Hips.offsetX = -0.05F;
        this.Hips.rotateAngleY = (float)Math.toRadians(-120);
        this.Hips.rotateAngleX = (float)Math.toRadians(15);
        this.Hips.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 0.60F;
        this.Hips.scaleChildren = true;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {

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
        EntityPrehistoricFloraPlesiosaurus ee = (EntityPrehistoricFloraPlesiosaurus) entitylivingbaseIn;

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
        EntityPrehistoricFloraPlesiosaurus entity = (EntityPrehistoricFloraPlesiosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-90))*-2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-90))*-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-90))*-2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-90))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+90))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+90))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+90))*2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+90))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+190))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+190))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+190))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+190))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+190))*2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+190))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-160))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-160))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-160))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-120))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-160))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-160))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-160))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-120))*-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-120))*5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-120))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-120))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-120))*-30 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-120))*-30)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5 + (((tickAnim - 20) / 20) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-2.5 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlesiosaurus entity = (EntityPrehistoricFloraPlesiosaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-2), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1.5536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(1.5536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = 1.4865+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5-(1.4865+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)));
            zz = 15.01015 + (((tickAnim - 0) / 20) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(15.01015)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 20) / 20) * (0.6826+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5 + (((tickAnim - 20) / 20) * (1.5618+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 20) / 20) * (14.90108-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = 0.6826+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 40) / 120) * (1.5536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0.6826+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = 1.5618+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5 + (((tickAnim - 40) / 120) * (1.4865+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5-(1.5618+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)));
            zz = 14.90108 + (((tickAnim - 40) / 120) * (15.01015-(14.90108)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)));
            zz = -10 + (((tickAnim - 0) / 20) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5 + (((tickAnim - 20) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 20) / 20) * (-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5 + (((tickAnim - 40) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)));
            zz = -10 + (((tickAnim - 40) / 120) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(xx), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(yy), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 0) / 30) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 0) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 30) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 30) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 60) / 70) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 60) / 70) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3 + (((tickAnim - 60) / 70) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 130) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 130) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 130) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 0) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 0) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 30) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 30) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 60) / 70) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 70) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3 + (((tickAnim - 60) / 70) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 130) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 130) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 130) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 0) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 0) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 0) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 30) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 30) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 30) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 60) / 70) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3 + (((tickAnim - 60) / 70) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3 + (((tickAnim - 60) / 70) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3)));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 130) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 130) / 30) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 130) / 30) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1 + (((tickAnim - 60) / 40) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 60) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 60) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 100) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 100) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 20) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 60) / 40) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 60) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 60) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 100) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 100) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 0) / 20) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 0) / 20) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 0) / 20) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 20) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 20) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 20) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 30) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1 + (((tickAnim - 30) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 30) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1 + (((tickAnim - 40) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 40) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 40) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 50) / 60) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 50) / 60) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 50) / 60) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 110) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1 + (((tickAnim - 140) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 140) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 140) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1 + (((tickAnim - 150) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 150) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1 + (((tickAnim - 150) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 0) / 20) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 0) / 20) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 0) / 20) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 20) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 20) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-1-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 20) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-1 + (((tickAnim - 30) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-1)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 30) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 40) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 40) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 40) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 50) / 60) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 50) / 60) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 50) / 60) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3 + (((tickAnim - 110) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1 + (((tickAnim - 140) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-10 + (((tickAnim - 140) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 140) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1 + (((tickAnim - 150) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)));
            yy = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 150) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*1 + (((tickAnim - 150) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 0) / 20) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 0) / 20) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 0) / 20) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 20) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 20) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-1-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 20) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-1 + (((tickAnim - 30) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-1)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 30) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1 + (((tickAnim - 40) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 40) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 40) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 50) / 60) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 50) / 60) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 50) / 60) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3 + (((tickAnim - 110) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1 + (((tickAnim - 140) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-5 + (((tickAnim - 140) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*3 + (((tickAnim - 140) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*3)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1 + (((tickAnim - 150) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 150) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*1 + (((tickAnim - 150) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 0) / 20) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 20) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 20) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-1 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-1)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 30) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-1 + (((tickAnim - 40) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 40) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 40) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 50) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 50) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 50) / 60) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3 + (((tickAnim - 110) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*1 + (((tickAnim - 140) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-1-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*-5 + (((tickAnim - 140) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*3 + (((tickAnim - 140) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*3)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-1 + (((tickAnim - 150) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-1)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5 + (((tickAnim - 150) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*1 + (((tickAnim - 150) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 0) / 20) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 0) / 20) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 20) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 20) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 30) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*-3 + (((tickAnim - 30) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*-3)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1 + (((tickAnim - 40) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5 + (((tickAnim - 40) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 40) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 50) / 60) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5 + (((tickAnim - 50) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 50) / 60) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1 + (((tickAnim - 110) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5 + (((tickAnim - 110) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 140) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*10 + (((tickAnim - 140) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*-3 + (((tickAnim - 140) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*-3)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1 + (((tickAnim - 150) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5 + (((tickAnim - 150) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*1 + (((tickAnim - 150) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 0) / 20) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 20) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3 + (((tickAnim - 20) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1 + (((tickAnim - 30) / 10) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2 + (((tickAnim - 40) / 10) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1 + (((tickAnim - 40) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3 + (((tickAnim - 40) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 50) / 60) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1 + (((tickAnim - 50) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3 + (((tickAnim - 50) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 110) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3 + (((tickAnim - 110) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 140) / 10) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1 + (((tickAnim - 140) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*5 + (((tickAnim - 140) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*5)));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2 + (((tickAnim - 150) / 10) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1 + (((tickAnim - 150) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3 + (((tickAnim - 150) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 13.6234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 60) * (9.2242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(13.6234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = 2.2927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 0) / 60) * (2.5825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(2.2927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = 17.36699 + (((tickAnim - 0) / 60) * (-0.23738-(17.36699)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = 9.2242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 60) / 30) * (13.2519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(9.2242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = 2.5825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 60) / 30) * (2.4324+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(2.5825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = -0.23738 + (((tickAnim - 60) / 30) * (12.3476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-0.23738)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 13.2519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 90) / 30) * (7.3242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(13.2519+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = 2.4324+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 90) / 30) * (2.0478+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(2.4324+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = 12.3476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 90) / 30) * (14.83303-(12.3476+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 7.3242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 120) / 40) * (13.6234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(7.3242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = 2.0478+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 120) / 40) * (2.2927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(2.0478+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
            zz = 14.83303 + (((tickAnim - 120) / 40) * (17.36699-(14.83303)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)));
            zz = -7.5 + (((tickAnim - 0) / 60) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5 + (((tickAnim - 60) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)));
            zz = -7.5 + (((tickAnim - 60) / 30) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(-7.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 90) / 30) * (-7.5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)));
            zz = -7.5 + (((tickAnim - 120) / 40) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 22.8829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 120) * (13.6234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(22.8829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = -2.4131+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 0) / 120) * (-2.2928+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(-2.4131+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            zz = -20.07039 + (((tickAnim - 0) / 120) * (-17.36699-(-20.07039)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 13.6234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(13.6234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = -2.2928+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(-2.2928+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            zz = -17.36699 + (((tickAnim - 120) / 20) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-17.36699)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 140) / 20) * (22.8829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 140) / 20) * (-2.4131+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 140) / 20) * (-20.07039-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5 + (((tickAnim - 0) / 120) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)));
            zz = 7.5 + (((tickAnim - 0) / 120) * (7.5-(7.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5 + (((tickAnim - 120) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)));
            zz = 7.5 + (((tickAnim - 120) / 20) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(7.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 140) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5 + (((tickAnim - 140) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 140) / 20) * (7.5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(xx), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(yy), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = 0.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 79) * (0.7126+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = -1.932+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5 + (((tickAnim - 0) / 79) * (-1.5817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5-(-1.932+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)));
            zz = -17.38263 + (((tickAnim - 0) / 79) * (-14.90003-(-17.38263)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = 0.7126+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0.7126+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = -1.5817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5-(-1.5817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)));
            zz = -14.90003 + (((tickAnim - 79) / 21) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5-(-14.90003)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 100) / 20) * (0.7126+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5 + (((tickAnim - 100) / 20) * (-1.5817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5 + (((tickAnim - 100) / 20) * (-14.90003-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0.7126+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 120) / 40) * (0.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0.7126+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = -1.5817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5 + (((tickAnim - 120) / 40) * (-1.932+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5-(-1.5817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)));
            zz = -14.90003 + (((tickAnim - 120) / 40) * (-17.38263-(-14.90003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(xx), Righthindflipper1.rotateAngleY + (float) Math.toRadians(yy), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 0) / 79) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = 10 + (((tickAnim - 0) / 79) * (10-(10)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 79) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = 10 + (((tickAnim - 79) / 21) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5-(10)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 100) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 100) / 20) * (10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5 + (((tickAnim - 120) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)));
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
        EntityPrehistoricFloraPlesiosaurus entity = (EntityPrehistoricFloraPlesiosaurus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*3), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-5));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-0.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*4);


        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-30), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-35), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-10));


        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-5), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*-5), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*-10));


        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-5), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-5), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-210))*-10));


        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-30), Righthindflipper1.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*35), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*10));


        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-5), Righthindflipper2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*5), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*10));


        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*-5), Righthindflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*5), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*10));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*2.5), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-3));


        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*3)));


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-20))*3));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*1));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*2));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-3), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*2.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*5));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*30), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*40), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*20));


        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*5), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*5), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*10));


        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*5), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*5), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10));


        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*30), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-40), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-20));


        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-40))*5), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*-5), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*-10));


        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*5), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+110))*-5), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*-10));


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlesiosaurus entity = (EntityPrehistoricFloraPlesiosaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*1), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+80))*-3));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3.5);


        this.setRotateAngle(Lefthindflipper1, Lefthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*20), Lefthindflipper1.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+80))*-20), Lefthindflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*-15));


        this.setRotateAngle(Lefthindflipper2, Lefthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*5), Lefthindflipper2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+110))*-15), Lefthindflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-80))*-10));


        this.setRotateAngle(Lefthindflipper3, Lefthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*5), Lefthindflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+140))*-15), Lefthindflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-110))*-10));


        this.setRotateAngle(Righthindflipper1, Righthindflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20), Righthindflipper1.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100))*20), Righthindflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*15));


        this.setRotateAngle(Righthindflipper2, Righthindflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*5), Righthindflipper2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+130))*15), Righthindflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*10));


        this.setRotateAngle(Righthindflipper3, Righthindflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*5), Righthindflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+160))*15), Righthindflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*10));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*5), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*-3));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*2.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-10))*-3));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*2.5), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3));


        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-2.5), Bodymiddle.rotateAngleY + (float) Math.toRadians(0), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+60))*3));


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1), Bodyfront.rotateAngleY + (float) Math.toRadians(0), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+50))*2));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-1), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*3));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*1), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*1), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-180))*-1), Neck4.rotateAngleY + (float) Math.toRadians(0), Neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-160))*3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-190))*-1), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-80))*3));


        this.setRotateAngle(Leftfrontflipper1, Leftfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+260))*-20), Leftfrontflipper1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20), Leftfrontflipper1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*20));


        this.setRotateAngle(Leftfrontflipper2, Leftfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+290))*-5), Leftfrontflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*10), Leftfrontflipper2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*15));


        this.setRotateAngle(Leftfrontflipper3, Leftfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+320))*-5), Leftfrontflipper3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*10), Leftfrontflipper3.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*15));


        this.setRotateAngle(Rightfrontflipper1, Rightfrontflipper1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+240))*-20), Rightfrontflipper1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20), Rightfrontflipper1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+10))*-20));


        this.setRotateAngle(Rightfrontflipper2, Rightfrontflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5), Rightfrontflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-10), Rightfrontflipper2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15));


        this.setRotateAngle(Rightfrontflipper3, Rightfrontflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+300))*-5), Rightfrontflipper3.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*-10), Rightfrontflipper3.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*-15));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 12, Neck1);
        this.faceTarget(f3, f4, 12, Neck2);
        this.faceTarget(f3, f4, 12, Neck3);
        this.faceTarget(f3, f4, 12, Neck4);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3};

        EntityPrehistoricFloraPlesiosaurus ee = (EntityPrehistoricFloraPlesiosaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }

}

