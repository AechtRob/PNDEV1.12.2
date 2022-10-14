package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHeterosteus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelHeterosteus extends AdvancedModelBase {
    private final AdvancedModelRenderer bodybase;
    private final AdvancedModelRenderer bodylower;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;

    private ModelAnimator animator;


    public ModelHeterosteus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bodybase = new AdvancedModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, 19.0F, -23.25F);


        this.bodylower = new AdvancedModelRenderer(this);
        this.bodylower.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.bodybase.addChild(bodylower);
        this.bodylower.cubeList.add(new ModelBox(bodylower, 0, 3, 0.0F, -8.0F, -9.5F, 0, 6, 5, 0.0F, false));
        this.bodylower.cubeList.add(new ModelBox(bodylower, 46, 28, -8.0F, -2.24F, -9.0F, 16, 6, 10, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(-8.0F, 2.75F, -1.0F);
        this.bodylower.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, -0.6109F, -0.3054F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 73, 47, -10.0F, 0.0F, -7.0F, 10, 0, 7, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(8.0F, 2.75F, -1.0F);
        this.bodylower.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.6109F, 0.3054F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 17, 14, 0.0F, 0.0F, -7.0F, 10, 0, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -9.5F);
        this.bodylower.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 44, 44, -6.0F, -2.235F, -10.5F, 12, 6, 12, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 2, 0.0F, -8.0F, -12.0F, 0, 6, 12, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.25F, -10.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 36, 62, -4.0F, -1.73F, -13.0F, 8, 5, 14, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 37, 42, 0.0F, 3.0F, -8.5F, 0, 4, 8, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.25F, -13.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 66, 67, -2.0F, -1.225F, -13.0F, 4, 4, 14, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.body4.addChild(tailfin);
        this.setRotateAngle(tailfin, -0.6109F, 0.0F, 0.0F);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 0, 0, 0.0F, -1.225F, -20.0F, 0, 12, 22, 0.0F, false));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.0F, -0.75F);
        this.bodybase.addChild(bodyfront);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, 10.0F);
        this.bodyfront.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 46, 0, -10.0F, -1.0F, 0.0F, 20, 6, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 66, -9.0F, -1.6F, 0.05F, 18, 1, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 66, 62, -10.0F, 3.0F, 7.0F, 20, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 34, -9.0F, -1.25F, -10.0F, 18, 6, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-5.0F, 2.1F, 19.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 74, 0.0F, 1.0F, -10.0F, 10, 1, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(4.75F, 2.1F, 19.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 1.0908F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 26, 2.0F, 0.89F, -4.8F, 8, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.1F, 19.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.9599F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 20, -4.99F, -0.925F, 0.05F, 10, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.0F, 2.1F, 19.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 76, 13, 1.0F, 0.95F, -9.35F, 8, 1, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.75F, 2.1F, 19.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, -1.0908F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 85, -10.0F, 0.19F, -2.1F, 10, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.75F, 2.1F, 19.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, -1.0908F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 92, 58, -10.0F, 0.89F, -4.8F, 8, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.75F, 2.1F, 19.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, -1.0908F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 93, 0, -10.0F, 0.49F, -3.0F, 9, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(4.75F, 2.1F, 19.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4363F, 1.0908F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 76, 23, 0.0F, 0.19F, -2.1F, 10, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.75F, 2.1F, 19.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 1.0908F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 74, 1.0F, 0.49F, -3.0F, 9, 1, 1, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(7.5F, -1.2F, 9.0F);
        this.head.addChild(bone3);
        this.setRotateAngle(bone3, -0.0436F, 0.0F, 0.0873F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.65F, 3.0F, 0.0F);
        this.bone3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1396F, -0.6981F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 85, 0.1243F, 0.372F, -3.5034F, 2, 1, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.65F, 0.0F, 3.0F);
        this.bone3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, -0.6981F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 81, -2.571F, 4.0647F, -5.1561F, 2, 1, 12, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.0F, 0.0F, 3.0F);
        this.bone3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.4363F, 0.0436F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 88, 67, 0.6162F, 0.3433F, -11.1601F, 4, 5, 8, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-7.5F, -1.2F, 9.0F);
        this.head.addChild(bone2);
        this.setRotateAngle(bone2, -0.0436F, 0.0F, -0.0873F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.65F, 3.0F, 0.0F);
        this.bone2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1396F, 0.6981F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 89, 86, -2.1243F, 0.372F, -3.5034F, 2, 1, 9, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.0F, 0.0F, 3.0F);
        this.bone2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, -0.4363F, -0.0436F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 85, -4.6162F, 0.3433F, -11.1601F, 4, 5, 8, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.65F, 0.0F, 3.0F);
        this.bone2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.6981F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 60, 85, 0.571F, 4.0647F, -5.1561F, 2, 1, 12, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, -1.5F, 7.0F);
        this.head.addChild(upperjaw);


        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.75F, 5.0F);
        this.upperjaw.addChild(bone);
        this.setRotateAngle(bone, -0.1309F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 50, -6.0F, 0.0F, -5.0F, 12, 3, 13, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 16, 88, -5.0F, 0.0F, -6.0F, 10, 3, 1, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(3.0F, 0.0F, 4.6F);
        this.bone.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.1745F, 0.1745F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 0, 50, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(-3.0F, 0.0F, 4.6F);
        this.bone.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.1745F, -0.1745F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 44, 28, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(-6.25F, 0.325F, 6.75F);
        this.bone.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, 0.5236F, -0.1745F);
        this.bone4.cubeList.add(new ModelBox(bone4, 84, 30, 0.0F, 0.1F, -13.75F, 2, 3, 14, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 80, 96, 2.0F, 0.1F, -11.0F, 2, 3, 8, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 66, 67, 4.0F, 0.1F, -11.0F, 2, 3, 5, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 100, 2.0F, 0.1F, -12.0F, 3, 3, 1, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(6.25F, 0.325F, 6.75F);
        this.bone.addChild(bone5);
        this.setRotateAngle(bone5, 0.0F, -0.5236F, 0.1745F);
        this.bone5.cubeList.add(new ModelBox(bone5, 26, 81, -2.0F, 0.1F, -13.75F, 2, 3, 14, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 0, 100, -5.0F, 0.1F, -12.0F, 3, 3, 1, 0.0F, true));
        this.bone5.cubeList.add(new ModelBox(bone5, 92, 47, -4.0F, 0.1F, -11.0F, 2, 3, 8, 0.0F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 0, 0, -6.0F, 0.1F, -11.0F, 2, 3, 5, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(-10.0F, 3.0F, 11.0F);
        this.head.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, -0.48F, -0.3054F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 30, 14, -16.0F, 0.0F, -14.0F, 16, 0, 14, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(10.0F, 3.0F, 11.0F);
        this.head.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.48F, 0.3054F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 0, 0.0F, 0.0F, -14.0F, 16, 0, 14, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bodybase.render(f5 * 1.25F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.upperjaw.rotateAngleX = (float) Math.toRadians(26);
        this.head.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.bodybase.offsetZ = 2.5F;
        this.bodybase.offsetY = -0.3F;
        this.bodybase.rotateAngleY = (float) Math.toRadians(180);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.tailfin};
        EntityPrehistoricFloraHeterosteus heterosteus = (EntityPrehistoricFloraHeterosteus) e;
        float speed = 0.3F;
        float taildegree = 0.25F;
        float inwater = 1F;

        if (!e.isInWater()) {
            speed = 0.7F;
            inwater = 0.65F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifier = 1F;
        float swingModifier = 1F;
        if (isAtBottom && !heterosteus.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
            bottomModifier = 0.5F;
            swingModifier = 0.5F;
            this.bodylower.rotateAngleX = (float) Math.toRadians(-10);
            this.bodybase.rotateAngleX = (float) Math.toRadians(10);
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * bottomModifier, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed * bottomModifier, taildegree * bottomModifier, -3, f2, 1);
            this.swing(bodybase, speed * bottomModifier, 0.3F * bottomModifier * swingModifier, true, 0, 0, f2, 1 * swingModifier);

            this.flap(pectoralfinL, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.2F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(pectoralfinL, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(pectoralfinR, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.2F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(pectoralfinR, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            this.flap(pelvicfinL, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.15F * inwater, true, -0.1F, 0.1F, f2, 1 * inwater);
            this.swing(pelvicfinL, (float) (speed * 0.65 * (bottomModifier * 2.5F)), 0.1F * inwater, true, 0, 0, f2, 1 * inwater);
            this.flap(pelvicfinR, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.15F * inwater, true, 0.1F, -0.1F, f2, 1 * inwater);
            this.swing(pelvicfinR, (float) (speed * 0.65 * (bottomModifier * 2.5F)), -0.1F * inwater, true, 0, 0, f2, 1 * inwater);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.bodybase.offsetY = -0.38F;
                this.bob(bodybase, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.upperjaw, (float) Math.toRadians(f4 / (180F / (float) Math.PI)),0,0);
        animator.rotate(this.upperjaw, (float) Math.toRadians(15), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(1);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.rotate(this.bodylower, (float) Math.toRadians(-10),0,0);
        //animator.rotate(this.bodybase, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.bodyfront, 0, (float) Math.toRadians(5),0);
        animator.rotate(this.upperjaw, (float) Math.toRadians(f4 / (180F / (float) Math.PI)),0,0);
        animator.rotate(this.upperjaw, (float) Math.toRadians(15), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(3);
        //animator.rotate(this.bodylower, (float) Math.toRadians(-10),0,0);
        //animator.rotate(this.bodybase, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.bodyfront, 0, (float) Math.toRadians(5),0);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(10);
        //animator.rotate(this.bodylower, (float) Math.toRadians(-10),0,0);
        //animator.rotate(this.bodybase, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.bodyfront, 0, (float) Math.toRadians(-5),0);
        animator.rotate(this.upperjaw, (float) Math.toRadians(f4 / (180F / (float) Math.PI)),0,0);
        animator.rotate(this.upperjaw, (float) Math.toRadians(15), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(3);
        //animator.rotate(this.bodylower, (float) Math.toRadians(-10),0,0);
        //animator.rotate(this.bodybase, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.bodyfront, 0, (float) Math.toRadians(-5),0);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

    }
}
