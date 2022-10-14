package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBlourugia extends AdvancedModelBase {
    private final AdvancedModelRenderer Blourugia;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    public ModelBlourugia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Blourugia = new AdvancedModelRenderer(this);
        this.Blourugia.setRotationPoint(0.0F, 16.7F, -0.4F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Blourugia.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 40, 42, -2.5F, -5.0F, -3.0F, 5, 9, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.9F, -3.0F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3142F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 0, -1.0F, -0.0625F, 0.1847F, 2, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 5.0F, -2.0F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3403F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 52, -1.0F, -2.6F, -1.3F, 2, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.1F, -7.8F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.5184F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 26, -2.0F, -0.03F, -1.9898F, 3, 2, 2, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -4.8F, -3.2F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7941F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 15, -2.0F, -0.4049F, 0.0796F, 3, 7, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.4F, -6.1F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5149F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 40, -2.0F, -1.1841F, -1.1459F, 4, 2, 2, 0.03F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 6, -2.0F, -0.6841F, -0.6459F, 4, 1, 1, 0.04F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.Cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 32, -2.0F, -4.0F, 0.0F, 4, 4, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -3.3F);
        this.Cephalon.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 15, 53, -2.0F, 0.0F, -2.7F, 4, 1, 3, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.1F, 0.2F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 55, -1.0F, -0.2F, -2.5F, 2, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 45, -1.5F, 0.0F, -1.8F, 3, 1, 2, -0.001F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, -2.3F);
        this.Blourugia.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 42, 0, -2.0F, -6.2F, 0.0F, 4, 11, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -6.2F, 0.0F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 43, 37, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 52, -1.0F, -1.0387F, -0.0244F, 2, 1, 3, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.0F, 3.0F, 0.8F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, -0.7854F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 21, 0, 0.0F, -1.0F, 0.0F, 0, 5, 9, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.0F, 3.0F, 0.8F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.7854F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 21, 0, 0.0F, -1.0F, 0.0F, 0, 5, 9, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 14, 16, -1.5F, -6.5F, -1.4F, 3, 12, 7, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 35, 9, 0.0F, -15.5F, -0.4F, 0, 10, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 5.6F, -0.8F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2793F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 20, 0.0F, -0.6F, -0.2F, 0, 8, 6, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -1.0F, 5.5F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 7, 36, -1.0F, -3.0F, -0.2F, 2, 6, 6, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 23, 0.0F, -14.8F, 0.1F, 0, 12, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.4F, -0.2F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 29, 0.0F, -0.2513F, 0.0836F, 0, 8, 7, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 42, -0.5F, -3.0F, 0.0F, 1, 3, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -5.2F, 0.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3665F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 49, -0.5F, 0.0415F, -0.0224F, 1, 2, 6, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0524F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 0, -0.5F, -3.0F, -0.5F, 1, 5, 3, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5061F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 0, -0.5F, -1.9F, 0.1F, 1, 2, 2, -0.001F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -1.0F, 2.8F);
        this.Body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, 0.0F, -5.0F, -1.0F, 0, 12, 10, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -2.2F, 2.0F);
        this.body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 0, -1.0F, -0.1F, -0.3F, 1, 1, 7, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -1.5F, 0.0F);
        this.body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 0, -1.0F, -0.5F, -0.8F, 1, 3, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Blourugia.render(f5 * 0.15F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Blourugia.rotateAngleY = (float) Math.toRadians(90);
        this.Blourugia.offsetX = -0.08F;
        this.Blourugia.offsetY = -0.16F;
        this.Blourugia.offsetZ = 0.07F;
        this.Blourugia.render(0.01F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Blourugia.offsetY = 1.25F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.25F, 5, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), (float)Math.toRadians(15), true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);




            this.swing(Blourugia, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Blourugia.rotateAngleZ = (float) Math.toRadians(90);
                this.Blourugia.offsetY = 1.3F;
                this.bob(Blourugia, -speed, 5F, false, f2, 1);
            }
        }
    }
}
