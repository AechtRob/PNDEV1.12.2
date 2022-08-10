package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraAustrolimulus;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelAustrolimulus extends AdvancedModelBase {
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer legs;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer leg9;
    private final AdvancedModelRenderer leg10;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer bookgills;
    private final AdvancedModelRenderer bookgill1;
    private final AdvancedModelRenderer bookgill2;
    private final AdvancedModelRenderer bookgill3;
    private final AdvancedModelRenderer bookgill4;
    private final AdvancedModelRenderer bookgill5;
    private final AdvancedModelRenderer bookgill6;

    public ModelAustrolimulus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(-1.5F, 23.0F, -8.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 6, -0.5F, -0.22F, 0.0F, 4, 0, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.carapace.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, -10.35F, 0.24F, -0.3F, 10, 0, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.carapace.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 1.2654F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 0, -3.95F, -0.26F, -2.35F, 1, 0, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, 0.2F, 0.0F);
        this.carapace.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.0908F, -0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 17, -2.6F, -1.32F, -1.075F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, -0.5F, 0.0F);
        this.carapace.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, -1.2654F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 3, 2.95F, -0.26F, -2.35F, 1, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, -0.5F, 0.0F);
        this.carapace.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, -0.5672F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 0, 0.35F, 0.24F, -0.3F, 10, 0, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.9F, 0.2F, 0.0F);
        this.carapace.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.0908F, 0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 18, 1.6F, -1.32F, -1.075F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.carapace.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.48F, -0.0873F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 14, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.9F, 0.0F, 0.0F);
        this.carapace.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.48F, 0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 12, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.carapace.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 1, -1.5F, -1.02F, 0.01F, 3, 1, 1, 0.0F, false));

        this.legs = new AdvancedModelRenderer(this);
        this.legs.setRotationPoint(1.5F, 1.2F, 4.5F);
        this.carapace.addChild(legs);


        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(0.25F, -2.0F, -2.85F);
        this.legs.addChild(leg1);
        this.setRotateAngle(leg1, 0.0F, 0.3054F, 0.2967F);
        this.leg1.cubeList.add(new ModelBox(leg1, 17, 14, 0.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(0.25F, -2.0F, -2.4F);
        this.legs.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.1745F, 0.2967F);
        this.leg2.cubeList.add(new ModelBox(leg2, 12, 17, 0.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(0.25F, -2.0F, -2.1F);
        this.legs.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, 0.0F, 0.2967F);
        this.leg3.cubeList.add(new ModelBox(leg3, 17, 8, 0.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(0.25F, -2.0F, -1.75F);
        this.legs.addChild(leg4);
        this.setRotateAngle(leg4, 0.0F, -0.1745F, 0.2967F);
        this.leg4.cubeList.add(new ModelBox(leg4, 6, 17, 0.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(0.25F, -2.0F, -1.25F);
        this.legs.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, -0.2618F, 0.2967F);
        this.leg5.cubeList.add(new ModelBox(leg5, 0, 17, 0.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-0.25F, -2.0F, -2.85F);
        this.legs.addChild(leg6);
        this.setRotateAngle(leg6, 0.0F, -0.3054F, -0.2967F);
        this.leg6.cubeList.add(new ModelBox(leg6, 12, 16, -3.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(-0.25F, -2.0F, -2.4F);
        this.legs.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, -0.1745F, -0.2967F);
        this.leg7.cubeList.add(new ModelBox(leg7, 6, 16, -3.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(-0.25F, -2.0F, -2.1F);
        this.legs.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.0F, -0.2967F);
        this.leg8.cubeList.add(new ModelBox(leg8, 16, 4, -3.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.leg9 = new AdvancedModelRenderer(this);
        this.leg9.setRotationPoint(-0.25F, -2.0F, -1.75F);
        this.legs.addChild(leg9);
        this.setRotateAngle(leg9, 0.0F, 0.1745F, -0.2967F);
        this.leg9.cubeList.add(new ModelBox(leg9, 16, 3, -3.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.leg10 = new AdvancedModelRenderer(this);
        this.leg10.setRotationPoint(-0.25F, -2.0F, -1.25F);
        this.legs.addChild(leg10);
        this.setRotateAngle(leg10, 0.0F, 0.2618F, -0.2967F);
        this.leg10.cubeList.add(new ModelBox(leg10, 0, 16, -3.0F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(1.5F, -1.25F, 0.5F);
        this.carapace.addChild(bone);
        this.setRotateAngle(bone, -0.2618F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, 1.0F, -0.5F);
        this.bone.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, -0.3054F, 0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 12, 0.25F, -0.685F, 2.4F, 2, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, 1.0F, -0.5F);
        this.bone.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.3054F, -0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 8, -2.25F, -0.685F, 2.4F, 2, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4538F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 3, -0.5F, 0.025F, 0.9F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, 1.0F, -0.5F);
        this.bone.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.6981F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -3.5F, -0.76F, 0.2F, 3, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3665F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 12, -1.49F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, 1.0F, -0.5F);
        this.bone.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, -0.6981F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 3, 0.5F, -0.76F, 0.2F, 3, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(1.5F, -1.35F, 3.15F);
        this.carapace.addChild(body1);
        this.setRotateAngle(body1, -0.2443F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 18, -0.5F, 0.0F, 2.25F, 1, 1, 1, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 7, -1.0F, 0.0F, 0.25F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 1.0F, -0.5F);
        this.body1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3927F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 14, -1.0F, -0.24F, 1.0F, 2, 0, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 4, 7, -1.0F, -0.24F, 2.0F, 1, 0, 2, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 7, -2.0F, -0.24F, 0.0F, 3, 0, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.5F, 1.0F, -0.5F);
        this.body1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 5, -1.0F, -0.24F, 1.0F, 2, 0, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 7, 0.0F, -0.24F, 2.0F, 1, 0, 2, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 11, 6, -1.0F, -0.24F, 0.0F, 3, 0, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.575F, 3.25F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.192F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -0.49F, -0.4983F, 0.0131F, 1, 1, 10, 0.0F, false));

        this.bookgills = new AdvancedModelRenderer(this);
        this.bookgills.setRotationPoint(0.0F, 1.0F, 0.25F);
        this.body1.addChild(bookgills);


        this.bookgill1 = new AdvancedModelRenderer(this);
        this.bookgill1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bookgills.addChild(bookgill1);
        this.setRotateAngle(bookgill1, 1.309F, 0.0F, 0.0F);
        this.bookgill1.cubeList.add(new ModelBox(bookgill1, 18, 15, -1.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.bookgill2 = new AdvancedModelRenderer(this);
        this.bookgill2.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.bookgills.addChild(bookgill2);
        this.setRotateAngle(bookgill2, 1.309F, 0.0F, 0.0F);
        this.bookgill2.cubeList.add(new ModelBox(bookgill2, 11, 18, -1.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.bookgill3 = new AdvancedModelRenderer(this);
        this.bookgill3.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.bookgills.addChild(bookgill3);
        this.setRotateAngle(bookgill3, 1.309F, 0.0F, 0.0F);
        this.bookgill3.cubeList.add(new ModelBox(bookgill3, 18, 9, -1.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.bookgill4 = new AdvancedModelRenderer(this);
        this.bookgill4.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.bookgills.addChild(bookgill4);
        this.setRotateAngle(bookgill4, 1.309F, 0.0F, 0.0F);
        this.bookgill4.cubeList.add(new ModelBox(bookgill4, 18, 7, -1.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.bookgill5 = new AdvancedModelRenderer(this);
        this.bookgill5.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.bookgills.addChild(bookgill5);
        this.setRotateAngle(bookgill5, 1.309F, 0.0F, 0.0F);
        this.bookgill5.cubeList.add(new ModelBox(bookgill5, 7, 18, -1.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        this.bookgill6 = new AdvancedModelRenderer(this);
        this.bookgill6.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.bookgills.addChild(bookgill6);
        this.setRotateAngle(bookgill6, 1.309F, 0.0F, 0.0F);
        this.bookgill6.cubeList.add(new ModelBox(bookgill6, 18, 6, -1.0F, -0.25F, 0.0F, 2, 1, 0, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.carapace.render(f5 * 0.18F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.carapace.offsetZ = -0.04F;
        this.carapace.render(0.037F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.carapace.offsetY = 1.22F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leg1, this.leg2, this.leg3, this.leg4, this.leg5};
        AdvancedModelRenderer[] legsR = {this.leg6, this.leg7, this.leg8, this.leg9, this.leg10};

        if (isAtBottom || !e.isInWater() || ((EntityPrehistoricFloraAustrolimulus)e).isJumpingPF()) {
            this.chainSwing(legsL, 0.6F, 0.1F, -3, f2, 1);
            this.chainSwing(legsR, 0.6F, 0.1F, -3, f2, 1);
            this.flap(leg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(leg6, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(leg7, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(leg8, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(leg9, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(leg10, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.swing(body2, 0.25F, 0.5F, true, 0, 0, f2, 0.3F);



            this.bob(carapace, 0.0F, 0.0F, false, f2, 1);
        } else if (f3 != 0) {
            this.carapace.rotateAngleZ = (float) Math.toRadians(180);
            this.carapace.rotateAngleX = (float) Math.toRadians(20);

            this.chainSwing(legsL, 0.8F, 0.1F, -3, f2, 1);
            this.chainSwing(legsR, 0.8F, 0.1F, -3, f2, 1);
            this.flap(leg1, 0.8F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(leg6, 0.8F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leg2, 0.8F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(leg7, 0.8F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leg3, 0.8F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(leg8, 0.8F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leg4, 0.8F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(leg9, 0.8F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leg5, 0.8F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(leg10, 0.8F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.walk(body2, 0.4F, 0.5F, true, 0, 0, f2, 0.3F);


            this.bob(carapace, 0.4F, 0.7F, true, f2, 1);
        } else {

            this.carapace.rotateAngleZ = (float) Math.toRadians(180);
            this.carapace.rotateAngleX = (float) Math.toRadians(20);

            this.chainFlap(legsL, 0.8F, 0.2F, -3, f2, 1);
            this.chainFlap(legsR, 0.8F, 0.2F, -3, f2, 1);
            /*this.flap(legL, 0.8F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.8F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.8F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.8F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.8F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.8F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.8F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.8F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.8F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.8F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);*/

            this.walk(body2, 0.4F, 0.5F, true, 0, 0, f2, 0.3F);
            this.bob(carapace, 0.4F, 0.7F, true, f2, 1);
        }

    }
}
