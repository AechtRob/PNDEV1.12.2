package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStoermeropterus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelStoermeropterus extends AdvancedModelBase {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legsegL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legsegR5;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer segment;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer segment5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer segment6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;

    private ModelAnimator animator;


    public ModelStoermeropterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, 22.5F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 9, -4.5F, -2.0F, -6.0F, 9, 2, 4, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 26, 19, -1.5F, -2.0F, -8.0F, 3, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.5F, -1.0F, -6.0F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.0472F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 22, 0.0F, -1.0F, -4.0F, 3, 2, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(4.5F, -1.0F, -6.0F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0472F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 23, -3.0F, -1.0F, -4.0F, 3, 2, 4, -0.01F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(3.5F, 0.0F, -3.0F);
        this.carapace.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.5672F, 0.2618F);
        this.legL5.cubeList.add(new ModelBox(legL5, 26, 23, 0.0F, -0.49F, -0.5F, 3, 1, 1, 0.0F, false));

        this.legsegL5 = new AdvancedModelRenderer(this);
        this.legsegL5.setRotationPoint(2.75F, 0.0F, 0.25F);
        this.legL5.addChild(legsegL5);
        this.setRotateAngle(legsegL5, 0.0F, 1.0036F, 0.0F);
        this.legsegL5.cubeList.add(new ModelBox(legsegL5, 10, 25, -0.225F, -0.49F, -0.1F, 1, 1, 4, -0.01F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-3.5F, 0.0F, -3.0F);
        this.carapace.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.5672F, -0.2618F);
        this.legR5.cubeList.add(new ModelBox(legR5, 26, 23, -3.0F, -0.49F, -0.5F, 3, 1, 1, 0.0F, true));

        this.legsegR5 = new AdvancedModelRenderer(this);
        this.legsegR5.setRotationPoint(-2.75F, 0.0F, 0.25F);
        this.legR5.addChild(legsegR5);
        this.setRotateAngle(legsegR5, 0.0F, -1.0036F, 0.0F);
        this.legsegR5.cubeList.add(new ModelBox(legsegR5, 10, 25, -0.775F, -0.49F, -0.1F, 1, 1, 4, -0.01F, true));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(2.0F, 0.0F, -6.25F);
        this.carapace.addChild(legL1);
        this.setRotateAngle(legL1, 0.3307F, 1.08F, 0.6621F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 6, 0.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-2.0F, 0.0F, -6.25F);
        this.carapace.addChild(legR1);
        this.setRotateAngle(legR1, 0.3307F, -1.08F, -0.6621F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 6, -2.0F, 0.01F, -0.5F, 2, 0, 1, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.75F, 0.0F, -5.75F);
        this.carapace.addChild(legL2);
        this.setRotateAngle(legL2, 0.1809F, 0.435F, 0.453F);
        this.legL2.cubeList.add(new ModelBox(legL2, 24, 5, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.75F, 0.0F, -5.75F);
        this.carapace.addChild(legR2);
        this.setRotateAngle(legR2, 0.1809F, -0.435F, -0.453F);
        this.legR2.cubeList.add(new ModelBox(legR2, 24, 5, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(3.5F, 0.0F, -5.0F);
        this.carapace.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.1745F, 0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 9, 23, 0.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-3.5F, 0.0F, -5.0F);
        this.carapace.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.1745F, -0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 9, 23, -5.0F, 0.01F, -0.5F, 5, 0, 1, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(3.75F, 0.0F, -4.0F);
        this.carapace.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, -0.0436F, 0.3054F);
        this.legL4.cubeList.add(new ModelBox(legL4, 21, 12, 0.0F, 0.01F, -0.5F, 7, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-3.75F, 0.0F, -4.0F);
        this.carapace.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0436F, -0.3054F);
        this.legR4.cubeList.add(new ModelBox(legR4, 21, 12, -7.0F, 0.01F, -0.5F, 7, 0, 1, 0.0F, true));

        this.segment = new AdvancedModelRenderer(this);
        this.segment.setRotationPoint(0.0F, -1.5F, -2.0F);
        this.carapace.addChild(segment);
        this.segment.cubeList.add(new ModelBox(segment, 0, 0, -4.5F, -0.5F, 0.0F, 9, 2, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-5.5F, 0.825F, 6.5F);
        this.segment.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.2654F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 5, -1.0F, -0.5F, 0.85F, 2, 0, 1, 0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(5.5F, 0.825F, 6.5F);
        this.segment.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.2654F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 5, -1.0F, -0.5F, 0.85F, 2, 0, 1, 0.01F, false));

        this.segment2 = new AdvancedModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.25F, 7.0F);
        this.segment.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 0, 20, -4.0F, -0.425F, 0.0F, 8, 1, 2, 0.01F, false));
        this.segment2.cubeList.add(new ModelBox(segment2, 0, 15, -4.0F, 0.225F, 0.0F, 8, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-5.5F, 0.6622F, -0.4981F);
        this.segment2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.2654F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 4, -2.95F, -0.5F, 1.8F, 2, 0, 1, 0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(5.5F, 0.6622F, -0.4981F);
        this.segment2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.2654F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 4, 0.95F, -0.5F, 1.8F, 2, 0, 1, 0.01F, false));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.25F, 2.0F);
        this.segment2.addChild(segment3);
        this.setRotateAngle(segment3, -0.0436F, 0.0F, 0.0F);
        this.segment3.cubeList.add(new ModelBox(segment3, 22, 9, -3.5F, -0.1628F, 0.0019F, 7, 1, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-5.5F, 0.4122F, -2.4981F);
        this.segment3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.2654F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 3, -4.75F, 0.0F, 3.275F, 3, 0, 1, 0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(5.5F, 0.4122F, -2.4981F);
        this.segment3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.2654F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 3, 1.75F, 0.0F, 3.275F, 3, 0, 1, 0.01F, false));

        this.segment4 = new AdvancedModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0872F, 2.0019F);
        this.segment3.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 26, 13, -2.5F, -0.25F, 0.0F, 5, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.9965F, 0.325F, 1.8473F);
        this.segment4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.309F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 2, -1.5F, 0.0F, -0.75F, 3, 0, 1, 0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.9965F, 0.325F, 1.8473F);
        this.segment4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -1.309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 2, -1.5F, 0.0F, -0.75F, 3, 0, 1, 0.01F, false));

        this.segment5 = new AdvancedModelRenderer(this);
        this.segment5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment4.addChild(segment5);
        this.segment5.cubeList.add(new ModelBox(segment5, 26, 16, -2.0F, -0.25F, -0.025F, 4, 1, 2, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.9965F, 0.325F, -0.1527F);
        this.segment5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 1.3963F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 1, -3.675F, 0.0F, 0.275F, 3, 0, 1, 0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.9965F, 0.325F, -0.1527F);
        this.segment5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.3963F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 0.675F, 0.0F, 0.275F, 3, 0, 1, 0.01F, false));

        this.segment6 = new AdvancedModelRenderer(this);
        this.segment6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.segment5.addChild(segment6);
        this.segment6.cubeList.add(new ModelBox(segment6, 25, 0, -1.0F, -0.25F, -0.05F, 2, 1, 4, -0.02F, false));
        this.segment6.cubeList.add(new ModelBox(segment6, 17, 15, -0.5F, 0.25F, 3.725F, 1, 0, 7, -0.04F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.9965F, 0.325F, -2.1527F);
        this.segment6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 1.3963F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -6.25F, 0.0F, 1.55F, 3, 0, 1, 0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.9965F, 0.325F, -2.1527F);
        this.segment6.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -1.3963F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 3.25F, 0.0F, 1.55F, 3, 0, 1, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.carapace.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(carapace, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(segment, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(segment2, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(segment3, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(segment4, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(segment5, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(segment6, 0.1F, 0.0F, 0.0F);
        this.carapace.offsetZ = -0.02F;
        this.carapace.offsetY = 0.13F;
        this.carapace.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.carapace.offsetZ = 0.030F;
        this.carapace.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.carapace.offsetY = -0.4F;
        this.carapace.offsetX = 1.0F;
        this.carapace.rotateAngleY = (float)Math.toRadians(200);
        this.carapace.rotateAngleX = (float)Math.toRadians(8);
        this.carapace.rotateAngleZ = (float)Math.toRadians(-8);
        this.carapace.scaleChildren = true;
        float scaler = 3.5F;
        this.carapace.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(carapace, 0.2F, 3.5F, 0.0F);
        this.setRotateAngle(segment, -0.1F, 0.2F, 0.05F);
        this.setRotateAngle(segment2, -0.1F, 0.2F, 0.05F);
        this.setRotateAngle(segment3, 0.1F, 0.2F, 0.05F);
        this.setRotateAngle(segment4, 0.2F, 0.2F, 0.05F);
        this.setRotateAngle(segment5, 0.3F, 0.2F, 0.05F);
        this.setRotateAngle(segment6, 0.3F, 0.2F, 0.05F);
        //End of pose, now render the model:
        this.carapace.render(f);
        //Reset rotations, positions and sizing:
        this.carapace.setScale(1.0F, 1.0F, 1.0F);
        this.carapace.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
       // this.body.offsetY = 0.4F;
        //this.carapace.offsetY = -0.2F;
        //this.carapace.offsetZ = 0.1F;


        AdvancedModelRenderer[] fishBody = {this.segment, this.segment2, this.segment3, this.segment4, this.segment5, this.segment6};
        AdvancedModelRenderer[] fishTail = {this.segment5, this.segment6};



        //mouthparts:
        //this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        //this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraStoermeropterus slimon = (EntityPrehistoricFloraStoermeropterus) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.body.offsetY = 0.2F;
                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraStoermeropterus ee = (EntityPrehistoricFloraStoermeropterus) entitylivingbaseIn;
        //Swimming pose:

        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
                    //Walk pose:
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    if (ee.getIsFast()) {
                        animFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    //Walk static pose:
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
            }
        }
    }

    public void animFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStoermeropterus entity = (EntityPrehistoricFloraStoermeropterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(carapace, carapace.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))), carapace.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+90))), carapace.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*0.5));
        this.carapace.rotationPointX = this.carapace.rotationPointX + (float)(0);
        this.carapace.rotationPointY = this.carapace.rotationPointY - (float)(0.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*0.1);
        this.carapace.rotationPointZ = this.carapace.rotationPointZ + (float)(0);


        this.setRotateAngle(segment, segment.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))), segment.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))), segment.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment2, segment2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))), segment2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))), segment2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment3, segment3.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))), segment3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))), segment3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment4, segment4.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))), segment4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))), segment4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment5, segment5.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))), segment5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))), segment5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment6, segment6.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-180))), segment6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))), segment6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -28.58 + (((tickAnim - 0) / 1) * (-28.52295-(-28.58)));
            yy = -18.05 + (((tickAnim - 0) / 1) * (-21.52946-(-18.05)));
            zz = -9.96 + (((tickAnim - 0) / 1) * (-11.35956-(-9.96)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -28.52295 + (((tickAnim - 1) / 2) * (-27.4764-(-28.52295)));
            yy = -21.52946 + (((tickAnim - 1) / 2) * (-8.51738-(-21.52946)));
            zz = -11.35956 + (((tickAnim - 1) / 2) * (-35.79321-(-11.35956)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -27.4764 + (((tickAnim - 3) / 3) * (-27.26579-(-27.4764)));
            yy = -8.51738 + (((tickAnim - 3) / 3) * (8.33887-(-8.51738)));
            zz = -35.79321 + (((tickAnim - 3) / 3) * (-14.85571-(-35.79321)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -27.26579 + (((tickAnim - 6) / 2) * (-28.69665-(-27.26579)));
            yy = 8.33887 + (((tickAnim - 6) / 2) * (-11.10114-(8.33887)));
            zz = -14.85571 + (((tickAnim - 6) / 2) * (-7.16105-(-14.85571)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -28.69665 + (((tickAnim - 8) / 3) * (-28.52295-(-28.69665)));
            yy = -11.10114 + (((tickAnim - 8) / 3) * (-21.52946-(-11.10114)));
            zz = -7.16105 + (((tickAnim - 8) / 3) * (-11.35956-(-7.16105)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -28.52295 + (((tickAnim - 11) / 2) * (-27.4764-(-28.52295)));
            yy = -21.52946 + (((tickAnim - 11) / 2) * (-8.51738-(-21.52946)));
            zz = -11.35956 + (((tickAnim - 11) / 2) * (-35.79321-(-11.35956)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -27.4764 + (((tickAnim - 13) / 3) * (-27.26579-(-27.4764)));
            yy = -8.51738 + (((tickAnim - 13) / 3) * (8.33887-(-8.51738)));
            zz = -35.79321 + (((tickAnim - 13) / 3) * (-14.85571-(-35.79321)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -27.26579 + (((tickAnim - 16) / 2) * (-28.69665-(-27.26579)));
            yy = 8.33887 + (((tickAnim - 16) / 2) * (-11.10114-(8.33887)));
            zz = -14.85571 + (((tickAnim - 16) / 2) * (-7.16105-(-14.85571)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -28.69665 + (((tickAnim - 18) / 2) * (-28.58-(-28.69665)));
            yy = -11.10114 + (((tickAnim - 18) / 2) * (-18.05-(-11.10114)));
            zz = -7.16105 + (((tickAnim - 18) / 2) * (-9.96-(-7.16105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 5.83 + (((tickAnim - 0) / 1) * (0-(5.83)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -12.5 + (((tickAnim - 3) / 3) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (17.5-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 17.5 + (((tickAnim - 8) / 3) * (0-(17.5)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -12.5 + (((tickAnim - 13) / 3) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (17.5-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 17.5 + (((tickAnim - 18) / 2) * (5.83-(17.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legsegL5, legsegL5.rotateAngleX + (float) Math.toRadians(xx), legsegL5.rotateAngleY + (float) Math.toRadians(yy), legsegL5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -27.26579 + (((tickAnim - 0) / 3) * (-28.69665-(-27.26579)));
            yy = -8.33887 + (((tickAnim - 0) / 3) * (11.10114-(-8.33887)));
            zz = 14.85571 + (((tickAnim - 0) / 3) * (7.16105-(14.85571)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -28.69665 + (((tickAnim - 3) / 2) * (-28.52295-(-28.69665)));
            yy = 11.10114 + (((tickAnim - 3) / 2) * (21.52946-(11.10114)));
            zz = 7.16105 + (((tickAnim - 3) / 2) * (11.35956-(7.16105)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -28.52295 + (((tickAnim - 5) / 3) * (-27.4764-(-28.52295)));
            yy = 21.52946 + (((tickAnim - 5) / 3) * (8.51738-(21.52946)));
            zz = 11.35956 + (((tickAnim - 5) / 3) * (35.79321-(11.35956)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -27.4764 + (((tickAnim - 8) / 2) * (-27.26579-(-27.4764)));
            yy = 8.51738 + (((tickAnim - 8) / 2) * (-8.33887-(8.51738)));
            zz = 35.79321 + (((tickAnim - 8) / 2) * (14.85571-(35.79321)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -27.26579 + (((tickAnim - 10) / 3) * (-28.69665-(-27.26579)));
            yy = -8.33887 + (((tickAnim - 10) / 3) * (11.10114-(-8.33887)));
            zz = 14.85571 + (((tickAnim - 10) / 3) * (7.16105-(14.85571)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -28.69665 + (((tickAnim - 13) / 2) * (-28.52295-(-28.69665)));
            yy = 11.10114 + (((tickAnim - 13) / 2) * (21.52946-(11.10114)));
            zz = 7.16105 + (((tickAnim - 13) / 2) * (11.35956-(7.16105)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -28.52295 + (((tickAnim - 15) / 3) * (-27.4764-(-28.52295)));
            yy = 21.52946 + (((tickAnim - 15) / 3) * (8.51738-(21.52946)));
            zz = 11.35956 + (((tickAnim - 15) / 3) * (35.79321-(11.35956)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.4764 + (((tickAnim - 18) / 2) * (-27.26579-(-27.4764)));
            yy = 8.51738 + (((tickAnim - 18) / 2) * (-8.33887-(8.51738)));
            zz = 35.79321 + (((tickAnim - 18) / 2) * (14.85571-(35.79321)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -17.5 + (((tickAnim - 3) / 2) * (0-(-17.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (12.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 12.5 + (((tickAnim - 8) / 2) * (0-(12.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -17.5 + (((tickAnim - 13) / 2) * (0-(-17.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (12.5-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 12.5 + (((tickAnim - 18) / 2) * (0-(12.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legsegR5, legsegR5.rotateAngleX + (float) Math.toRadians(xx), legsegR5.rotateAngleY + (float) Math.toRadians(yy), legsegR5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(0), legL1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*2.5), legL1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+115))*5));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(0), legR1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*2.5), legR1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+115))*5));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -9.86 + (((tickAnim - 0) / 1) * (-11.31485-(-9.86)));
            yy = -2.44 + (((tickAnim - 0) / 1) * (-7.26951-(-2.44)));
            zz = -12.17 + (((tickAnim - 0) / 1) * (-12.52599-(-12.17)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -11.31485 + (((tickAnim - 1) / 2) * (-9.22272-(-11.31485)));
            yy = -7.26951 + (((tickAnim - 1) / 2) * (-0.96641-(-7.26951)));
            zz = -12.52599 + (((tickAnim - 1) / 2) * (-24.6919-(-12.52599)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -9.22272 + (((tickAnim - 3) / 3) * (-2.56943-(-9.22272)));
            yy = -0.96641 + (((tickAnim - 3) / 3) * (21.72709-(-0.96641)));
            zz = -24.6919 + (((tickAnim - 3) / 3) * (-10.38824-(-24.6919)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -2.56943 + (((tickAnim - 6) / 5) * (-11.31485-(-2.56943)));
            yy = 21.72709 + (((tickAnim - 6) / 5) * (-7.26951-(21.72709)));
            zz = -10.38824 + (((tickAnim - 6) / 5) * (-12.52599-(-10.38824)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -11.31485 + (((tickAnim - 11) / 2) * (-9.22272-(-11.31485)));
            yy = -7.26951 + (((tickAnim - 11) / 2) * (-0.96641-(-7.26951)));
            zz = -12.52599 + (((tickAnim - 11) / 2) * (-24.6919-(-12.52599)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9.22272 + (((tickAnim - 13) / 3) * (-2.56943-(-9.22272)));
            yy = -0.96641 + (((tickAnim - 13) / 3) * (21.72709-(-0.96641)));
            zz = -24.6919 + (((tickAnim - 13) / 3) * (-10.38824-(-24.6919)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.56943 + (((tickAnim - 16) / 4) * (-9.86-(-2.56943)));
            yy = 21.72709 + (((tickAnim - 16) / 4) * (-2.44-(21.72709)));
            zz = -10.38824 + (((tickAnim - 16) / 4) * (-12.17-(-10.38824)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.56943 + (((tickAnim - 0) / 5) * (-11.31485-(-2.56943)));
            yy = -21.72709 + (((tickAnim - 0) / 5) * (7.26951-(-21.72709)));
            zz = 10.38824 + (((tickAnim - 0) / 5) * (12.52599-(10.38824)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -11.31485 + (((tickAnim - 5) / 3) * (-9.22272-(-11.31485)));
            yy = 7.26951 + (((tickAnim - 5) / 3) * (0.96641-(7.26951)));
            zz = 12.52599 + (((tickAnim - 5) / 3) * (24.6919-(12.52599)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.22272 + (((tickAnim - 8) / 2) * (-2.56943-(-9.22272)));
            yy = 0.96641 + (((tickAnim - 8) / 2) * (-21.72709-(0.96641)));
            zz = 24.6919 + (((tickAnim - 8) / 2) * (10.38824-(24.6919)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.56943 + (((tickAnim - 10) / 5) * (-11.31485-(-2.56943)));
            yy = -21.72709 + (((tickAnim - 10) / 5) * (7.26951-(-21.72709)));
            zz = 10.38824 + (((tickAnim - 10) / 5) * (12.52599-(10.38824)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -11.31485 + (((tickAnim - 15) / 3) * (-9.22272-(-11.31485)));
            yy = 7.26951 + (((tickAnim - 15) / 3) * (0.96641-(7.26951)));
            zz = 12.52599 + (((tickAnim - 15) / 3) * (24.6919-(12.52599)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.22272 + (((tickAnim - 18) / 2) * (-2.56943-(-9.22272)));
            yy = 0.96641 + (((tickAnim - 18) / 2) * (-21.72709-(0.96641)));
            zz = 24.6919 + (((tickAnim - 18) / 2) * (10.38824-(24.6919)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.88 + (((tickAnim - 0) / 2) * (-2.8833-(-4.88)));
            yy = -10.17 + (((tickAnim - 0) / 2) * (-1.27913-(-10.17)));
            zz = -12.58 + (((tickAnim - 0) / 2) * (-23.0746-(-12.58)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -2.8833 + (((tickAnim - 2) / 2) * (0.30938-(-2.8833)));
            yy = -1.27913 + (((tickAnim - 2) / 2) * (14.65647-(-1.27913)));
            zz = -23.0746 + (((tickAnim - 2) / 2) * (-8.89589-(-23.0746)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.30938 + (((tickAnim - 4) / 5) * (-5.873-(0.30938)));
            yy = 14.65647 + (((tickAnim - 4) / 5) * (-14.61515-(14.65647)));
            zz = -8.89589 + (((tickAnim - 4) / 5) * (-7.33313-(-8.89589)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -5.873 + (((tickAnim - 9) / 3) * (-2.8833-(-5.873)));
            yy = -14.61515 + (((tickAnim - 9) / 3) * (-1.27913-(-14.61515)));
            zz = -7.33313 + (((tickAnim - 9) / 3) * (-23.0746-(-7.33313)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -2.8833 + (((tickAnim - 12) / 2) * (0.30938-(-2.8833)));
            yy = -1.27913 + (((tickAnim - 12) / 2) * (14.65647-(-1.27913)));
            zz = -23.0746 + (((tickAnim - 12) / 2) * (-8.89589-(-23.0746)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0.30938 + (((tickAnim - 14) / 5) * (-5.873-(0.30938)));
            yy = 14.65647 + (((tickAnim - 14) / 5) * (-14.61515-(14.65647)));
            zz = -8.89589 + (((tickAnim - 14) / 5) * (-7.33313-(-8.89589)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -5.873 + (((tickAnim - 19) / 1) * (-4.88-(-5.873)));
            yy = -14.61515 + (((tickAnim - 19) / 1) * (-10.17-(-14.61515)));
            zz = -7.33313 + (((tickAnim - 19) / 1) * (-12.58-(-7.33313)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.75 + (((tickAnim - 0) / 3) * (-5.873-(-1.75)));
            yy = -4.9 + (((tickAnim - 0) / 3) * (14.61515-(-4.9)));
            zz = 8.37 + (((tickAnim - 0) / 3) * (7.33313-(8.37)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.873 + (((tickAnim - 3) / 3) * (-2.8833-(-5.873)));
            yy = 14.61515 + (((tickAnim - 3) / 3) * (1.27913-(14.61515)));
            zz = 7.33313 + (((tickAnim - 3) / 3) * (23.0746-(7.33313)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -2.8833 + (((tickAnim - 6) / 2) * (0.30938-(-2.8833)));
            yy = 1.27913 + (((tickAnim - 6) / 2) * (-14.65647-(1.27913)));
            zz = 23.0746 + (((tickAnim - 6) / 2) * (8.89589-(23.0746)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.30938 + (((tickAnim - 8) / 5) * (-5.873-(0.30938)));
            yy = -14.65647 + (((tickAnim - 8) / 5) * (14.61515-(-14.65647)));
            zz = 8.89589 + (((tickAnim - 8) / 5) * (7.33313-(8.89589)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -5.873 + (((tickAnim - 13) / 3) * (-2.8833-(-5.873)));
            yy = 14.61515 + (((tickAnim - 13) / 3) * (1.27913-(14.61515)));
            zz = 7.33313 + (((tickAnim - 13) / 3) * (23.0746-(7.33313)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -2.8833 + (((tickAnim - 16) / 2) * (0.30938-(-2.8833)));
            yy = 1.27913 + (((tickAnim - 16) / 2) * (-14.65647-(1.27913)));
            zz = 23.0746 + (((tickAnim - 16) / 2) * (8.89589-(23.0746)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.30938 + (((tickAnim - 18) / 2) * (-1.75-(0.30938)));
            yy = -14.65647 + (((tickAnim - 18) / 2) * (-4.9-(-14.65647)));
            zz = 8.89589 + (((tickAnim - 18) / 2) * (8.37-(8.89589)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.5 + (((tickAnim - 0) / 3) * (-11.69626-(-8.5)));
            yy = -14.59 + (((tickAnim - 0) / 3) * (-29.2269-(-14.59)));
            zz = -5.58 + (((tickAnim - 0) / 3) * (-3.2704-(-5.58)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -11.69626 + (((tickAnim - 3) / 2) * (-8.61274-(-11.69626)));
            yy = -29.2269 + (((tickAnim - 3) / 2) * (-15.4556-(-29.2269)));
            zz = -3.2704 + (((tickAnim - 3) / 2) * (-15.5082-(-3.2704)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.61274 + (((tickAnim - 5) / 3) * (-5.30812-(-8.61274)));
            yy = -15.4556 + (((tickAnim - 5) / 3) * (0.0438-(-15.4556)));
            zz = -15.5082 + (((tickAnim - 5) / 3) * (-7.8883-(-15.5082)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5.30812 + (((tickAnim - 8) / 5) * (-11.69626-(-5.30812)));
            yy = 0.0438 + (((tickAnim - 8) / 5) * (-29.2269-(0.0438)));
            zz = -7.8883 + (((tickAnim - 8) / 5) * (-3.2704-(-7.8883)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -11.69626 + (((tickAnim - 13) / 2) * (-8.61274-(-11.69626)));
            yy = -29.2269 + (((tickAnim - 13) / 2) * (-15.4556-(-29.2269)));
            zz = -3.2704 + (((tickAnim - 13) / 2) * (-15.5082-(-3.2704)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -8.61274 + (((tickAnim - 15) / 3) * (-5.30812-(-8.61274)));
            yy = -15.4556 + (((tickAnim - 15) / 3) * (0.0438-(-15.4556)));
            zz = -15.5082 + (((tickAnim - 15) / 3) * (-7.8883-(-15.5082)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.30812 + (((tickAnim - 18) / 2) * (-8.5-(-5.30812)));
            yy = 0.0438 + (((tickAnim - 18) / 2) * (-14.59-(0.0438)));
            zz = -7.8883 + (((tickAnim - 18) / 2) * (-5.58-(-7.8883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.51 + (((tickAnim - 0) / 2) * (-5.30812-(-7.51)));
            yy = 10.29 + (((tickAnim - 0) / 2) * (-0.0438-(10.29)));
            zz = 12.97 + (((tickAnim - 0) / 2) * (7.8883-(12.97)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -5.30812 + (((tickAnim - 2) / 5) * (-11.69626-(-5.30812)));
            yy = -0.0438 + (((tickAnim - 2) / 5) * (29.2269-(-0.0438)));
            zz = 7.8883 + (((tickAnim - 2) / 5) * (3.2704-(7.8883)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -11.69626 + (((tickAnim - 7) / 2) * (-8.61274-(-11.69626)));
            yy = 29.2269 + (((tickAnim - 7) / 2) * (15.4556-(29.2269)));
            zz = 3.2704 + (((tickAnim - 7) / 2) * (15.5082-(3.2704)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -8.61274 + (((tickAnim - 9) / 3) * (-5.30812-(-8.61274)));
            yy = 15.4556 + (((tickAnim - 9) / 3) * (-0.0438-(15.4556)));
            zz = 15.5082 + (((tickAnim - 9) / 3) * (7.8883-(15.5082)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -5.30812 + (((tickAnim - 12) / 5) * (-11.69626-(-5.30812)));
            yy = -0.0438 + (((tickAnim - 12) / 5) * (29.2269-(-0.0438)));
            zz = 7.8883 + (((tickAnim - 12) / 5) * (3.2704-(7.8883)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -11.69626 + (((tickAnim - 17) / 2) * (-8.61274-(-11.69626)));
            yy = 29.2269 + (((tickAnim - 17) / 2) * (15.4556-(29.2269)));
            zz = 3.2704 + (((tickAnim - 17) / 2) * (15.5082-(3.2704)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -8.61274 + (((tickAnim - 19) / 1) * (-7.51-(-8.61274)));
            yy = 15.4556 + (((tickAnim - 19) / 1) * (10.29-(15.4556)));
            zz = 15.5082 + (((tickAnim - 19) / 1) * (12.97-(15.5082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraStoermeropterus entity = (EntityPrehistoricFloraStoermeropterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(carapace, carapace.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))), carapace.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+90))), carapace.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))*0.5));
        this.carapace.rotationPointX = this.carapace.rotationPointX + (float)(0);
        this.carapace.rotationPointY = this.carapace.rotationPointY - (float)(0.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*0.1);
        this.carapace.rotationPointZ = this.carapace.rotationPointZ + (float)(0);


        this.setRotateAngle(segment, segment.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))), segment.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+60))), segment.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment2, segment2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))), segment2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))), segment2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment3, segment3.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))), segment3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))), segment3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment4, segment4.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))), segment4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-30))), segment4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment5, segment5.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))), segment5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))), segment5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(segment6, segment6.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-180))), segment6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))), segment6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -28.58 + (((tickAnim - 0) / 1) * (-28.52295-(-28.58)));
            yy = -18.05 + (((tickAnim - 0) / 1) * (-21.52946-(-18.05)));
            zz = -9.96 + (((tickAnim - 0) / 1) * (-11.35956-(-9.96)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -28.52295 + (((tickAnim - 1) / 2) * (-27.4764-(-28.52295)));
            yy = -21.52946 + (((tickAnim - 1) / 2) * (-8.51738-(-21.52946)));
            zz = -11.35956 + (((tickAnim - 1) / 2) * (-35.79321-(-11.35956)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -27.4764 + (((tickAnim - 3) / 3) * (-27.26579-(-27.4764)));
            yy = -8.51738 + (((tickAnim - 3) / 3) * (8.33887-(-8.51738)));
            zz = -35.79321 + (((tickAnim - 3) / 3) * (-14.85571-(-35.79321)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -27.26579 + (((tickAnim - 6) / 2) * (-28.69665-(-27.26579)));
            yy = 8.33887 + (((tickAnim - 6) / 2) * (-11.10114-(8.33887)));
            zz = -14.85571 + (((tickAnim - 6) / 2) * (-7.16105-(-14.85571)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -28.69665 + (((tickAnim - 8) / 3) * (-28.52295-(-28.69665)));
            yy = -11.10114 + (((tickAnim - 8) / 3) * (-21.52946-(-11.10114)));
            zz = -7.16105 + (((tickAnim - 8) / 3) * (-11.35956-(-7.16105)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -28.52295 + (((tickAnim - 11) / 2) * (-27.4764-(-28.52295)));
            yy = -21.52946 + (((tickAnim - 11) / 2) * (-8.51738-(-21.52946)));
            zz = -11.35956 + (((tickAnim - 11) / 2) * (-35.79321-(-11.35956)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -27.4764 + (((tickAnim - 13) / 3) * (-27.26579-(-27.4764)));
            yy = -8.51738 + (((tickAnim - 13) / 3) * (8.33887-(-8.51738)));
            zz = -35.79321 + (((tickAnim - 13) / 3) * (-14.85571-(-35.79321)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -27.26579 + (((tickAnim - 16) / 2) * (-28.69665-(-27.26579)));
            yy = 8.33887 + (((tickAnim - 16) / 2) * (-11.10114-(8.33887)));
            zz = -14.85571 + (((tickAnim - 16) / 2) * (-7.16105-(-14.85571)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -28.69665 + (((tickAnim - 18) / 2) * (-28.58-(-28.69665)));
            yy = -11.10114 + (((tickAnim - 18) / 2) * (-18.05-(-11.10114)));
            zz = -7.16105 + (((tickAnim - 18) / 2) * (-9.96-(-7.16105)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 5.83 + (((tickAnim - 0) / 1) * (0-(5.83)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -12.5 + (((tickAnim - 3) / 3) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (17.5-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 17.5 + (((tickAnim - 8) / 3) * (0-(17.5)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -12.5 + (((tickAnim - 13) / 3) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (17.5-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 17.5 + (((tickAnim - 18) / 2) * (5.83-(17.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legsegL5, legsegL5.rotateAngleX + (float) Math.toRadians(xx), legsegL5.rotateAngleY + (float) Math.toRadians(yy), legsegL5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -27.26579 + (((tickAnim - 0) / 3) * (-28.69665-(-27.26579)));
            yy = -8.33887 + (((tickAnim - 0) / 3) * (11.10114-(-8.33887)));
            zz = 14.85571 + (((tickAnim - 0) / 3) * (7.16105-(14.85571)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -28.69665 + (((tickAnim - 3) / 2) * (-28.52295-(-28.69665)));
            yy = 11.10114 + (((tickAnim - 3) / 2) * (21.52946-(11.10114)));
            zz = 7.16105 + (((tickAnim - 3) / 2) * (11.35956-(7.16105)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -28.52295 + (((tickAnim - 5) / 3) * (-27.4764-(-28.52295)));
            yy = 21.52946 + (((tickAnim - 5) / 3) * (8.51738-(21.52946)));
            zz = 11.35956 + (((tickAnim - 5) / 3) * (35.79321-(11.35956)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -27.4764 + (((tickAnim - 8) / 2) * (-27.26579-(-27.4764)));
            yy = 8.51738 + (((tickAnim - 8) / 2) * (-8.33887-(8.51738)));
            zz = 35.79321 + (((tickAnim - 8) / 2) * (14.85571-(35.79321)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -27.26579 + (((tickAnim - 10) / 3) * (-28.69665-(-27.26579)));
            yy = -8.33887 + (((tickAnim - 10) / 3) * (11.10114-(-8.33887)));
            zz = 14.85571 + (((tickAnim - 10) / 3) * (7.16105-(14.85571)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -28.69665 + (((tickAnim - 13) / 2) * (-28.52295-(-28.69665)));
            yy = 11.10114 + (((tickAnim - 13) / 2) * (21.52946-(11.10114)));
            zz = 7.16105 + (((tickAnim - 13) / 2) * (11.35956-(7.16105)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -28.52295 + (((tickAnim - 15) / 3) * (-27.4764-(-28.52295)));
            yy = 21.52946 + (((tickAnim - 15) / 3) * (8.51738-(21.52946)));
            zz = 11.35956 + (((tickAnim - 15) / 3) * (35.79321-(11.35956)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -27.4764 + (((tickAnim - 18) / 2) * (-27.26579-(-27.4764)));
            yy = 8.51738 + (((tickAnim - 18) / 2) * (-8.33887-(8.51738)));
            zz = 35.79321 + (((tickAnim - 18) / 2) * (14.85571-(35.79321)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -17.5 + (((tickAnim - 3) / 2) * (0-(-17.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (12.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 12.5 + (((tickAnim - 8) / 2) * (0-(12.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -17.5 + (((tickAnim - 13) / 2) * (0-(-17.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (12.5-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 12.5 + (((tickAnim - 18) / 2) * (0-(12.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legsegR5, legsegR5.rotateAngleX + (float) Math.toRadians(xx), legsegR5.rotateAngleY + (float) Math.toRadians(yy), legsegR5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(0), legL1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*2.5), legL1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+115))*5));


        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(0), legR1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*2.5), legR1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+115))*5));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -9.86 + (((tickAnim - 0) / 1) * (-11.31485-(-9.86)));
            yy = -2.44 + (((tickAnim - 0) / 1) * (-7.26951-(-2.44)));
            zz = -12.17 + (((tickAnim - 0) / 1) * (-12.52599-(-12.17)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -11.31485 + (((tickAnim - 1) / 2) * (-9.22272-(-11.31485)));
            yy = -7.26951 + (((tickAnim - 1) / 2) * (-0.96641-(-7.26951)));
            zz = -12.52599 + (((tickAnim - 1) / 2) * (-24.6919-(-12.52599)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -9.22272 + (((tickAnim - 3) / 3) * (-2.56943-(-9.22272)));
            yy = -0.96641 + (((tickAnim - 3) / 3) * (21.72709-(-0.96641)));
            zz = -24.6919 + (((tickAnim - 3) / 3) * (-10.38824-(-24.6919)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -2.56943 + (((tickAnim - 6) / 5) * (-11.31485-(-2.56943)));
            yy = 21.72709 + (((tickAnim - 6) / 5) * (-7.26951-(21.72709)));
            zz = -10.38824 + (((tickAnim - 6) / 5) * (-12.52599-(-10.38824)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -11.31485 + (((tickAnim - 11) / 2) * (-9.22272-(-11.31485)));
            yy = -7.26951 + (((tickAnim - 11) / 2) * (-0.96641-(-7.26951)));
            zz = -12.52599 + (((tickAnim - 11) / 2) * (-24.6919-(-12.52599)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9.22272 + (((tickAnim - 13) / 3) * (-2.56943-(-9.22272)));
            yy = -0.96641 + (((tickAnim - 13) / 3) * (21.72709-(-0.96641)));
            zz = -24.6919 + (((tickAnim - 13) / 3) * (-10.38824-(-24.6919)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -2.56943 + (((tickAnim - 16) / 4) * (-9.86-(-2.56943)));
            yy = 21.72709 + (((tickAnim - 16) / 4) * (-2.44-(21.72709)));
            zz = -10.38824 + (((tickAnim - 16) / 4) * (-12.17-(-10.38824)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.56943 + (((tickAnim - 0) / 5) * (-11.31485-(-2.56943)));
            yy = -21.72709 + (((tickAnim - 0) / 5) * (7.26951-(-21.72709)));
            zz = 10.38824 + (((tickAnim - 0) / 5) * (12.52599-(10.38824)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -11.31485 + (((tickAnim - 5) / 3) * (-9.22272-(-11.31485)));
            yy = 7.26951 + (((tickAnim - 5) / 3) * (0.96641-(7.26951)));
            zz = 12.52599 + (((tickAnim - 5) / 3) * (24.6919-(12.52599)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.22272 + (((tickAnim - 8) / 2) * (-2.56943-(-9.22272)));
            yy = 0.96641 + (((tickAnim - 8) / 2) * (-21.72709-(0.96641)));
            zz = 24.6919 + (((tickAnim - 8) / 2) * (10.38824-(24.6919)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.56943 + (((tickAnim - 10) / 5) * (-11.31485-(-2.56943)));
            yy = -21.72709 + (((tickAnim - 10) / 5) * (7.26951-(-21.72709)));
            zz = 10.38824 + (((tickAnim - 10) / 5) * (12.52599-(10.38824)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -11.31485 + (((tickAnim - 15) / 3) * (-9.22272-(-11.31485)));
            yy = 7.26951 + (((tickAnim - 15) / 3) * (0.96641-(7.26951)));
            zz = 12.52599 + (((tickAnim - 15) / 3) * (24.6919-(12.52599)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.22272 + (((tickAnim - 18) / 2) * (-2.56943-(-9.22272)));
            yy = 0.96641 + (((tickAnim - 18) / 2) * (-21.72709-(0.96641)));
            zz = 24.6919 + (((tickAnim - 18) / 2) * (10.38824-(24.6919)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.88 + (((tickAnim - 0) / 2) * (-2.8833-(-4.88)));
            yy = -10.17 + (((tickAnim - 0) / 2) * (-1.27913-(-10.17)));
            zz = -12.58 + (((tickAnim - 0) / 2) * (-23.0746-(-12.58)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -2.8833 + (((tickAnim - 2) / 2) * (0.30938-(-2.8833)));
            yy = -1.27913 + (((tickAnim - 2) / 2) * (14.65647-(-1.27913)));
            zz = -23.0746 + (((tickAnim - 2) / 2) * (-8.89589-(-23.0746)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0.30938 + (((tickAnim - 4) / 5) * (-5.873-(0.30938)));
            yy = 14.65647 + (((tickAnim - 4) / 5) * (-14.61515-(14.65647)));
            zz = -8.89589 + (((tickAnim - 4) / 5) * (-7.33313-(-8.89589)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -5.873 + (((tickAnim - 9) / 3) * (-2.8833-(-5.873)));
            yy = -14.61515 + (((tickAnim - 9) / 3) * (-1.27913-(-14.61515)));
            zz = -7.33313 + (((tickAnim - 9) / 3) * (-23.0746-(-7.33313)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -2.8833 + (((tickAnim - 12) / 2) * (0.30938-(-2.8833)));
            yy = -1.27913 + (((tickAnim - 12) / 2) * (14.65647-(-1.27913)));
            zz = -23.0746 + (((tickAnim - 12) / 2) * (-8.89589-(-23.0746)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0.30938 + (((tickAnim - 14) / 5) * (-5.873-(0.30938)));
            yy = 14.65647 + (((tickAnim - 14) / 5) * (-14.61515-(14.65647)));
            zz = -8.89589 + (((tickAnim - 14) / 5) * (-7.33313-(-8.89589)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -5.873 + (((tickAnim - 19) / 1) * (-4.88-(-5.873)));
            yy = -14.61515 + (((tickAnim - 19) / 1) * (-10.17-(-14.61515)));
            zz = -7.33313 + (((tickAnim - 19) / 1) * (-12.58-(-7.33313)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.75 + (((tickAnim - 0) / 3) * (-5.873-(-1.75)));
            yy = -4.9 + (((tickAnim - 0) / 3) * (14.61515-(-4.9)));
            zz = 8.37 + (((tickAnim - 0) / 3) * (7.33313-(8.37)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.873 + (((tickAnim - 3) / 3) * (-2.8833-(-5.873)));
            yy = 14.61515 + (((tickAnim - 3) / 3) * (1.27913-(14.61515)));
            zz = 7.33313 + (((tickAnim - 3) / 3) * (23.0746-(7.33313)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -2.8833 + (((tickAnim - 6) / 2) * (0.30938-(-2.8833)));
            yy = 1.27913 + (((tickAnim - 6) / 2) * (-14.65647-(1.27913)));
            zz = 23.0746 + (((tickAnim - 6) / 2) * (8.89589-(23.0746)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.30938 + (((tickAnim - 8) / 5) * (-5.873-(0.30938)));
            yy = -14.65647 + (((tickAnim - 8) / 5) * (14.61515-(-14.65647)));
            zz = 8.89589 + (((tickAnim - 8) / 5) * (7.33313-(8.89589)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -5.873 + (((tickAnim - 13) / 3) * (-2.8833-(-5.873)));
            yy = 14.61515 + (((tickAnim - 13) / 3) * (1.27913-(14.61515)));
            zz = 7.33313 + (((tickAnim - 13) / 3) * (23.0746-(7.33313)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -2.8833 + (((tickAnim - 16) / 2) * (0.30938-(-2.8833)));
            yy = 1.27913 + (((tickAnim - 16) / 2) * (-14.65647-(1.27913)));
            zz = 23.0746 + (((tickAnim - 16) / 2) * (8.89589-(23.0746)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.30938 + (((tickAnim - 18) / 2) * (-1.75-(0.30938)));
            yy = -14.65647 + (((tickAnim - 18) / 2) * (-4.9-(-14.65647)));
            zz = 8.89589 + (((tickAnim - 18) / 2) * (8.37-(8.89589)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.5 + (((tickAnim - 0) / 3) * (-11.69626-(-8.5)));
            yy = -14.59 + (((tickAnim - 0) / 3) * (-29.2269-(-14.59)));
            zz = -5.58 + (((tickAnim - 0) / 3) * (-3.2704-(-5.58)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -11.69626 + (((tickAnim - 3) / 2) * (-8.61274-(-11.69626)));
            yy = -29.2269 + (((tickAnim - 3) / 2) * (-15.4556-(-29.2269)));
            zz = -3.2704 + (((tickAnim - 3) / 2) * (-15.5082-(-3.2704)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.61274 + (((tickAnim - 5) / 3) * (-5.30812-(-8.61274)));
            yy = -15.4556 + (((tickAnim - 5) / 3) * (0.0438-(-15.4556)));
            zz = -15.5082 + (((tickAnim - 5) / 3) * (-7.8883-(-15.5082)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5.30812 + (((tickAnim - 8) / 5) * (-11.69626-(-5.30812)));
            yy = 0.0438 + (((tickAnim - 8) / 5) * (-29.2269-(0.0438)));
            zz = -7.8883 + (((tickAnim - 8) / 5) * (-3.2704-(-7.8883)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -11.69626 + (((tickAnim - 13) / 2) * (-8.61274-(-11.69626)));
            yy = -29.2269 + (((tickAnim - 13) / 2) * (-15.4556-(-29.2269)));
            zz = -3.2704 + (((tickAnim - 13) / 2) * (-15.5082-(-3.2704)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -8.61274 + (((tickAnim - 15) / 3) * (-5.30812-(-8.61274)));
            yy = -15.4556 + (((tickAnim - 15) / 3) * (0.0438-(-15.4556)));
            zz = -15.5082 + (((tickAnim - 15) / 3) * (-7.8883-(-15.5082)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.30812 + (((tickAnim - 18) / 2) * (-8.5-(-5.30812)));
            yy = 0.0438 + (((tickAnim - 18) / 2) * (-14.59-(0.0438)));
            zz = -7.8883 + (((tickAnim - 18) / 2) * (-5.58-(-7.8883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.51 + (((tickAnim - 0) / 2) * (-5.30812-(-7.51)));
            yy = 10.29 + (((tickAnim - 0) / 2) * (-0.0438-(10.29)));
            zz = 12.97 + (((tickAnim - 0) / 2) * (7.8883-(12.97)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -5.30812 + (((tickAnim - 2) / 5) * (-11.69626-(-5.30812)));
            yy = -0.0438 + (((tickAnim - 2) / 5) * (29.2269-(-0.0438)));
            zz = 7.8883 + (((tickAnim - 2) / 5) * (3.2704-(7.8883)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -11.69626 + (((tickAnim - 7) / 2) * (-8.61274-(-11.69626)));
            yy = 29.2269 + (((tickAnim - 7) / 2) * (15.4556-(29.2269)));
            zz = 3.2704 + (((tickAnim - 7) / 2) * (15.5082-(3.2704)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -8.61274 + (((tickAnim - 9) / 3) * (-5.30812-(-8.61274)));
            yy = 15.4556 + (((tickAnim - 9) / 3) * (-0.0438-(15.4556)));
            zz = 15.5082 + (((tickAnim - 9) / 3) * (7.8883-(15.5082)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -5.30812 + (((tickAnim - 12) / 5) * (-11.69626-(-5.30812)));
            yy = -0.0438 + (((tickAnim - 12) / 5) * (29.2269-(-0.0438)));
            zz = 7.8883 + (((tickAnim - 12) / 5) * (3.2704-(7.8883)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -11.69626 + (((tickAnim - 17) / 2) * (-8.61274-(-11.69626)));
            yy = 29.2269 + (((tickAnim - 17) / 2) * (15.4556-(29.2269)));
            zz = 3.2704 + (((tickAnim - 17) / 2) * (15.5082-(3.2704)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -8.61274 + (((tickAnim - 19) / 1) * (-7.51-(-8.61274)));
            yy = 15.4556 + (((tickAnim - 19) / 1) * (10.29-(15.4556)));
            zz = 15.5082 + (((tickAnim - 19) / 1) * (12.97-(15.5082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStoermeropterus e = (EntityPrehistoricFloraStoermeropterus) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
