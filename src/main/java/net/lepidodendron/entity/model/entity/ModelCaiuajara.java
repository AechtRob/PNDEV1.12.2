package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCaiuajara;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelCaiuajara extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer legmembrane;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer legmembrane2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer legmembrane3;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer legmembrane4;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftmembrane;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftmembrane2;
    private final AdvancedModelRenderer leftmplane3;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer leftwing4;
    private final AdvancedModelRenderer leftmembrane4;
    private final AdvancedModelRenderer leftwing5;
    private final AdvancedModelRenderer leftmembrane5;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer leftmembrane3;
    private final AdvancedModelRenderer leftmplane2;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightmembrane;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightmembrane2;
    private final AdvancedModelRenderer rightmplane3;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer rightwing4;
    private final AdvancedModelRenderer rightmembrane4;
    private final AdvancedModelRenderer rightwing5;
    private final AdvancedModelRenderer rightmembrane5;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer rightmembrane3;
    private final AdvancedModelRenderer rightmplane2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
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
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer throat;

    private ModelAnimator animator;

    public ModelCaiuajara() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 13.025F, 2.0F);
        this.setRotateAngle(main, -1.021F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 50, 60, -1.0F, -0.5F, -0.5F, 3, 3, 3, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.074F, 1.026F, 0.7755F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.5255F, 0.1953F, -0.7377F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 30, 50, -1.25F, -0.5F, -0.75F, 2, 5, 1, -0.001F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 20, 67, -1.25F, -0.5F, -0.25F, 2, 5, 1, 0.0F, false));

        this.legmembrane = new AdvancedModelRenderer(this);
        this.legmembrane.setRotationPoint(-2.0F, -1.5F, -1.75F);
        this.leftleg.addChild(legmembrane);
        this.legmembrane.cubeList.add(new ModelBox(legmembrane, 26, 67, 1.25F, 1.0F, 2.5F, 1, 5, 1, -0.001F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.25F, 4.25F, -0.25F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6816F, -0.0716F, 0.65F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 36, 41, -0.5F, -0.25F, -0.25F, 1, 7, 1, 0.0F, false));

        this.legmembrane2 = new AdvancedModelRenderer(this);
        this.legmembrane2.setRotationPoint(-2.5F, -1.25F, -1.25F);
        this.leftleg2.addChild(legmembrane2);
        this.legmembrane2.cubeList.add(new ModelBox(legmembrane2, 30, 67, 2.5F, 1.0F, 2.0F, 0, 7, 1, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 6.3225F, 0.5165F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.3389F, -0.0278F, -0.0245F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 60, 6, -1.0F, -0.25F, -3.0F, 2, 1, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.074F, 1.026F, 0.7755F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.5255F, -0.1953F, 0.7377F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 30, 50, -0.75F, -0.5F, -0.75F, 2, 5, 1, -0.001F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 20, 67, -0.75F, -0.5F, -0.25F, 2, 5, 1, 0.0F, true));

        this.legmembrane3 = new AdvancedModelRenderer(this);
        this.legmembrane3.setRotationPoint(2.0F, -1.5F, -1.75F);
        this.rightleg.addChild(legmembrane3);
        this.legmembrane3.cubeList.add(new ModelBox(legmembrane3, 26, 67, -2.25F, 1.0F, 2.5F, 1, 5, 1, -0.001F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.25F, 4.25F, -0.25F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6816F, 0.0716F, -0.65F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 36, 41, -0.5F, -0.25F, -0.25F, 1, 7, 1, 0.0F, true));

        this.legmembrane4 = new AdvancedModelRenderer(this);
        this.legmembrane4.setRotationPoint(2.5F, -1.25F, -1.25F);
        this.rightleg2.addChild(legmembrane4);
        this.legmembrane4.cubeList.add(new ModelBox(legmembrane4, 30, 67, -2.5F, 1.0F, 2.0F, 0, 7, 1, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 6.3225F, 0.5165F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.3389F, 0.0278F, 0.0245F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 60, 6, -1.0F, -0.25F, -3.0F, 2, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 0.25F, 2.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 70, 18, 0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.288F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 40, 0, -1.5F, -0.5F, -6.0F, 4, 4, 6, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(2.5011F, 0.7482F, -5.9103F);
        this.body.addChild(leftwing);
        this.setRotateAngle(leftwing, -1.3802F, 0.1609F, -0.9632F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 56, 10, -1.5F, -0.75F, -0.5F, 2, 2, 6, 0.0F, false));

        this.leftmembrane = new AdvancedModelRenderer(this);
        this.leftmembrane.setRotationPoint(-0.325F, -0.45F, 2.5F);
        this.leftwing.addChild(leftmembrane);
        this.setRotateAngle(leftmembrane, 0.0498F, -0.095F, -0.3525F);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 36, 49, -0.5F, -6.0F, -3.0F, 1, 6, 6, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(-1.0406F, 0.6769F, 4.777F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.6059F, -0.9327F, 0.9749F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 18, 41, -1.0F, -1.75F, -0.5F, 2, 2, 7, -0.001F, false));

        this.leftmembrane2 = new AdvancedModelRenderer(this);
        this.leftmembrane2.setRotationPoint(-2.25F, -0.25F, 3.5F);
        this.leftwing2.addChild(leftmembrane2);
        this.leftmembrane2.cubeList.add(new ModelBox(leftmembrane2, 0, 36, 2.0F, -7.5F, -5.0F, 1, 6, 8, -0.001F, false));

        this.leftmplane3 = new AdvancedModelRenderer(this);
        this.leftmplane3.setRotationPoint(2.45F, -7.25F, -1.5F);
        this.leftmembrane2.addChild(leftmplane3);
        this.leftmplane3.cubeList.add(new ModelBox(leftmplane3, 18, 15, 0.05F, -0.25F, -4.5F, 0, 6, 9, 0.0F, false));
        this.leftmplane3.cubeList.add(new ModelBox(leftmplane3, 0, 21, -0.05F, -0.25F, -4.5F, 0, 6, 9, 0.0F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(0.0998F, -0.001F, 5.9945F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.3389F, -0.1291F, -0.0522F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 0, 50, -0.5F, -1.75F, 0.0F, 1, 2, 7, 0.0F, false));

        this.leftwing4 = new AdvancedModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.0999F, -0.2516F, 6.9957F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 2.7962F, 0.0129F, -0.0083F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 18, 30, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        this.leftmembrane4 = new AdvancedModelRenderer(this);
        this.leftmembrane4.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.leftwing4.addChild(leftmembrane4);
        this.setRotateAngle(leftmembrane4, 0.0F, 0.0F, -0.0436F);
        this.leftmembrane4.cubeList.add(new ModelBox(leftmembrane4, 18, 0, -0.5F, -5.0F, -5.0F, 1, 5, 10, 0.001F, false));

        this.leftwing5 = new AdvancedModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.025F, 0.5F, 10.0F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1178F, 0.0F, 0.0F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 40, 27, -0.5F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

        this.leftmembrane5 = new AdvancedModelRenderer(this);
        this.leftmembrane5.setRotationPoint(0.0F, -1.0F, 5.5F);
        this.leftwing5.addChild(leftmembrane5);
        this.setRotateAngle(leftmembrane5, 0.0F, 0.0F, -0.0436F);
        this.leftmembrane5.cubeList.add(new ModelBox(leftmembrane5, 36, 15, -0.5F, -3.0F, -5.5F, 1, 3, 9, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.2F, -0.25F, 6.275F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, -0.1365F, 0.0031F, -0.7854F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 70, 6, -1.25F, 0.0F, -1.3F, 2, 2, 1, 0.0F, false));

        this.leftmembrane3 = new AdvancedModelRenderer(this);
        this.leftmembrane3.setRotationPoint(0.0F, -1.5F, 2.0F);
        this.leftwing3.addChild(leftmembrane3);
        this.leftmembrane3.cubeList.add(new ModelBox(leftmembrane3, 40, 37, -0.5F, -5.25F, -2.0F, 1, 5, 7, -0.001F, false));

        this.leftmplane2 = new AdvancedModelRenderer(this);
        this.leftmplane2.setRotationPoint(-0.4F, -5.5F, 2.0F);
        this.leftmembrane3.addChild(leftmplane2);
        this.leftmplane2.cubeList.add(new ModelBox(leftmplane2, 16, 50, 0.5F, -0.75F, -4.0F, 0, 4, 7, 0.0F, false));
        this.leftmplane2.cubeList.add(new ModelBox(leftmplane2, 50, 49, 0.4F, -0.75F, -4.0F, 0, 4, 7, 0.0F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-1.5011F, 0.7482F, -5.9103F);
        this.body.addChild(rightwing);
        this.setRotateAngle(rightwing, -1.3802F, -0.1609F, 0.9632F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 56, 10, -0.5F, -0.75F, -0.5F, 2, 2, 6, 0.0F, true));

        this.rightmembrane = new AdvancedModelRenderer(this);
        this.rightmembrane.setRotationPoint(0.325F, -0.45F, 2.5F);
        this.rightwing.addChild(rightmembrane);
        this.setRotateAngle(rightmembrane, 0.0498F, 0.095F, 0.3525F);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 36, 49, -0.5F, -6.0F, -3.0F, 1, 6, 6, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(1.0406F, 0.6769F, 4.777F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.6059F, 0.9327F, -0.9749F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 18, 41, -1.0F, -1.75F, -0.5F, 2, 2, 7, -0.001F, true));

        this.rightmembrane2 = new AdvancedModelRenderer(this);
        this.rightmembrane2.setRotationPoint(2.25F, -0.25F, 3.5F);
        this.rightwing2.addChild(rightmembrane2);
        this.rightmembrane2.cubeList.add(new ModelBox(rightmembrane2, 0, 36, -3.0F, -7.5F, -5.0F, 1, 6, 8, -0.001F, true));

        this.rightmplane3 = new AdvancedModelRenderer(this);
        this.rightmplane3.setRotationPoint(-2.45F, -7.25F, -1.5F);
        this.rightmembrane2.addChild(rightmplane3);
        this.rightmplane3.cubeList.add(new ModelBox(rightmplane3, 18, 15, -0.05F, -0.25F, -4.5F, 0, 6, 9, 0.0F, true));
        this.rightmplane3.cubeList.add(new ModelBox(rightmplane3, 0, 21, 0.05F, -0.25F, -4.5F, 0, 6, 9, 0.0F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-0.0998F, -0.001F, 5.9945F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.3389F, 0.1291F, 0.0522F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 0, 50, -0.5F, -1.75F, 0.0F, 1, 2, 7, 0.0F, true));

        this.rightwing4 = new AdvancedModelRenderer(this);
        this.rightwing4.setRotationPoint(0.0999F, -0.2516F, 6.9957F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 2.7962F, -0.0129F, 0.0083F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 18, 30, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, true));

        this.rightmembrane4 = new AdvancedModelRenderer(this);
        this.rightmembrane4.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.rightwing4.addChild(rightmembrane4);
        this.setRotateAngle(rightmembrane4, 0.0F, 0.0F, 0.0436F);
        this.rightmembrane4.cubeList.add(new ModelBox(rightmembrane4, 18, 0, -0.5F, -5.0F, -5.0F, 1, 5, 10, 0.001F, true));

        this.rightwing5 = new AdvancedModelRenderer(this);
        this.rightwing5.setRotationPoint(0.025F, 0.5F, 10.0F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1178F, 0.0F, 0.0F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 40, 27, -0.5F, -1.0F, 0.0F, 1, 1, 9, 0.0F, true));

        this.rightmembrane5 = new AdvancedModelRenderer(this);
        this.rightmembrane5.setRotationPoint(0.0F, -1.0F, 5.5F);
        this.rightwing5.addChild(rightmembrane5);
        this.setRotateAngle(rightmembrane5, 0.0F, 0.0F, 0.0436F);
        this.rightmembrane5.cubeList.add(new ModelBox(rightmembrane5, 36, 15, -0.5F, -3.0F, -5.5F, 1, 3, 9, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.2F, -0.25F, 6.275F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, -0.1365F, -0.0031F, 0.7854F);
        this.righthand.cubeList.add(new ModelBox(righthand, 70, 6, -0.75F, 0.0F, -1.3F, 2, 2, 1, 0.0F, true));

        this.rightmembrane3 = new AdvancedModelRenderer(this);
        this.rightmembrane3.setRotationPoint(0.0F, -1.5F, 2.0F);
        this.rightwing3.addChild(rightmembrane3);
        this.rightmembrane3.cubeList.add(new ModelBox(rightmembrane3, 40, 37, -0.5F, -5.25F, -2.0F, 1, 5, 7, -0.001F, true));

        this.rightmplane2 = new AdvancedModelRenderer(this);
        this.rightmplane2.setRotationPoint(0.4F, -5.5F, 2.0F);
        this.rightmembrane3.addChild(rightmplane2);
        this.rightmplane2.cubeList.add(new ModelBox(rightmplane2, 16, 50, -0.5F, -0.75F, -4.0F, 0, 4, 7, 0.0F, true));
        this.rightmplane2.cubeList.add(new ModelBox(rightmplane2, 50, 49, -0.4F, -0.75F, -4.0F, 0, 4, 7, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0474F, -5.8154F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 64, 44, 0.25F, -0.35F, -2.25F, 2, 3, 3, 0.001F, false));
        this.neck.cubeList.add(new ModelBox(neck, 64, 50, -1.25F, -0.35F, -2.25F, 2, 3, 3, 0.002F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1091F, -1.7954F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1833F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 59, -1.0F, -0.5F, -3.5F, 3, 3, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.2148F, -3.2792F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0873F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 60, 26, -0.5F, -0.75F, -3.5F, 2, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 1.2697F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 14, 61, -1.0F, -2.0F, -2.0F, 3, 3, 3, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 70, 24, 1.25F, -1.7F, -1.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 70, 24, -1.25F, -1.7F, -1.5F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -3.4664F, 4.2419F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6981F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 56, -0.5F, -1.0F, -3.0F, 1, 1, 3, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -3.5567F, 2.0076F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4232F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 61, -0.5F, 0.0F, -1.0F, 1, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.5827F, 2.3291F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.7723F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 67, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.296F, -0.8374F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1614F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 61, -0.5F, 0.2F, -1.15F, 2, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.7583F, -5.3807F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0742F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 37, -0.5F, 0.0F, 0.075F, 2, 2, 5, 0.002F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -10.9205F, -5.3735F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.8334F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 67, -0.5F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -7.1558F, -6.7252F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.2261F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 67, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -3.7997F, -5.4072F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9643F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 10, -0.5F, -0.225F, -1.175F, 1, 2, 1, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.7314F, -2.0207F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 27, -0.5F, -0.775F, -0.5F, 1, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -5.2977F, -4.0587F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.357F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 21, -0.5F, -1.0F, 0.25F, 1, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.2924F, -7.9982F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.357F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.5F, 0.5F, 1.925F, 0, 12, 9, -0.002F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 56, 18, 0.0F, 0.0F, 0.0F, 1, 2, 6, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -1.2924F, -7.9982F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5105F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 44, -0.5F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.8441F, -5.8076F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 60, 66, -0.5F, -1.0F, -3.0F, 1, 1, 4, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 62, 60, -0.5F, -2.0F, -3.9F, 2, 2, 4, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0227F, -1.6304F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.4538F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 66, -0.5F, -2.0F, -1.9F, 2, 2, 3, -0.002F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 10, -0.5F, 0.0F, -2.9F, 2, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.0094F, -3.8671F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 0, -0.5F, 0.0F, 1.0F, 2, 1, 5, 0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 2.6697F, -3.2985F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 56, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 1.5834F, -5.2529F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 67, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.687F, -3.3611F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 59, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 1.0094F, -3.8671F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5672F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 13, -0.5F, 0.0F, -0.4F, 1, 1, 1, 0.002F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 1.0094F, -3.8671F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 33, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.001F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.2632F, -2.6834F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0873F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 0, 66, 0.0F, -0.3406F, -0.0421F, 1, 1, 4, 0.0F, false));
        this.throat.cubeList.add(new ModelBox(throat, 68, 33, 0.0F, -1.0906F, 1.4579F, 1, 1, 2, -0.001F, false));

        this.leftmembrane2.scaleChildren = true;
        this.leftmplane3.scaleChildren = true;
        this.leftmplane2.scaleChildren = true;
        this.leftmembrane4.scaleChildren = true;
        this.leftmembrane5.scaleChildren = true;
        this.leftmembrane3.scaleChildren = true;
        this.rightmembrane2.scaleChildren = true;
        this.rightmplane3.scaleChildren = true;
        this.rightmplane2.scaleChildren = true;
        this.rightmembrane4.scaleChildren = true;
        this.rightmembrane5.scaleChildren = true;
        this.rightmembrane3.scaleChildren = true;

        this.leftmembrane2.setScale((float)1,(float)0,(float)0);
        this.leftmplane3.setScale((float)1,(float)0,(float)0);
        this.leftmplane2.setScale((float)1,(float)0,(float)0);
        this.leftmembrane4.setScale((float)1,(float)0,(float)0);
        this.leftmembrane5.setScale((float)1,(float)0,(float)0);
        this.leftmembrane3.setScale((float)1,(float)0,(float)0);
        this.rightmembrane2.setScale((float)1,(float)0,(float)0);
        this.rightmplane3.setScale((float)1,(float)0,(float)0);
        this.rightmplane2.setScale((float)1,(float)0,(float)0);
        this.rightmembrane4.setScale((float)1,(float)0,(float)0);
        this.rightmembrane5.setScale((float)1,(float)0,(float)0);
        this.rightmembrane3.setScale((float)1,(float)0,(float)0);


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.main.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.main.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.4F;
        this.main.offsetX = -0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(125);
        this.main.rotateAngleX = (float)Math.toRadians(-50);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, -0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;

        AdvancedModelRenderer[] tailFull = {this.tail};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 8, neck);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 8, neck3);
            this.faceTarget(f3, f4, 4, head);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 12, neck);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 12, neck3);
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCaiuajara ee = (EntityPrehistoricFloraCaiuajara) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!
            this.leftmembrane2.setScale((float)1,(float)1,(float)1);
            this.leftmplane3.setScale((float)1,(float)1,(float)1);
            this.leftmplane2.setScale((float)1,(float)1,(float)1);
            this.leftmembrane4.setScale((float)1,(float)1,(float)1);
            this.leftmembrane5.setScale((float)1,(float)1,(float)1);
            this.leftmembrane3.setScale((float)1,(float)1,(float)1);
            this.rightmembrane2.setScale((float)1,(float)1,(float)1);
            this.rightmplane3.setScale((float)1,(float)1,(float)1);
            this.rightmplane2.setScale((float)1,(float)1,(float)1);
            this.rightmembrane4.setScale((float)1,(float)1,(float)1);
            this.rightmembrane5.setScale((float)1,(float)1,(float)1);
            this.rightmembrane3.setScale((float)1,(float)1,(float)1);

            //And now the pose:
            this.setRotateAngle(body, 0.288F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 1.357F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 1.357F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.5105F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, 0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.4232F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r20, 0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, 0.7723F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.1614F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 0.0742F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.8334F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 1.2261F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.9643F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, -0.4756F, 0.0F, 0.0F);
            this.setRotateAngle(lefthand, 0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg, 0.3083F, 0.4721F, -1.3746F);
            this.setRotateAngle(leftleg2, 0.8714F, -0.0298F, 0.082F);
            this.setRotateAngle(leftleg3, 0.9609F, -0.0174F, -0.0053F);
            this.setRotateAngle(leftmembrane, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftmembrane4, 0.0F, 0.0F, -0.0436F);
            this.setRotateAngle(leftmembrane5, 0.0F, 0.0F, -0.0436F);
            this.setRotateAngle(leftwing, -1.5199F, -0.0073F, -1.4649F);
            this.setRotateAngle(leftwing2, -0.2364F, 0.1265F, -0.0383F);
            this.setRotateAngle(leftwing3, 0.1753F, 0.0548F, -0.0095F);
            this.setRotateAngle(leftwing4, 0.204F, -0.0433F, 0.0156F);
            this.setRotateAngle(leftwing5, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(main, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(righthand, 0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg, 0.3083F, -0.4721F, 1.3746F);
            this.setRotateAngle(rightleg2, 0.8714F, 0.0298F, -0.082F);
            this.setRotateAngle(rightleg3, 0.9609F, 0.0174F, 0.0053F);
            this.setRotateAngle(rightmembrane4, 0.0F, 0.0F, 0.0436F);
            this.setRotateAngle(rightmembrane5, 0.0F, 0.0F, 0.0436F);
            this.setRotateAngle(rightwing, -1.5199F, 0.0073F, 1.4649F);
            this.setRotateAngle(rightwing2, -0.2364F, -0.1265F, 0.0383F);
            this.setRotateAngle(rightwing3, 0.1753F, -0.0548F, 0.0095F);
            this.setRotateAngle(rightwing4, 0.204F, 0.0433F, -0.0156F);
            this.setRotateAngle(rightwing5, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(throat, 0.0F, 0.0F, 0.0F);



        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that

                this.leftmembrane2.setScale((float)1,(float)0,(float)0);
                this.leftmplane3.setScale((float)1,(float)0,(float)0);
                this.leftmplane2.setScale((float)1,(float)0,(float)0);
                this.leftmembrane4.setScale((float)1,(float)0,(float)0);
                this.leftmembrane5.setScale((float)1,(float)0,(float)0);
                this.leftmembrane3.setScale((float)1,(float)0,(float)0);
                this.rightmembrane2.setScale((float)1,(float)0,(float)0);
                this.rightmplane3.setScale((float)1,(float)0,(float)0);
                this.rightmplane2.setScale((float)1,(float)0,(float)0);
                this.rightmembrane4.setScale((float)1,(float)0,(float)0);
                this.rightmembrane5.setScale((float)1,(float)0,(float)0);
                this.rightmembrane3.setScale((float)1,(float)0,(float)0);
            }
            else {
                //Climb pose

            }
        }

        if (ee.getAttachmentPos() == null) {

        } else {

        }

        if (ee.getAttachmentPos() == null ) {
            if (ee.getIsMoving()) {
                animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }

            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaiuajara entity = (EntityPrehistoricFloraCaiuajara) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 35.5 + (((tickAnim - 11) / 12) * (-2-(35.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -2 + (((tickAnim - 23) / 6) * (-2-(-2)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -2 + (((tickAnim - 29) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 21.5 + (((tickAnim - 11) / 12) * (-6.5-(21.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -6.5 + (((tickAnim - 23) / 4) * (-13.75-(-6.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -13.75 + (((tickAnim - 27) / 2) * (-6.5-(-13.75)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 29) / 6) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 15.25 + (((tickAnim - 11) / 12) * (-8-(15.25)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -8 + (((tickAnim - 23) / 4) * (-2.75-(-8)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -2.75 + (((tickAnim - 27) / 2) * (-8-(-2.75)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -8 + (((tickAnim - 29) / 6) * (0-(-8)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 14.25 + (((tickAnim - 7) / 4) * (0-(14.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (23.79-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 23.79 + (((tickAnim - 15) / 7) * (-25.25-(23.79)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -25.25 + (((tickAnim - 22) / 1) * (-2.5-(-25.25)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 23) / 4) * (-9.25-(-2.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -9.25 + (((tickAnim - 27) / 2) * (-2.5-(-9.25)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 29) / 6) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 24.75 + (((tickAnim - 7) / 4) * (0-(24.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (27-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 27 + (((tickAnim - 22) / 1) * (0-(27)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (11-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 11 + (((tickAnim - 27) / 2) * (0-(11)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 12) * (0-(1)));
            zz = 1 + (((tickAnim - 0) / 12) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 12) / 10) * (1-(1)));
            yy = 0 + (((tickAnim - 12) / 10) * (1-(0)));
            zz = 1 + (((tickAnim - 12) / 10) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 22) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 22) / 6) * (-0.0125-(1)));
            zz = 1 + (((tickAnim - 22) / 6) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 28) / 5) * (1-(1)));
            yy = -0.0125 + (((tickAnim - 28) / 5) * (1-(-0.0125)));
            zz = 1 + (((tickAnim - 28) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCaiuajara entity = (EntityPrehistoricFloraCaiuajara) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 10) / 5) * (4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-9-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-9 + (((tickAnim - 15) / 5) * (5.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4-(4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 5.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4 + (((tickAnim - 20) / 3) * (-3.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*9-(5.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -3.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*9 + (((tickAnim - 23) / 4) * (-2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-3.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*9)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 27) / 8) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 35) / 6) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-6.825-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-6.825 + (((tickAnim - 15) / 7) * (-5.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-6.825)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.5 + (((tickAnim - 22) / 5) * (-9.25-(-5.5)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -9.25 + (((tickAnim - 27) / 8) * (-7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-15-(-9.25)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-15 + (((tickAnim - 35) / 6) * (0-(-7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-15)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*25 + (((tickAnim - 10) / 5) * (-6.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*14-(-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -6.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*14 + (((tickAnim - 15) / 7) * (-10.25-(-6.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*14)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -10.25 + (((tickAnim - 22) / 5) * (-12.37-(-10.25)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -12.37 + (((tickAnim - 27) / 8) * (-27.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(-12.37)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -27.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 35) / 6) * (0-(-27.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25 + (((tickAnim - 10) / 5) * (15.5-(20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 15.5 + (((tickAnim - 15) / 7) * (14.75-(15.5)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 14.75 + (((tickAnim - 22) / 5) * (7.75-(14.75)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 7.75 + (((tickAnim - 27) / 3) * (1.75-(7.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 1.75 + (((tickAnim - 30) / 11) * (0-(1.75)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 19.5 + (((tickAnim - 3) / 4) * (0-(19.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (24-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24 + (((tickAnim - 10) / 5) * (0-(24)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0.75 + (((tickAnim - 20) / 7) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.6))*-5-(0.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.6))*-5 + (((tickAnim - 27) / 8) * (-0.75-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.6))*-5)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -0.75 + (((tickAnim - 35) / 6) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCaiuajara entity = (EntityPrehistoricFloraCaiuajara) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.25 + (((tickAnim - 0) / 3) * (6.86722-(16.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (7.28409-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-9.54617-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 6.86722 + (((tickAnim - 3) / 9) * (-8-(6.86722)));
            yy = 7.28409 + (((tickAnim - 3) / 9) * (0-(7.28409)));
            zz = -9.54617 + (((tickAnim - 3) / 9) * (0-(-9.54617)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -8 + (((tickAnim - 12) / 10) * (16.25-(-8)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.75 + (((tickAnim - 0) / 3) * (-3.72-(29.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.72 + (((tickAnim - 3) / 5) * (-31.5-(-3.72)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -31.5 + (((tickAnim - 8) / 4) * (-24.5-(-31.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -24.5 + (((tickAnim - 12) / 10) * (29.75-(-24.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.225 + (((tickAnim - 3) / 5) * (0-(0.225)));
            yy = 1.525 + (((tickAnim - 3) / 5) * (0.875-(1.525)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 8) / 4) * (0-(0.875)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 79.25 + (((tickAnim - 0) / 3) * (81.0036-(79.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.47446-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.56068-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 81.0036 + (((tickAnim - 3) / 9) * (38.95098-(81.0036)));
            yy = 4.47446 + (((tickAnim - 3) / 9) * (16.77923-(4.47446)));
            zz = 1.56068 + (((tickAnim - 3) / 9) * (5.85256-(1.56068)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 38.95098 + (((tickAnim - 12) / 5) * (3.69061-(38.95098)));
            yy = 16.77923 + (((tickAnim - 12) / 5) * (5.81546-(16.77923)));
            zz = 5.85256 + (((tickAnim - 12) / 5) * (-6.52238-(5.85256)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 3.69061 + (((tickAnim - 17) / 5) * (79.25-(3.69061)));
            yy = 5.81546 + (((tickAnim - 17) / 5) * (0-(5.81546)));
            zz = -6.52238 + (((tickAnim - 17) / 5) * (0-(-6.52238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 1.525 + (((tickAnim - 3) / 9) * (-0.275-(1.525)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 12) / 10) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -4 + (((tickAnim - 0) / 12) * (16.25-(-4)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 16.25 + (((tickAnim - 12) / 3) * (6.86722-(16.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (7.28409-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (9.5462-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 6.86722 + (((tickAnim - 15) / 4) * (-8-(6.86722)));
            yy = 7.28409 + (((tickAnim - 15) / 4) * (0-(7.28409)));
            zz = 9.5462 + (((tickAnim - 15) / 4) * (0-(9.5462)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -8 + (((tickAnim - 19) / 3) * (-4-(-8)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -20.05695 + (((tickAnim - 0) / 12) * (29.75-(-20.05695)));
            yy = 0.37303 + (((tickAnim - 0) / 12) * (0-(0.37303)));
            zz = 0.17837 + (((tickAnim - 0) / 12) * (0-(0.17837)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 29.75 + (((tickAnim - 12) / 3) * (-3.72-(29.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3.72 + (((tickAnim - 15) / 3) * (-31.5-(-3.72)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -31.5 + (((tickAnim - 18) / 1) * (-24.5-(-31.5)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -24.5 + (((tickAnim - 19) / 3) * (-20.05695-(-24.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0.37303-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0.17837-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (1.525-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.225 + (((tickAnim - 15) / 3) * (0-(0.225)));
            yy = 1.525 + (((tickAnim - 15) / 3) * (0.875-(1.525)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 18) / 1) * (0-(0.875)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 33.62 + (((tickAnim - 0) / 5) * (3.26598-(33.62)));
            yy = -17.11047 + (((tickAnim - 0) / 5) * (-7.74547-(-17.11047)));
            zz = -4.60268 + (((tickAnim - 0) / 5) * (4.6468-(-4.60268)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 3.26598 + (((tickAnim - 5) / 7) * (79.25-(3.26598)));
            yy = -7.74547 + (((tickAnim - 5) / 7) * (0-(-7.74547)));
            zz = 4.6468 + (((tickAnim - 5) / 7) * (0-(4.6468)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 79.25 + (((tickAnim - 12) / 3) * (81.0036-(79.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (4.47446-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (1.56068-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 81.0036 + (((tickAnim - 15) / 4) * (61.95098-(81.0036)));
            yy = 4.47446 + (((tickAnim - 15) / 4) * (-16.7792-(4.47446)));
            zz = 1.56068 + (((tickAnim - 15) / 4) * (-5.8526-(1.56068)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 61.95098 + (((tickAnim - 19) / 3) * (33.62-(61.95098)));
            yy = -16.7792 + (((tickAnim - 19) / 3) * (-17.11047-(-16.7792)));
            zz = -5.8526 + (((tickAnim - 19) / 3) * (-4.60268-(-5.8526)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 12) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (1.525-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 1.525 + (((tickAnim - 15) / 4) * (-0.275-(1.525)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 19) / 3) * (-0.15-(-0.275)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -4.55096 + (((tickAnim - 0) / 14) * (21.66387-(-4.55096)));
            yy = -5.84229 + (((tickAnim - 0) / 14) * (5.0878-(-5.84229)));
            zz = 21.53714 + (((tickAnim - 0) / 14) * (17.98696-(21.53714)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 21.66387 + (((tickAnim - 14) / 8) * (-4.55096-(21.66387)));
            yy = 5.0878 + (((tickAnim - 14) / 8) * (-5.84229-(5.0878)));
            zz = 17.98696 + (((tickAnim - 14) / 8) * (21.53714-(17.98696)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -0.00887 + (((tickAnim - 0) / 14) * (-31.23627-(-0.00887)));
            yy = 8.48953 + (((tickAnim - 0) / 14) * (2.23301-(8.48953)));
            zz = 15.92223 + (((tickAnim - 0) / 14) * (0.6468-(15.92223)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -31.23627 + (((tickAnim - 14) / 8) * (-0.00887-(-31.23627)));
            yy = 2.23301 + (((tickAnim - 14) / 8) * (8.48953-(2.23301)));
            zz = 0.6468 + (((tickAnim - 14) / 8) * (15.92223-(0.6468)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane, leftmembrane.rotateAngleX + (float) Math.toRadians(xx), leftmembrane.rotateAngleY + (float) Math.toRadians(yy), leftmembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 14) / 8) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftmembrane.rotationPointX = this.leftmembrane.rotationPointX + (float)(xx);
        this.leftmembrane.rotationPointY = this.leftmembrane.rotationPointY - (float)(yy);
        this.leftmembrane.rotationPointZ = this.leftmembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 25.04088 + (((tickAnim - 0) / 14) * (26.02381-(25.04088)));
            yy = 20.97735 + (((tickAnim - 0) / 14) * (36.12662-(20.97735)));
            zz = -45.52206 + (((tickAnim - 0) / 14) * (-47.08623-(-45.52206)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 26.02381 + (((tickAnim - 14) / 4) * (-14.91305-(26.02381)));
            yy = 36.12662 + (((tickAnim - 14) / 4) * (29.39361-(36.12662)));
            zz = -47.08623 + (((tickAnim - 14) / 4) * (-46.39104-(-47.08623)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -14.91305 + (((tickAnim - 18) / 1) * (-10.19069-(-14.91305)));
            yy = 29.39361 + (((tickAnim - 18) / 1) * (24.34385-(29.39361)));
            zz = -46.39104 + (((tickAnim - 18) / 1) * (-45.86965-(-46.39104)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -10.19069 + (((tickAnim - 19) / 3) * (25.04088-(-10.19069)));
            yy = 24.34385 + (((tickAnim - 19) / 3) * (20.97735-(24.34385)));
            zz = -45.86965 + (((tickAnim - 19) / 3) * (-45.52206-(-45.86965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftmembrane2.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -5.5 + (((tickAnim - 0) / 14) * (37.25-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 37.25 + (((tickAnim - 14) / 4) * (50.75-(37.25)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 50.75 + (((tickAnim - 18) / 1) * (36.25-(50.75)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 36.25 + (((tickAnim - 19) / 3) * (-5.5-(36.25)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 1.96629 + (((tickAnim - 0) / 14) * (-16.43247-(1.96629)));
            yy = -4.28463 + (((tickAnim - 0) / 14) * (-5.79677-(-4.28463)));
            zz = 1.37621 + (((tickAnim - 0) / 14) * (5.12666-(1.37621)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -16.43247 + (((tickAnim - 14) / 5) * (-1.50652-(-16.43247)));
            yy = -5.79677 + (((tickAnim - 14) / 5) * (-10.15112-(-5.79677)));
            zz = 5.12666 + (((tickAnim - 14) / 5) * (4.57599-(5.12666)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -1.50652 + (((tickAnim - 19) / 3) * (1.96629-(-1.50652)));
            yy = -10.15112 + (((tickAnim - 19) / 3) * (-4.28463-(-10.15112)));
            zz = 4.57599 + (((tickAnim - 19) / 3) * (1.37621-(4.57599)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftmembrane4.rotationPointX = this.leftmembrane4.rotationPointX + (float)(0);
        this.leftmembrane4.rotationPointY = this.leftmembrane4.rotationPointY - (float)(-0.075);
        this.leftmembrane4.rotationPointZ = this.leftmembrane4.rotationPointZ + (float)(0);
        this.leftmembrane4.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -3.5 + (((tickAnim - 14) / 8) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftmembrane5.rotationPointX = this.leftmembrane5.rotationPointX + (float)(0);
        this.leftmembrane5.rotationPointY = this.leftmembrane5.rotationPointY - (float)(-0.05);
        this.leftmembrane5.rotationPointZ = this.leftmembrane5.rotationPointZ + (float)(0);
        this.leftmembrane5.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 24.41569 + (((tickAnim - 0) / 8) * (-0.31436-(24.41569)));
            yy = 16.93331 + (((tickAnim - 0) / 8) * (-10.76472-(16.93331)));
            zz = 9.29738 + (((tickAnim - 0) / 8) * (1.96777-(9.29738)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -0.31436 + (((tickAnim - 8) / 6) * (63.65646-(-0.31436)));
            yy = -10.76472 + (((tickAnim - 8) / 6) * (8.52901-(-10.76472)));
            zz = 1.96777 + (((tickAnim - 8) / 6) * (-4.07944-(1.96777)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 63.65646 + (((tickAnim - 14) / 4) * (62.96611-(63.65646)));
            yy = 8.52901 + (((tickAnim - 14) / 4) * (12.26425-(8.52901)));
            zz = -4.07944 + (((tickAnim - 14) / 4) * (1.86581-(-4.07944)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 62.96611 + (((tickAnim - 18) / 1) * (0-(62.96611)));
            yy = 12.26425 + (((tickAnim - 18) / 1) * (0-(12.26425)));
            zz = 1.86581 + (((tickAnim - 18) / 1) * (0-(1.86581)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (24.41569-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (16.93331-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (9.29738-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 3) * (0.43-(0.3)));
            zz = 1.125 + (((tickAnim - 0) / 3) * (-0.01-(1.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.43 + (((tickAnim - 3) / 2) * (0.57-(0.43)));
            zz = -0.01 + (((tickAnim - 3) / 2) * (0.61-(-0.01)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.57 + (((tickAnim - 5) / 3) * (0.71-(0.57)));
            zz = 0.61 + (((tickAnim - 5) / 3) * (0.835-(0.61)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.71 + (((tickAnim - 8) / 6) * (1.075-(0.71)));
            zz = 0.835 + (((tickAnim - 8) / 6) * (-0.32-(0.835)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.075 + (((tickAnim - 14) / 4) * (0.73-(1.075)));
            zz = -0.32 + (((tickAnim - 14) / 4) * (-0.205-(-0.32)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.73 + (((tickAnim - 18) / 1) * (0-(0.73)));
            zz = -0.205 + (((tickAnim - 18) / 1) * (1.325-(-0.205)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0.3-(0)));
            zz = 1.325 + (((tickAnim - 19) / 3) * (1.125-(1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);



        this.leftmembrane3.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.91387 + (((tickAnim - 0) / 2) * (21.66387-(18.91387)));
            yy = -5.0878 + (((tickAnim - 0) / 2) * (-5.0878-(-5.0878)));
            zz = -17.987 + (((tickAnim - 0) / 2) * (-17.987-(-17.987)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 21.66387 + (((tickAnim - 2) / 7) * (-4.55096-(21.66387)));
            yy = -5.0878 + (((tickAnim - 2) / 7) * (5.8423-(-5.0878)));
            zz = -17.987 + (((tickAnim - 2) / 7) * (-21.5371-(-17.987)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = -4.55096 + (((tickAnim - 9) / 13) * (18.91387-(-4.55096)));
            yy = 5.8423 + (((tickAnim - 9) / 13) * (-5.0878-(5.8423)));
            zz = -21.5371 + (((tickAnim - 9) / 13) * (-17.987-(-21.5371)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -31.23627 + (((tickAnim - 0) / 2) * (-31.23627-(-31.23627)));
            yy = 2.23301 + (((tickAnim - 0) / 2) * (2.23301-(2.23301)));
            zz = 0.6468 + (((tickAnim - 0) / 2) * (0.6468-(0.6468)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -31.23627 + (((tickAnim - 2) / 7) * (-0.00887-(-31.23627)));
            yy = 2.23301 + (((tickAnim - 2) / 7) * (-8.4895-(2.23301)));
            zz = 0.6468 + (((tickAnim - 2) / 7) * (-15.9222-(0.6468)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = -0.00887 + (((tickAnim - 9) / 13) * (-31.23627-(-0.00887)));
            yy = -8.4895 + (((tickAnim - 9) / 13) * (2.23301-(-8.4895)));
            zz = -15.9222 + (((tickAnim - 9) / 13) * (0.6468-(-15.9222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane, rightmembrane.rotateAngleX + (float) Math.toRadians(xx), rightmembrane.rotateAngleY + (float) Math.toRadians(yy), rightmembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 2) * (-0.425-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 2) / 7) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 13) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightmembrane.rotationPointX = this.rightmembrane.rotationPointX + (float)(xx);
        this.rightmembrane.rotationPointY = this.rightmembrane.rotationPointY - (float)(yy);
        this.rightmembrane.rotationPointZ = this.rightmembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 22.02381 + (((tickAnim - 0) / 2) * (26.02381-(22.02381)));
            yy = -36.1266 + (((tickAnim - 0) / 2) * (-36.1266-(-36.1266)));
            zz = 47.0862 + (((tickAnim - 0) / 2) * (47.0862-(47.0862)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 26.02381 + (((tickAnim - 2) / 3) * (-14.91305-(26.02381)));
            yy = -36.1266 + (((tickAnim - 2) / 3) * (-29.3936-(-36.1266)));
            zz = 47.0862 + (((tickAnim - 2) / 3) * (46.391-(47.0862)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -14.91305 + (((tickAnim - 5) / 2) * (-10.19069-(-14.91305)));
            yy = -29.3936 + (((tickAnim - 5) / 2) * (-24.3439-(-29.3936)));
            zz = 46.391 + (((tickAnim - 5) / 2) * (45.8697-(46.391)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -10.19069 + (((tickAnim - 7) / 2) * (25.04088-(-10.19069)));
            yy = -24.3439 + (((tickAnim - 7) / 2) * (-20.9773-(-24.3439)));
            zz = 45.8697 + (((tickAnim - 7) / 2) * (45.5221-(45.8697)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 25.04088 + (((tickAnim - 9) / 13) * (22.02381-(25.04088)));
            yy = -20.9773 + (((tickAnim - 9) / 13) * (-36.1266-(-20.9773)));
            zz = 45.5221 + (((tickAnim - 9) / 13) * (47.0862-(45.5221)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightmembrane2.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 32.5 + (((tickAnim - 0) / 2) * (37.25-(32.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 37.25 + (((tickAnim - 2) / 3) * (50.75-(37.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 50.75 + (((tickAnim - 5) / 2) * (36.25-(50.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 36.25 + (((tickAnim - 7) / 2) * (-5.5-(36.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = -5.5 + (((tickAnim - 9) / 13) * (32.5-(-5.5)));
            yy = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -15.68247 + (((tickAnim - 0) / 2) * (-16.43247-(-15.68247)));
            yy = 5.7968 + (((tickAnim - 0) / 2) * (5.7968-(5.7968)));
            zz = 5.12666 + (((tickAnim - 0) / 2) * (5.12666-(5.12666)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -16.43247 + (((tickAnim - 2) / 5) * (-1.50652-(-16.43247)));
            yy = 5.7968 + (((tickAnim - 2) / 5) * (10.1511-(5.7968)));
            zz = 5.12666 + (((tickAnim - 2) / 5) * (4.57599-(5.12666)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -1.50652 + (((tickAnim - 7) / 2) * (1.96629-(-1.50652)));
            yy = 10.1511 + (((tickAnim - 7) / 2) * (4.2846-(10.1511)));
            zz = 4.57599 + (((tickAnim - 7) / 2) * (1.37621-(4.57599)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 1.96629 + (((tickAnim - 9) / 13) * (-15.68247-(1.96629)));
            yy = 4.2846 + (((tickAnim - 9) / 13) * (5.7968-(4.2846)));
            zz = 1.37621 + (((tickAnim - 9) / 13) * (5.12666-(1.37621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightmembrane4.rotationPointX = this.rightmembrane4.rotationPointX + (float)(0);
        this.rightmembrane4.rotationPointY = this.rightmembrane4.rotationPointY - (float)(-0.1);
        this.rightmembrane4.rotationPointZ = this.rightmembrane4.rotationPointZ + (float)(0);
        this.rightmembrane4.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 2 && tickAnim < 9) {
            xx = -3.5 + (((tickAnim - 2) / 7) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 9) / 13) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightmembrane5.rotationPointX = this.rightmembrane5.rotationPointX + (float)(0);
        this.rightmembrane5.rotationPointY = this.rightmembrane5.rotationPointY - (float)(-0.1);
        this.rightmembrane5.rotationPointZ = this.rightmembrane5.rotationPointZ + (float)(0);
        this.rightmembrane5.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 53.81937 + (((tickAnim - 0) / 2) * (63.65646-(53.81937)));
            yy = 13.25975 + (((tickAnim - 0) / 2) * (8.52901-(13.25975)));
            zz = 0.82247 + (((tickAnim - 0) / 2) * (-4.07944-(0.82247)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 63.65646 + (((tickAnim - 2) / 3) * (62.96611-(63.65646)));
            yy = 8.52901 + (((tickAnim - 2) / 3) * (12.26425-(8.52901)));
            zz = -4.07944 + (((tickAnim - 2) / 3) * (1.86581-(-4.07944)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 62.96611 + (((tickAnim - 5) / 2) * (0-(62.96611)));
            yy = 12.26425 + (((tickAnim - 5) / 2) * (0-(12.26425)));
            zz = 1.86581 + (((tickAnim - 5) / 2) * (0-(1.86581)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (24.41569-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (-16.9333-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (9.29738-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 24.41569 + (((tickAnim - 9) / 5) * (-0.31436-(24.41569)));
            yy = -16.9333 + (((tickAnim - 9) / 5) * (10.7647-(-16.9333)));
            zz = 9.29738 + (((tickAnim - 9) / 5) * (1.96777-(9.29738)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -0.31436 + (((tickAnim - 14) / 8) * (53.81937-(-0.31436)));
            yy = 10.7647 + (((tickAnim - 14) / 8) * (13.25975-(10.7647)));
            zz = 1.96777 + (((tickAnim - 14) / 8) * (0.82247-(1.96777)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 1.075 + (((tickAnim - 2) / 3) * (0.73-(1.075)));
            zz = -0.32 + (((tickAnim - 2) / 3) * (-0.205-(-0.32)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.73 + (((tickAnim - 5) / 2) * (0-(0.73)));
            zz = -0.205 + (((tickAnim - 5) / 2) * (1.325-(-0.205)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.3-(0)));
            zz = 1.325 + (((tickAnim - 7) / 2) * (1.125-(1.325)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 9) / 3) * (0.52-(0.3)));
            zz = 1.125 + (((tickAnim - 9) / 3) * (-0.25-(1.125)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.52 + (((tickAnim - 12) / 2) * (0.71-(0.52)));
            zz = -0.25 + (((tickAnim - 12) / 2) * (0.435-(-0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.71 + (((tickAnim - 14) / 4) * (0.87-(0.71)));
            zz = 0.435 + (((tickAnim - 14) / 4) * (0.7-(0.435)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.87 + (((tickAnim - 18) / 4) * (1.075-(0.87)));
            zz = 0.7 + (((tickAnim - 18) / 4) * (-0.32-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



        this.rightmembrane3.setScale((float)1,(float)0,(float)1);


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+170))*-2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542))*-2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+30))*-3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.325+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271))*-0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271-60))*-0.5);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+90))*5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+30))*3));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+90))*3), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+30))*3));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+170))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+20))*-3));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+220))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+100))*3));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+290))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+150))*-3));



    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCaiuajara entity = (EntityPrehistoricFloraCaiuajara) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*15)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*1 + (((tickAnim - 0) / 50) * (-3.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1 + (((tickAnim - 0) / 50) * (-3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = -3.25 + (((tickAnim - 50) / 70) * (-3.25-(-3.25)));
            zz = -3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1 + (((tickAnim - 50) / 70) * (-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1-(-3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = -3.25 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*1-(-3.25)));
            zz = -1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1-(-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(0), leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(0), leftleg3.rotateAngleY + (float) Math.toRadians(0), leftleg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-140))*-5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-140))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-140))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftmembrane, leftmembrane.rotateAngleX + (float) Math.toRadians(0), leftmembrane.rotateAngleY + (float) Math.toRadians(0), leftmembrane.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-20-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0.5 + (((tickAnim - 0) / 50) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0.5 + (((tickAnim - 50) / 70) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0.5 + (((tickAnim - 120) / 40) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(xx);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(yy);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(zz);







        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-25 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-25-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-30)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-30-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));






        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(116), lefthand.rotateAngleY + (float) Math.toRadians(78.89645), lefthand.rotateAngleZ + (float) Math.toRadians(-180));
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(0);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(-0.575);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(0);






        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+80))*-10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+80))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+80))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+160))*10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+160))*10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+160))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+220))*-10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+220))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+220))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+290))*-10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+290))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+290))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.75-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0.75 + (((tickAnim - 50) / 70) * (0.75-(0.75)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0.75 + (((tickAnim - 120) / 40) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);



        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(10), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(0), rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(0), rightleg3.rotateAngleY + (float) Math.toRadians(0), rightleg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*20-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.5 + (((tickAnim - 0) / 50) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -0.5 + (((tickAnim - 50) / 70) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -0.5 + (((tickAnim - 120) / 40) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing2.rotationPointX = this.rightwing2.rotationPointX + (float)(xx);
        this.rightwing2.rotationPointY = this.rightwing2.rotationPointY - (float)(yy);
        this.rightwing2.rotationPointZ = this.rightwing2.rotationPointZ + (float)(zz);







        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*25 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*25-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*30)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*30-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));






        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(-260.89514), righthand.rotateAngleY + (float) Math.toRadians(-81.89449), righthand.rotateAngleZ + (float) Math.toRadians(175.23061));
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(0);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(-0.7);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(0);



    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCaiuajara e = (EntityPrehistoricFloraCaiuajara) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, ((0.288F)-(0.288F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.6981F)-(0.6981F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((1.357F)-(1.357F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((1.357F)-(1.357F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((0.5105F)-(0.5105F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((0.5236F)-(0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((0.4232F)-(0.4232F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((0.5672F)-(0.5672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((0.7723F)-(0.7723F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((0.1614F)-(0.1614F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((0.0742F)-(0.0742F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.8334F)-(0.8334F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((1.2261F)-(1.2261F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.9643F)-(0.9643F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.7854F)-(1.2697F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((-0.4756F)-(-0.4538F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lefthand, ((0.6109F)-(-0.1365F)), ((0.0F)-(0.0031F)),((0.0F)-(-0.7854F)));
        animator.rotate(leftleg, ((0.3083F)-(0.5255F)), ((0.4721F)-(0.1953F)),((-1.3746F)-(-0.7377F)));
        animator.rotate(leftleg2, ((0.8714F)-(0.6816F)), ((-0.0298F)-(-0.0716F)),((0.082F)-(0.65F)));
        animator.rotate(leftleg3, ((0.9609F)-(-0.3389F)), ((-0.0174F)-(-0.0278F)),((-0.0053F)-(-0.0245F)));
        animator.rotate(leftmembrane, ((0.0F)-(0.0498F)), ((0.0F)-(-0.095F)),((0.0F)-(-0.3525F)));
        animator.rotate(leftmembrane4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0436F)-(-0.0436F)));
        animator.rotate(leftmembrane5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0436F)-(-0.0436F)));
        animator.rotate(leftwing, ((-1.5199F)-(-1.3802F)), ((-0.0073F)-(0.1609F)),((-1.4649F)-(-0.9632F)));
        animator.rotate(leftwing2, ((-0.2364F)-(-0.6059F)), ((0.1265F)-(-0.9327F)),((-0.0383F)-(0.9749F)));
        animator.rotate(leftwing3, ((0.1753F)-(0.3389F)), ((0.0548F)-(-0.1291F)),((-0.0095F)-(-0.0522F)));
        animator.rotate(leftwing4, ((0.204F)-(2.7962F)), ((-0.0433F)-(0.0129F)),((0.0156F)-(-0.0083F)));
        animator.rotate(leftwing5, ((0.3491F)-(0.1178F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(main, ((-0.3927F)-(-1.021F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((-0.1309F)-(-0.1833F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.1309F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((-0.0873F)-(-0.1365F)), ((0.0F)-(-0.0031F)),((0.0F)-(0.7854F)));
        animator.rotate(righthand, ((0.6109F)-(0.5255F)), ((0.0F)-(-0.1953F)),((0.0F)-(0.7377F)));
        animator.rotate(rightleg, ((0.3083F)-(0.6816F)), ((-0.4721F)-(0.0716F)),((1.3746F)-(-0.65F)));
        animator.rotate(rightleg2, ((0.8714F)-(-0.3389F)), ((0.0298F)-(0.0278F)),((-0.082F)-(0.0245F)));
        animator.rotate(rightleg3, ((0.9609F)-(0.0498F)), ((0.0174F)-(0.095F)),((0.0053F)-(0.3525F)));
        animator.rotate(rightmembrane4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0436F)-(0.0436F)));
        animator.rotate(rightmembrane5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0436F)-(0.0436F)));
        animator.rotate(rightwing, ((-1.5199F)-(-1.3802F)), ((0.0073F)-(-0.1609F)),((1.4649F)-(0.9632F)));
        animator.rotate(rightwing2, ((-0.2364F)-(-0.6059F)), ((-0.1265F)-(0.9327F)),((0.0383F)-(-0.9749F)));
        animator.rotate(rightwing3, ((0.1753F)-(0.3389F)), ((-0.0548F)-(0.1291F)),((0.0095F)-(0.0522F)));
        animator.rotate(rightwing4, ((0.204F)-(2.7962F)), ((0.0433F)-(-0.0129F)),((-0.0156F)-(0.0083F)));
        animator.rotate(rightwing5, ((0.3491F)-(0.1178F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat, ((0.0F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, -((0.288F)-(0.288F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.6981F)-(0.6981F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((1.357F)-(1.357F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((1.357F)-(1.357F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((0.5105F)-(0.5105F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((0.5236F)-(0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((0.4232F)-(0.4232F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((0.5672F)-(0.5672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((0.7723F)-(0.7723F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((0.1614F)-(0.1614F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((0.0742F)-(0.0742F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.8334F)-(0.8334F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((1.2261F)-(1.2261F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.9643F)-(0.9643F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.7854F)-(1.2697F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((-0.4756F)-(-0.4538F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lefthand, -((0.6109F)-(-0.1365F)), -((0.0F)-(0.0031F)),-((0.0F)-(-0.7854F)));
        animator.rotate(leftleg, -((0.3083F)-(0.5255F)), -((0.4721F)-(0.1953F)),-((-1.3746F)-(-0.7377F)));
        animator.rotate(leftleg2, -((0.8714F)-(0.6816F)), -((-0.0298F)-(-0.0716F)),-((0.082F)-(0.65F)));
        animator.rotate(leftleg3, -((0.9609F)-(-0.3389F)), -((-0.0174F)-(-0.0278F)),-((-0.0053F)-(-0.0245F)));
        animator.rotate(leftmembrane, -((0.0F)-(0.0498F)), -((0.0F)-(-0.095F)),-((0.0F)-(-0.3525F)));
        animator.rotate(leftmembrane4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0436F)-(-0.0436F)));
        animator.rotate(leftmembrane5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0436F)-(-0.0436F)));
        animator.rotate(leftwing, -((-1.5199F)-(-1.3802F)), -((-0.0073F)-(0.1609F)),-((-1.4649F)-(-0.9632F)));
        animator.rotate(leftwing2, -((-0.2364F)-(-0.6059F)), -((0.1265F)-(-0.9327F)),-((-0.0383F)-(0.9749F)));
        animator.rotate(leftwing3, -((0.1753F)-(0.3389F)), -((0.0548F)-(-0.1291F)),-((-0.0095F)-(-0.0522F)));
        animator.rotate(leftwing4, -((0.204F)-(2.7962F)), -((-0.0433F)-(0.0129F)),-((0.0156F)-(-0.0083F)));
        animator.rotate(leftwing5, -((0.3491F)-(0.1178F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(main, -((-0.3927F)-(-1.021F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((-0.1309F)-(-0.1833F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.1309F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((-0.0873F)-(-0.1365F)), -((0.0F)-(-0.0031F)),-((0.0F)-(0.7854F)));
        animator.rotate(righthand, -((0.6109F)-(0.5255F)), -((0.0F)-(-0.1953F)),-((0.0F)-(0.7377F)));
        animator.rotate(rightleg, -((0.3083F)-(0.6816F)), -((-0.4721F)-(0.0716F)),-((1.3746F)-(-0.65F)));
        animator.rotate(rightleg2, -((0.8714F)-(-0.3389F)), -((0.0298F)-(0.0278F)),-((-0.082F)-(0.0245F)));
        animator.rotate(rightleg3, -((0.9609F)-(0.0498F)), -((0.0174F)-(0.095F)),-((0.0053F)-(0.3525F)));
        animator.rotate(rightmembrane4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0436F)-(0.0436F)));
        animator.rotate(rightmembrane5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0436F)-(0.0436F)));
        animator.rotate(rightwing, -((-1.5199F)-(-1.3802F)), -((0.0073F)-(-0.1609F)),-((1.4649F)-(0.9632F)));
        animator.rotate(rightwing2, -((-0.2364F)-(-0.6059F)), -((-0.1265F)-(0.9327F)),-((0.0383F)-(-0.9749F)));
        animator.rotate(rightwing3, -((0.1753F)-(0.3389F)), -((-0.0548F)-(0.1291F)),-((0.0095F)-(0.0522F)));
        animator.rotate(rightwing4, -((0.204F)-(2.7962F)), -((0.0433F)-(-0.0129F)),-((-0.0156F)-(0.0083F)));
        animator.rotate(rightwing5, -((0.3491F)-(0.1178F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat, -((0.0F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
