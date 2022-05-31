package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelPalaeoJelly2 extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer tentacleA;
    private final AdvancedModelRenderer tentacleB;
    private final AdvancedModelRenderer tentacleC;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacleA5;
    private final AdvancedModelRenderer tentacleB5;
    private final AdvancedModelRenderer tentacleC5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacleA6;
    private final AdvancedModelRenderer tentacleB6;
    private final AdvancedModelRenderer tentacleC6;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacleA4;
    private final AdvancedModelRenderer tentacleB4;
    private final AdvancedModelRenderer tentacleC4;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacleA2;
    private final AdvancedModelRenderer tentacleB2;
    private final AdvancedModelRenderer tentacleC2;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacleA8;
    private final AdvancedModelRenderer tentacleB8;
    private final AdvancedModelRenderer tentacleC8;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacleA9;
    private final AdvancedModelRenderer tentacleB9;
    private final AdvancedModelRenderer tentacleC9;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacleA7;
    private final AdvancedModelRenderer tentacleB7;
    private final AdvancedModelRenderer tentacleC7;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacleA3;
    private final AdvancedModelRenderer tentacleB3;
    private final AdvancedModelRenderer tentacleC3;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacleA11;
    private final AdvancedModelRenderer tentacleB11;
    private final AdvancedModelRenderer tentacleC11;
    private final AdvancedModelRenderer tentacle12;
    private final AdvancedModelRenderer tentacleA12;
    private final AdvancedModelRenderer tentacleB12;
    private final AdvancedModelRenderer tentacleC12;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacleA10;
    private final AdvancedModelRenderer tentacleB10;
    private final AdvancedModelRenderer tentacleC10;

    public ModelPalaeoJelly2() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -20.0F, -3.0F, 6, 6, 6, 0.0F, false));

        this.tentacle1 = new AdvancedModelRenderer(this);
        this.tentacle1.setRotationPoint(2.5F, -14.0F, -2.5F);
        this.body.addChild(tentacle1);
        this.setRotateAngle(tentacle1, 0.0F, -0.7854F, 0.0F);
        this.tentacle1.cubeList.add(new ModelBox(tentacle1, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.tentacleA = new AdvancedModelRenderer(this);
        this.tentacleA.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle1.addChild(tentacleA);
        this.tentacleA.cubeList.add(new ModelBox(tentacleA, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleB = new AdvancedModelRenderer(this);
        this.tentacleB.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA.addChild(tentacleB);
        this.tentacleB.cubeList.add(new ModelBox(tentacleB, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleC = new AdvancedModelRenderer(this);
        this.tentacleC.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB.addChild(tentacleC);
        this.tentacleC.cubeList.add(new ModelBox(tentacleC, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(2.5F, -14.0F, 2.5F);
        this.body.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.0F, 0.7854F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.tentacleA5 = new AdvancedModelRenderer(this);
        this.tentacleA5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle5.addChild(tentacleA5);
        this.tentacleA5.cubeList.add(new ModelBox(tentacleA5, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleB5 = new AdvancedModelRenderer(this);
        this.tentacleB5.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA5.addChild(tentacleB5);
        this.tentacleB5.cubeList.add(new ModelBox(tentacleB5, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleC5 = new AdvancedModelRenderer(this);
        this.tentacleC5.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB5.addChild(tentacleC5);
        this.tentacleC5.cubeList.add(new ModelBox(tentacleC5, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(-2.5F, -14.0F, 2.5F);
        this.body.addChild(tentacle6);
        this.setRotateAngle(tentacle6, 0.0F, -0.7854F, 0.0F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.tentacleA6 = new AdvancedModelRenderer(this);
        this.tentacleA6.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle6.addChild(tentacleA6);
        this.tentacleA6.cubeList.add(new ModelBox(tentacleA6, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleB6 = new AdvancedModelRenderer(this);
        this.tentacleB6.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA6.addChild(tentacleB6);
        this.tentacleB6.cubeList.add(new ModelBox(tentacleB6, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleC6 = new AdvancedModelRenderer(this);
        this.tentacleC6.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB6.addChild(tentacleC6);
        this.tentacleC6.cubeList.add(new ModelBox(tentacleC6, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-2.5F, -14.0F, -2.5F);
        this.body.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.0F, 0.7854F, 0.0F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.tentacleA4 = new AdvancedModelRenderer(this);
        this.tentacleA4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle4.addChild(tentacleA4);
        this.tentacleA4.cubeList.add(new ModelBox(tentacleA4, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleB4 = new AdvancedModelRenderer(this);
        this.tentacleB4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA4.addChild(tentacleB4);
        this.tentacleB4.cubeList.add(new ModelBox(tentacleB4, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleC4 = new AdvancedModelRenderer(this);
        this.tentacleC4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB4.addChild(tentacleC4);
        this.tentacleC4.cubeList.add(new ModelBox(tentacleC4, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(2.5F, -14.1F, -1.5F);
        this.body.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.0F, -0.7854F, 0.0F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.tentacleA2 = new AdvancedModelRenderer(this);
        this.tentacleA2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle2.addChild(tentacleA2);
        this.tentacleA2.cubeList.add(new ModelBox(tentacleA2, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleB2 = new AdvancedModelRenderer(this);
        this.tentacleB2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA2.addChild(tentacleB2);
        this.tentacleB2.cubeList.add(new ModelBox(tentacleB2, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleC2 = new AdvancedModelRenderer(this);
        this.tentacleC2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB2.addChild(tentacleC2);
        this.tentacleC2.cubeList.add(new ModelBox(tentacleC2, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(2.5F, -14.1F, 1.5F);
        this.body.addChild(tentacle8);
        this.setRotateAngle(tentacle8, 0.0F, 0.7854F, 0.0F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.tentacleA8 = new AdvancedModelRenderer(this);
        this.tentacleA8.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle8.addChild(tentacleA8);
        this.tentacleA8.cubeList.add(new ModelBox(tentacleA8, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleB8 = new AdvancedModelRenderer(this);
        this.tentacleB8.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA8.addChild(tentacleB8);
        this.tentacleB8.cubeList.add(new ModelBox(tentacleB8, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleC8 = new AdvancedModelRenderer(this);
        this.tentacleC8.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB8.addChild(tentacleC8);
        this.tentacleC8.cubeList.add(new ModelBox(tentacleC8, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(-2.5F, -14.1F, 1.5F);
        this.body.addChild(tentacle9);
        this.setRotateAngle(tentacle9, 0.0F, -0.7854F, 0.0F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.tentacleA9 = new AdvancedModelRenderer(this);
        this.tentacleA9.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle9.addChild(tentacleA9);
        this.tentacleA9.cubeList.add(new ModelBox(tentacleA9, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleB9 = new AdvancedModelRenderer(this);
        this.tentacleB9.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA9.addChild(tentacleB9);
        this.tentacleB9.cubeList.add(new ModelBox(tentacleB9, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleC9 = new AdvancedModelRenderer(this);
        this.tentacleC9.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB9.addChild(tentacleC9);
        this.tentacleC9.cubeList.add(new ModelBox(tentacleC9, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(-2.5F, -14.1F, -1.5F);
        this.body.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.0F, 0.7854F, 0.0F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.tentacleA7 = new AdvancedModelRenderer(this);
        this.tentacleA7.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle7.addChild(tentacleA7);
        this.tentacleA7.cubeList.add(new ModelBox(tentacleA7, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleB7 = new AdvancedModelRenderer(this);
        this.tentacleB7.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA7.addChild(tentacleB7);
        this.tentacleB7.cubeList.add(new ModelBox(tentacleB7, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleC7 = new AdvancedModelRenderer(this);
        this.tentacleC7.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB7.addChild(tentacleC7);
        this.tentacleC7.cubeList.add(new ModelBox(tentacleC7, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(1.5F, -14.1F, -2.5F);
        this.body.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, -0.7854F, 0.0F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.tentacleA3 = new AdvancedModelRenderer(this);
        this.tentacleA3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle3.addChild(tentacleA3);
        this.tentacleA3.cubeList.add(new ModelBox(tentacleA3, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleB3 = new AdvancedModelRenderer(this);
        this.tentacleB3.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA3.addChild(tentacleB3);
        this.tentacleB3.cubeList.add(new ModelBox(tentacleB3, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleC3 = new AdvancedModelRenderer(this);
        this.tentacleC3.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB3.addChild(tentacleC3);
        this.tentacleC3.cubeList.add(new ModelBox(tentacleC3, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(1.5F, -14.1F, 2.5F);
        this.body.addChild(tentacle11);
        this.setRotateAngle(tentacle11, 0.0F, 0.7854F, 0.0F);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.tentacleA11 = new AdvancedModelRenderer(this);
        this.tentacleA11.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle11.addChild(tentacleA11);
        this.tentacleA11.cubeList.add(new ModelBox(tentacleA11, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleB11 = new AdvancedModelRenderer(this);
        this.tentacleB11.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA11.addChild(tentacleB11);
        this.tentacleB11.cubeList.add(new ModelBox(tentacleB11, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacleC11 = new AdvancedModelRenderer(this);
        this.tentacleC11.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB11.addChild(tentacleC11);
        this.tentacleC11.cubeList.add(new ModelBox(tentacleC11, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, false));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(-1.5F, -14.1F, 2.5F);
        this.body.addChild(tentacle12);
        this.setRotateAngle(tentacle12, 0.0F, -0.7854F, 0.0F);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.tentacleA12 = new AdvancedModelRenderer(this);
        this.tentacleA12.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle12.addChild(tentacleA12);
        this.tentacleA12.cubeList.add(new ModelBox(tentacleA12, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleB12 = new AdvancedModelRenderer(this);
        this.tentacleB12.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA12.addChild(tentacleB12);
        this.tentacleB12.cubeList.add(new ModelBox(tentacleB12, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleC12 = new AdvancedModelRenderer(this);
        this.tentacleC12.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB12.addChild(tentacleC12);
        this.tentacleC12.cubeList.add(new ModelBox(tentacleC12, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(-1.5F, -14.1F, -2.5F);
        this.body.addChild(tentacle10);
        this.setRotateAngle(tentacle10, 0.0F, 0.7854F, 0.0F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 0, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.tentacleA10 = new AdvancedModelRenderer(this);
        this.tentacleA10.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.tentacle10.addChild(tentacleA10);
        this.tentacleA10.cubeList.add(new ModelBox(tentacleA10, 2, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleB10 = new AdvancedModelRenderer(this);
        this.tentacleB10.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleA10.addChild(tentacleB10);
        this.tentacleB10.cubeList.add(new ModelBox(tentacleB10, 0, 12, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        this.tentacleC10 = new AdvancedModelRenderer(this);
        this.tentacleC10.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.tentacleB10.addChild(tentacleC10);
        this.tentacleC10.cubeList.add(new ModelBox(tentacleC10, 4, 0, -0.5F, 0.0F, 0.0F, 1, 4, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.93F);

        this.body.render(f5 * 0.5F);
        GlStateManager.disableBlend();

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
        this.body.setScaleX(1.0F);
        this.body.setScaleZ(1.0F);
        this.body.scaleChildren = false;
        this.body.offsetY = 1.05F;

        AdvancedModelRenderer[] tentacle1 = {this.tentacleA, this.tentacleB, this.tentacleC};
        AdvancedModelRenderer[] tentacle2 = {this.tentacleA2, this.tentacleB2, this.tentacleC2};
        AdvancedModelRenderer[] tentacle3 = {this.tentacleA3, this.tentacleB3, this.tentacleC3};
        AdvancedModelRenderer[] tentacle4 = {this.tentacleA4, this.tentacleB4, this.tentacleC4};
        AdvancedModelRenderer[] tentacle5 = {this.tentacleA5, this.tentacleB5, this.tentacleC5};
        AdvancedModelRenderer[] tentacle6 = {this.tentacleA6, this.tentacleB6, this.tentacleC6};
        AdvancedModelRenderer[] tentacle7 = {this.tentacleA7, this.tentacleB7, this.tentacleC7};
        AdvancedModelRenderer[] tentacle8 = {this.tentacleA8, this.tentacleB8, this.tentacleC8};
        AdvancedModelRenderer[] tentacle9 = {this.tentacleA9, this.tentacleB9, this.tentacleC9};
        AdvancedModelRenderer[] tentacle10 = {this.tentacleA10, this.tentacleB10, this.tentacleC10};
        AdvancedModelRenderer[] tentacle11 = {this.tentacleA11, this.tentacleB11, this.tentacleC11};
        AdvancedModelRenderer[] tentacle12 = {this.tentacleA12, this.tentacleB12, this.tentacleC12};

        float speed = 0.125F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(body, speed * 0.4F, 0.5F, true, 0, 0, f2, 1);
            this.walk(body, speed * 0.3F, 0.8F, true, 0, 0, f2, 1);
            this.flap(body, speed * 0.2F, 0.8F, true, 0, 0, f2, 1);
            this.chainWave(tentacle1, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle2, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle3, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle4, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle5, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle6, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle7, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle8, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle9, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle10, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle11, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle12, speed, -0.4F, -3, f2, 1);

            this.bob(body, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.76F;
                this.body.offsetX = -0.5F;
                this.body.offsetZ = -0.06F;
                this.body.scaleChildren = true;
                this.body.setScaleX(0.2F);
                this.body.setScaleZ(1.2F);
            }
        }
    }
}
