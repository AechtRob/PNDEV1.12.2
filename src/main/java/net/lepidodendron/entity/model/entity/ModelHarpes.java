package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHarpes;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelHarpes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leg;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer cube_r14;

    public ModelHarpes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 18, -1.5F, -1.0F, 3.0F, 3, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 14, -2.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 9, -2.5F, -1.0F, -4.0F, 5, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -5.5F, -0.15F, -8.475F, 11, 0, 9, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 14, 9, -2.0F, -1.775F, -2.85F, 4, 1, 3, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 16, 20, -1.0F, -1.5F, 0.075F, 2, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 21, -0.5F, -1.275F, 2.05F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0F, 0.075F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0785F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 18, -1.0F, 0.325F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, -2.125F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3316F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 14, -1.0F, -1.025F, -1.925F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.75F, -0.15F, 1.525F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1134F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 3, -0.85F, 0.025F, -1.35F, 1, 0, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.75F, -0.15F, 1.525F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1134F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, -0.15F, 0.025F, -1.35F, 1, 0, 3, 0.0F, false));

        this.leg = new AdvancedModelRenderer(this);
        this.leg.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.main.addChild(leg);
        this.setRotateAngle(leg, 0.0F, 0.0F, 0.1309F);
        this.leg.cubeList.add(new ModelBox(leg, 7, 18, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.main.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, 0.0F, -0.1309F);
        this.leg5.cubeList.add(new ModelBox(leg5, 0, 8, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(0.5F, 0.0F, 1.75F);
        this.main.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.0F, 0.1309F);
        this.leg2.cubeList.add(new ModelBox(leg2, 17, 13, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-0.5F, 0.0F, 1.75F);
        this.main.addChild(leg6);
        this.setRotateAngle(leg6, 0.0F, 0.0F, -0.1309F);
        this.leg6.cubeList.add(new ModelBox(leg6, 4, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(0.5F, 0.0F, 3.0F);
        this.main.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, 0.0F, 0.1309F);
        this.leg3.cubeList.add(new ModelBox(leg3, 10, 16, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(-0.5F, 0.0F, 3.0F);
        this.main.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, 0.0F, -0.1309F);
        this.leg7.cubeList.add(new ModelBox(leg7, 4, 4, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(0.5F, 0.0F, 4.25F);
        this.main.addChild(leg4);
        this.setRotateAngle(leg4, 0.0F, 0.0F, 0.1309F);
        this.leg4.cubeList.add(new ModelBox(leg4, 4, 8, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(-0.5F, 0.0F, 4.25F);
        this.main.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.0F, -0.1309F);
        this.leg8.cubeList.add(new ModelBox(leg8, 4, 3, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(3.0F, -0.65F, -1.15F);
        this.main.addChild(bone);
        this.setRotateAngle(bone, -0.0552F, 0.2048F, 0.3568F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1788F, 0.7468F, -0.2705F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 15, -0.2F, -1.375F, -1.075F, 0, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.4394F, -1.005F, 7.1138F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1825F, -0.7683F, -0.5203F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 2, -0.0657F, -1.2163F, 0.0847F, 0, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.2575F, -1.3602F, 4.4241F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1423F, -0.4021F, -0.4487F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 3, 0.2399F, -0.8042F, -0.1642F, 0, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.92F, -0.6997F, 1.4672F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.131F, -0.0433F, -0.3984F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 11, 0.0638F, -1.2746F, 0.0428F, 0, 2, 3, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-3.0F, -0.65F, -1.15F);
        this.main.addChild(bone2);
        this.setRotateAngle(bone2, -0.0552F, -0.2048F, -0.3568F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1788F, -0.7468F, 0.2705F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 15, 0.2F, -1.375F, -1.075F, 0, 2, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.4394F, -1.005F, 7.1138F);
        this.bone2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1825F, 0.7683F, 0.5203F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 2, 0.0657F, -1.2163F, 0.0847F, 0, 2, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2575F, -1.3602F, 4.4241F);
        this.bone2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1423F, 0.4021F, 0.4487F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 3, -0.2399F, -0.8042F, -0.1642F, 0, 2, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.92F, -0.6997F, 1.4672F);
        this.bone2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.131F, 0.0433F, 0.3984F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 11, -0.0638F, -1.2746F, 0.0428F, 0, 2, 3, 0.0F, true));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(antennaright);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.25F, -0.075F, -4.0F);
        this.antennaright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3054F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -2.25F, 0.0F, -2.5F, 3, 0, 3, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(antennaleft);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.25F, -0.075F, -4.0F);
        this.antennaleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.3054F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.75F, 0.0F, -2.5F, 3, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5 * 0.3F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.main.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {

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
        this.main.offsetY = 1.05F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leg, this.leg2, this.leg3, this.leg4};
        AdvancedModelRenderer[] legsR = {this.leg5, this.leg6, this.leg7, this.leg8};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraHarpes) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leg, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(leg5, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(leg6, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(leg7, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(leg8, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            }
            this.bob(main, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leg, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(leg5, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leg2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(leg6, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leg3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(leg7, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leg4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(leg8, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.bob(main, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(antennaleft, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaright, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
