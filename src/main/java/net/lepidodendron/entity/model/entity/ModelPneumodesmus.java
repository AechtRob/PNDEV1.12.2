package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPneumodesmus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer antennaL_r1;
    private final AdvancedModelRenderer antennaR_r1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer legR_r1;
    private final AdvancedModelRenderer legL_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legR_r2;
    private final AdvancedModelRenderer legL_r2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legR_r3;
    private final AdvancedModelRenderer legL_r3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legR_r4;
    private final AdvancedModelRenderer legL_r4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legR_r5;
    private final AdvancedModelRenderer legL_r5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legR_r6;
    private final AdvancedModelRenderer legL_r6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer legR_r7;
    private final AdvancedModelRenderer legL_r7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer legR_r8;
    private final AdvancedModelRenderer legL_r8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer legR_r9;
    private final AdvancedModelRenderer legL_r9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer legL_r10;
    private final AdvancedModelRenderer legR_r10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer legR_r11;
    private final AdvancedModelRenderer legL_r11;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer legL_r12;
    private final AdvancedModelRenderer legR_r12;
    private final AdvancedModelRenderer bodyend;

    public ModelPneumodesmus() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);


        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(0.0F, -1.5F, -7.0F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.5236F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 0, 12, -0.99F, -0.501F, -1.75F, 2, 1, 2, 0.0F, false));

        this.antennaL_r1 = new AdvancedModelRenderer(this);
        this.antennaL_r1.setRotationPoint(0.5F, -1.5F, -8.0F);
        this.head.addChild(antennaL_r1);
        this.setRotateAngle(antennaL_r1, 0.0F, -0.3491F, 0.0F);
        this.antennaL_r1.cubeList.add(new ModelBox(antennaL_r1, 0, 7, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.antennaR_r1 = new AdvancedModelRenderer(this);
        this.antennaR_r1.setRotationPoint(-0.5F, -1.5F, -8.0F);
        this.head.addChild(antennaR_r1);
        this.setRotateAngle(antennaR_r1, 0.0F, 0.3491F, 0.0F);
        this.antennaR_r1.cubeList.add(new ModelBox(antennaR_r1, 4, 7, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.5F, -7.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 6, 6, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r1 = new AdvancedModelRenderer(this);
        this.legR_r1.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body1.addChild(legR_r1);
        this.setRotateAngle(legR_r1, 0.0F, 0.0F, 1.0472F);
        this.legR_r1.cubeList.add(new ModelBox(legR_r1, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r1 = new AdvancedModelRenderer(this);
        this.legL_r1.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body1.addChild(legL_r1);
        this.setRotateAngle(legL_r1, 0.0F, 0.0F, -1.0472F);
        this.legL_r1.cubeList.add(new ModelBox(legL_r1, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 6, 6, -1.0F, -0.501F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r2 = new AdvancedModelRenderer(this);
        this.legR_r2.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body2.addChild(legR_r2);
        this.setRotateAngle(legR_r2, 0.0F, 0.0F, 1.0472F);
        this.legR_r2.cubeList.add(new ModelBox(legR_r2, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r2 = new AdvancedModelRenderer(this);
        this.legL_r2.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body2.addChild(legL_r2);
        this.setRotateAngle(legL_r2, 0.0F, 0.0F, -1.0472F);
        this.legL_r2.cubeList.add(new ModelBox(legL_r2, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 6, 6, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r3 = new AdvancedModelRenderer(this);
        this.legR_r3.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body3.addChild(legR_r3);
        this.setRotateAngle(legR_r3, 0.0F, 0.0F, 1.0472F);
        this.legR_r3.cubeList.add(new ModelBox(legR_r3, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r3 = new AdvancedModelRenderer(this);
        this.legL_r3.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body3.addChild(legL_r3);
        this.setRotateAngle(legL_r3, 0.0F, 0.0F, -1.0472F);
        this.legL_r3.cubeList.add(new ModelBox(legL_r3, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 6, 6, -1.0F, -0.501F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r4 = new AdvancedModelRenderer(this);
        this.legR_r4.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body4.addChild(legR_r4);
        this.setRotateAngle(legR_r4, 0.0F, 0.0F, 1.0472F);
        this.legR_r4.cubeList.add(new ModelBox(legR_r4, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r4 = new AdvancedModelRenderer(this);
        this.legL_r4.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body4.addChild(legL_r4);
        this.setRotateAngle(legL_r4, 0.0F, 0.0F, -1.0472F);
        this.legL_r4.cubeList.add(new ModelBox(legL_r4, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 6, 6, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r5 = new AdvancedModelRenderer(this);
        this.legR_r5.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body5.addChild(legR_r5);
        this.setRotateAngle(legR_r5, 0.0F, 0.0F, 1.0472F);
        this.legR_r5.cubeList.add(new ModelBox(legR_r5, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r5 = new AdvancedModelRenderer(this);
        this.legL_r5.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body5.addChild(legL_r5);
        this.setRotateAngle(legL_r5, 0.0F, 0.0F, -1.0472F);
        this.legL_r5.cubeList.add(new ModelBox(legL_r5, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 6, 6, -1.0F, -0.501F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r6 = new AdvancedModelRenderer(this);
        this.legR_r6.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body6.addChild(legR_r6);
        this.setRotateAngle(legR_r6, 0.0F, 0.0F, 1.0472F);
        this.legR_r6.cubeList.add(new ModelBox(legR_r6, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r6 = new AdvancedModelRenderer(this);
        this.legL_r6.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body6.addChild(legL_r6);
        this.setRotateAngle(legL_r6, 0.0F, 0.0F, -1.0472F);
        this.legL_r6.cubeList.add(new ModelBox(legL_r6, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 6, 6, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r7 = new AdvancedModelRenderer(this);
        this.legR_r7.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body7.addChild(legR_r7);
        this.setRotateAngle(legR_r7, 0.0F, 0.0F, 1.0472F);
        this.legR_r7.cubeList.add(new ModelBox(legR_r7, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r7 = new AdvancedModelRenderer(this);
        this.legL_r7.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body7.addChild(legL_r7);
        this.setRotateAngle(legL_r7, 0.0F, 0.0F, -1.0472F);
        this.legL_r7.cubeList.add(new ModelBox(legL_r7, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 6, 6, -1.0F, -0.501F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r8 = new AdvancedModelRenderer(this);
        this.legR_r8.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body8.addChild(legR_r8);
        this.setRotateAngle(legR_r8, 0.0F, 0.0F, 1.0472F);
        this.legR_r8.cubeList.add(new ModelBox(legR_r8, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r8 = new AdvancedModelRenderer(this);
        this.legL_r8.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body8.addChild(legL_r8);
        this.setRotateAngle(legL_r8, 0.0F, 0.0F, -1.0472F);
        this.legL_r8.cubeList.add(new ModelBox(legL_r8, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 6, 6, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r9 = new AdvancedModelRenderer(this);
        this.legR_r9.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body9.addChild(legR_r9);
        this.setRotateAngle(legR_r9, 0.0F, 0.0F, 1.0472F);
        this.legR_r9.cubeList.add(new ModelBox(legR_r9, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r9 = new AdvancedModelRenderer(this);
        this.legL_r9.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body9.addChild(legL_r9);
        this.setRotateAngle(legL_r9, 0.0F, 0.0F, -1.0472F);
        this.legL_r9.cubeList.add(new ModelBox(legL_r9, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 0, 4, -1.0F, -0.501F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legL_r10 = new AdvancedModelRenderer(this);
        this.legL_r10.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body10.addChild(legL_r10);
        this.setRotateAngle(legL_r10, 0.0F, 0.0F, -1.0472F);
        this.legL_r10.cubeList.add(new ModelBox(legL_r10, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legR_r10 = new AdvancedModelRenderer(this);
        this.legR_r10.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body10.addChild(legR_r10);
        this.setRotateAngle(legR_r10, 0.0F, 0.0F, 1.0472F);
        this.legR_r10.cubeList.add(new ModelBox(legR_r10, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 6, 6, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legR_r11 = new AdvancedModelRenderer(this);
        this.legR_r11.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body11.addChild(legR_r11);
        this.setRotateAngle(legR_r11, 0.0F, 0.0F, 1.0472F);
        this.legR_r11.cubeList.add(new ModelBox(legR_r11, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legL_r11 = new AdvancedModelRenderer(this);
        this.legL_r11.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body11.addChild(legL_r11);
        this.setRotateAngle(legL_r11, 0.0F, 0.0F, -1.0472F);
        this.legL_r11.cubeList.add(new ModelBox(legL_r11, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 0, 4, -1.0F, -0.501F, 0.0F, 2, 1, 2, 0.0F, false));

        this.legL_r12 = new AdvancedModelRenderer(this);
        this.legL_r12.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body12.addChild(legL_r12);
        this.setRotateAngle(legL_r12, 0.0F, 0.0F, -1.0472F);
        this.legL_r12.cubeList.add(new ModelBox(legL_r12, 0, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.legR_r12 = new AdvancedModelRenderer(this);
        this.legR_r12.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body12.addChild(legR_r12);
        this.setRotateAngle(legR_r12, 0.0F, 0.0F, 1.0472F);
        this.legR_r12.cubeList.add(new ModelBox(legR_r12, 0, 2, -0.5F, 0.866F, -0.5F, 0, 2, 1, 0.0F, false));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body12.addChild(bodyend);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 7, 9, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
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
        //super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 0.0F;

        AdvancedModelRenderer[] legsL = {this.legL_r1, this.legL_r2, this.legL_r3, this.legL_r4, this.legL_r5, this.legL_r6, this.legL_r7, this.legL_r8, this.legL_r9, this.legL_r10, this.legL_r11, this.legL_r12};
        AdvancedModelRenderer[] legsR = {this.legR_r1, this.legR_r2, this.legR_r3, this.legR_r4, this.legR_r5, this.legR_r6, this.legR_r7, this.legR_r8, this.legR_r9, this.legR_r10, this.legR_r11, this.legR_r12};
        AdvancedModelRenderer[] BodyF = {this.body5, this.body4, this.body3, this.body2, this.body};
        AdvancedModelRenderer[] BodyB = {this.body6, this.body7, this.body8, this.body9, this.body10};
        AdvancedModelRenderer[] BodyFull = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10};

        AdvancedModelRenderer[] Body1 = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body2 = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body3 = {this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body4 = {this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body5 = {this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body6 = {this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body7 = {this.body7, this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body8 = {this.body8, this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body9 = {this.body9, this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body10 = {this.body10, this.body11, this.body12};
        AdvancedModelRenderer[] Body11 = {this.body11, this.body12};
        AdvancedModelRenderer[] Body12 = {this.body12};

        AdvancedModelRenderer[] BodyHead = {this.body1, this.body};

        EntityPrehistoricFloraMyriapod Pneumodesmus = (EntityPrehistoricFloraMyriapod) e;
        if (f3 == 0.0F || !Pneumodesmus.getIsMoving()) { //Not moving
            this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            return;
        }

        AdvancedModelRenderer[] bodySegments = new AdvancedModelRenderer[]{
                body1, body2, body3, body4, body5, body6, body7, body8, body9, body10, body11, body12, bodyend };
        Pneumodesmus.myriapodBuffer.applyChainSwingBuffer(false, bodySegments);

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            if (((EntityPrehistoricFloraMyriapod) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                //this.chainSwing(BodyHead, 0.2F, 0.3F, -3, f2, 1);
                //this.walk(head, 0.2F, 0.3F, false,0.3F, 0.5F, f2, 1);

                this.chainSwing(Body1, 0.3F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body2, 0.3F, 0.015F, -3, f2, 0.5F);
                this.chainSwing(Body3, 0.3F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body4, 0.3F, 0.015F, -3, f2, 0.5F);
                this.chainSwing(Body5, 0.2F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body6, 0.2F, 0.015F, -3, f2, 0.5F);
                this.chainSwing(Body7, 0.15F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body8, 0.15F, 0.016F, -3, f2, 0.5F);
                this.chainSwing(Body9, 0.15F, -0.016F, -3, f2, 0.5F);
                this.chainSwing(Body10, 0.10F, -0.016F, -3, f2, 0.5F);
                this.chainSwing(Body11, 0.10F, -0.016F, -3, f2, 0.5F);
                this.chainSwing(Body12, 0.10F, -0.016F, -3, f2, 0.5F);

                this.flap(legL_r1, 0.7F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(legR_r1, 0.7F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(legL_r2, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r2, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r3, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r3, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r4, 0.7F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r4, 0.7F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r5, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r5, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r6, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r6, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r7, 0.7F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r7, 0.7F, 0.5F, false, 0.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r8, 0.7F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r8, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r9, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r9, 0.7F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r10, 0.7F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r10, 0.7F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r11, 0.7F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r11, 0.7F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legL_r12, 0.7F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(legR_r12, 0.7F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            }
        }
    }
}
