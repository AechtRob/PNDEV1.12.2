package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelLunataspis extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer bodylower;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bookgill1;
    private final AdvancedModelRenderer bookgill2;
    private final AdvancedModelRenderer bookgill3;
    private final AdvancedModelRenderer bookgill4;
    private final AdvancedModelRenderer bookgill5;
    private final AdvancedModelRenderer bookgill6;
    private final AdvancedModelRenderer leg10;
    private final AdvancedModelRenderer leg9;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer leg1;

    public ModelLunataspis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.8F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -3.5F, -3.0F, -1.0F, 7, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -3.0F, -5.0F, 7, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, -3.5F, -2.0F, -5.0F, 7, 2, 4, 0.0F, false));

        this.bodylower = new AdvancedModelRenderer(this);
        this.bodylower.setRotationPoint(0.0F, -2.3F, -1.1F);
        this.body.addChild(bodylower);
        this.setRotateAngle(bodylower, -0.2182F, 0.0F, 0.0F);
        this.bodylower.cubeList.add(new ModelBox(bodylower, 0, 17, -2.5F, -0.5F, 0.0F, 5, 1, 3, 0.0F, false));
        this.bodylower.cubeList.add(new ModelBox(bodylower, 10, 28, -2.5F, 0.5F, 0.0F, 5, 1, 3, 0.0F, false));
        this.bodylower.cubeList.add(new ModelBox(bodylower, 19, 1, -2.0F, -0.5F, 3.0F, 4, 1, 1, 0.0F, false));
        this.bodylower.cubeList.add(new ModelBox(bodylower, 0, 30, -2.0F, 0.5F, 3.0F, 4, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.bodylower.addChild(tail);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 11, -0.5F, -0.7F, -0.01F, 1, 1, 6, 0.0F, false));

        this.bookgill1 = new AdvancedModelRenderer(this);
        this.bookgill1.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.bodylower.addChild(bookgill1);
        this.setRotateAngle(bookgill1, 1.309F, 0.0F, 0.0F);
        this.bookgill1.cubeList.add(new ModelBox(bookgill1, 0, 24, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill2 = new AdvancedModelRenderer(this);
        this.bookgill2.setRotationPoint(0.0F, 0.5F, 0.8F);
        this.bodylower.addChild(bookgill2);
        this.setRotateAngle(bookgill2, 1.309F, 0.0F, 0.0F);
        this.bookgill2.cubeList.add(new ModelBox(bookgill2, 0, 24, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill3 = new AdvancedModelRenderer(this);
        this.bookgill3.setRotationPoint(0.0F, 0.5F, 1.2F);
        this.bodylower.addChild(bookgill3);
        this.setRotateAngle(bookgill3, 1.309F, 0.0F, 0.0F);
        this.bookgill3.cubeList.add(new ModelBox(bookgill3, 0, 24, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill4 = new AdvancedModelRenderer(this);
        this.bookgill4.setRotationPoint(0.0F, 0.5F, 1.6F);
        this.bodylower.addChild(bookgill4);
        this.setRotateAngle(bookgill4, 1.309F, 0.0F, 0.0F);
        this.bookgill4.cubeList.add(new ModelBox(bookgill4, 0, 24, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill5 = new AdvancedModelRenderer(this);
        this.bookgill5.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.bodylower.addChild(bookgill5);
        this.setRotateAngle(bookgill5, 1.309F, 0.0F, 0.0F);
        this.bookgill5.cubeList.add(new ModelBox(bookgill5, 0, 24, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.bookgill6 = new AdvancedModelRenderer(this);
        this.bookgill6.setRotationPoint(0.0F, 0.5F, 2.4F);
        this.bodylower.addChild(bookgill6);
        this.setRotateAngle(bookgill6, 1.309F, 0.0F, 0.0F);
        this.bookgill6.cubeList.add(new ModelBox(bookgill6, 0, 24, -2.0F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.leg10 = new AdvancedModelRenderer(this);
        this.leg10.setRotationPoint(-0.25F, -2.0F, -1.25F);
        this.body.addChild(leg10);
        this.setRotateAngle(leg10, 0.0F, 0.2618F, -0.0873F);
        this.leg10.cubeList.add(new ModelBox(leg10, 18, 5, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leg9 = new AdvancedModelRenderer(this);
        this.leg9.setRotationPoint(-0.25F, -2.0F, -1.75F);
        this.body.addChild(leg9);
        this.setRotateAngle(leg9, 0.0F, 0.1745F, -0.0873F);
        this.leg9.cubeList.add(new ModelBox(leg9, 18, 7, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(-0.25F, -2.0F, -2.1F);
        this.body.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.0F, -0.0873F);
        this.leg8.cubeList.add(new ModelBox(leg8, 13, 18, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(-0.25F, -2.0F, -2.4F);
        this.body.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, -0.1745F, -0.0873F);
        this.leg7.cubeList.add(new ModelBox(leg7, 19, 18, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-0.25F, -2.0F, -2.85F);
        this.body.addChild(leg6);
        this.setRotateAngle(leg6, 0.0F, -0.3054F, -0.0873F);
        this.leg6.cubeList.add(new ModelBox(leg6, 16, 20, -3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(0.25F, -2.0F, -1.25F);
        this.body.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, -0.2618F, 0.0873F);
        this.leg5.cubeList.add(new ModelBox(leg5, 0, 22, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(0.25F, -2.0F, -1.75F);
        this.body.addChild(leg4);
        this.setRotateAngle(leg4, 0.0F, -0.1745F, 0.0873F);
        this.leg4.cubeList.add(new ModelBox(leg4, 22, 4, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(0.25F, -2.0F, -2.1F);
        this.body.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, 0.0F, 0.0873F);
        this.leg3.cubeList.add(new ModelBox(leg3, 6, 22, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(0.25F, -2.0F, -2.4F);
        this.body.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.1745F, 0.0873F);
        this.leg2.cubeList.add(new ModelBox(leg2, 22, 10, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(0.25F, -2.0F, -2.85F);
        this.body.addChild(leg1);
        this.setRotateAngle(leg1, 0.0F, 0.3054F, 0.0873F);
        this.leg1.cubeList.add(new ModelBox(leg1, 12, 22, 0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.45F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.render(0.023F);
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
        this.body.offsetY = 0.82F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] Tail = {this.tail};

        if (f3 != 0) {
            //Left
            this.swing(leg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(leg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(leg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(leg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.swing(leg5, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);

            //Right:
            this.swing(leg6, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.swing(leg7, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.swing(leg8, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.swing(leg9, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.swing(leg10, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
        }

        if (isAtBottom) {
            this.chainSwing(Tail, 0.1F, 0.2F, -2, f2, 1.0F);
            this.chainWave(Tail, 0.1F, 0.05f, -2, f2, 0F);
            this.bob(body, 0.0F, 0.0F, false, f2, 1);
        } else {
            this.body.rotateAngleZ = (float) Math.toRadians(180);
            this.body.rotateAngleX = (float) Math.toRadians(20);
            this.chainSwing(Tail, 0.2F, 0.08F, -2, f2, 0.5F);
            this.chainWave(Tail, 0.2F, 0.05f, -2, f2, 0.8F);
            this.bob(body, 0.2F, 0.1F, false, f2, 0.5F);
        }

    }
}
