package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGuanoGolem extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer drip;
    private final AdvancedModelRenderer drip2;
    private final AdvancedModelRenderer drip9;
    private final AdvancedModelRenderer drip12;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer field_78193_e_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer drip3;
    private final AdvancedModelRenderer drip4;
    private final AdvancedModelRenderer drip13;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer field_78193_e_r2;
    private final AdvancedModelRenderer bottomBody;
    private final AdvancedModelRenderer drip5;
    private final AdvancedModelRenderer drip6;
    private final AdvancedModelRenderer drip7;
    private final AdvancedModelRenderer drip8;
    private final AdvancedModelRenderer drip10;
    private final AdvancedModelRenderer drip11;

    public ModelGuanoGolem() {
        this.textureWidth = 116;
        this.textureHeight = 92;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 10.5F, -1.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -9.5F, -12.0F, 10, 13, 18, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 2, 2, -5.0F, -10.5F, -11.0F, 10, 1, 16, 0.0F, false));

        this.drip = new AdvancedModelRenderer(this);
        this.drip.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(drip);
        this.drip.cubeList.add(new ModelBox(drip, 28, 24, 5.0F, -9.5F, -4.0F, 1, 2, 1, 0.0F, false));
        this.drip.cubeList.add(new ModelBox(drip, 28, 24, 5.0F, -9.5F, 5.0F, 1, 2, 1, 0.0F, false));
        this.drip.cubeList.add(new ModelBox(drip, 27, 23, 5.0F, -9.5F, -2.0F, 1, 2, 2, 0.0F, false));
        this.drip.cubeList.add(new ModelBox(drip, 28, 24, 5.0F, -9.5F, 3.0F, 1, 2, 1, 0.0F, false));
        this.drip.cubeList.add(new ModelBox(drip, 28, 24, 5.0F, -9.5F, -3.0F, 1, 4, 1, 0.0F, false));
        this.drip.cubeList.add(new ModelBox(drip, 27, 23, 5.0F, -9.5F, 1.0F, 1, 4, 2, 0.0F, false));
        this.drip.cubeList.add(new ModelBox(drip, 41, 38, 5.0F, -9.5F, 0.0F, 1, 3, 1, 0.0F, false));
        this.drip.cubeList.add(new ModelBox(drip, 41, 38, 5.0F, -9.5F, 4.0F, 1, 3, 1, 0.0F, false));

        this.drip2 = new AdvancedModelRenderer(this);
        this.drip2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(drip2);
        this.drip2.cubeList.add(new ModelBox(drip2, 28, 24, -6.0F, -9.5F, -4.0F, 1, 2, 1, 0.0F, true));
        this.drip2.cubeList.add(new ModelBox(drip2, 28, 24, -6.0F, -9.5F, 5.0F, 1, 2, 1, 0.0F, true));
        this.drip2.cubeList.add(new ModelBox(drip2, 27, 23, -6.0F, -9.5F, -2.0F, 1, 2, 2, 0.0F, true));
        this.drip2.cubeList.add(new ModelBox(drip2, 28, 24, -6.0F, -9.5F, 3.0F, 1, 2, 1, 0.0F, true));
        this.drip2.cubeList.add(new ModelBox(drip2, 28, 24, -6.0F, -9.5F, -3.0F, 1, 4, 1, 0.0F, true));
        this.drip2.cubeList.add(new ModelBox(drip2, 27, 23, -6.0F, -9.5F, 1.0F, 1, 4, 2, 0.0F, true));
        this.drip2.cubeList.add(new ModelBox(drip2, 41, 38, -6.0F, -9.5F, 0.0F, 1, 3, 1, 0.0F, true));
        this.drip2.cubeList.add(new ModelBox(drip2, 41, 38, -6.0F, -9.5F, 4.0F, 1, 3, 1, 0.0F, true));

        this.drip9 = new AdvancedModelRenderer(this);
        this.drip9.setRotationPoint(-11.0F, -14.0F, 0.0F);
        this.body.addChild(drip9);
        this.drip9.cubeList.add(new ModelBox(drip9, 28, 24, 6.5F, 4.5F, 6.0F, 1, 3, 1, 0.0F, true));
        this.drip9.cubeList.add(new ModelBox(drip9, 28, 24, 15.5F, 4.5F, 6.0F, 1, 3, 1, 0.0F, true));
        this.drip9.cubeList.add(new ModelBox(drip9, 27, 23, 8.5F, 4.5F, 6.0F, 2, 3, 1, 0.0F, true));
        this.drip9.cubeList.add(new ModelBox(drip9, 28, 24, 13.5F, 4.5F, 6.0F, 1, 2, 1, 0.0F, true));
        this.drip9.cubeList.add(new ModelBox(drip9, 28, 24, 5.5F, 4.5F, 6.0F, 1, 2, 1, 0.0F, true));
        this.drip9.cubeList.add(new ModelBox(drip9, 28, 24, 7.5F, 4.5F, 6.0F, 1, 5, 1, 0.0F, true));
        this.drip9.cubeList.add(new ModelBox(drip9, 27, 23, 11.5F, 4.5F, 6.0F, 2, 5, 1, 0.0F, true));
        this.drip9.cubeList.add(new ModelBox(drip9, 41, 38, 10.5F, 4.5F, 6.0F, 1, 4, 1, 0.0F, true));
        this.drip9.cubeList.add(new ModelBox(drip9, 41, 38, 14.5F, 4.5F, 6.0F, 1, 4, 1, 0.0F, true));

        this.drip12 = new AdvancedModelRenderer(this);
        this.drip12.setRotationPoint(0.0F, 14.0F, -6.0F);
        this.body.addChild(drip12);
        this.drip12.cubeList.add(new ModelBox(drip12, 28, 24, -4.0F, -10.5F, -6.0F, 1, 3, 1, 0.0F, false));
        this.drip12.cubeList.add(new ModelBox(drip12, 27, 23, -2.0F, -10.5F, -6.0F, 2, 3, 1, 0.0F, false));
        this.drip12.cubeList.add(new ModelBox(drip12, 28, 24, 3.0F, -10.5F, -6.0F, 1, 2, 1, 0.0F, false));
        this.drip12.cubeList.add(new ModelBox(drip12, 28, 24, -5.0F, -10.5F, -6.0F, 1, 2, 1, 0.0F, false));
        this.drip12.cubeList.add(new ModelBox(drip12, 28, 24, -3.0F, -10.5F, -6.0F, 1, 5, 1, 0.0F, false));
        this.drip12.cubeList.add(new ModelBox(drip12, 27, 23, 1.0F, -10.5F, -6.0F, 2, 5, 1, 0.0F, false));
        this.drip12.cubeList.add(new ModelBox(drip12, 41, 38, 0.0F, -10.5F, -6.0F, 1, 4, 1, 0.0F, false));
        this.drip12.cubeList.add(new ModelBox(drip12, 41, 38, 4.0F, -10.5F, -6.0F, 1, 4, 1, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-5.5F, 9.1667F, -8.8333F);
        this.root.addChild(rightHand);


        this.field_78193_e_r1 = new AdvancedModelRenderer(this);
        this.field_78193_e_r1.setRotationPoint(10.5F, -2.1667F, 0.8333F);
        this.rightHand.addChild(field_78193_e_r1);
        this.setRotateAngle(field_78193_e_r1, 0.0F, 0.0F, 1.5708F);
        this.field_78193_e_r1.cubeList.add(new ModelBox(field_78193_e_r1, 0, 0, 15.0F, 8.0F, -5.0F, 2, 5, 7, 0.0F, false));
        this.field_78193_e_r1.cubeList.add(new ModelBox(field_78193_e_r1, 67, 7, 10.0F, 9.0F, -3.0F, 5, 3, 5, 0.0F, false));
        this.field_78193_e_r1.cubeList.add(new ModelBox(field_78193_e_r1, 38, 0, 0.0F, 8.0F, -4.0F, 10, 5, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -10.5F);
        this.root.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 50, -5.5F, -5.0F, -5.5F, 11, 10, 11, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 2, 52, -4.5F, -6.0F, -4.5F, 9, 1, 9, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 6, 56, -1.5F, -7.0F, -1.5F, 4, 1, 5, 0.0F, false));

        this.drip3 = new AdvancedModelRenderer(this);
        this.drip3.setRotationPoint(0.0F, 5.5F, -0.5F);
        this.head.addChild(drip3);
        this.drip3.cubeList.add(new ModelBox(drip3, 28, 24, -6.5F, -10.5F, -4.0F, 1, 3, 1, 0.0F, true));
        this.drip3.cubeList.add(new ModelBox(drip3, 28, 24, -6.5F, -10.5F, 5.0F, 1, 3, 1, 0.0F, true));
        this.drip3.cubeList.add(new ModelBox(drip3, 27, 23, -6.5F, -10.5F, -2.0F, 1, 3, 2, 0.0F, true));
        this.drip3.cubeList.add(new ModelBox(drip3, 28, 24, -6.5F, -10.5F, 3.0F, 1, 2, 1, 0.0F, true));
        this.drip3.cubeList.add(new ModelBox(drip3, 28, 24, -6.5F, -10.5F, -5.0F, 1, 2, 1, 0.0F, true));
        this.drip3.cubeList.add(new ModelBox(drip3, 28, 24, -6.5F, -10.5F, -3.0F, 1, 5, 1, 0.0F, true));
        this.drip3.cubeList.add(new ModelBox(drip3, 27, 23, -6.5F, -10.5F, 1.0F, 1, 5, 2, 0.0F, true));
        this.drip3.cubeList.add(new ModelBox(drip3, 41, 38, -6.5F, -10.5F, 0.0F, 1, 4, 1, 0.0F, true));
        this.drip3.cubeList.add(new ModelBox(drip3, 41, 38, -6.5F, -10.5F, 4.0F, 1, 4, 1, 0.0F, true));

        this.drip4 = new AdvancedModelRenderer(this);
        this.drip4.setRotationPoint(0.0F, 5.5F, -0.5F);
        this.head.addChild(drip4);
        this.drip4.cubeList.add(new ModelBox(drip4, 28, 24, 5.5F, -10.5F, -4.0F, 1, 3, 1, 0.0F, false));
        this.drip4.cubeList.add(new ModelBox(drip4, 28, 24, 5.5F, -10.5F, 5.0F, 1, 3, 1, 0.0F, false));
        this.drip4.cubeList.add(new ModelBox(drip4, 27, 23, 5.5F, -10.5F, -2.0F, 1, 3, 2, 0.0F, false));
        this.drip4.cubeList.add(new ModelBox(drip4, 28, 24, 5.5F, -10.5F, 3.0F, 1, 2, 1, 0.0F, false));
        this.drip4.cubeList.add(new ModelBox(drip4, 28, 24, 5.5F, -10.5F, -5.0F, 1, 2, 1, 0.0F, false));
        this.drip4.cubeList.add(new ModelBox(drip4, 28, 24, 5.5F, -10.5F, -3.0F, 1, 5, 1, 0.0F, false));
        this.drip4.cubeList.add(new ModelBox(drip4, 27, 23, 5.5F, -10.5F, 1.0F, 1, 5, 2, 0.0F, false));
        this.drip4.cubeList.add(new ModelBox(drip4, 41, 38, 5.5F, -10.5F, 0.0F, 1, 4, 1, 0.0F, false));
        this.drip4.cubeList.add(new ModelBox(drip4, 41, 38, 5.5F, -10.5F, 4.0F, 1, 4, 1, 0.0F, false));

        this.drip13 = new AdvancedModelRenderer(this);
        this.drip13.setRotationPoint(-11.0F, -1.5F, -11.5F);
        this.head.addChild(drip13);
        this.drip13.cubeList.add(new ModelBox(drip13, 28, 24, 6.5F, 6.5F, 6.0F, 1, 1, 1, 0.0F, true));
        this.drip13.cubeList.add(new ModelBox(drip13, 28, 24, 15.5F, 6.5F, 6.0F, 1, 1, 1, 0.0F, true));
        this.drip13.cubeList.add(new ModelBox(drip13, 27, 23, 8.5F, 6.5F, 6.0F, 2, 1, 1, 0.0F, true));
        this.drip13.cubeList.add(new ModelBox(drip13, 28, 24, 13.5F, 6.5F, 6.0F, 1, 0, 1, 0.0F, true));
        this.drip13.cubeList.add(new ModelBox(drip13, 28, 24, 5.5F, 6.5F, 6.0F, 1, 0, 1, 0.0F, true));
        this.drip13.cubeList.add(new ModelBox(drip13, 28, 24, 7.5F, 6.5F, 7.0F, 1, 3, 1, 0.0F, true));
        this.drip13.cubeList.add(new ModelBox(drip13, 27, 23, 12.5F, 6.5F, 6.0F, 1, 3, 1, 0.0F, true));
        this.drip13.cubeList.add(new ModelBox(drip13, 41, 38, 10.5F, 6.5F, 6.0F, 1, 2, 1, 0.0F, true));
        this.drip13.cubeList.add(new ModelBox(drip13, 41, 38, 14.5F, 6.5F, 8.0F, 1, 2, 1, 0.0F, true));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(6.5F, 9.1667F, -8.8333F);
        this.root.addChild(leftHand);


        this.field_78193_e_r2 = new AdvancedModelRenderer(this);
        this.field_78193_e_r2.setRotationPoint(-1.5F, -2.1667F, 0.8333F);
        this.leftHand.addChild(field_78193_e_r2);
        this.setRotateAngle(field_78193_e_r2, 0.0F, 0.0F, 1.5708F);
        this.field_78193_e_r2.cubeList.add(new ModelBox(field_78193_e_r2, 0, 31, 15.0F, -4.0F, -5.0F, 2, 5, 7, 0.0F, false));
        this.field_78193_e_r2.cubeList.add(new ModelBox(field_78193_e_r2, 0, 71, 10.0F, -3.0F, -3.0F, 5, 3, 5, 0.0F, false));
        this.field_78193_e_r2.cubeList.add(new ModelBox(field_78193_e_r2, 44, 60, 0.0F, -4.0F, -4.0F, 10, 5, 7, 0.0F, false));

        this.bottomBody = new AdvancedModelRenderer(this);
        this.bottomBody.setRotationPoint(0.0F, 23.5F, 1.0F);
        this.root.addChild(bottomBody);
        this.bottomBody.cubeList.add(new ModelBox(bottomBody, 49, 38, -6.0F, -14.5F, -10.0F, 12, 7, 15, 0.0F, false));
        this.bottomBody.cubeList.add(new ModelBox(bottomBody, 46, 16, -7.0F, -7.5F, -8.0F, 14, 7, 15, 0.0F, false));
        this.bottomBody.cubeList.add(new ModelBox(bottomBody, 0, 31, -7.0F, -0.5F, -8.0F, 14, 1, 18, 0.0F, false));
        this.bottomBody.cubeList.add(new ModelBox(bottomBody, 16, 47, 3.0F, -0.5F, 10.0F, 3, 1, 2, 0.0F, false));
        this.bottomBody.cubeList.add(new ModelBox(bottomBody, 15, 46, 4.0F, -0.5F, 12.0F, 1, 1, 3, 0.0F, false));
        this.bottomBody.cubeList.add(new ModelBox(bottomBody, 16, 47, -5.0F, -0.5F, 10.0F, 5, 1, 2, 0.0F, false));
        this.bottomBody.cubeList.add(new ModelBox(bottomBody, 16, 47, -4.0F, -0.5F, 12.0F, 2, 1, 2, 0.0F, false));

        this.drip5 = new AdvancedModelRenderer(this);
        this.drip5.setRotationPoint(0.0F, -19.0F, -12.0F);
        this.bottomBody.addChild(drip5);
        this.drip5.cubeList.add(new ModelBox(drip5, 28, 24, 6.0F, 4.5F, 7.0F, 1, 3, 1, 0.0F, false));
        this.drip5.cubeList.add(new ModelBox(drip5, 28, 24, 6.0F, 4.5F, 16.0F, 1, 3, 1, 0.0F, false));
        this.drip5.cubeList.add(new ModelBox(drip5, 27, 23, 6.0F, 4.5F, 9.0F, 1, 3, 2, 0.0F, false));
        this.drip5.cubeList.add(new ModelBox(drip5, 28, 24, 6.0F, 4.5F, 14.0F, 1, 2, 1, 0.0F, false));
        this.drip5.cubeList.add(new ModelBox(drip5, 28, 24, 6.0F, 4.5F, 6.0F, 1, 2, 1, 0.0F, false));
        this.drip5.cubeList.add(new ModelBox(drip5, 28, 24, 6.0F, 4.5F, 8.0F, 1, 5, 1, 0.0F, false));
        this.drip5.cubeList.add(new ModelBox(drip5, 27, 23, 6.0F, 4.5F, 12.0F, 1, 5, 2, 0.0F, false));
        this.drip5.cubeList.add(new ModelBox(drip5, 41, 38, 6.0F, 4.5F, 11.0F, 1, 4, 1, 0.0F, false));
        this.drip5.cubeList.add(new ModelBox(drip5, 41, 38, 6.0F, 4.5F, 15.0F, 1, 4, 1, 0.0F, false));

        this.drip6 = new AdvancedModelRenderer(this);
        this.drip6.setRotationPoint(0.0F, -19.0F, -12.0F);
        this.bottomBody.addChild(drip6);
        this.drip6.cubeList.add(new ModelBox(drip6, 28, 24, -7.0F, 4.5F, 7.0F, 1, 3, 1, 0.0F, true));
        this.drip6.cubeList.add(new ModelBox(drip6, 28, 24, -7.0F, 4.5F, 16.0F, 1, 3, 1, 0.0F, true));
        this.drip6.cubeList.add(new ModelBox(drip6, 27, 23, -7.0F, 4.5F, 9.0F, 1, 3, 2, 0.0F, true));
        this.drip6.cubeList.add(new ModelBox(drip6, 28, 24, -7.0F, 4.5F, 14.0F, 1, 2, 1, 0.0F, true));
        this.drip6.cubeList.add(new ModelBox(drip6, 28, 24, -7.0F, 4.5F, 6.0F, 1, 2, 1, 0.0F, true));
        this.drip6.cubeList.add(new ModelBox(drip6, 28, 24, -7.0F, 4.5F, 8.0F, 1, 5, 1, 0.0F, true));
        this.drip6.cubeList.add(new ModelBox(drip6, 27, 23, -7.0F, 4.5F, 12.0F, 1, 5, 2, 0.0F, true));
        this.drip6.cubeList.add(new ModelBox(drip6, 41, 38, -7.0F, 4.5F, 11.0F, 1, 4, 1, 0.0F, true));
        this.drip6.cubeList.add(new ModelBox(drip6, 41, 38, -7.0F, 4.5F, 15.0F, 1, 4, 1, 0.0F, true));

        this.drip7 = new AdvancedModelRenderer(this);
        this.drip7.setRotationPoint(2.0F, 2.0F, -2.0F);
        this.bottomBody.addChild(drip7);
        this.drip7.cubeList.add(new ModelBox(drip7, 28, 24, 5.0F, -9.5F, -4.0F, 1, 2, 1, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 28, 24, 5.0F, -9.5F, 5.0F, 1, 2, 1, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 28, 24, 5.0F, -9.5F, 7.0F, 1, 2, 1, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 27, 23, 5.0F, -9.5F, -2.0F, 1, 2, 2, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 28, 24, 5.0F, -9.5F, 3.0F, 1, 2, 1, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 28, 24, 5.0F, -9.5F, -3.0F, 1, 4, 1, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 28, 24, 5.0F, -9.5F, 6.0F, 1, 4, 1, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 27, 23, 5.0F, -9.5F, 1.0F, 1, 4, 2, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 41, 38, 5.0F, -9.5F, 0.0F, 1, 3, 1, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 41, 38, 5.0F, -9.5F, 4.0F, 1, 3, 1, 0.0F, false));
        this.drip7.cubeList.add(new ModelBox(drip7, 41, 38, 5.0F, -9.5F, 8.0F, 1, 1, 1, 0.0F, false));

        this.drip8 = new AdvancedModelRenderer(this);
        this.drip8.setRotationPoint(-2.0F, 2.0F, -2.0F);
        this.bottomBody.addChild(drip8);
        this.drip8.cubeList.add(new ModelBox(drip8, 28, 24, -6.0F, -9.5F, -4.0F, 1, 2, 1, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 28, 24, -6.0F, -9.5F, 5.0F, 1, 2, 1, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 28, 24, -6.0F, -9.5F, 7.0F, 1, 2, 1, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 27, 23, -6.0F, -9.5F, -2.0F, 1, 2, 2, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 28, 24, -6.0F, -9.5F, 3.0F, 1, 2, 1, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 28, 24, -6.0F, -9.5F, -3.0F, 1, 4, 1, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 28, 24, -6.0F, -9.5F, 6.0F, 1, 4, 1, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 27, 23, -6.0F, -9.5F, 1.0F, 1, 4, 2, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 41, 38, -6.0F, -9.5F, 0.0F, 1, 3, 1, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 41, 38, -6.0F, -9.5F, 4.0F, 1, 3, 1, 0.0F, true));
        this.drip8.cubeList.add(new ModelBox(drip8, 41, 38, -6.0F, -9.5F, 8.0F, 1, 1, 1, 0.0F, true));

        this.drip10 = new AdvancedModelRenderer(this);
        this.drip10.setRotationPoint(-11.0F, -27.0F, -2.0F);
        this.bottomBody.addChild(drip10);
        this.drip10.cubeList.add(new ModelBox(drip10, 28, 24, 6.5F, 19.5F, 9.0F, 1, 3, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 28, 24, 15.5F, 19.5F, 9.0F, 1, 3, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 28, 24, 16.5F, 19.5F, 9.0F, 1, 1, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 27, 23, 8.5F, 19.5F, 9.0F, 2, 3, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 28, 24, 13.5F, 19.5F, 9.0F, 1, 2, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 28, 24, 5.5F, 19.5F, 9.0F, 1, 2, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 28, 24, 7.5F, 19.5F, 9.0F, 1, 5, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 27, 23, 11.5F, 19.5F, 9.0F, 2, 5, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 41, 38, 10.5F, 19.5F, 9.0F, 1, 4, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 41, 38, 14.5F, 19.5F, 9.0F, 1, 4, 1, 0.0F, true));
        this.drip10.cubeList.add(new ModelBox(drip10, 41, 38, 4.5F, 19.5F, 9.0F, 1, 4, 1, 0.0F, true));

        this.drip11 = new AdvancedModelRenderer(this);
        this.drip11.setRotationPoint(-2.0F, -5.0F, 11.0F);
        this.bottomBody.addChild(drip11);
        this.drip11.cubeList.add(new ModelBox(drip11, 28, 24, -4.0F, -9.5F, -6.0F, 1, 2, 1, 0.0F, false));
        this.drip11.cubeList.add(new ModelBox(drip11, 28, 24, 5.0F, -9.5F, -6.0F, 1, 2, 1, 0.0F, false));
        this.drip11.cubeList.add(new ModelBox(drip11, 28, 24, 7.0F, -9.5F, -6.0F, 1, 2, 1, 0.0F, false));
        this.drip11.cubeList.add(new ModelBox(drip11, 27, 23, -2.0F, -9.5F, -6.0F, 2, 2, 1, 0.0F, false));
        this.drip11.cubeList.add(new ModelBox(drip11, 28, 24, 3.0F, -9.5F, -6.0F, 1, 2, 1, 0.0F, false));
        this.drip11.cubeList.add(new ModelBox(drip11, 28, 24, -3.0F, -9.5F, -6.0F, 1, 4, 1, 0.0F, false));
        this.drip11.cubeList.add(new ModelBox(drip11, 28, 24, 6.0F, -9.5F, -6.0F, 1, 4, 1, 0.0F, false));
        this.drip11.cubeList.add(new ModelBox(drip11, 27, 23, 1.0F, -9.5F, -6.0F, 2, 4, 1, 0.0F, false));
        this.drip11.cubeList.add(new ModelBox(drip11, 41, 38, 0.0F, -9.5F, -6.0F, 1, 3, 1, 0.0F, false));
        this.drip11.cubeList.add(new ModelBox(drip11, 41, 38, 4.0F, -9.5F, -6.0F, 1, 3, 1, 0.0F, false));
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;
        this.body.rotateAngleY = netHeadYaw * 0.017453292F * 0.25F;

        this.rightHand.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftHand.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.rightHand.rotateAngleY = 0.0F;
        this.leftHand.rotateAngleY = 0.0F;
        this.rightHand.rotateAngleZ = 0.0F;
        this.leftHand.rotateAngleZ = 0.0F;

//        float f = MathHelper.sin(this.body.rotateAngleY);
//        float f1 = MathHelper.cos(this.body.rotateAngleY);
//        this.rightHand.rotateAngleZ = 1.0F;
//        this.leftHand.rotateAngleZ = -1.0F;
//        this.rightHand.rotateAngleY = 0.0F + this.body.rotateAngleY;
//        this.leftHand.rotateAngleY = (float) Math.PI + this.body.rotateAngleY;
//        this.rightHand.rotationPointX = f1 * 5.0F;
//        this.rightHand.rotationPointZ = -f * 5.0F;
//        this.leftHand.rotationPointX = -f1 * 5.0F;
//        this.leftHand.rotationPointZ = f * 5.0F;
    }

    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.root.render(scale);
    }

}
